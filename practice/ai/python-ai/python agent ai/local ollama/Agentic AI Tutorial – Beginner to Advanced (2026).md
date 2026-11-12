# google 

Building Agentic AI in Python involves combining a Large Language Model (LLM) with tools (Python functions) and an execution loop so the system can reason, take actions, and observe results autonomously.

Core Architecture & APIs

An agentic system relies on three main components:
• LLM Brain APIs. Cloud providers like the OpenAI API, Anthropic Claude API, and Google Gemini API handle reasoning and decide which tools to call. For local execution without API costs, you can use Ollama.
• Agent Orchestration Frameworks. Libraries such as LangGraph, CrewAI, and the OpenAI Agents SDK manage multi-step state, retries, and multi-agent collaboration.
• External Tool & Data APIs. Agents interact with the real world by calling standard REST APIs or protocols like the Model Context Protocol (MCP) to search the web, query databases, or modify local files.

Step-by-Step Python Tutorial (Pure Python + OpenAI API)

Building an agent without heavy frameworks helps clarify how the underlying tool-calling loop works.

1. Set Up Your Environment

Install the official OpenAI SDK and python-dotenv to manage your credentials:
bash
pip install openai python-dotenv
Use code with caution.
Create a .env file in your project root and add your key:
env
OPENAI_API_KEY=your_api_key_here
Use code with caution.

2. Define Tools as Python Functions

An LLM cannot execute code directly. Instead, you write standard Python functions with clear type hints and docstrings, then provide a JSON schema describing those tools to the model.

3. Run the Agentic Loop

Save the following complete example as agent.py and run it. The loop sends a prompt to the model, checks if the model requested a tool, runs the Python function locally, and feeds the result back until the model generates a final answer.
python
import json
import os
from dotenv import load_dotenv
from openai import OpenAI

load_dotenv()
client = OpenAI()

# 1. Define the actual Python tool
def calculate_compound_interest(principal: float, rate: float, years: int) -> str:
    """Calculate total amount with annual compound interest."""
    amount = principal * ((1 + rate) ** years)
    return json.dumps({"final_amount": round(amount, 2), "currency": "USD"})

# 2. Describe the tool schema for the LLM API
tools = [
    {
        "type": "function",
        "function": {
            "name": "calculate_compound_interest",
            "description": "Calculate total amount with annual compound interest.",
            "parameters": {
                "type": "object",
                "properties": {
                    "principal": {"type": "number", "description": "Initial investment amount"},
                    "rate": {"type": "number", "description": "Annual interest rate as a decimal (e.g., 0.05 for 5%)"},
                    "years": {"type": "integer", "description": "Number of years"}
                },
                "required": ["principal", "rate", "years"]
            }
        }
    }
]

available_functions = {"calculate_compound_interest": calculate_compound_interest}

# 3. Execute the Agentic Loop
def run_agent(user_prompt: str):
    messages = [
        {"role": "system", "content": "You are a helpful financial assistant. Use your tools to perform exact math."},
        {"role": "user", "content": user_prompt}
    ]

    while True:
        response = client.chat.completions.create(
            model="gpt-4o-mini",
            messages=messages,
            tools=tools
        )
        
        response_message = response.choices[0].message
        messages.append(response_message)

        # If the model did not call a tool, return the final response
        if not response_message.tool_calls:
            return response_message.content

        # Execute each requested tool and append the output to conversation history
        for tool_call in response_message.tool_calls:
            func_name = tool_call.function.name
            func_args = json.loads(tool_call.function.arguments)
            
            print(f"[Agent Action] Calling {func_name} with {func_args}...")
            tool_result = available_functions[func_name](**func_args)
            
            messages.append({
                "tool_call_id": tool_call.id,
                "role": "tool",
                "name": func_name,
                "content": tool_result
            })

if __name__ == "__main__":
    result = run_agent("If I invest $5,000 at 7% annual interest for 12 years, how much will I have?")
    print("\nFinal Answer:", result)
