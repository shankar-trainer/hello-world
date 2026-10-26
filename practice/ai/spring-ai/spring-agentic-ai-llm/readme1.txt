1st way 
in application.properties  add following 

    spring.ai.openai.api-key=83e8e6bea3294c04b0cdffaa5f3d49cc.nfiNsZs4z_0t_MQlO9bTceBY

    spring.ai.openai.chat.options.model=${OLLAMA_MODEL:gemma4:31b}
    or 
    spring.ai.openai.chat.options.model=gemma4:31b

    then mvn spring-boot:run 

2nd way 
or in application.properties set 
    spring.ai.openai.chat.options.model=gemma4:31b
    spring.ai.openai.api-key=${OLLAMA_API_KEY}
    in powershell 

    $env:OLLAMA_API_KEY = "83e8e6bea3294c04b0cdffaa5f3d49cc.nfiNsZs4z_0t_MQlO9bTceBY"
    then mvn spring-boot:run 

    
```powershell
Invoke-RestMethod `
  -Method Post `
  -Uri http://localhost:8080/api/agent/chat `
  -ContentType "application/json" `
  -Body '{"message":"What is 137 multiplied by 29? Show the calculation."}'
```
