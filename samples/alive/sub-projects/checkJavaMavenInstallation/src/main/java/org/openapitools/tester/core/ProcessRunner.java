package org.openapitools.tester.core;

import java.io.*;
import java.text.MessageFormat;
import java.util.*;

import org.slf4j.*;

/**
 * A process runner
 */
public class ProcessRunner {
   /** LOGGER. */
   private static final Logger LOGGER = LoggerFactory.getLogger(ProcessRunner.class);

   /** The process to execute */
   private Process process;

   /**
    * Return the current process.
    * @return Process.
    */
   public Process getProcess() {
      return this.process;
   }

   /**
    * Destroy (kill) the process
    * @see Process#destroy()
    */
   public void destroy() {
      this.process.destroy();
   }

   /**
    * Check it this process is currently alive.
    * @see Process#isAlive()
    */
   public boolean isAlive() {
      return this.process.isAlive();
   }

   /**
    * Return the process exit value or null if the process is still active
    * @return exit value or null
    */
   public Integer exitValue() {
      try {
         return this.process.exitValue();
      }
      catch(IllegalThreadStateException e) {
         return null;
      }
   }

   /**
    * Start a process
    * @param workingDirectory Working directory. Optional.
    * @param additionalEnvironmentVariables Additional environment variables to provide to the process.
    * @param commandAndArguments Command to execute, and its optional arguments
    * @return Process started
    * @throws ProcessNotStartedException if a trouble prevent that process from starting
    */
   public Process start(String workingDirectory, Map<String, String> additionalEnvironmentVariables, String... commandAndArguments) throws ProcessNotStartedException {
      Objects.requireNonNull(commandAndArguments, "The command (and its optional arguments) to execute is mandatory, it cannot be null");

      // A command to run is required
      if (commandAndArguments.length == 0) {
         String message = "You haven't provided a command to execute. No process to start.";
         LOGGER.error(message);
         throw new ProcessNotStartedException(message);
      }

      ProcessBuilder pb = new ProcessBuilder(commandAndArguments);

      // Add optional environment variables
      if (additionalEnvironmentVariables != null) {
         Map<String, String> env = pb.environment();
         env.putAll(additionalEnvironmentVariables);
      }

      // Set optional working directory
      if (workingDirectory != null) {
         pb.directory(new File(workingDirectory));
      }

      // Start the process, and keep it in a variable member
      try {
         this.process = pb.start();
         return this.process;
      }
      catch(IOException e) {
         String format = "Cannot start a process in the working directory {0} with the command ''{1}'': {2}";
         String message = MessageFormat.format(format, workingDirectory, commandAndArguments[0], e.getMessage());
         LOGGER.error(message);
         throw new ProcessNotStartedException(message, e);
      }
   }
}
