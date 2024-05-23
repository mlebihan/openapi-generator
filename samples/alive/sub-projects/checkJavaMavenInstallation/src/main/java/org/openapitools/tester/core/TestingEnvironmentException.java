package org.openapitools.tester.core;

/**
 * An exception that depicts a testing environment problem.
 */
public class TestingEnvironmentException extends Exception {
   /**
    * {@inheritDoc}
    */
   public TestingEnvironmentException(String message) {
      super(message);
   }

   /**
    * {@inheritDoc}
    */
   public TestingEnvironmentException(String message, Throwable cause) {
      super(message, cause);
   }
}
