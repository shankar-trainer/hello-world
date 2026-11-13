import os
from typing import Annotated, TypedDict

from langchain_core.messages import AnyMessage, HumanMessage, SystemMessage
from langchain_core.messages.tool import ToolMessage
from langchain_core.tools import tool
from langchain_openai import ChatOpenAI
from langgraph.graph import StateGraph, add_messages


class OrderState(TypedDict):
    order: dict[str, str]
    messages: Annotated[list[AnyMessage], add_messages]


@tool
def cancel_order(order_id: str) -> str:
    """Cancel an order that hasn't shipped."""
    # (Here you'd call your real backend API)
    return f"Order {order_id} has been cancelled."


def call_model(state: OrderState) -> dict[str, list[AnyMessage]]:
    api_key = os.environ.get("OLLAMA_API_KEY")
    if not api_key:
        raise RuntimeError(
            "Set the OLLAMA_API_KEY environment variable before running this example."
        )

    order = state.get("order", {"order_id": "UNKNOWN"})
    system_message = SystemMessage(
        content=(
            "You are an ecommerce support agent.\n"
            f"ORDER ID: {order['order_id']}\n"
            "If the customer asks to cancel, call cancel_order(order_id) "
            "and then send a simple confirmation.\n"
            "Otherwise, just respond normally."
        )
    )
    messages = [system_message, *state["messages"]]
    model = ChatOpenAI(
        model=os.environ.get("OLLAMA_MODEL", "gpt-oss:120b"),
        base_url="https://ollama.com/v1",
        api_key=api_key,
        temperature=0,
    )
    first = model.bind_tools([cancel_order]).invoke(messages)
    output: list[AnyMessage] = [first]

    for tool_call in first.tool_calls:
        result = cancel_order.invoke(tool_call["args"])
        output.append(ToolMessage(content=str(result), tool_call_id=tool_call["id"]))

    if first.tool_calls:
        second = model.invoke([*messages, *output])
        output.append(second)

    return {"messages": output}


def construct_graph():
    graph_builder = StateGraph(OrderState)
    graph_builder.add_node("assistant", call_model)
    graph_builder.set_entry_point("assistant")
    return graph_builder.compile()


graph = construct_graph()


if __name__ == "__main__":
    example_order = {"order_id": "A12345"}
    conversation = [HumanMessage(content="Please cancel my order A12345.")]
    result = graph.invoke({"order": example_order, "messages": conversation})
    for message in result["messages"]:
        print(f"{message.type}: {message.content}")
