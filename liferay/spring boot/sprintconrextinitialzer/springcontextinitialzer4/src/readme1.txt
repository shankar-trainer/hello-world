Here’s a complete, runnable example of using ApplicationContextInitializer in Spring.
This is useful when you want to programmatically modify the ConfigurableApplicationContext before it is refreshed — for example, to set environment properties or activate profiles.

Example: Setting a Custom Property Before Context Refresh
Java

Copy code
package com.example.demo;

import org.springframework.context.ApplicationContextInitializer;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.ConfigurableEnvironment;

// Custom initializer
public class MyApplicationContextInitializer
        implements ApplicationContextInitializer<ConfigurableApplicationContext> {

    @Override
    public void initialize(ConfigurableApplicationContext applicationContext) {
        ConfigurableEnvironment env = applicationContext.getEnvironment();
        // Add a custom property before the context is refreshed
        env.getSystemProperties().put("app.custom.message", "Hello from Initializer!");
        System.out.println("ApplicationContextInitializer executed.");
    }

    // Main method to run without Spring Boot
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext();
        context.addApplicationContextInitializer(new MyApplicationContextInitializer());
        context.register(AppConfig.class);
        context.refresh();

        MyService service = context.getBean(MyService.class);
        service.printMessage();

        context.close();
    }
}

// Spring configuration
@Configuration
class AppConfig {
    @Bean
    public MyService myService() {
        return new MyService();
    }
}

// Simple service bean
class MyService {
    public void printMessage() {
        String message = System.getProperty("app.custom.message", "Default Message");
        System.out.println("Message: " + message);
    }
}
How It Works

MyApplicationContextInitializer implements ApplicationContextInitializer<ConfigurableApplicationContext>.
In initialize(), we modify the environment before the context is refreshed.
We manually add the initializer to the context via addApplicationContextInitializer(...).
The bean MyService reads the property set by the initializer.
Using with Spring Boot
If you’re using Spring Boot, you can register the initializer in:

spring.factories (Spring Boot ≤ 2.3) or
META-INF/spring/org.springframework.boot.SpringApplicationRunListener (newer versions)
or simply via:
Java

Copy code
SpringApplication app = new SpringApplication(MySpringBootApp.class);
app.addInitializers(new MyApplicationContextInitializer());
app.run(args);
✅ This example is self-contained and works in both plain Spring and Spring Boot.
If you want, I can also give you a JUnit test example showing @ContextConfiguration(initializers = ...) for integration testing.


===================================
Spring Core Testing - Initializing ConfigurableApplicationContext with ApplicationContextInitializer.
[Last Updated: Feb 12, 2026]
ApplicationContextInitializer interface can be used for some programmatic initialization of the application context. For example, registering property sources or activating profiles with the context environment.

This example demonstrates how to use ApplicationContextInitializer with Spring tests by using 'initializers' element of @ContextConfiguration.

Example
Creating a simple Spring application
package com.logicbig.example;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
public class AppConfig {

    @Bean
    @Profile("windows")
    public MyService myServiceA() {
        return new MyServiceA();
    }

    @Bean
    @Profile("other")
    public MyService myServiceB() {
        return new MyServiceB();
    }
}
package com.logicbig.example;

public interface MyService {
    public String doSomething();

}
package com.logicbig.example;

public class MyServiceA implements MyService {

    @Override
    public String doSomething() {
        return "in " + this.getClass().getSimpleName();
    }
}
package com.logicbig.example;

public class MyServiceB implements MyService {

    @Override
    public String doSomething() {
        return "in " + this.getClass().getSimpleName();
    }
}
Implementing the Initializer
package com.logicbig.example;

import org.springframework.context.ApplicationContextInitializer;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;

public class MyApplicationContextInitializer implements
        ApplicationContextInitializer<ConfigurableApplicationContext> {

    @Override
    public void initialize(ConfigurableApplicationContext ac) {
        String os = System.getProperty("os.name");
        String profile = (os.toLowerCase().startsWith("windows")) ? "windows" : "other";
        ConfigurableEnvironment ce = ac.getEnvironment();
        ce.addActiveProfile(profile);
    }
}
The JUnit test
Following test will fail if run other than Windows O.S.

package com.logicbig.example;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(SpringExtension.class)
@ContextConfiguration(classes = AppConfig.class,
        initializers = MyApplicationContextInitializer.class)
public class MyServiceTests {

    @Autowired
    private MyService dataService;

    @Test
    public void testDoSomething() {
        String s = dataService.doSomething();
        System.out.println(s);
        assertEquals("in MyServiceA", s);
    }
}