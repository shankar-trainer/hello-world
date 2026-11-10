## 1. What a "vector database" actually does

| Concept | What it means for you |
|---------|----------------------|
| **Embedding** | A neural model turns a piece of text into a dense numeric vector (e.g., 768-dim float array). Similar texts have vectors that are close in Euclidean / cosine space. |
| **Vector store (vector DB)** | A specialized index that can store many vectors and quickly retrieve the *k* most similar ones to a query vector. |
| **Retriever** | LangChain component that talks to a vector store, runs the embedding model, and returns the most relevant documents. |
| **RAG (Retrieval-Augmented Generation)** | The LLM receives the retrieved documents as context, so it can answer questions that go beyond its internal knowledge. |

---

## 2. Choose a vector store

| Store | When to use it | Install command |
|-------|----------------|-----------------|
| **Chroma** (pure-Python, on-disk) | Small-to-medium projects, offline, no external service | `pip install chromadb` |
| **FAISS** (in-memory, fast) | Pure-Python + C++ binary, good for experiments | `pip install faiss-cpu` |
| **Pinecone / Weaviate / Qdrant** | Cloud-hosted or multi-node, production scale | `pip install pinecone-client weaviate-client qdrant-client` |

For this tutorial we'll use **Chroma** because it:

* works out-of-the-box,
* stores data on disk (so you can reload later),
* integrates cleanly with LangChain.

---

## 3. Install everything you need

```bash
# LangChain core + agents + embeddings
pip install -U "langchain[all]"  # includes tools, schemas, etc.

# Ollama client (to call the local model for embeddings)
pip install ollama

# Chroma vector store
pip install chromadb
```

> **Note** - If you already have `langchain` from the `agent1.py` script, you only need the `chromadb` and `ollama` packages.

---

## 4. Pick an embedding model

Ollama ships a few small embedding models that run locally, e.g.:

* `nomic-embed-text` - 768-dim, fast, works well for English.
* `mxbai-embed-large` - 1024-dim, a bit more accurate.

You can pull one with:

```bash
ollama pull nomic-embed-text
```

---

## 5. Full runnable example

Create a new file `vector_rag_demo.py` (or add the code to a notebook).  
The script:

1. **Loads** a few sample documents.
2. **Embeds** them with the Ollama embedding model.
3. **Stores** the vectors in a Chroma collection on disk.
4. **Queries** the collection using a LangChain `Retriever`.
5. **Feeds** the retrieved docs to a generation model (`ollama:qwen3.5:2b` - the same model you used for the agent) to produce a final answer.

```python
# --------------------------------------------------------------
# vector_rag_demo.py
# --------------------------------------------------------------

import os
from pathlib import Path

from langchain.schema import Document
from langchain.text_splitter import RecursiveCharacterTextSplitter
from langchain_community.vectorstores import Chroma
from langchain_community.embeddings import OllamaEmbeddings
from langchain_community.llms import Ollama
from langchain.chains import RetrievalQA

# ------------------------------------------------------------------
# 1.  Settings (change paths / model names if you like)
# ------------------------------------------------------------------
CHROMA_PERSIST_DIR = Path("./chroma_store")   # where vectors will be saved
EMBED_MODEL = "nomic-embed-text"              # Ollama embedding model
LLM_MODEL   = "ollama:qwen3.5:2b"              # LLM used for answer generation

# ------------------------------------------------------------------
# 2.  Helper: load / create sample documents
# ------------------------------------------------------------------
def load_sample_documents() -> list[Document]:
    """
    Returns a small list of LangChain-related documents.
    In a real project you would read files, PDFs, webpages, etc.
    """
    texts = [
        """LangChain is a framework for building applications
        powered by language models. It provides abstractions for
        LLMs, prompts, agents, memory, and retrieval-augmented generation
        (RAG).""",
        """A Retriever is a component that returns the most relevant
        documents for a given query. Common retrievers are based on
        vector similarity, BM25, or hybrid approaches.""",
        """Ollama is an open-source tool that lets you run LLMs
        locally on your machine without an API key. You can pull
        models like qwen3.5:2b or llama3.2 and query them via a simple
        HTTP API or the `ollama` CLI.""",
        """Vector databases store high-dimensional embeddings and
        provide fast nearest-neighbor search. Popular choices are
        Chroma, FAISS, Pinecone, Weaviate, and Qdrant.""",
    ]

    # Turn each string into a LangChain Document (adds metadata automatically)
    return [Document(page_content=t.strip(), metadata={"source": f"sample_{i}"})
            for i, t in enumerate(texts)]

# ------------------------------------------------------------------
# 3.  Split documents into manageable chunks (optional but recommended)
# ------------------------------------------------------------------
def chunk_documents(docs: list[Document]) -> list[Document]:
    splitter = RecursiveCharacterTextSplitter(
        chunk_size=500,
        chunk_overlap=50,
        separators=["\n\n", "\n", " ", ""],
    )
    return splitter.split_documents(docs)

# ------------------------------------------------------------------
# 4.  Create (or load) the Chroma vector store
# ------------------------------------------------------------------
def get_vector_store(docs: list[Document]) -> Chroma:
    """
    If a persisted Chroma collection exists, load it.
    Otherwise embed the supplied docs and create a new collection.
    """
    embedding = OllamaEmbeddings(model=EMBED_MODEL)

    if CHROMA_PERSIST_DIR.exists():
        print("🔄 Loading existing Chroma collection ...")
        vectordb = Chroma(
            persist_directory=str(CHROMA_PERSIST_DIR),
            embedding_function=embedding,
        )
    else:
        print("🗂️  Creating new Chroma collection ...")
        vectordb = Chroma.from_documents(
            documents=docs,
            embedding=embedding,
            persist_directory=str(CHROMA_PERSIST_DIR),
        )
        # Force a write-to-disk so we can reload later
        vectordb.persist()
    return vectordb

# ------------------------------------------------------------------
# 5.  Build a Retrieval-QA chain
# ------------------------------------------------------------------
def build_qa_chain(vectordb: Chroma) -> RetrievalQA:
    retriever = vectordb.as_retriever(search_type="similarity", search_kwargs={"k": 3})
    llm = Ollama(model=LLM_MODEL)          # uses the same model you used for the agent
    qa = RetrievalQA.from_chain_type(
        llm=llm,
        chain_type="stuff",               # "stuff" just concatenates docs; good for short contexts
        retriever=retriever,
        return_source_documents=True,    # handy for debugging / showing citations
    )
    return qa

# ------------------------------------------------------------------
# 6.  Demo - ask a few questions
# ------------------------------------------------------------------
def demo():
    # Load / prepare data
    raw_docs = load_sample_documents()
    chunked = chunk_documents(raw_docs)

    # Vector store
    vectordb = get_vector_store(chunked)

    # QA chain
    qa = build_qa_chain(vectordb)

    # ------------------------------------------------------------------
    # Example queries
    # ------------------------------------------------------------------
    queries = [
        "What is LangChain?",
        "How does a Retriever work?",
        "Can I run LLMs locally without an API key?",
        "What are the main uses of a vector database?",
    ]

    for q in queries:
        print("\n? Question:", q)
        answer = qa({"query": q})
        print("💬 Answer:", answer["result"])
        # Show which docs were used (useful to verify retrieval)
        print("🔎 Sources:")
        for doc in answer["source_documents"]:
            print(f"   • {doc.metadata['source']}: {doc.page_content[:80]}...")

if __name__ == "__main__":
    demo()
```

