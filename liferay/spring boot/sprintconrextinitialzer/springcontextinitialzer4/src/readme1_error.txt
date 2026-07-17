It can be incredibly frustrating when you register an initializer and Spring Boot just completely ignores it.

The most common reason context.addApplicationContextInitializer() "doesn't work" in Spring Boot is a matter of timing.

If you try to call this method after the application context has already started refreshing (for example, inside a @Component or a CommandLineRunner), it’s simply too late. The context is already baked.

Here is how to properly register an ApplicationContextInitializer so Spring Boot actually runs it.

Option 1: Register it via SpringApplication (Recommended)
You need to add the initializer to the SpringApplication instance before calling .run().

Java
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MyApplication {

    public static void main(String[] args) {
        SpringApplication application = new SpringApplication(MyApplication.class);

        // Register your custom initializer here
        application.addInitializers(new MyCustomInitializer());

        application.run(args);
    }
}
Option 2: The SpringApplicationBuilder Fluent API
If you prefer a more fluent configuration style, you can use the builder:

Java
import org.springframework.boot.builder.SpringApplicationBuilder;

public static void main(String[] args) {
    new SpringApplicationBuilder(MyApplication.class)
            .initializers(new MyCustomInitializer())
            .run(args);
}
Option 3: Declarative via spring.factories or META-INF/spring.factories
If you are writing a shared library or prefer automatic discovery without touching the main method, you can register it via the Spring SPI.

Create a file named META-INF/spring.factories in your src/main/resources folder.

Add the following line (replace with your actual package and class name):

Properties
org.springframework.context.ApplicationContextInitializer=\
com.example.MyCustomInitializer
A Quick Checklist if it's Still Not Working
Check your implementation: Ensure your custom initializer class actually implements ApplicationContextInitializer<ConfigurableApplicationContext> and overrides the initialize method.

Are you trying to use @Autowired? Initializers run before the bean factory is fully prepared. You cannot inject Spring beans into an initializer because those beans don't exist yet.

How are you currently trying to trigger your initializer, and what exactly are you trying to set up inside it?