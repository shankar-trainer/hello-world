# Spring Boot 4 agent with Ollama Cloud

This example uses Spring AI tool calling to let a chat model decide when to invoke a Java calculator. Requests go directly to Ollama Cloud over HTTPS; you do not need to install or run Ollama locally.

## Requirements

- Java 21
- Maven 3.6.3 or newer
- An Ollama Cloud API key from <https://ollama.com/settings/keys>

## Run

In PowerShell, set the API key and start the app:

```powershell
$env:OLLAMA_API_KEY = "your-ollama-cloud-api-key"
# Optional: choose another model available to your Ollama Cloud account.
$env:OLLAMA_MODEL = "gpt-oss:120b"
mvn spring-boot:run
```

The default model can be changed with `OLLAMA_MODEL`. The API key is read from the environment and is not stored in the project.

## Try it

```powershell
Invoke-RestMethod `
  -Method Post `
  -Uri http://localhost:8080/api/agent/chat `
  -ContentType "application/json" `
  -Body '{"message":"What is 137 multiplied by 29? Show the calculation."}'
```

The request/response JSON shapes are:

```json
{"message":"What is 137 multiplied by 29?"}
```

```json
{"answer":"137 multiplied by 29 is 3,973."}
```

## Configuration

`application.properties` sets the OpenAI-compatible endpoint to `https://ollama.com`. Spring AI sends requests to Ollama Cloud's chat completions API and supplies `OLLAMA_API_KEY` as the bearer token. It does not use `localhost:11434`.
