`ChatResponse` is a custom Java DTO (Data Transfer Object) that you define to send the AI-generated answer back to the client.

For example:

java

```java
public record ChatResponse(String answer) {}
```

In your current code:

java

```java
@PostMapping("/chat")
public ChatResponse chat(@RequestBody ChatRequest request) {
    String answer = chatClient.prompt()
            .user(request.message())
            .call()
            .content();

    return new ChatResponse(answer);
}
```

The API returns JSON like this:

json

```json
{
  "answer": "Hello! How can I help you?"
}
```

## Can you return a simple String?

Yes\! You don't need `ChatResponse` at all.

Simply change your method's return type to `String`:

java

```java
@PostMapping("/chat")
public String chat(@RequestBody ChatRequest request) {
    String answer = chatClient.prompt()
            .user(request.message())
            .call()
            .content();

    return answer;
}
```

Now the response will be a plain string:

text

```text
Hello! How can I help you?
```

## Which should you use?

- String: If you only want to return the AI-generated message.
- ChatResponse: If you plan to return additional information later, such as answer, timestamp, conversation ID, etc.

My recommendation: For your current chatbot implementation, returning `String` is perfectly fine.