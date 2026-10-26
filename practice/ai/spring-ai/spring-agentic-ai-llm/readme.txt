
agentic ai in spring boot 4.x example with ollama on cloud not local


To run an agentic AI application using Spring Boot 4.x and Ollama hosted on the cloud, you use the identical ChatClient architecture as local instances, redirecting the Spring AI base URL configuration to point to your cloud endpoint.
The primary requirement for agentic AI (tool calling/function execution) is choosing a cloud-hosted Ollama model that supports native function execution (such as qwen2.5, llama3.1, or mistral).

1. Maven Dependencies (pom.xml)

Ensure you use the latest Spring Boot 4.x parent and the corresponding Spring AI 2.x milestones.
xml
<parent>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter-parent</artifactId>
    <version>4.0.0</version> <!-- Or latest 4.x release -->
</parent>

<dependencies>
    <dependency>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-web</artifactId>
    </dependency>
    <!-- Native Spring AI Ollama Starter -->
    <dependency>
        <groupId>org.springframework.ai</groupId>
        <artifactId>spring-ai-ollama-spring-boot-starter</artifactId>
    </dependency>
</dependencies>

<dependencyManagement>
    <dependencies>
        <dependency>
            <groupId>org.springframework.ai</groupId>
            <artifactId>spring-ai-bom</artifactId>
            <version>2.0.0-SNAPSHOT</version> <!-- Spring Boot 4 companion -->
            <type>pom</type>
            <scope>import</scope>
        </dependency>
    </dependencies>
</dependencyManagement>
Use code with caution.

2. Cloud Configuration (application.yml)

Instead of pointing to localhost, map the base-url property to your remote cloud server instance (e.g., hosted via AWS EC2, GCP, RunPod, or a managed Ollama instance).
yaml
spring:
  ai:
    ollama:
      # Swap localhost out for your public Cloud endpoint or IP address
      base-url: https://your-ollama-cloud-domain-or-ip:11434
      chat:
        options:
          # Crucial: Model must natively support function/tool calling
          model: qwen2.5 
          temperature: 0.4
Use code with caution.
(Note: If your cloud-hosted Ollama endpoint is secured behind an API Key proxy or basic auth gateway, map your properties to spring.ai.openai styles pointing to /v1 since Ollama provides an OpenAI-compliant compatibility layer).

3. Registering the Agent's Tools (Functions)

Define the Java methods that your cloud AI agent can autonomously decide to call. Annotate them as a @Bean using Spring's Function interface.
java
package com.example.agent.config;

import org.springframework.context.annotation.Bean;
            import org.springframework.context.annotation.Configuration;
            import org.springframework.context.annotation.Description;
            import java.util.function.Function;

@Configuration
public class AgentToolsConfig {

    // Input signature for the tool
    public record DeliveryRequest(String orderId) {}
    // Output response from the tool
    public record DeliveryStatus(String status, String eta) {}

    @Bean
    @Description("Get the live delivery tracking status and ETA for a specific order ID")
    public Function<DeliveryRequest, DeliveryStatus> checkDeliveryStatus() {
        return request -> {
            // Business logic: fetch from cloud DB or ERP system
            System.out.println("--- Agent executed tool for order: " + request.orderId() + " ---");
            if ("ORD-123".equals(request.orderId())) {
                return new DeliveryStatus("IN_TRANSIT", "2 hours");
            }
            return new DeliveryStatus("UNKNOWN_ORDER", "N/A");
        };
    }
}
Use code with caution.

4. Creating the Agentic Controller

Inject the ChatClient.Builder to assemble your agent. Register the bean name of your tool inside the client configurations so the cloud model knows it has permission to call it.
java
package com.example.agent.controller;

import org.springframework.ai.chat.client.ChatClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AgentController {

    private final ChatClient agentClient;

    public AgentController(ChatClient.Builder builder) {
        this.agentClient = builder
            .defaultSystem("You are a helpful customer support agent. " +
                            "Use the provided tools autonomously whenever a user asks about order tracing.")
            .build();
    }

    @GetMapping("/api/agent/chat")
    public String askAgent(@RequestParam String userPrompt) {
        return this.agentClient.prompt()
            .user(userPrompt)
            // Registering the tool by its method bean name
            .functions("checkDeliveryStatus") 
            .call()
            .content();
    }
}
Use code with caution.

Execution Flow

1. A client calls GET /api/agent/chat?userPrompt=Where is my package ORD-123?.
2. The Spring Boot application sends the system prompt, user prompt, and the checkDeliveryStatus metadata structure over to the remote Ollama Cloud instance.
3. The Cloud model evaluates the text, recognizes it needs structural details, and responds back asking to invoke the function.
4. Spring AI automatically executes the checkDeliveryStatus bean on your server, feeds the execution result back up to the cloud model, and returns a natural language response back to the client.