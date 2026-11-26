# from mcp.server.fastmcp import FastMCP
from mcp.server.mcpserver import MCPServer

# mcp = FastMCP("My First MCP Server")
mcp = MCPServer("My First MCP Server")

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