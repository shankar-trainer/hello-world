import faiss
import numpy as np
import ollama

from sentence_transformers import SentenceTransformer

# 1. Documents
docs = [
    "Refunds are available within 30 days with a receipt.",
    "Standard shipping takes 3 to 5 business days.",
    "Support hours are Monday through Friday, 9 AM to 6 PM.",
]

# 2. Load embedding model
embedder = SentenceTransformer("all-MiniLM-L6-v2")

# 3. Generate document embeddings
doc_embeddings = embedder.encode(docs)

# 4. Create FAISS index
doc_embeddings = np.array(doc_embeddings, dtype="float32")

index = faiss.IndexFlatL2(doc_embeddings.shape[1])
index.add(doc_embeddings)


# 5. Retrieve relevant documents
def retrieve(query: str, k: int = 2) -> list[str]:

    query_vec = embedder.encode([query])

    query_vec = np.array(query_vec, dtype="float32")

    distances, indices = index.search(query_vec, k)

    return [
        docs[i]
        for i in indices[0]
        if i != -1
    ]


# 6. User query
query = "How long does shipping take?"


# 7. Retrieve relevant context
context = "\n".join(retrieve(query))


# 8. Create RAG prompt
prompt = f"""
You are a helpful AI assistant.

Answer the question using ONLY the provided context.

If the answer is not available in the context,
say "I don't know based on the provided information."

Context:
{context}

Question:
{query}

Answer:
"""


# 9. Send prompt to Ollama
response = ollama.generate(
    model="llama3.2",
    prompt=prompt
)


# 10. Print response
print("\nRetrieved Context:")
print(context)

print("\nAI Answer:")
print(response["response"])
