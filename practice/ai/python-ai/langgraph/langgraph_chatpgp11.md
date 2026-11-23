# LangGraph Tutorial – Beginner to Advanced (Python)

Let's learn **LangGraph step by step**, starting from the basics and gradually building real-world AI agents.

## 1\. What is LangGraph?

LangGraph  is an open-source Python framework developed by the LangChain team for building **stateful, multi-step AI agents and workflows**.

It allows you to build AI applications that can:

- Remember previous conversations.
- Make decisions based on user input.
- Call external tools and APIs.
- Execute multiple tasks.
- Loop until a task is completed.
- Pause and wait for human approval.
- Build multi-agent systems.

### LangChain vs LangGraph

| LangChain | LangGraph |
| --- | --- |
| Build LLM applications | Build complex AI workflows |
| Chain-based execution | Graph-based execution |
| Good for sequential tasks | Good for conditional and cyclic tasks |
| Agent abstractions | Fine-grained agent control |
| Basic workflow orchestration | Stateful workflow orchestration |

---

## 2\. Core Concepts of LangGraph

You should understand these six concepts.

| Concept | Meaning |
| --- | --- |
| State | Stores information shared between nodes |
| Nodes | Individual functions that perform tasks |
| Edges | Connect nodes and determine execution flow |
| Conditional Edges | Decide which node executes next |
| Checkpointer | Saves graph state for persistence |
| Messages | Stores conversation history |

### How LangGraph works

Imagine building an AI research assistant.

text

```text
       User Question
             |
             v
        Input Node
             |
             v
       Research Node
             |
             v
       Analysis Node
             |
             v
        Answer Node
             |
             v
        Final Output
```

Each box is a node, and arrows are edges.

---

# 3\. Installation and Setup

First, create a project.

bash

```bash
mkdir langgraph-tutorial
cd langgraph-tutorial
```

Create a virtual environment:

bash

```bash
python -m venv venv
```

Activate it:

Windows:

bash

```bash
venv\Scripts\activate
```

Linux/Mac:

bash

```bash
source venv/bin/activate
```

Install LangGraph:

bash

```bash
pip install -U langgraph
```

---

# 4\. First LangGraph Program

Let's build a simple graph without an LLM.

### Step 1: Import libraries

python

```python
from typing import TypedDict
from langgraph.graph import StateGraph, START, END
```

### Step 2: Define State

State stores the information that flows through the graph.

python

```python
class MyState(TypedDict):
    message: str
```

### Step 3: Create a Node

A node is simply a Python function.

python

```python
def greeting_node(state: MyState):
    return {
        "message": "Hello " + state["message"]
    }
```

### Step 4: Create Graph

python

```python
graph_builder = StateGraph(MyState)

graph_builder.add_node("greeting", greeting_node)

graph_builder.add_edge(START, "greeting")

graph_builder.add_edge("greeting", END)
```

### Step 5: Compile Graph

python

```python
graph = graph_builder.compile()
```

### Step 6: Execute Graph

python

```python
result = graph.invoke({
    "message": "World"
})

print(result)
```

Output:

python

```python
{
    'message': 'Hello World'
}
```

Congratulations\! You've created your first LangGraph application.

---

# 5\. Understanding Nodes and Edges

Let's create a workflow with multiple nodes.

text

```text
       START
         |
         v
      Node A
         |
         v
      Node B
         |
         v
      Node C
         |
         v
        END
```

Code:

python

```python
from typing import TypedDict
from langgraph.graph import StateGraph, START, END

class State(TypedDict):
    number: int

def node_a(state):
    return {"number": state["number"] + 10}

def node_b(state):
    return {"number": state["number"] * 2}

def node_c(state):
    return {"number": state["number"] - 5}

builder = StateGraph(State)

builder.add_node("A", node_a)
builder.add_node("B", node_b)
builder.add_node("C", node_c)

builder.add_edge(START, "A")
builder.add_edge("A", "B")
builder.add_edge("B", "C")
builder.add_edge("C", END)

graph = builder.compile()

result = graph.invoke({"number": 5})

print(result)
```

Output:

python

```python
{'number': 25}
```

Calculation:

- Initial number = 5
- Node A = 5 + 10 = 15
- Node B = 15 × 2 = 30
- Node C = 30 - 5 = 25

---

# 6\. Conditional Edges

Conditional edges allow an AI workflow to make decisions.

Example:

text

```text
          START
             |
             v
         Check Age
             |
       -------------
       |           |
      Age         Age
     >=18         <18
       |           |
       v           v
    Adult        Minor
       |           |
       -------------
             |
             v
            END
```

Code:

python

```python
from typing import TypedDict
from langgraph.graph import StateGraph, START, END

class State(TypedDict):
    age: int
    result: str

def check_age(state):
    return {}

def adult(state):
    return {"result": "You are an adult"}

def minor(state):
    return {"result": "You are a minor"}

def age_router(state):
    if state["age"] >= 18:
        return "adult"
    return "minor"

builder = StateGraph(State)

builder.add_node("check_age", check_age)
builder.add_node("adult", adult)
builder.add_node("minor", minor)

builder.add_edge(START, "check_age")

builder.add_conditional_edges(
    "check_age",
    age_router,
    {
        "adult": "adult",
        "minor": "minor"
    }
)

builder.add_edge("adult", END)
builder.add_edge("minor", END)

graph = builder.compile()

print(graph.invoke({
    "age": 22,
    "result": ""
}))
```

