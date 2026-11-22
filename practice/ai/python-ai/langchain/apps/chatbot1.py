import os

from langchain_core.output_parsers import StrOutputParser
from langchain_core.prompts import ChatPromptTemplate, MessagesPlaceholder
from langchain_core.messages import AIMessage, BaseMessage, HumanMessage
from langchain_ollama import ChatOllama


def main() -> None:
    api_key = os.getenv("OLLAMA_API_KEY")
    if not api_key:
        raise RuntimeError(
            "OLLAMA_API_KEY is not set. Set it in your environment before starting the chatbot."
        )

    model = ChatOllama(
        model="glm-5.3-flash:cloud",
        temperature=0.1,
        base_url="https://ollama.com",
        client_kwargs={
            "headers": {"Authorization": f"Bearer {api_key}"},
        },
    )
    prompt = ChatPromptTemplate.from_messages(
        [
            ("system", "You are a helpful, concise assistant."),
            MessagesPlaceholder("history"),
            ("human", "{message}"),
        ]
    )
    chain = prompt | model | StrOutputParser()
    history: list[BaseMessage] = []

    print("Chatbot is ready. Type 'exit' or 'quit' to end the conversation.")
    while True:
        try:
            message = input("You: ").strip()
        except (EOFError, KeyboardInterrupt):
            print("\nGoodbye!")
            break

        if message.lower() in {"exit", "quit"}:
            print("Goodbye!")
            break
        if not message:
            continue

        response = chain.invoke({"history": history, "message": message})
        print(f"Assistant: {response}")
        history.extend(
            (HumanMessage(content=message), AIMessage(content=response))
        )


if __name__ == "__main__":
    main()