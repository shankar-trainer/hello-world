An ApplicationContextInitializer is a Spring callback interface used to initialize a ConfigurableApplicationContext programmatically before the context is refreshed. This makes it an ideal place to dynamically detect environments and activate profiles like dev or prod before any beans are created.Below is a complete example showing how to create an initializer that checks a system property or environment variable to toggle between dev and prod profiles.1. Create the Custom Initializer ClassThis class implements ApplicationContextInitializer. It reads an external configuration (like an environment variable or system property) and sets the active profile accordingly.
java

package com.example.config;

import org.springframework.context.ApplicationContextInitializer;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;

public class EnvironmentSelectionInitializer
        implements ApplicationContextInitializer<ConfigurableApplicationContext> {

    @Override
    public void initialize(ConfigurableApplicationContext applicationContext) {
        // Retrieve the current environment interface
        ConfigurableEnvironment environment = applicationContext.getEnvironment();

        // Read an environment variable or system property (e.g., -DAPP_ENV=prod)
        String currentEnv = System.getProperty("APP_ENV");

        if (currentEnv == null) {
            currentEnv = System.getenv("APP_ENV");
        }

        // Determine profile to activate based on the variable value
        if ("prod".equalsIgnoreCase(currentEnv)) {
            environment.setActiveProfiles("prod");
            System.out.println("Initializer: Activated 'prod' profile.");
        } else {
            // Default to dev if not specified or explicitly set to dev
            environment.setActiveProfiles("dev");
            System.out.println("Initializer: Activated 'dev' profile.");
        }
    }
}

Use code with caution.
2. Register the InitializerSpring must know about the initializer before it starts up.
You can register it using one of two common methods:

Option A: via META-INF/spring.factories (Recommended)

    This approach registers the initializer globally so it automatically catches the earliest startup phases without
    modifying your main class code.

    Create a folder named META-INF inside your src/main/resources directory.
    Inside it, create a file named spring.factories.
    Add the following line (use your actual package name):

    properties
    org.springframework.context.ApplicationContextInitializer=com.example.config.EnvironmentSelectionInitializer
    Use code with caution.

Option B: Programmatically in the Main Class
    If you prefer not to use spring.factories,
    you can manually attach the initializer directly to your Spring Boot application launcher instance.
    java
    package com.example;

    import com.example.config.EnvironmentSelectionInitializer;
    import org.springframework.boot.SpringApplication;
    import org.springframework.boot.autoconfigure.SpringBootApplication;

    @SpringBootApplication
    public class DemoApplication {

        public static void main(String[] args) {
            SpringApplication application = new SpringApplication(DemoApplication.class);

            // Manually adding the initializer class
            application.addInitializers(new EnvironmentSelectionInitializer());

            application.run(args);
        }
    }
Use code with caution.
3. Create Profile-Specific Beans (Verification)To verify that the initializer successfully toggled your profiles,
you can create a simple service component that acts differently depending on the active environment.
java
package com.example.service;

public interface DataService {
    String getDataSourceName();
}

Use code with caution.java
package com.example.service;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile("dev")
public class DevDataService implements DataService {
    @Override
    public String getDataSourceName() {
        return "Connected to Local H2 Database (Dev Environment)";
    }
}
Use code with caution.java
package com.example.service;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile("prod")
public class ProdDataService implements DataService {
    @Override
    public String getDataSourceName() {
        return "Connected to Secure AWS RDS MySQL Instance (Production Environment)";
    }
}

Use code with caution.

4. How to Test and Run
You can switch between your profiles by passing the APP_ENV variable during startup.

To run the Dev profile:bash
java -DAPP_ENV=dev -jar your-app.jar

Use code with caution.(If no variable is passed, the fallback logic inside your implementation defaults to dev anyway).

To run the Prod profile:bash
java -DAPP_ENV=prod -jar your-app.jar

Use code with caution.If you would like to expand on this setup, tell me:
Do you also need to load custom .properties or .yml files inside this initializer?Are you using Spring Boot 3.x or an older legacy Spring Framework MVC project?