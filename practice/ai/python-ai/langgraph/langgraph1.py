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
