# --- System ---
You are an expert programming agent. Focus on correctness and simplicity.

# --- User ---
File: F:\ishaan\2026\ai\python-ai\langgraph\langgraph1.py
```
from typing import TypedDict
from langgraph.graph import StateGraph, START, END

# Define state
class State(TypedDict):
    message: str

# Define node
def greeting(state: State):
    return {
        "message": "Hello from LangGraph!"
    }

# Create graph
graph = StateGraph(State)

# Add node
graph.add_node("greeting", greeting)

# Connect nodes
graph.add_edge(START, "greeting")
graph.add_edge("greeting", END)

# Compile
app = graph.compile()

# Execute
result = app.invoke({
    "message": ""
})

print(result)

```
what api used here


# --- Agent ---

## --- Thinking ---
>The user asks: "what api used here". They show a Python file using langgraph. They likely want to know which API is being used, maybe from LangGraph library. They imported StateGraph, START, END from langgraph.graph. So the API used is LangGraph's StateGraph API for building graph of nodes. Also they used TypedDict from typing. So answer: It's using LangGraph's StateGraph API, which is part of LangChain? Actually LangGraph is a library built on LangChain for graph workflows. So answer: using LangGraph's graph API, specifically StateGraph, nodes, edges, compile, invoke.
> 
> Explain each component: START, END are sentinel nodes. Also mention that invoke uses the compiled graph as a runnable.
> 
> Thus respond.

## --- Response ---
The code is using **LangGraph's "State-Graph" API** - the high-level graph-building interface that LangGraph provides on top of LangChain.

### What you see in the script

| Line / Symbol | What it is | Role in the LangGraph API |
|---------------|------------|---------------------------|
| `from langgraph.graph import StateGraph, START, END` | Imports the core graph primitives from **`langgraph.graph`** | `StateGraph` is the class you instantiate to define a graph; `START` and `END` are special sentinel nodes that mark the entry- and exit-points of the workflow. |
| `class State(TypedDict): ...` | A **TypedDict** that describes the shape of the graph's state | LangGraph expects a *state schema* so it can type-check the data that flows between nodes. |
| `def greeting(state: State): ...` | A **node function** (a "runnable") | Any callable that receives the current `state` and returns a dictionary of updates. This is the basic building block of a LangGraph node. |
| `graph = StateGraph(State)` | **Graph construction** | Creates a new graph instance that knows the state schema. |
| `graph.add_node("greeting", greeting)` | **Node registration** | Registers the `greeting` function under the name `"greeting"` so the graph can route to it. |
| `graph.add_edge(START, "greeting")` | **Edge definition** | Connects the start sentinel to the `"greeting"` node - this tells the engine where to begin execution. |
| `graph.add_edge("greeting", END)` | **Edge definition** | Connects the `"greeting"` node to the end sentinel - this tells the engine when the workflow is finished. |
| `app = graph.compile()` | **Compilation** | Turns the declarative graph description into an executable **Runnable** (the same interface LangChain uses). |
| `result = app.invoke({"message": ""})` | **Invocation** | Runs the compiled graph with an initial state (here an empty `"message"` field). The returned `result` is the final state after all nodes have executed. |
| `print(result)` | **Output** | Shows the final state, which will be `{'message': 'Hello from LangGraph!'}`. |

### In short

- **API/library:** `langgraph.graph` -> **StateGraph API** (part of the LangGraph library, which itself builds on LangChain's Runnable interface).
- **Key concepts used:**  
  - **State schema** (`TypedDict`)  
  - **Node functions** (`greeting`)  
  - **Graph construction** (`StateGraph`)  
  - **Edges** (`add_edge`) with the special `START` / `END` nodes  
  - **Compilation** (`compile`) producing a Runnable (`app`)  
  - **Execution** (`invoke`)

If you look at the LangGraph documentation, you'll find the same pattern under *"Simple state-graph example"* - that's exactly what this script demonstrates.

# --- User ---
