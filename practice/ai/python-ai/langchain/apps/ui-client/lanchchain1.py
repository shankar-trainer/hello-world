from langchain_community.llms import Ollama

#llm = Ollama(model="qwen3.5:2b")
#ollama run qwen3.5:2b

# llm = Ollama(model="llama3.2")
# ollama run llama3.2

llm = Ollama(model="smollm2:135m")
# ollama run smollm2:135m
# msg=llm.invoke("Explain genai and agentic ai in one sentence.")

topic=input('enter topic   ')
msg=llm.invoke(topic)

print(msg)

#ollama run smollm2:135m