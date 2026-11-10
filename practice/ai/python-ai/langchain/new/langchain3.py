#llm = Ollama(model="qwen3.5:2b")
# pip install -U langchain-ollama

# (Optional) make sure LangChain core is up-to-date
# pip install -U langchain


from langchain_ollama import OllamaLLM   # <-- NEW import

# Create the model instance.
# The class name changed from `Ollama` -> `OllamaLLM`,
# but the constructor arguments are the same.

llm = OllamaLLM(model="qwen3.5:2b")   # or model="llama3.2", etc.

# -----------------------------------------------------------------
#  You can call the model in two common ways:
#   * .invoke(prompt)   - returns the raw string response
#   * .invoke(prompt, stop=None, **kwargs) - same signature as before
#   * .stream(prompt)   - generator for token-by-token streaming
# -----------------------------------------------------------------

prompt = "Explain genai and agentic ai in one sentence."

# Simple (synchronous) call
response: str = llm.invoke(prompt)

print("\n=== Ollama response ===")
print(response)

# ollama run qwen3.5:2b

