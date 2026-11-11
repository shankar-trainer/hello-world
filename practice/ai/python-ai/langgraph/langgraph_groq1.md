Below is a **step-by-step tutorial** for getting started with **LangGraph** - the graph-oriented orchestration library built on top of LangChain.  
It walks you through installation, core concepts, building a simple graph, adding memory, branching, loops, and finally deploying the graph as an API.

---

## 1. What is LangGraph?

LangGraph lets you **compose LLM calls, tools, and custom Python functions into a directed graph**.  
Each node (called a **"step"**) produces an output that can be routed to one or more downstream steps.  
The runtime executes the graph, handling:

| Feature | What it gives you |
|---------|-------------------|
| **Deterministic routing** | Conditional branches (`if/else`) based on LLM output or state. |
| **Loops & recursion** | Repeat a sub-graph until a condition is met (e.g., "keep asking until answer is valid"). |
| **Stateful memory** | A mutable `state` dict that every step can read/write. |
| **Tool integration** | Call external APIs, databases, or any Python function as a node. |
| **Parallel execution** | Run independent branches concurrently (via `async`). |
| **Persistence** | Serialize the state to resume later or store in a DB. |

Think of it as a **visual programming language for LLM workflows**, but all defined in pure Python.

---

## 2. Installation

```bash
# Core LangGraph + LangChain (recommended)
pip install "langgraph[all]"   # pulls in langchain, pydantic, tqdm, etc.

# If you only need the lightweight core:
# pip install langgraph
```

> **Tip:** Use a virtual environment (or `conda`) to keep dependencies isolated.

---

## 3. Core Concepts

| Concept | Description |
|---------|-------------|
| **Node (Step)** | A callable that receives `state` and returns a dict of updates. |
| **Graph** | A mapping of node names -> callables + routing rules. |
| **State** | A mutable dict (`Dict[str, Any]`) shared across the whole execution. |
| **Edge / Router** | A function that decides which node(s) to run next based on the current state. |
| **Executor** | `graph.compile().invoke(state)` runs the graph synchronously; `graph.compile().ainvoke(state)` runs it async. |
| **Checkpoint** | Serialized snapshot of the state + current node, useful for resumable workflows. |

---

## 4. Minimal "Hello-World" Graph

```python
from langgraph.graph import StateGraph, END
from langchain.llms import OpenAI   # or any other LangChain LLM wrapper

# 1. Define the LLM we'll use (OpenAI for demo)
llm = OpenAI(model="gpt-4o-mini", temperature=0.0)

# 2. Define a node that asks a question via the LLM
def ask_question(state):
    prompt = "What is the capital of France?"
    answer = llm.invoke(prompt)          # synchronous call
    # Store the answer in the shared state
    return {"answer": answer, "next": "show_answer"}

# 3. Define a node that displays the answer
def show_answer(state):
    print("✅ Answer from LLM:", state["answer"])
    return {"next": END}                 # END tells the executor to stop

# 4. Build the graph
graph = StateGraph()
graph.add_node("ask_question", ask_question)
graph.add_node("show_answer", show_answer)

# 5. Define routing (explicit here, but you can also use a router function)
graph.set_entry_point("ask_question")
graph.add_edge("ask_question", "show_answer")
graph.add_edge("show_answer", END)

# 6. Compile & run
app = graph.compile()
app.invoke(state={})   # empty initial state
```

**Output**

```
✅ Answer from LLM: Paris
```

That's the whole graph in ~15 lines! 🎉

---

## 5. Adding Conditional Branches

Let's ask the user for a number and decide whether it's **even** or **odd**.

