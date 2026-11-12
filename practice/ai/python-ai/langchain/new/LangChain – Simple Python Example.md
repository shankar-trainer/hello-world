## LangChain – Simple Python Example

LangChain is a Python framework for building applications powered by Large Language Models (LLMs), such as ChatGPT, Gemini, and Claude.

Let's start with a very simple example.

### 1. Install LangChain

bash

```bash
pip install langchain langchain-openai
```

### 2. Simple LangChain code

This example sends a question to an OpenAI model and gets an answer.

python

```python
from langchain_openai import ChatOpenAI

# Initialize the LLM
llm = ChatOpenAI(
    model="gpt-4o-mini",
    temperature=0,
    api_key="YOUR_OPENAI_API_KEY"
)

# Ask a question
response = llm.invoke("What is LangChain?")

# Print response
print(response.content)
```

### 3. Example with a Prompt Template

Prompt templates help create reusable prompts.

python

```python
from langchain_openai import ChatOpenAI
from langchain_core.prompts import ChatPromptTemplate

llm = ChatOpenAI(
    model="gpt-4o-mini",
    temperature=0
)

# Create prompt template
prompt = ChatPromptTemplate.from_template(
    "Explain {topic} in simple words."
)

# Create chain
chain = prompt | llm

# Execute chain
response = chain.invoke({
    "topic": "Artificial Intelligence"
})

print(response.content)
```

### 4. Understand how LangChain works

User Input
    "Explain Python"

Prompt Template
    Formats the user question

LLM (GPT)
    Generates an answer

Output
    Python is a programming language...

### 5. Important LangChain concepts

| Concept | Purpose |
| --- | --- |
| Model | Connects to an LLM |
| Prompt Template | Creates reusable prompts |
| Chain | Connects multiple components |
| Retriever | Retrieves relevant documents |
| Vector Store | Stores document embeddings |
| Agent | Uses tools to perform tasks |
| Memory | Maintains conversational context |

### 6. What should you learn next?

I recommend learning LangChain in this order:

1. Basic LLM integration
2. Prompt Templates
3. Chains and LCEL
4. Chatbots
5. Document Loaders
6. Embeddings and Vector Databases
7. RAG (Retrieval-Augmented Generation)
8. AI Agents and Tools

Next, I can show you a simple LangChain RAG project where you upload a PDF and ask questions about its contents.