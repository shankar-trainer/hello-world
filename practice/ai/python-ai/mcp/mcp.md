An MCP Server (Model Context Protocol Server) is a program that allows AI assistants like ChatGPT, Claude, or other LLMs to connect to external tools, applications, databases, and services.

Think of it as a bridge between an AI model and external systems.

## 1. Why do we need an MCP server?

Normally, an AI model can understand and generate text, but it cannot automatically access your database, read local files, or interact with external applications.

An MCP server makes these capabilities available to the AI.

For example, you could ask:

- "Show me all customers from my database."
- "Read the latest files from my computer."
- "Send an email to Rahul."
- "Fetch the latest weather information."
- "Create a GitHub issue."

The MCP server exposes the tools needed to perform these actions.

## 2. How does MCP work?

Model Context Protocol (MCP) Overview | C3 AI Documentation

[docs.c3.ai](<https://docs.c3.ai/docs/mcpServer/8.9/topic/mcpServer-overview-doc?utm_source=chatgpt.com>)

There are three main components:

1. MCP Host: The AI application, such as Claude Desktop or an MCP-enabled ChatGPT application.
2. MCP Client: Manages the connection between the AI application and an MCP server.
3. MCP Server: Provides tools and access to external resources.

### Example workflow

Suppose you ask an AI:

"Show me all users in my PostgreSQL database."

The process looks like this:

1. You send the request to the AI.
2. The AI identifies that it needs database access.
3. The MCP client communicates with the PostgreSQL MCP server.
4. The MCP server executes the appropriate database query.
5. The server returns the results.
6. The AI explains the results to you.

## 3. What can an MCP server provide?

MCP supports three important capabilities:

| Capability | Purpose | Example |
| --- | --- | --- |
| Tools | Perform actions | Send email, execute a query |
| Resources | Provide data | Database records, files |
| Prompts | Provide reusable prompt templates | Code review template |

## 4. Example: Creating a simple MCP server in Python

You can use the Python MCP SDK.

First, install it:

bash

```bash
pip install "mcp[cli]"
```

Create `server.py`:

python

```python
from mcp.server.fastmcp import FastMCP

mcp = FastMCP("My First MCP Server")

@mcp.tool()
def add(a: int, b: int) -> int:
    """Add two numbers."""
    return a + b

@mcp.tool()
def greet(name: str) -> str:
    """Greet a person."""
    return f"Hello, {name}!"

if __name__ == "__main__":
    mcp.run()
```

Run the server:

bash

```bash
python server.py
```

Now an MCP-compatible AI application can connect to this server and use the `add` and `greet` tools.

## 5. MCP vs REST API

| Feature | REST API | MCP |
| --- | --- | --- |
| Main purpose | Application communication | AI-to-tool communication |
| Tool discovery | Usually manual/API documentation | Standardized discovery |
| AI integration | Requires integration code | Designed for AI clients |
| Data access | Yes | Yes |
| Actions | Yes | Yes |
| Standard protocol | HTTP-based conventions | MCP protocol |

Important: MCP does not replace REST APIs. An MCP server can actually use REST APIs internally to provide capabilities to AI models.

## 6. Real-world MCP server examples

- GitHub MCP Server: Interact with repositories, issues, and pull requests.
- Filesystem MCP Server: Read and manage files.
- PostgreSQL MCP Server: Access database information.
- Slack MCP Server: Interact with Slack.
- Google Drive MCP Server: Access documents and files.

## 7\. The easiest way to understand it

Think of it this way:

- LLM: The brain.
- MCP Client: The communication manager.
- MCP Server: The service provider.
- Tools: The actions the AI can perform.
- External systems: Databases, APIs, files, GitHub, etc.

In one sentence: MCP is a standard protocol that lets AI applications discover and use external tools and data through MCP servers.

If you're learning AI agents, understanding MCP is especially useful because it provides a standardized way to connect agents to real-world applications.