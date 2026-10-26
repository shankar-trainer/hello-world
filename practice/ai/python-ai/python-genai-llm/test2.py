import os
from openai import OpenAI

# Configure the client to hit the Ollama Cloud v1 endpoint
client = OpenAI(
    base_url="https://ollama.com/v1",
    api_key=os.environ.get("OLLAMA_API_KEY")
)

# Call the cloud model
completion = client.chat.completions.create(
    model="gemma4:31b-cloud",
    messages=[
        {"role": "user", "content": "Explain quantum computing in one sentence."}
    ]
)

print(completion.choices[0].message.content)