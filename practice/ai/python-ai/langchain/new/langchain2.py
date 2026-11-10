from langchain_community.llms import Ollama

#llm = Ollama(model="qwen3.5:2b")
#ollama run qwen3.5:2b

# llm = Ollama(model="llama3.2")
# ollama run llama3.2

msg=llm.invoke("Explain genai and agentic ai in one sentence.")

print(msg)

# error for llm = Ollama(model="qwen3.5:2b")   LangChainDeprecationWarning: The class `Ollama` was deprecated in LangChain 0.3.1 and will be removed in 1.0.0. An updated version of the class exists in the `langchain-ollama package and should be used instead. To use it run
#  `pip install -U `langchain-ollama` and import as `from `langchain_ollama import OllamaLLM``.
#   llm=Ollama(model="qwen3.5:2b")
