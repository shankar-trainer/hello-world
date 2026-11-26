You can create an MCP client using the Python MCP SDK's `ClientSession` and `stdio_client`.

The client will:

1. Start your MCP server.
2. Connect to it through standard input/output (stdio).
3. Discover available tools (`add`, `greet`).
4. Call those tools and display their results.

## 1. Project structure

text

```text
mcp_project/
│
├── server.py
└── client.py
```

## 2. MCP Server (`server.py`)

One important note: `MCPServer` is not the usual public server class used in the current Python MCP SDK. Your code uses the `FastMCP` API, so I'll use that for a working example.

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
    mcp.run(transport="stdio")
```

## 3. MCP Client (`client.py`)

python

```python

import asyncio

from mcp import ClientSession, StdioServerParameters
from mcp.client.stdio import stdio_client


# Configure MCP server
server_params = StdioServerParameters(
    command="python",
    args=["server.py"],
)


async def main():

    # Start and connect to MCP server
    async with stdio_client(server_params) as (read, write):

        async with ClientSession(read, write) as session:

            # Initialize connection
            await session.initialize()

            print("Connected to MCP Server!")

            # Discover available tools
            tools = await session.list_tools()

            print("\nAvailable Tools:")
            for tool in tools.tools:
                print(f"- {tool.name}: {tool.description}")

            # Call add tool
            result = await session.call_tool(
                "add",
                arguments={
                    "a": 10,
                    "b": 20
                }
            )

            print("\nAdd Tool Result:")
            print(result.content)

            # Call greet tool
            result = await session.call_tool(
                "greet",
                arguments={
                    "name": "Rahul"
                }
            )

            print("\nGreet Tool Result:")
            print(result.content)


if __name__ == "__main__":
    asyncio.run(main())
```

## 4. Install dependencies

bash

```bash
pip install mcp
```

## 5. Run the client

Execute:

bash

```bash
python client.py
```

You don't need to start `server.py` separately. The client automatically starts the server using `stdio_client`.

## 6. Expected output

text

```text
Connected to MCP Server!

Available Tools:
- add: Add two numbers.
- greet: Greet a person.

Add Tool Result:
[TextContent(type='text', text='30')]

Greet Tool Result:
[TextContent(type='text', text='Hello, Rahul!')]
```

## 7. Understand the architecture

MCP Client

client.py

ClientSession + stdio\_client

MCP protocol over stdio

MCP Server

server.py

FastMCP

add()

10 + 20

greet()

Hello, Rahul\!

Important concepts:

- `initialize()` – establishes the MCP session.
- `list_tools()` – discovers tools exposed by the server.
- `call_tool()` – executes a particular server tool.
- `stdio_client()` – launches and communicates with the server process.

Next step: You can extend this example to build an AI agent that uses an LLM to decide automatically when to call `add()` or `greet()`, instead of hardcoding tool calls in the client.