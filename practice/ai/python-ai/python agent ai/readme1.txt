python agentic ai example with ollama on cloud not on local


You can run an agentic AI in Python connected to Ollama in the cloud using either Ollama's official cloud API (https://ollama.com) or an OpenAI-compatible cloud endpoint.

Method 1: Using the Official Ollama Cloud API (ollama Python package)

To connect directly to Ollama's cloud infrastructure, you need an API key from your Ollama Account Dashboard.
1. Set your environment variable:bash
export OLLAMA_API_KEY="your_ollama_api_key"
Use code with caution.
2. Python Agent Example:python
import os
from ollama import Client

# Initialize client pointing to Ollama cloud
client = Client(
    host='https://ollama.com',
    headers={'Authorization': 'Bearer ' + os.environ.get('OLLAMA_API_KEY')}
)

messages = [
    {'role': 'system', 'content': 'You are a helpful research agent.'},
    {'role': 'user', 'content': 'What are 3 key steps to plan a Python project? List them.'}
]

response = client.chat(
    model='gpt-oss:120b',  # Or your chosen cloud model
    messages=messages
)

print(response['message']['content'])
Use code with caution.

Method 2: Using the OpenAI SDK with Ollama Cloud (/v1)

Ollama provides an OpenAI-compatible routing endpoint (https://ollama.com/v1) which lets you use the standard openai Python library with cloud models.
Alternatively, you can initialize the standard OpenAI client pointing to the Ollama cloud base URL:
To implement this using the standard OpenAI library with Ollama's compatible endpoint, refer to the documentation on Ollama Documentation.
If you are building a multi-step agent loop (such as with LangGraph or CrewAI), let me know:
• Which orchestration framework you prefer to use
• Whether you have custom tools (like web search or a database) the agent needs to call
