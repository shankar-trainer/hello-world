import ollama

response = ollama.chat(
    model='qwen3.5:2b',
    messages=[{'role': 'user', 'content': 'Hello!'}],
)
print(response['message']['content'])