package com.example.agenticai.agent;

import org.springframework.ai.chat.client.ChatClient;
import org.springframework.stereotype.Service;

@Service
public class AgentService {

    private final ChatClient chatClient;

    public AgentService(ChatClient.Builder chatClientBuilder, CalculatorTools calculatorTools) {
        this.chatClient = chatClientBuilder
                .defaultSystem("""
                        You are a helpful assistant. Use the calculator tool for arithmetic
                        instead of calculating in your head, then explain the result clearly.
                        """)
                .defaultTools(calculatorTools)
                .build();
    }

    public String chat(String message) {
        return chatClient.prompt()
                .user(message)
                .call()
                .content();
    }
}