```python
from langgraph.graph import StateGraph, END, START
from langchain.prompts import ChatPromptTemplate
from langchain.schema import HumanMessage

# Prompt template (re-usable)
prompt_template = ChatPromptTemplate.from_messages([
    ("system", "You are a helpful math assistant."),
    ("human", "{question}")
])

def ask_number(state):
    # In a real app you could get this from an API or UI; here we hard-code.
    question = "Give me a random integer between 1 and 20."
    resp = llm.invoke(prompt_template.format_messages(question=question))
    # Extract the integer (simple regex)
    import re
    num = int(re.search(r"\d+", resp).group())
    return {"number": num, "next": "check_parity"}

def check_parity(state):
    n = state["number"]
    parity = "even" if n % 2 == 0 else "odd"
    return {"parity": parity, "next": f"say_{parity}"}

def say_even(state):
    print(f"The number {state['number']} is **even**.")
    return {"next": END}

def say_odd(state):
    print(f"The number {state['number']} is **odd**.")
    return {"next": END}

# Build graph
g = StateGraph()
g.add_node("ask_number", ask_number)
g.add_node("check_parity", check_parity)
g.add_node("say_even", say_even)
g.add_node("say_odd", say_odd)

g.set_entry_point("ask_number")
g.add_edge("ask_number", "check_parity")
g.add_edge("check_parity", "say_even")
g.add_edge("check_parity", "say_odd")   # both edges are allowed; router decides

# Router for the parity decision
def parity_router(state):
    # `state["parity"]` is set by `check_parity`
    if state["parity"] == "even":
        return "say_even"
    else:
        return "say_odd"

g.set_conditional_router("check_parity", parity_router)

app = g.compile()
app.invoke(state={})
```

**Key point:** `set_conditional_router(node_name, fn)` lets you decide the *next* node based on the updated state.

---

## 6. Loops - "Ask Until Valid"

Suppose we need the user (or LLM) to give a **valid email address**. We'll loop until the regex matches.

```python
import re
from typing import Dict, Any

def ask_email(state: Dict[str, Any]):
    prompt = "Please give me a valid email address."
    resp = llm.invoke(prompt)
    return {"raw_email": resp.strip(), "next": "validate_email"}

def validate_email(state: Dict[str, Any]):
    email = state["raw_email"]
    if re.fullmatch(r"[^@]+@[^@]+\.[^@]+", email):
        # Valid! Store normalized email and exit loop.
        return {"email": email.lower(), "next": "done"}
    else:
        # Invalid - ask again.
        return {"error": "Invalid format, try again.", "next": "ask_email"}

def done(state):
    print("✅ Got a valid email:", state["email"])
    return {"next": END}

loop_graph = StateGraph()
loop_graph.add_node("ask_email", ask_email)
loop_graph.add_node("validate_email", validate_email)
loop_graph.add_node("done", done)

loop_graph.set_entry_point("ask_email")
loop_graph.add_edge("ask_email", "validate_email")
loop_graph.add_edge("validate_email", "ask_email")   # loop back on failure
loop_graph.add_edge("validate_email", "done")        # succeed

app = loop_graph.compile()
app.invoke(state={})
```

The graph will keep asking until the regex passes. You can add a **max-retry** counter to avoid infinite loops:

```python
def validate_email(state):
    attempts = state.get("attempts", 0) + 1
    email = state["raw_email"]
    if re.fullmatch(r"[^@]+@[^@]+\.[^@]+", email):
        return {"email": email.lower(), "next": "done"}
    elif attempts >= 3:
        return {"error": "Too many attempts.", "next": END}
    else:
        return {"attempts": attempts, "next": "ask_email"}
```

---

## 7. Using **Tools** (Python Functions) as Nodes

LangGraph shines when you combine LLM reasoning with **real world tools** (e.g., web search, DB query, calculator).

