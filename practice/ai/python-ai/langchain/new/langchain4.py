from langchain_ollama import OllamaLLM
from langchain_core.prompts import PromptTemplate

llm = OllamaLLM(
    model="qwen3.5:2b",
#    model="smollm2:135m",
    temperature=0.1
)

prompt = PromptTemplate(
    input_variables=["topic"],
    template="Tell me about {topic}"
)

chain = prompt | llm

# response = chain.invoke({"topic": "Begusarai"})
response = chain.invoke({"topic": "java"})

print(response)