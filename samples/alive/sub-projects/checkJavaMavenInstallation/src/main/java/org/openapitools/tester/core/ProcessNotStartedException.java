package org.openapitools.tester.core;

/**
 * Exception raised when a process asked to start can't start
 */
public class ProcessNotStartedException extends Exception {
   /**
    * {@inheritDoc}
    */
   public ProcessNotStartedException(String message) {
      super(message);
   }

   /**
    * {@inheritDoc}
    */
   public ProcessNotStartedException(String message, Throwable cause) {
      super(message, cause);
   }
}
