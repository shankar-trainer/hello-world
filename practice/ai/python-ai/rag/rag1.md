Retrieval-Augmented Generation (RAG) connects a Large Language Model (LLM) to external data sources so it can retrieve relevant facts before generating an answer, reducing hallucinations and keeping responses up to date.

How a Basic RAG Pipeline Works

1. Chunking: Split documents, FAQs, or PDFs into smaller text pieces so they fit into prompts and retrieve cleanly.

2. Embedding & Indexing: Convert each chunk into a numerical vector using an embedding model and store it in a vector index or database.

3. Retrieval: Embed the user's question and find the closest matching document chunks via similarity search.

4. Augmentation & Generation: Insert the retrieved chunks into the LLM prompt and instruct the model to answer using that context.

Minimal Python Example

Here is a simple example using sentence-transformers and faiss-cpu to retrieve relevant snippets before calling an LLM:
python

import faiss
import numpy as np
from sentence_transformers import SentenceTransformer

docs = [
    "Refunds are available within 30 days with a receipt.",
    "Standard shipping takes 3 to 5 business days.",
    "Support hours are Monday through Friday, 9 AM to 6 PM.",
]

embedder = SentenceTransformer("all-MiniLM-L6-v2")
doc_embeddings = embedder.encode(docs)

index = faiss.IndexFlatL2(doc_embeddings.shape[1])
index.add(np.array(doc_embeddings, dtype="float32"))

def retrieve(query: str, k: int = 2) -> list[str]:
    query_vec = embedder.encode([query])
    _, indices = index.search(np.array(query_vec, dtype="float32"), k)
    return [docs[i] for i in indices[0] if i != -1]

context = "\n".join(retrieve("How long does shipping take?"))
prompt = f"Answer using only this context:\n{context}\n\nQuestion: How long does shipping take?"
Pass prompt to your preferred chat model API or local LLM runtime to generate the final response.

Next Steps & Guides

• Follow the SingleStore RAG Tutorial for a beginner walkthrough of vector retrieval workflows.
• Explore IBM RAG Tutorials for guides on LangChain, LangGraph, and vector search optimization.
• Check out Herman Wandabwa's RAG Chatbot Tutorial for an end-to-end project using ChromaDB and a web UI

==============================

You can use the **Ollama Python library** to pass your RAG-generated prompt to a locally running Ollama model (such as `llama3.2`).

Here is the complete working code:

### 1\. Install dependencies

bash

```bash
pip install faiss-cpu numpy sentence-transformers ollama
```

### 2\. Download an Ollama model

bash

```bash
ollama pull llama3.2
```

Make sure Ollama is running.

### 3\. Complete RAG + FAISS + Ollama code

python

```python
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
```

### 4\. Expected output

text

```text
Retrieved Context:
Standard shipping takes 3 to 5 business days.
Refunds are available within 30 days with a receipt.

AI Answer:
Standard shipping takes 3 to 5 business days.
```

### 5\. How the RAG pipeline works

Your code implements a basic Retrieval-Augmented Generation (RAG) pipeline.

text

```text
        User Question
              |
              v
       SentenceTransformer
              |
              v
        Query Embedding
              |
              v
          FAISS Index
              |
              v
     Retrieve Relevant Docs
              |
              v
       Build RAG Prompt
              |
              v
       Ollama (Llama 3.2)
              |
              v
        Generated Answer
```

**Component responsibilities:**

| Component | Responsibility |
| --- | --- |
| SentenceTransformer | Converts text into embeddings |
| FAISS | Finds semantically similar documents |
| Retriever | Returns relevant documents |
| Prompt | Combines context and question |
| Ollama | Generates the final answer |


**Note:** `ollama.generate()` is used for simple text generation. You can also use `ollama.chat()` if you want a conversational RAG application with chat history.