Output:

python

```python
{
    'age': 22,
    'result': 'You are an adult'
}
```

---

# 7\. Build an AI Chatbot Using LangGraph

Now let's integrate an LLM.

Install dependencies:

bash

```bash
pip install -U langchain-openai langgraph
```

Set your API key:

bash

```bash
export OPENAI_API_KEY="your-api-key"
```

For Windows PowerShell:

powershell

```powershell
$env:OPENAI_API_KEY="your-api-key"
```

### Complete chatbot example

python

```python
from langchain_openai import ChatOpenAI

from langgraph.graph import (
    StateGraph,
    START,
    END,
    MessagesState
)

from langgraph.checkpoint.memory import InMemorySaver

# Initialize model
model = ChatOpenAI(
    model="gpt-4.1-mini"
)

# Create chatbot node
def chatbot(state: MessagesState):

    response = model.invoke(
        state["messages"]
    )

    return {
        "messages": [response]
    }

# Build graph
builder = StateGraph(MessagesState)

builder.add_node("chatbot", chatbot)

builder.add_edge(START, "chatbot")

builder.add_edge("chatbot", END)

# Add memory
memory = InMemorySaver()

graph = builder.compile(
    checkpointer=memory
)

# Configure conversation
config = {
    "configurable": {
        "thread_id": "user_1"
    }
}

# First message
response = graph.invoke(
    {
        "messages": [
            ("user", "My name is Rahul")
        ]
    },
    config
)

print(response["messages"][-1].content)

# Second message
response = graph.invoke(
    {
        "messages": [
            ("user", "What is my name?")
        ]
    },
    config
)

print(response["messages"][-1].content)
```

The chatbot can remember the previous conversation because we added a checkpointer and reused the same `thread_id`.

Note: `InMemorySaver` is suitable for demonstrations. Production applications should use a persistent checkpointer.

---

# 8\. Important Advanced Topics

Once you understand the fundamentals, learn these topics in order.

| No. | Topic | What you'll learn |
| --- | --- | --- |
| 1 | State Management | TypedDict, schemas, reducers |
| 2 | Conditional Routing | Dynamic workflow execution |
| 3 | Tool Calling | Connect APIs and external tools |
| 4 | ReAct Agents | Reasoning and tool execution loops |
| 5 | Memory | Short-term and long-term memory |
| 6 | Persistence | Checkpointing and recovery |
| 7 | Human-in-the-Loop | Human approval and interrupts |
| 8 | Streaming | Stream agent responses |
| 9 | Parallel Execution | Execute multiple nodes simultaneously |
| 10 | Multi-Agent Systems | Supervisor and worker agents |
| 11 | RAG with LangGraph | Build intelligent document assistants |
| 12 | Deployment | Deploy production-ready AI agents |

---

# 9\. Real-World Projects to Build

After completing the basics, try these projects:

1. **AI Chatbot:** Conversational chatbot with memory.
2. **Research Agent:** Searches the internet and generates research reports.
3. **PDF RAG Agent:** Answers questions from uploaded documents.
4. **Customer Support Agent:** Handles customer queries using tools.
5. **Multi-Agent System:** Multiple specialized agents collaborate.
6. **AI Coding Agent:** Analyzes code and suggests improvements.
7. **Human Approval Agent:** Requests human approval before executing important actions.

---

# 10\. Best Free Learning Resources

These are particularly useful:

1. **Official LangGraph documentation**[LangGraph Documentation](<https://docs.langchain.com/oss/python/langgraph/overview?utm_source=chatgpt.com>)
2. **Official LangGraph Academy**[Introduction to LangGraph – Free Course](<https://academy.langchain.com/courses/intro-to-langgraph?source=post_page-----18a5c6b8e34a---------------------------------------&utm_source=chatgpt.com>)
   Covers graphs, agents, state, memory, streaming and human-in-the-loop.
3. **LangGraph 101 – GitHub**[LangGraph 101 Tutorials](<https://github.com/langchain-ai/langgraph-101?utm_source=chatgpt.com>)
4. **Official GitHub Repository**[LangGraph GitHub](<https://github.com/langchain-ai/langgraph?utm_source=chatgpt.com>)

---

## Recommended Learning Roadmap

I recommend following this sequence:

| Day | Learning |
| --- | --- |
| Day 1 | Introduction, State, Nodes, Edges |
| Day 2 | Conditional Edges and Graph Routing |
| Day 3 | LLM Integration and Chatbot |
| Day 4 | Tool Calling and ReAct Agents |
| Day 5 | Short-term and Long-term Memory |
| Day 6 | Human-in-the-Loop and Persistence |
| Day 7 | Multi-Agent Systems |
| Day 8 | RAG with LangGraph |
| Day 9 | Streaming and Advanced Workflows |
| Day 10 | Build an End-to-End AI Agent |

**My suggestion:** Learn LangGraph by writing code rather than just watching tutorials. Start with State, Nodes and Edges, then gradually move towards building tool-calling agents and multi-agent systems.