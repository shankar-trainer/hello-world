# Spring Boot 4 + Ollama Cloud chat example

This Spring AI app exposes `POST /api/chat` and returns a reply from Ollama Cloud
through its OpenAI-compatible API.

## Run

Requires Java 17+ and Maven. Set your Ollama Cloud API key in the environment;
do not put the key in source control.

PowerShell:

```powershell
$env:OLLAMA_API_KEY = "your-ollama-cloud-api-key"
mvn spring-boot:run
```

The configured model must be available to your Ollama Cloud account. Change
`spring.ai.openai.chat.options.model` in `application.properties` to a model
listed in the Ollama Cloud catalog if `llama3.2` is unavailable.

## Try it

```powershell
Invoke-RestMethod -Method Post `
  -Uri http://localhost:8080/api/chat `
  -ContentType "application/json" `
  -Body '{"message":"Explain Spring AI in one sentence."}'
```

Example response:

```json
{
  "answer": "Ollama Cloud generated response."
}
```

now @Configuration file is removed OllamaCloudConfiguration.java 

so no need to add below line 

$env:OLLAMA_API_KEY = "83e8e6bea3294c04b0cdffaa5f3d49cc.nfiNsZs4z_0t_MQlO9bTceBY"

now in application.properties api-key is added

spring.ai.openai.api-key=83e8e6bea3294c04b0cdffaa5f3d49cc.nfiNsZs4z_0t_MQlO9bTceBY

so directly run below code 

mvn spring-boot:run



== error if api key added in application.properties

The 404 was caused by the base URL: Spring AI appends /chat/completions, so https://ollama.com/api produced the unsupported /api/chat/completions path. I changed it to Ollama Cloud’s OpenAI-compatible /v1 endpoint in application.properties and moved the API key to the OLLAMA_API_KEY environment variable. I also updated the run instructions in README.md.

In PowerShell, set the key and restart the app:


Security: API credentials were present in the properties file. Revoke and replace any exposed keys; don’t reuse them. The configured model must also be available in your Ollama Cloud account—if you get a model-related error after this change, select a model from its cloud catalog.

I verified the endpoint and environment-variable configuration. I couldn’t run a build because Java and Maven aren’t available in this environment.

