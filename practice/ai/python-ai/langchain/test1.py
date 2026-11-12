from langchain_core.prompts import ChatPromptTemplate
from langchain_ollama import ChatOllama
from langchain_core.output_parsers import StrOutputParser


def generate_ai_response(topic: str) -> str:

    # 1. Initialize the local language model
    model = ChatOllama(
        model="smollm2:135m",
        temperature=0.7
    )

    # 2. Define prompt template
    prompt = ChatPromptTemplate.from_messages([
        ("system", "You are a witty, brilliant AI assistant. Explain topics concisely."),
        ("user", "Explain the concept of {topic} in three bullet points.")
    ])

    # 3. Create the chain
    chain = prompt | model | StrOutputParser()

    # 4. Execute the chain
    response = chain.invoke({"topic": topic})

    return response


if __name__ == "__main__":
    result = generate_ai_response("Quantum Computing")
    print(result)

#pip install langchain langchain-core langchain-ollama python-dotenv
#ollama run smollm2:135m