Use code with caution.
For a visual walkthrough of building this exact tool-calling loop from scratch in Python, watch this beginner tutorial:
37:25
Building AI Agents in Pure Python - Beginner Course
2.6L views · 2 months ago
YouTube · Tech With Tim

Popular Frameworks Comparison

Once you move beyond single-file scripts, frameworks simplify state persistence, human-in-the-loop approvals, and multi-agent handoffs.

Framework   Best Use Case   Key Strength
LangGraph   Complex workflows and state machines    Fine-grained control over cycles, branching, and persistent memory.
CrewAI  Role-based multi-agent teams    Easy setup for assigning distinct personas (e.g., Researcher, Writer) to collaborate.
PydanticAI  Production type-safe applications   Uses Python type annotations and Pydantic validation for structured, reliable outputs.
LlamaIndex  Data-heavy and Agentic RAG systems  Deep integrations with vector databases, PDFs, and enterprise document pipelines.


Useful APIs to Give Your Agent Capabilities

• Web Search. Use Tavily API or Serper API to give agents clean, LLM-ready web search results.
• Web Scraping & Browsing. Use Firecrawl or Playwright for Python to convert live websites into Markdown or automate browser clicks.
• Sandboxed Code Execution. Use E2B to let your agent safely write and execute Python scripts in an isolated cloud sandbox.
If you'd like to tailor this further, let me know:
• Your preferred LLM provider (OpenAI, Gemini, Claude, or local Ollama)
• The specific task you want the agent to automate (web research, database queries, coding, etc.)
I can provide a complete, copy-pasteable starter project using a framework like LangGraph or CrewAI.
• 
YouTube·Tech With Tim
Build an AI Agent From 


# chatgpt

# Agentic AI Tutorial – Beginner to Advanced (2026)

Agentic AI is one of the most exciting areas of artificial intelligence. If you want to learn how to build AI agents that can think through tasks, use tools, make decisions, and automate workflows, this tutorial will guide you step by step.

I'll structure this as a practical learning roadmap, starting from zero and progressing to building real-world multi-agent applications.

## 1. What is Agentic AI?

Traditional AI generally responds to your questions. Agentic AI can take a goal, plan the steps, use tools, execute actions, and evaluate results.

Example:

Suppose you ask:

"Plan a 5-day trip to Goa within ₹30,000."

A traditional chatbot gives you suggestions.

An AI agent can:

1. Understand your budget and requirements.
2. Research flights and hotels.
3. Compare available options.
4. Create a day-by-day itinerary.
5. Calculate the estimated cost.
6. Ask for your approval before booking.

AI Agents 101: From Concept to Code (No Frameworks Required) | by Kamil Tustanowski | Feb, 2026 | Medium

