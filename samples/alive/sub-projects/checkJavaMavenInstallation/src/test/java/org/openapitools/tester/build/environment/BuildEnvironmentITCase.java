package org.openapitools.tester.build.environment;

import org.junit.jupiter.api.*;
import org.openapitools.tester.BaseClientTester;
import org.openapitools.tester.core.ProcessRunner;
import org.slf4j.*;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Integration test for testing the build environment.
 */
@SpringBootTest(classes = Application.class)
class BuildEnvironmentITCase extends BaseClientTester {
   /** Logger. */
   private static final Logger LOGGER = LoggerFactory.getLogger(BuildEnvironmentITCase.class);

   /**
    * Both unit and integration tests reports, for build environment testing, on the same family of tests
    */
   public BuildEnvironmentITCase() {
      setTesterName("build-tester-environment");
   }

   /**
    * Run an integration test
    */
   @Test
   @DisplayName("Application runs in integration testing.")
   void runningAsIT() {
      assertDoesNotThrow(() -> LOGGER.info("I'm an integration test running"));
   }

   /**
    * Run "java -jar openapi-generator-cli.jar version" as a process
    */
   @Test
   @DisplayName("Run java -jar openapi-generator-cli.jar version")
   void runningOpenapiGeneratorVersion() {
      assertDoesNotThrow(() -> {
            ProcessRunner runner = new ProcessRunner();
            runner.start(null, null, "java", "-jar", "openapi-generator.jar");
            LOGGER.info("openapi-generator has started...");

            Thread.sleep(5000);

            Integer exitValue = runner.exitValue();

            if (exitValue == null) {
               LOGGER.warn("openapi-generator version hasn't finished in imparted time. Destroying it");
               runner.destroy();
            }

            assertNotNull(exitValue, "openapi-generator version execution has not ended");
         }
      );
   }
}
