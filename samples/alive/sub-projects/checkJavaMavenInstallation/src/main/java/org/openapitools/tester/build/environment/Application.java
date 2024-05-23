package org.openapitools.tester.build.environment;

import java.util.*;

import org.slf4j.*;
import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.context.*;
import org.springframework.core.env.*;

@SpringBootApplication
public class Application implements ApplicationContextAware, ApplicationRunner {
   /** LOGGER. */
   private static final Logger LOGGER = LoggerFactory.getLogger(Application.class);

   /**
    * Main process (delegating to Runner).
    * @param args Arguments.
    */
   public static void main(String[] args) {
      SpringApplication.run(Application.class, args);
   }

   /**
    * Runner
    */
   @Override
   public void run(ApplicationArguments args) {
      LOGGER.info("Hello! Application to ensure that build environment for test execution is working starts");
   }

   /**
    * @see org.springframework.context.ApplicationContextAware#setApplicationContext(org.springframework.context.ApplicationContext)
    */
   @Override
   public void setApplicationContext(ApplicationContext ctx) {
      Environment env = ctx.getEnvironment();
      LOGGER.info("\nApplication starts with these profiles: {}\n", Arrays.asList(env.getActiveProfiles()));
   }
}
