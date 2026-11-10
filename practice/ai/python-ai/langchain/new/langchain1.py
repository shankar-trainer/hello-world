from langchain_community.llms import Ollama

# llm = Ollama(model="qwen3.5:2b")
llm = Ollama(model="llama3.2")
print(llm.invoke("Explain LangChain in one sentence."))

## 1. Install the required packages

# ```bash
# Core LangChain + community extensions (includes Ollama wrapper)
# pip install "langchain[all]"          # installs core + most optional deps
# pip install langchain-community       # if you only want the community extras
# pip install ollama                    # Python client that the wrapper uses
# ```
#ollama run llama3.2

#
#pip install "langchain[openai]"
#pip install langchain