### What the script does, line-by-line

| Section | Purpose |
|---------|---------|
| **Imports** | Pulls in LangChain's core types, the Chroma wrapper, Ollama embeddings/LLM, and the `RetrievalQA` chain. |
| **Settings** | Central place to change the model names or storage path. |
| **`load_sample_documents`** | Creates a few tiny example documents. Replace this with `loader = TextLoader(...); docs = loader.load_and_split()` for real files. |
| **`chunk_documents`** | Splits long texts into ~500-token chunks so each vector represents a coherent piece of information. |
| **`get_vector_store`** | If a persisted Chroma directory already exists, it loads it (fast!). Otherwise it embeds the documents and creates a new collection, persisting it to disk. |
| **`build_qa_chain`** | Connects the vector store (retriever) to an LLM (`qwen3.5:2b`) via LangChain's `RetrievalQA`. |
| **`demo`** | Runs a few sample queries, prints the answer and the source snippets that the retriever returned. |

---

## 6. Running the demo

```bash
# 1. Pull the embedding model (if you haven't already)
ollama pull nomic-embed-text

# 2. Pull the LLM you want to use for generation
ollama pull qwen3.5:2b   # already present for your agent, but run again if missing

# 3. Execute the script
python vector_rag_demo.py
```

You should see output similar to:

```
🗂️  Creating new Chroma collection ...
🔄 Loading existing Chroma collection ...
? Question: What is LangChain?
💬 Answer: LangChain is a framework for building applications powered by language models. It provides abstractions for LLMs, prompts, agents, memory, and retrieval-augmented generation (RAG).
🔎 Sources:
   • sample_0: LangChain is a framework for building applications powered by language models. It provides abstractions for LLMs, prompts, agents, memory, and retrieval-augmented generation (RAG)...
...
```

On subsequent runs the script will **reuse** the persisted vectors, so the embedding step is instant.

---

## 7. Extending the tutorial

| Goal | How to do it |
|------|--------------|
| **Load real files** (PDF, DOCX, web pages) | Use LangChain loaders, e.g. `from langchain_community.document_loaders import PyPDFLoader, UnstructuredHTMLLoader` and then `loader.load_and_split()` |
| **Change the vector store** (FAISS, Pinecone, etc.) | Replace `Chroma` import with `FAISS` (`from langchain_community.vectorstores import FAISS`) or the appropriate client, keep the same `OllamaEmbeddings`. |
| **Hybrid retrieval (BM25 + vectors)** | Use `langchain.retrievers import BM25Retriever` and combine with `MultiRetriever`. |
| **Persist in the cloud** (Pinecone) | `pinecone.init(api_key="...", environment="us-west1-gcp")` -> `Pinecone.from_documents(...)` |
| **Add metadata filters** (e.g., only docs from a certain source) | When creating the collection, store `metadata={"source": "...", "category": "..."}` and later call `retriever = vectordb.as_retriever(filter={"source": "sample_2"})`. |
| **Streaming answers** | Use `Ollama(streaming=True)` and iterate over `response` chunks. |
| **Integrate with your existing agent** | The `agent` you built with `create_agent` can also be given a `retriever` tool. Example: `tools=[get_weather, vectordb.as_retriever()]`. |

