package com.example.demo;

import com.example.demo.initializer.MyCustomContextInitializer;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;

@SpringBootTest
@ContextConfiguration(initializers = MyCustomContextInitializer.class)
class DemoApplicationTests {

    @Test
    void contextLoads() {
        // Test context will load with "performance-mode" profile active
    }
}