[medium.com](<https://medium.com/%40kamil.tustanowski/ai-agents-101-from-concept-to-code-no-frameworks-required-2dfdaf66b6c1?utm_source=chatgpt.com>)

## 2. How Agentic AI works

    An AI agent typically has five major components:

    1. Brain (LLM)

    Understands instructions and reasons about tasks

    2. Planning

    Breaks a complex goal into smaller steps

    3. Tools

    Uses APIs, search, databases and Python

    4. Memory

    Maintains relevant context and task state

    5. Execution and evaluation

    Performs actions and checks the results

    The process repeats until the task is completed or human intervention is needed.

## 3. Technologies you should learn

Here is a recommended technology stack.

| Technology | Purpose |
| --- | --- |
| Python | Programming language |
| LLMs | Intelligence and reasoning |
| OpenAI API | Connect applications to AI models |
| LangChain | Build AI applications and agents |
| LangGraph | Control agent workflows |
| RAG | Retrieve information from documents |
| Vector databases | Store and retrieve embeddings |
| APIs | Connect external services |
| FastAPI | Build backend applications |
| Docker | Deploy applications |

You don't need to learn everything simultaneously. Start with Python and basic LLM concepts.

## 4. Your step-by-step learning roadmap

1. Phase 1: Python fundamentals
   Learn:
   - Variables and data types
   - Functions and loops
   - Classes and objects
   - Lists and dictionaries
   - API requests
   - Async programming
   Foundation
2. Phase 2: Generative AI and LLMs
   Learn:
   - What are LLMs?
   - Tokens and embeddings
   - Prompt engineering
   - Context windows
   - Function calling
   - Structured outputs
3. Phase 3: Build your first AI agent
   Learn:
   - Agent architecture
   - System instructions
   - Tool calling
   - Agent execution loops
   - Error handling
   Build a simple research assistant.
4. Phase 4: LangChain and LangGraph
   Learn:
   - Chains and tools
   - Agents
   - State management
   - Graphs and nodes
   - Conditional workflows
   - Checkpointing
5. Phase 5: Advanced agentic AI
   Learn:
   - Multi-agent architecture
   - Agent collaboration
   - Agent delegation
   - RAG
   - Long-term memory
   - Human-in-the-loop
6. Phase 6: Production deployment
   Learn:
   - FastAPI
   - Docker
   - Cloud deployment
   - Monitoring and tracing
   - Security and guardrails
   - Agent evaluation

## 5. Build your first AI agent using Python

Let's start with a simple example.

Our first project: AI Calculator Agent

The agent receives a mathematical question, decides whether to use a calculator tool, and returns the answer.

Install:

bash

```bash
pip install openai
```

Example implementation using Python:

python

```python

from openai import OpenAI
import json

client = OpenAI()

# Define a tool
tools = [
    {
        "type": "function",
        "name": "calculator",
        "description": "Calculate basic arithmetic",
        "parameters": {
            "type": "object",
            "properties": {
                "a": {"type": "number"},
                "b": {"type": "number"},
                "operation": {
                    "type": "string",
                    "enum": ["add", "subtract", "multiply"]
                }
            },
            "required": ["a", "b", "operation"],
            "additionalProperties": False
        },
        "strict": True
    }
]

# Tool execution
def calculator(a, b, operation):
    if operation == "add":
        return a + b
    elif operation == "subtract":
        return a - b
    elif operation == "multiply":
        return a * b

# Ask the model
response = client.responses.create(
    model="gpt-5",
    input="Calculate 25 multiplied by 8.",
    tools=tools
)

# Execute tool calls
for item in response.output:
    if item.type == "function_call":
        args = json.loads(item.arguments)

        result = calculator(**args)

        print("Tool result:", result)
```

This demonstrates the basic tool-calling concept. A complete agent would also send the tool result back to the model and continue the execution loop until it produces a final answer.

## 6. Real-world projects to build

These projects will help you develop practical skills.

Copilot Researcher’s Agentic Shift: Grounding, Multi-Model Choice, and Review | Windows Forum

Project 1: AI Research Agent

Searches for information, summarizes findings and generates reports.

Beginner

AI Customer Support Services

Project 2: Customer Support Agent

Answers customer queries, retrieves company policies and escalates difficult cases.

Beginner

AI Orchestration Engine - HES

Project 3: Multi-Agent System

Researcher, analyst and report-writer agents collaborate to complete tasks.

Intermediate

AI Automation Services | AI Chatbots, WhatsApp Automation, CRM Automation & Workflow Automation — DesignBub

Project 4: Business Automation Agent

Processes documents, extracts information, prepares reports and requests approval before external actions.

Advanced

## 7. Best free learning resources

These are useful tutorials and official documentation:

1. [OpenAI – Building Agents](<https://developers.openai.com/tracks/building-agents?utm_source=chatgpt.com>) — Beginner-friendly concepts and practical implementation.
2. [LangChain Learning Resources](<https://docs.langchain.com/oss/python/learn?utm_source=chatgpt.com>) — LangChain, LangGraph, RAG and multi-agent systems.
3. [Microsoft Agent Framework Tutorial](<https://learn.microsoft.com/en-us/agent-framework/get-started/?utm_source=chatgpt.com>) — Step-by-step agent development.
4. [Anthropic – Building Effective Agents](<https://www.anthropic.com/research/building-effective-agents?aff=47lw0&utm_source=chatgpt.com>) — Agent architecture and design principles.
5. [FreeCodeCamp – Complete Agentic AI Course](<https://www.youtube.com/watch?v=Zy7EXDONlTY&utm_source=chatgpt.com>) — Long-form practical video course.

## 8\. Let's personalize your learning path

I can teach you Agentic AI as a structured course, with explanations, Python code, diagrams, exercises and practical projects.

Tell me your current level:

1\. What is your programming experience?

beginner Beginner – No programming experience

Basic Python knowledge

Intermediate Python developer

Experienced software developer

2\. What is your main goal?

Build AI agents and automation projects Build AI agents and automation projects

Become an Agentic AI Engineer

Build multi-agent enterprise applications

Learn Agentic AI for business

3\. Preferred programming language

Python Python

JavaScript / TypeScript

No-code tools

4\. Daily learning time

30 minutes

1–2 hours daily 1–2 hours daily

3–4 hours daily

 Start my Agentic AI course

My recommendation: Learn Python → LLM fundamentals → tool calling → LangChain → LangGraph → RAG → Multi-Agent Systems → Deployment. Build one working project at every stage.




========================== Multi-Agent System==================

# Building an AI Multi-Agent System with Python

An AI Multi-Agent System (MAS) is a system where multiple AI agents collaborate to solve a complex problem. Each agent has a specific role, its own responsibilities, and sometimes access to different tools.

For example, you can build an AI system where:

- Research Agent: Searches for information.
- Analysis Agent: Analyzes the collected information.
- Writer Agent: Generates a structured report.
- Reviewer Agent: Checks the report for accuracy and quality.
- Orchestrator Agent: Coordinates all agents and manages workflow.

## 1. Architecture of an AI Multi-Agent System

Deep Research（信息检索增强）认识和项目实战-CSDN博客

[blog.csdn.net](<https://blog.csdn.net/yang2330648064/article/details/149743031?utm_source=chatgpt.com>)

A typical architecture looks like this:

text

```text
              User Query
                  |
                  v
          Orchestrator Agent
                  |
       +----------+----------+
       |          |          |
       v          v          v
   Research    Analysis    Planning
     Agent       Agent      Agent
       |          |          |
       +----------+----------+
                  |
                  v
             Writer Agent
                  |
                  v
             Reviewer Agent
                  |
                  v
             Final Response
```

## 2. Python technologies for multi-agent AI

| Framework | Purpose |
| --- | --- |
| LangGraph | Stateful multi-agent workflows |
| CrewAI | Role-based agent collaboration |
| AutoGen | Multi-agent conversations |
| LangChain | LLM applications and tools |
| Pydantic AI | Type-safe AI agents |
| OpenAI API | LLM intelligence |

My recommendation: Start with LangGraph if you want to build production-ready systems with controlled workflows, state management, and human approval.

## 3. Build a simple multi-agent system using Python

Let's create a system with three agents:

1. Researcher
2. Analyst
3. Writer

### Step 1: Install dependencies

bash

```bash
pip install langgraph langchain-openai python-dotenv
```

### Step 2: Configure API key

Create a `.env` file:

env

```env
OPENAI_API_KEY=your_openai_api_key
```

### Step 3: Implement agents

Create `multi_agent.py`:

python

```python

import os
from dotenv import load_dotenv

from typing import TypedDict
from langgraph.graph import StateGraph, START, END
from langchain_openai import ChatOpenAI

load_dotenv()

llm = ChatOpenAI(
    model="gpt-4.1-mini",
    temperature=0
)

# Shared state between agents
class AgentState(TypedDict):
    topic: str
    research: str
    analysis: str
    final_report: str


# Agent 1: Researcher
def researcher(state: AgentState):

    response = llm.invoke(
        f"Research this topic with key facts and insights: "
        f"{state['topic']}"
    )

    return {"research": response.content}


# Agent 2: Analyst
def analyst(state: AgentState):

    response = llm.invoke(
        f"Analyze this research and identify important insights:\n"
        f"{state['research']}"
    )

    return {"analysis": response.content}


# Agent 3: Writer
def writer(state: AgentState):

    response = llm.invoke(
        f"Create a professional report.\n\n"
        f"Topic: {state['topic']}\n"
        f"Research: {state['research']}\n"
        f"Analysis: {state['analysis']}"
    )

    return {"final_report": response.content}


# Create workflow
workflow = StateGraph(AgentState)

workflow.add_node("researcher", researcher)
workflow.add_node("analyst", analyst)
workflow.add_node("writer", writer)

workflow.add_edge(START, "researcher")
workflow.add_edge("researcher", "analyst")
workflow.add_edge("analyst", "writer")
workflow.add_edge("writer", END)

app = workflow.compile()


# Execute system
result = app.invoke({
    "topic": "Artificial Intelligence in Healthcare",
    "research": "",
    "analysis": "",
    "final_report": ""
})

print("\nFINAL REPORT\n")
print(result["final_report"])
```

### Step 4: Run the application

bash

```bash
python multi_agent.py
```

The workflow executes:

## Agent execution flow

1. Researcher Agent
   Collects and summarizes information.
   Completed first
2. Analyst Agent
   Extracts insights and identifies important patterns.
3. Writer Agent
   Converts the findings into a professional report.
4. Final Output
   Returns the completed report to the user.

Note: This example uses an LLM for research and analysis, but it does not independently browse the internet. You can add search tools to the Researcher Agent.

## 4. Advanced Multi-Agent System Architecture

Once you understand the basics, you can build a more sophisticated system.

Best AI Agent Frameworks in 2026: LangGraph vs CrewAI vs AutoGen & More | MortalApps

[mortalapps.com](<https://mortalapps.com/blog/best-ai-agent-frameworks/?utm_source=chatgpt.com>)

Consider adding:

- Supervisor Agent: Delegates tasks to other agents.
- Memory System: Stores previous conversations and findings.
- Tool Calling: Allows agents to use APIs, databases and search engines.
- RAG: Retrieves relevant documents from a knowledge base.
- Human-in-the-Loop: Allows users to approve important decisions.
- Agent Communication: Enables agents to exchange structured messages.
- Evaluation Agent: Measures output quality.

## 5. Suggested Python project structure

text

```text
ai_multi_agent/
│
├── main.py
├── config.py
├── .env
│
├── agents/
│   ├── researcher.py
│   ├── analyst.py
│   ├── writer.py
│   ├── reviewer.py
│   └── supervisor.py
│
├── tools/
│   ├── web_search.py
│   ├── database.py
│   └── calculator.py
│
├── memory/
│   ├── short_term.py
│   └── long_term.py
│
├── workflows/
│   └── graph.py
│
└── requirements.txt
```

## 6. What type of multi-agent system do you want to build?

I can help you develop a complete Python project with source code, architecture, agent communication, memory, tools and deployment.

1. Select your AI framework

LangGraph LangGraph

CrewAI

Microsoft AutoGen

Custom Python multi-agent architecture

2. What do you want to build?

Autonomous AI Research System Autonomous AI Research System

AI Software Development Team

AI Customer Support System

AI Data Analyst System

Enterprise Multi-Agent Automation

General Purpose AI Assistant

3. Complexity

Beginner

Intermediate

Advanced Advanced

Production-ready

4. Required capabilities

[x]Long-term memory

[x]Tool calling

[x]Agent collaboration

[ ]Web search

[ ]RAG / Vector database

[ ]Human approval

[ ]FastAPI deployment

[ ]Monitoring and evaluation

 Build my AI multi-agent system