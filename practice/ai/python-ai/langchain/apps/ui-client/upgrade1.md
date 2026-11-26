This warning appears because Ollama from the older LangChain integration is deprecated. You should use the newer langchain-ollama package and OllamaLLM class.

1. Install the updated package
Run this in your terminal:


bash
pip install -U langchain-ollama
2. Update your Python code
Old code (deprecated):


python
from langchain_community.llms import Ollama

llm = Ollama(model="smollm2:135m")
New code (recommended):


python
from langchain_ollama import OllamaLLM

llm = OllamaLLM(model="smollm2:135m")
3. Test the model

python
from langchain_ollama import OllamaLLM

llm = OllamaLLM(model="smollm2:135m")

response = llm.invoke("What is artificial intelligence?")

print(response)
4. If the model isn't downloaded
Run:


bash
ollama pull smollm2:135m
Make sure the Ollama application/service is running.

Recommended solution
Replace:


python
Ollama(model="smollm2:135m")
with:


python
OllamaLLM(model="smollm2:135m")

run by streamlit run app.py