---

## 8. Quick cheat-sheet of the most common LangChain objects used here

| Object | Typical import | What you give it |
|--------|----------------|------------------|
| **Embedding model** | `from langchain_community.embeddings import OllamaEmbeddings` | `model="nomic-embed-text"` |
| **Vector store** | `from langchain_community.vectorstores import Chroma` | `documents`, `embedding`, `persist_directory` |
| **Retriever** | `vectordb.as_retriever()` | `search_type="similarity"`, `k=5` |
| **LLM** |

# --- User ---



=======================


vector database tutorial

A vector database is a specialized storage system designed to store, index, and query high-dimensional data points known as vector embeddings. Unlike traditional databases that match exact strings or numbers in tables, vector databases measure the mathematical "distance" between vectors to find data based on its semantic meaning. This makes them foundational for modern Artificial Intelligence, specifically for applications like Retrieval-Augmented Generation (RAG), recommendation engines, and semantic search.

🚀 Core Concepts: How it Works

1. Data Chunking & Embedding Generation: Unstructured data (text, images, audio) is broken into smaller chunks and passed through an embedding model (like OpenAI, Google Gemini, or Hugging Face transformers). The model translates the data's meaning into an array of numbers (a vector).
2. High-Dimensional Vector Space: In this mathematical space, vectors representing concepts with similar meanings sit physically closer together. For example, the vector for "king" minus "man" plus "woman" aligns incredibly close to the vector for "queen".
3. Similarity Search: When a user passes a query, it is converted into a vector using the exact same embedding model. The database searches for the "nearest neighbors" using metrics like Cosine Similarity, Euclidean Distance, or Dot Product.
4. Approximate Nearest Neighbor (ANN) Indexing: To avoid comparing a query against billions of vectors linearly (which is computationally impossible at scale), vector databases utilize advanced indexing algorithms like HNSW (Hierarchical Navigable Small World) or IVF (Inverted File Index) to return fast, approximate matches.

🛠️ Practical Hands-on Tutorial: Building a Local Vector Index

Below is a step-by-step implementation using FAISS (Facebook AI Similarity Search), a widely used, highly optimized local vector library.

1. Install Dependencies

You will need faiss-cpu for the index and numpy to format data arrays.
bash
pip install faiss-cpu numpy
Use code with caution.

2. Python Implementation

Save this script as vector_tutorial.py and run it. It simulates creating small 4-dimensional embeddings for 3 documents and performing a semantic query.
python
import faiss
import numpy as np

# 1. Define sample data vectors (Simulating embeddings generated from data chunks)
# In real life, these would be 768 or 1536-dimensional arrays from an embedding API
data_vectors = np.array([
    [0.1, 0.2, 0.3, 0.4],  # Document 1 (e.g., Tech article)
    [0.2, 0.1, 0.4, 0.3],  # Document 2 (e.g., Science blog)
    [0.9, 0.8, 0.7, 0.6],  # Document 3 (e.g., Cooking recipe)
], dtype='float32')

# 2. Initialize the index
# We use IndexFlatL2, which calculates Euclidean (L2) distance between vectors
dimension = data_vectors.shape[1] 
index = faiss.IndexFlatL2(dimension)

# 3. Populate the vector database
index.add(data_vectors)
print(f"Total vectors indexed: {index.ntotal}")

# 4. Define a user search query vector
# This query is mathematically closer to Document 1 and 2, but far from Document 3
query_vector = np.array([[0.15, 0.25, 0.35, 0.45]], dtype='float32')

# 5. Execute the search (Retrieve top 2 most similar items)
k = 2 
distances, indices = index.search(query_vector, k)

# 6. View the results
print("\n--- Search Results ---")
for i in range(k):
    print(f"Rank {i+1}: Stored Vector Index = {indices[0][i]} (Distance: {distances[0][i]:.4f})")
Use code with caution.

🧬 Choosing the Right Vector Tools

Depending on your production requirements, the vector ecosystem is divided into specific tool categories:

Database Type   Key Examples    Best Used For
Dedicated Native Vector DBs Pinecone, Milvus, Qdrant, ChromaDB  Production-grade, high-scale AI applications needing fully managed low-latency semantic search.
Vector-Capable Extensions   pgvector (PostgreSQL), Redis    Teams wanting to store vector embeddings inside their existing relational or in-memory application databases.
Local Search Libraries  FAISS, Hnswlib  Light scripts, prototyping, local execution, and low-complexity computational data operations.
