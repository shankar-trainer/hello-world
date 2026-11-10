# from langchain web site 

# pip install -qU langchain "langchain[openai]"

from langchain.agents import create_agent

def get_weather(city: str)->str:
    """Get weather for a given city."""
    return f"It's always sunny in {city}!"

agent = create_agent(
    model="ollama:qwen3.5:2b",
    tools=[get_weather],
    system_prompt="You are a helpful assistant",  
)

result = agent.invoke(
    {"messages": [{"role": "user", "content": "What's the weather in San Francisco?"}]}
)
print(result["messages"][-1].content_blocks)



#ollama pull qwen3.5:2b 
#ollama run qwen3.5:2b  no need api key
# pip install ollama



#ollama pull llama3.2
#ollama run llama3.2 no need api key
# pip install ollama
#ollama list 
