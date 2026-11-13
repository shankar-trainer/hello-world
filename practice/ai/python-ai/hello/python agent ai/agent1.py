import ast
import os
import operator
from datetime import datetime, timezone

from ollama import Client


_BINARY_OPERATORS = {
    ast.Add: operator.add,
    ast.Sub: operator.sub,
    ast.Mult: operator.mul,
    ast.Div: operator.truediv,
}
_UNARY_OPERATORS = {
    ast.UAdd: operator.pos,
    ast.USub: operator.neg,
}


def _evaluate(node: ast.AST) -> int | float:
    if isinstance(node, ast.Expression):
        return _evaluate(node.body)
    if isinstance(node, ast.Constant) and type(node.value) in (int, float):
        return node.value
    if isinstance(node, ast.BinOp) and type(node.op) in _BINARY_OPERATORS:
        left = _evaluate(node.left)
        right = _evaluate(node.right)
        return _BINARY_OPERATORS[type(node.op)](left, right)
    if isinstance(node, ast.UnaryOp) and type(node.op) in _UNARY_OPERATORS:
        return _UNARY_OPERATORS[type(node.op)](_evaluate(node.operand))
    raise ValueError("Only numbers and +, -, *, / arithmetic are allowed.")


def calculate(expression: str) -> str:
    """Calculate an arithmetic expression using numbers and +, -, *, /."""
    result = _evaluate(ast.parse(expression, mode="eval"))
    return str(result)


def get_current_utc_time() -> str:
    """Get the current time in UTC."""
    return datetime.now(timezone.utc).isoformat()


TOOLS = {
    "calculate": calculate,
    "get_current_utc_time": get_current_utc_time,
}


def run_agent(client: Client, prompt: str, model: str) -> str:
    messages = [
        {
            "role": "system",
            "content": (
                "You are a helpful agent. Use the available tools when useful, "
                "then give the user a clear answer."
            ),
        },
        {"role": "user", "content": prompt},
    ]

    for _ in range(6):
        response = client.chat(model=model, messages=messages, tools=list(TOOLS.values()))
        messages.append(response.message)

        if not response.message.tool_calls:
            return response.message.content

        for call in response.message.tool_calls:
            tool = TOOLS.get(call.function.name)
            if tool is None:
                raise RuntimeError(f"The model requested an unknown tool: {call.function.name}")
            
            # Safely handle arguments whether they are already a dict or need unpacking
            args = call.function.arguments
            if isinstance(args, str):
                import json
                args = json.loads(args)

            try:
                result = tool(**args)
            except Exception as e:
                # Catch tool errors (like syntax errors in calculator) and pass back to LLM
                result = f"Error executing tool: {e}"

            messages.append(
                {
                    "role": "tool",
                    "tool_name": call.function.name,
                    "content": str(result),
                }
            )

    raise RuntimeError("The agent reached the maximum number of tool-call rounds.")
def main() -> None:
    # No API key needed for a local Ollama instance
    prompt = input("Ask the agent: ").strip()
    if not prompt:
        raise ValueError("Enter a prompt for the agent.")

    # Point directly to your local Ollama server
    client = Client(host="http://localhost:11434")
    
    # Use your locally pulled model name (e.g., "llama3", "mistral", etc.)
    model = os.environ.get("OLLAMA_MODEL", "llama3.2")
    print(run_agent(client, prompt, model))


if __name__ == "__main__":
    main()

#ollama pull llama3.2
#ollama run llama3.2 no need api key



