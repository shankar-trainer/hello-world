import asyncio

from mcp import ClientSession, StdioServerParameters
from mcp.client.stdio import stdio_client


# Configure MCP server
# server_params = StdioServerParameters(
#     command="python",
#     args=["server.py"],
# )

import sys

server_params = StdioServerParameters(
    command=sys.executable,
    args=[
        "/home/shankar/Downloads/code/mycode/ai/python-ai/mcp/server.py"
    ],
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
