package com.example.agenticai.agent;

import org.springframework.ai.tool.annotation.Tool;
import org.springframework.ai.tool.annotation.ToolParam;
import org.springframework.stereotype.Component;

@Component
public class CalculatorTools {

    @Tool(description = "Perform basic arithmetic on two numbers.")
    public double calculate(
            @ToolParam(description = "The first number") double left,
            @ToolParam(description = "Operation: add, subtract, multiply, or divide") String operation,
            @ToolParam(description = "The second number") double right) {
        return switch (operation.toLowerCase()) {
            case "add" -> left + right;
            case "subtract" -> left - right;
            case "multiply" -> left * right;
            case "divide" -> {
                if (right == 0) {
                    throw new IllegalArgumentException("Cannot divide by zero.");
                }
                yield left / right;
            }
            default -> throw new IllegalArgumentException("Unsupported operation: " + operation);
        };
    }
}