```python
# Simple calculator tool
def calc(state):
    expr = state["question"]  # e.g. "12 * (5 + 3)"
    try:
        result = eval(expr, {"__builtins__": {}})  # safe eval for arithmetic only
        return {"calc_result": result, "next": "report"}
    except Exception as exc:
        return {"calc_error": str(exc), "next": "report"}

def ask_math(state):
    # Ask the LLM for a math expression to evaluate
    prompt = "Give me a simple arithmetic expression (e.g., 7*8)."
    expr = llm.invoke(prompt).strip()
    return {"question": expr, "next": "calc"}

def report(state):
    if "calc_result" in state:
        print(f"🧮 {state['question']} = {state['calc_result']}")
    else:
        print("❌ Calculation failed:", state.get("calc_error"))
    return {"next": END}

calc_graph = StateGraph()
calc_graph.add_node("ask_math", ask_math)
calc_graph.add_node("calc", calc)
calc_graph.add_node("report", report)

calc_graph.set_entry_point("ask_math")
calc_graph.add_edge("ask_math", "calc")
calc_graph.add_edge("calc", "report")

app = calc_graph.compile()
app.invoke(state={})
```

You can replace `calc` with any **API call** (e.g., `requests.get`, database query) - just make sure the node returns a dict with the updated state.

---

## 8. Parallel Branches (Async)

When two branches are independent, you can run them concurrently using `async` nodes.

```python
import asyncio
from langgraph.graph import StateGraph, END

async def fetch_weather(state):
    # Simulate an async HTTP call
    await asyncio.sleep(0.5)
    return {"weather": "sunny", "next": "combine"}

async def fetch_news(state):
    await asyncio.sleep(0.7)
    return {"news_headline": "LangGraph 1.2 released!", "next": "combine"}

def combine(state):
    print(f"Weather: {state['weather']}, News: {state['news_headline']}")
    return {"next": END}

parallel = StateGraph()
parallel.add_node("weather", fetch_weather)
parallel.add_node("news", fetch_news)
parallel.add_node("combine", combine)

parallel.set_entry_point("weather")
parallel.add_edge("weather", "combine")
parallel.add_edge("news", "combine")
parallel.set_entry_point("weather")   # start with weather; news runs in parallel automatically

app = parallel.compile()
await app.ainvoke(state={})   # note the `await` for async execution
```

**Why it works:**  
LangGraph detects `async` callables and schedules them on the same event loop, automatically handling the join point (`combine`).

---

## 9. Persisting & Resuming a Graph

You can **checkpoint** the state at any point and later resume.

```python
# Assume `app` is a compiled graph from earlier
checkpoint = app.checkpoint(state={})   # returns a dict with `state` + `next_node`
# Save `checkpoint` to a DB, file, or cache.

# Later...
restored_app = app.compile()            # same compiled graph
restored_app.invoke(state=checkpoint["state"], start_at=checkpoint["next_node"])
```

LangGraph also ships with a built-in **SQLite checkpoint store** (`langgraph.checkpoint.sqlite`) for production-grade persistence.

---

## 🔟 Deploying as an API (FastAPI example)

Below is a minimal FastAPI wrapper that receives a request, runs a graph, and returns the final state.

```python
# file: server.py
from fastapi import FastAPI, BackgroundTasks
from pydantic import BaseModel
from typing import Dict, Any
from langgraph.graph import StateGraph, END

app = FastAPI()

# ---------- Define a simple graph ----------
def greet(state: Dict[str, Any]):
    name = state.get("name", "world")
    return {"greeting": f"Hello, {name}!", "next": END}

g = StateGraph()
g.add_node("greet", greet)
g.set_entry_point("greet")
compiled = g.compile()
# -------------------------------------------

class Payload(BaseModel):
    name: str | None = None

@app.post("/run")
async def run(payload: Payload):
    # Kick off the graph with the incoming payload as the initial state
    result = await compiled.ainvoke(state=payload.dict())
    # `result` is the final state dict (includes "greeting")
    return {"output": result.get("greeting")}

# Run with: uvicorn server:app --reload
```

**Test it**

```bash
curl -X POST http://127.0.0.1:8000/run -H "Content-Type: application/json" \
     -d '{"name":"Ada"}'
```

```json
{
  "output": "Hello, Ada!"
}
```

---

##
