import os
from ollama import Client

client = Client(
    host="https://ollama.com",
    headers={"Authorization": f"Bearer {os.environ.get('OLLAMA_API_KEY')}"}
)
response = client.chat(
    model="gemma4:31b-cloud",
    messages=[
        {
            "role": "user",
            "content": "Write a python function to check if a number is prime.",
        }
    ]
)

print(response["message"]["content"])

