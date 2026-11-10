
import os
from langchain_ollama import OllamaLLM
from langchain_core.prompts import PromptTemplate

# Set your NEW regenerated API key in your environment
api_key = os.environ["OLLAMA_API_KEY"]

#set OLLAMA_API_KEY=83e8e6bea3294c04b0cdffaa5f3d49cc.nfiNsZs4z_0t_MQlO9bTceBY

llm = OllamaLLM(
    model="glm-5.3-flash:cloud",
    temperature=0.1,
    base_url="https://ollama.com",
    client_kwargs={
        "headers": {
            "Authorization": f"Bearer {api_key}"
        }
    }
)

prompt = PromptTemplate(
    input_variables=["topic"],
    template="Tell me about {topic}"
)

chain = prompt | llm

response = chain.invoke({"topic": "java"})

print(response)