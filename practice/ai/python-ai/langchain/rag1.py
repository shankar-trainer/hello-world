# This script indexes a small custom knowledge base, performs a vector search based on a query,
# and passes the retrieved context to the LLM to get an informed response.
import os
import sys

# Ensure Unicode output works on Windows terminals configured for a legacy code page.
if hasattr(sys.stdout, "reconfigure"):
    sys.stdout.reconfigure(encoding="utf-8")

import ollama
import chromadb

def main() -> None:
    api_key = os.environ.get("OLLAMA_API_KEY")
    if not api_key:
        raise RuntimeError(
            "Set the OLLAMA_API_KEY environment variable with an Ollama API key "
            "from https://ollama.com/settings/keys."
        )

    ollama_client = ollama.Client(
        host="https://ollama.com",
        headers={"Authorization": f"Bearer {api_key}"},
    )
    model_name = os.environ.get("OLLAMA_MODEL", "gemma4:31b")

    # 1. Prepare your local documents (Knowledge Base)
    documents = [
        "The official color of Acme Corp is Cosmic Purple (#663399).",
        "Acme Corp was founded in 2024 by Jane Doe and John Smith.",
        "The maximum remote work stipend for Acme employees is $500 per year.",
        "Acme Corp's main headquarters is located in Austin, Texas."
    ]

    # 2. Initialize ChromaDB. Its default embedding function runs locally.
    chroma_client = chromadb.EphemeralClient()
    collection = chroma_client.create_collection(name="acme_knowledge")

    print("Vectorizing and indexing documents...")

    # 3. Chroma creates and stores embeddings for the documents.
    collection.add(
        ids=[f"doc_{i}" for i in range(len(documents))],
        documents=documents,
    )

    # 4. Define the user query.
    user_query = "What is the corporate color of Acme Corp and how much can I get for working from home?"

    print(f"\nUser Query: {user_query}")

    # 5. Chroma embeds the query locally and retrieves matching documents.
    results = collection.query(query_texts=[user_query], n_results=2)
    retrieved_context = "\n".join(results["documents"][0])

    print(f"\nRetrieved Context:\n{retrieved_context}")

    # 6. Construct the prompt augmenting the query with the context.
    system_instruction = (
        "You are a helpful assistant. Answer the user's question using ONLY the provided context. "
        "If the answer cannot be found in the context, say 'I do not know'."
    )
    full_prompt = f"Context:\n{retrieved_context}\n\nQuestion: {user_query}"

    # 7. Generate the final answer using Ollama's cloud API.
    output = ollama_client.chat(
        model=model_name,
        messages=[
            {"role": "system", "content": system_instruction},
            {"role": "user", "content": full_prompt},
        ],
    )
    print(f"\nAI Answer:\n{output.message.content}")


if __name__ == "__main__":
    main()
