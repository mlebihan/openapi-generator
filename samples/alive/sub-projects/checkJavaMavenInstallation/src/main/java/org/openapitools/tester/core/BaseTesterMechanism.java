package org.openapitools.tester.core;

import java.io.*;
import java.nio.file.*;
import java.text.MessageFormat;

import org.slf4j.*;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.*;
import org.springframework.stereotype.Component;

/**
 * Core test mechanism
 */
@Component
public class BaseTesterMechanism implements ApplicationContextAware {
   /** LOGGER. */
   private static final Logger LOGGER = LoggerFactory.getLogger(BaseTesterMechanism.class);

   /** Tester name */
   @Value("${tester.name:null}")
   private String testerName;

   /** Test results parent directory: expecting a temp directory coming from the calling script */
   @Value("${tester.test.results.directory:null}")
   private String testResultsParentDirectory;

   /** Test results parent directory as Path */
   private Path pathResultsParentDirectory;

   /** Sequential operation number */
   private int operationNumber;

   /** Sequential test or step number */
   private int testOrStepNumber;

   /**
    * Return the operation number
    * @return Operation number
    */
   public int getOperationNumber() {
      return this.operationNumber;
   }

   /**
    * Increase the operation number and returns it
    * @return operation number
    */
   public int increaseOperationNumber() {
      this.operationNumber++;
      return this.operationNumber;
   }

   /**
    * Return the test or step number
    * @return Test or step number
    */
   public int getTestOrStepNumber() {
      return this.testOrStepNumber;
   }

   /**
    * Increase the test or step number and returns it
    * @return test or step number
    */
   public int increaseTestOrStepNumber() {
      this.testOrStepNumber++;
      return this.testOrStepNumber;
   }

   /**
    * Return the tester name, that names the serial of tests
    * @return Tester name
    */
   public String getTesterName() {
      return this.testerName;
   }

   /**
    * Return the test results parent directory
    * @return test results directory
    */
   public String getTestResultsParentDirectory() {
      return this.testResultsParentDirectory;
   }

   /**
    * Return the test results parent directory as a Path
    * @return test results directory
    */
   public Path getTestResultsDirectoryPath() {
      return this.pathResultsParentDirectory;
   }

   /**
    * Set the tester name, that names the serial of tests
    * @param testerName Tester name
    */
   public void setTesterName(String testerName) {
      this.testerName = testerName;
   }

   /**
    * Create a test result directory for a single test or step
    * @param folderNameSuffix Optional folder name suffix
    * @return The target path of that folder : {parent test results directory}/{test or step operation number}[-{folderNameSuffix}]
    * @throws TestingEnvironmentException if the wished directory cannot be created
    */
   protected Path createTestResultDirectory(String folderNameSuffix) throws TestingEnvironmentException {
      // Expecting a parent test results folder to have been created before
      if (this.pathResultsParentDirectory == null) {
         throw new IllegalStateException("No parent directory for tests has been created, before. Cannot continue");
      }

      String formatFolder = folderNameSuffix != null && !folderNameSuffix.isBlank() ?
         "{0}/{1,number,#0}-{2}" : "{0}/{1,number,#0}";

      int number = getTestOrStepNumber();

      String folder = MessageFormat.format(formatFolder, number, folderNameSuffix);
      Path folderPath = Paths.get(new File(folder).getAbsolutePath());

      try {
         Files.createDirectories(folderPath);
         LOGGER.info("{} have been created as directory for test or step results {}", folderPath, number);
      }
      catch(IOException e) {
         String format = "Cannot create directory {0} ({1} suffix) to receive tests results: {2}";
         String message = MessageFormat.format(format, folder, folderNameSuffix, e.getMessage());
         LOGGER.error(message);

         throw new TestingEnvironmentException(message, e);
      }

      return folderPath;
   }

   /**
    * Create the parent test results directory
    * Get the test results directory, that can have been set by a property.
    * If not, it's a temp directory that is created.
    */
   private void createParentTestResultsDirectory() {
      // Get the test results directory, that can have been set by a property. If not, it's a temp directory that is now created
      if (this.testResultsParentDirectory == null || this.testResultsParentDirectory.isEmpty()) {
         try {
            this.testResultsParentDirectory = Files.createTempDirectory(null).toFile().getAbsolutePath();
            this.pathResultsParentDirectory = Paths.get(this.testResultsParentDirectory);
         }
         catch(IOException e) {
            String format = "Cannot create parent temp directory to receive tests results: {0}";
            String message = MessageFormat.format(format, e.getMessage());
            LOGGER.error(message);

            throw new RuntimeException(message, e);
         }
      }
      else {
         this.testResultsParentDirectory = new File(this.testResultsParentDirectory).getAbsolutePath();
         this.pathResultsParentDirectory = Paths.get(this.testResultsParentDirectory);

         try {
            Files.createDirectories(pathResultsParentDirectory);
            LOGGER.info("{} have been created as parent directory for test results", this.testResultsParentDirectory);
         }
         catch(IOException e) {
            String format = "Cannot create parent directory {0} to receive tests results: {1}";
            String message = MessageFormat.format(format, this.testResultsParentDirectory, e.getMessage());
            LOGGER.error(message);

            throw new RuntimeException(message, e);
         }
      }

      LOGGER.info("Test results parent destination for this serial of tests: {}", this.testResultsParentDirectory);
   }

   /**
    * {@inheritDoc}
    */
   @Override
   public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
      // Get the tester name, that can have been set by a property. If not, it's the class name.
      if (this.testerName == null || this.testerName.isEmpty()) {
         this.testerName = getClass().getName();
      }

      LOGGER.info("Name of this serial of tests: {}", this.testerName);

      // Get the test results directory, that can have been set by a property. If not, it's a temp directory that is now created
      createParentTestResultsDirectory();
   }
}
