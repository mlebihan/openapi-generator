package org.openapitools.codegen.languages;

import java.text.MessageFormat;
import java.util.*;
import java.util.function.*;

import org.slf4j.*;

/**
 * Select an appropriate code fragment for a given parameter
 * @param <P> Usually Schema or CodegenParameter, CodeGenProperty, CodeGenModel
 * @param <O> Kind of fragment returned. Usually a String
 */
public abstract class AbstractCodeSelector<P,O> {
   /** Logger. */
   private final Logger logger = LoggerFactory.getLogger(AbstractCodeSelector.class);

   /** To return an empty string: "" */
   protected final Supplier<String> EMPTY_STRING_SUPPLIER = () -> "\"\"";

   /**
    * Evaluate conditions to return an appropriate code fragment
    * @param candidates Candidate predicates that might return a piece of code, depending to conditions
    * @param allowNotFound true if finding nothing is acceptable, and then this method will return <code>null</code><br>
    *                      false if it isn't, and it will throw an <code>NoSuchElementException</code> then
    * @return an Optional O class that contains:<br>
    * - an O object if a code has been selected
    * - <code>null</code> if no predicate applies to P and <code>allowNotFound = true</code>
    * @throws NoSuchElementException if no predicate applies to P and <code>allowNotFound = false</code>
    */
   public O findFirst(List<Supplier<Optional<O>>> candidates, boolean allowNotFound) throws NoSuchElementException {
      Objects.requireNonNull(candidates, "code fragment candidates can be empty, but cannot be null");

      // This loop stops at first candidate that passes it's first condition
      // (it means: that this candidate responds to a case where it can return something,
      // even if that thing respond itself to another (or others) condition(s))
      for(Supplier<Optional<O>> candidate : candidates) {
         Optional<O> codeFragment = candidate.get();

         if (codeFragment.isPresent()) {
            return codeFragment.get();
         }
      }

      String format = "No code fragment found responding to any of the {0} given predicates";
      String message = new MessageFormat(format, Locale.ROOT).format(candidates.size());
      logger.warn(message);

      if (!allowNotFound) {
         throw new NoSuchElementException(message);
      }

      return null;
   }

   /**
    * Return a code fragment depending on conditions filled
    * @param firstCriterion First condition to meet.
    * @param secondCriterion Secondary condition (Third, fourth criterion should be tested inside, if needed). Might be null, if not needed
    * @param p Property or Parameter or Model currently evaluated
    * @param generatedWhenConditionsFilled The code fragment that is generated if the conditions are met
    * @param generatedWhenConditionsNotFilled fragment The code fragment that is generated if the conditions aren't met
    * @return Fragment chosen depending on the test<br>
    * or null (in optional) if the test cannot meet the first criterion
    */
   protected Optional<O> codeFragment(Predicate<P> firstCriterion, Predicate<P> secondCriterion, P p,
       Supplier<O> generatedWhenConditionsFilled, Supplier<O> generatedWhenConditionsNotFilled) {
      // If there's no firstCriteria, we are returning generatedWhenConditionsFilled as a final default value
      if (firstCriterion == null) {
         return Optional.of(generatedWhenConditionsFilled.get());
      }

      // If our property doesn't fill the first condition, return optional.empty()
      if (!firstCriterion.test(p)) {
         return Optional.empty();
      }

      // Some properties of that kind returns systematically the same value, and don't provide a test to study them further
      if (secondCriterion == null) {
         return Optional.of(generatedWhenConditionsFilled.get());
      }

      // Else, perform the test to see if the property has something special to return
      return Optional.of(secondCriterion.test(p) ? generatedWhenConditionsFilled.get() : generatedWhenConditionsNotFilled.get());
   }
}
