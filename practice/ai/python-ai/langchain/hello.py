import os
from langchain_ollama import ChatOllama
from langchain_core.messages import HumanMessage, SystemMessage

# 1. Fetch the API key from environment variables
api_key = os.getenv("OLLAMA_API_KEY")
if not api_key:
    raise ValueError("Missing OLLAMA_API_KEY environment variable.")

# 2. Configure ChatOllama to point to the remote cloud server
# Note: Cloud models (e.g. gemma4:31b) do not need to be downloaded locally.
llm = ChatOllama(
    base_url="https://ollama.com",
    model="gemma4:31b",
    temperature=0.7,
    client_kwargs={
        "headers": {
            "Authorization": f"Bearer {api_key}"
        }
    }
)

# 3. Create the conversational prompt context
messages = [
    SystemMessage(content="You are a brilliant and direct data engineer."),
    HumanMessage(content="Explain what a vector database is using a library catalog analogy.")
]

# 4. Invoke the cloud model and display results
try:
    print("Sending request to Ollama Cloud API...")
    response = llm.invoke(messages)
    print("\n[Ollama Cloud Response]:")
    print(response.content)
except Exception as e:
    print(f"An error occurred: {e}")