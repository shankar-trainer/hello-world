chromedb tutorial

---

## 📚 1.  What is ChromaDB?

* **Chroma** is a lightweight, persistent vector database that stores embeddings and lets you do fast similarity search (k-NN) on them.  
* It ships with an **in-process** mode (no external server) and a **client-server** mode (HTTP API).  
* Perfect for prototyping RAG (Retrieval-Augmented Generation) pipelines with LangChain.

---  

## 🛠️ 2.  Installation

```bash
# Core libraries
pip install chromadb          # the vector store
pip install langchain         # LLM-oriented abstractions
pip install openai            # for the OpenAI embeddings/LLM (or any other provider)

# Optional - if you want to use Sentence-Transformers locally:
pip install sentence-transformers
```

> **Tip:** Keep your `requirements.txt` in sync:
```text
chromadb==0.4.24
langchain==0.2.0
openai==1.30.0
sentence-transformers==2.7.0   # optional
```

---  

## 🚀 3.  Quick-Start: In-Process ChromaDB

Below is a minimal, fully-self-contained script that:
1. Creates a Chroma collection.
2. Adds a few text snippets (you can replace them with your own docs).
3. Generates embeddings with the OpenAI `text-embedding-3-large` model.
4. Performs a similarity search.
5. Wraps everything in a LangChain `VectorStoreRetriever` for chat-style RAG.

```python
# -------------------------------------------------
# vector_chatgpt1.py  (or paste into your .md as a code block)
# -------------------------------------------------
import os
from pathlib import Path

# 1.  Load your LLM/embedding provider ---------------------------------
# Here we use OpenAI embeddings - you can swap in any provider LangChain supports.
import openai
openai.api_key = os.getenv("OPENAI_API_KEY")   # 👉 set this in your shell or .env

# 2.  Create a Chroma client (in-process, persisted to ./chroma_db) -----
import chromadb
from chromadb.config import Settings

client = chromadb.Client(
    Settings(
        chroma_db_impl="duckdb+parquet",   # fast, persistent on disk
        persist_directory="./chroma_db",   # <-- change as you like
    )
)

# 3.  Define (or load) your documents -----------------------------------
# Replace these with `Path("my_folder").rglob("*.txt")` etc.
documents = [
    {"id": "doc1", "text": "Python is a programming language that lets you work quickly."},
    {"id": "doc2", "text": "LangChain enables composable LLM applications."},
    {"id": "doc3", "text": "ChromaDB stores vector embeddings for fast similarity search."},

]

# 4.  Compute embeddings -------------------------------------------------
def embed(texts: list[str]) -> list[list[float]]:
    """Batch call to OpenAI embeddings."""
    response = openai.embeddings.create(
        input=texts,
        model="text-embedding-3-large",   # cheap & good quality
    )
    return [list(item.embedding) for item in response.data]

embeddings = embed([doc["text"] for doc in documents])

# 5.  Create (or get) a collection ---------------------------------------
collection_name = "my_docs"
if collection_name in [c.name for c in client.list_collections()]:
    collection = client.get_collection(name=collection_name)
else:
    collection = client.create_collection(name=collection_name)

# 6.  Add documents to Chroma --------------------------------------------
collection.add(
    ids=[doc["id"] for doc in documents],
    documents=[doc["text"] for doc in documents],
    embeddings=embeddings,
)

# 7.  Verify that data persisted -----------------------------------------
print("Collections now:", client.list_collections())
print("Number of vectors in collection:", collection.count())

# 8.  Retrieval with LangChain -------------------------------------------
from langchain.vectorstores import Chroma
from langchain.embeddings import OpenAIEmbeddings
from langchain.retrievers import ContextualCompressionRetriever
from langchain.chat_models import ChatOpenAI
from langchain.chains import ConversationalRetrievalChain

# LangChain wrapper - tells LangChain how to embed future queries
langchain_embeddings = OpenAIEmbeddings(model="text-embedding-3-large")
vectorstore = Chroma(
    client=client,
    collection_name=collection_name,
    embedding_function=langchain_embeddings,
)

retriever = vectorstore.as_retriever(search_kwargs={"k": 3})   # top-3 results

# 9.  Chat-with-retrieval (RAG) -----------------------------------------
qa = ConversationalRetrievalChain.from_llm(
    llm=ChatOpenAI(model="gpt-4o-mini"),   # or any other chat model
    retriever=retriever,
    return_source_documents=True,
)

# Simple interactive loop ------------------------------------------------
chat_history = []
print("\n🗨️  Ask me anything about the docs! (type 'exit' to quit)")
while True:
    query = input("\n> ")
    if query.lower() in {"exit", "quit"}:
        break

    result = qa({"question": query, "chat_history": chat_history})
    answer = result["answer"]
    sources = result["source_documents"]

    print("\nAnswer:", answer)
    print("\nSources:")
    for doc in sources:
        print(f"- [{doc.metadata.get('id')}] {doc.page_content[:150]}...")
    chat_history.append((query, answer))
```

### What the script does

| Step | Purpose |
|------|---------|
| **1-2** | Set up OpenAI credentials and a persistent Chroma client (stores data in `./chroma_db`). |
| **3-4** | Load raw texts and compute their embeddings in one batch. |
| **5-6** | Create a collection named `my_docs` and add the vectors. |
| **7** | Print a quick sanity check - you'll see the collection persisted on disk. |
| **8** | Wrap the Chroma collection in LangChain's `Chroma` vector store, so LangChain can call it for retrieval. |
| **9** | Build a `ConversationalRetrievalChain` that: <br>• Sends the user query -> retriever (k-NN) <br>• Feeds retrieved chunks + chat history to the LLM <br>• Returns an answer plus source excerpts. |

---

## 📂 4.  Loading Real-World Documents

If you have a folder of PDFs, Markdown files, or plain-text docs, replace the manual `documents` list with something like:

```python
from langchain.document_loaders import DirectoryLoader, TextLoader, PyPDFLoader

loader = DirectoryLoader(
    path="data/",               # your folder
    glob="**/*.pdf",            # change pattern as needed
    loader_cls=PyPDFLoader,
    recursive=True,
)

raw_docs = loader.load()
# Convert LangChain Document objects to the dict format Chroma expects:
documents = [
    {"id": f"doc_{i}", "text": doc.page_content}
    for i, doc in enumerate(raw_docs)
]
```

After loading, you can reuse the same `embed` and `collection.add` steps as before.

---

## 🔧 5.  Tips & Gotchas

| Issue | Fix |
|-------|-----|
| **Embedding model mismatch** | The embeddings used **when you add data** must be **exactly the same** as the embeddings used for query time. If you switch from `text-embedding-3-large` to another model, re-index the collection. |
| **Running out of memory** | Batch your embeddings (`embed(chunk_of_100)`) instead of sending the whole corpus at once. |
| **Persistence path** | `persist_directory` is relative to where you launch the script. Use an absolute path (`Path.cwd() / "chroma_db"` ) for reproducibility. |
| **Multiple collections** | You can keep separate collections for different topics (e.g., `legal_docs`, `product_manuals`). Just change `collection_name`. |
| **Changing the number of retrieved chunks** | Adjust `search_kwargs={"k": N}` in `as_retriever`. More chunks -> richer context but higher token cost. |
| **Using a local embedding model** | Replace `OpenAIEmbeddings` with `SentenceTransformerEmbeddings`:

```python
from langchain.embeddings import HuggingFaceEmbeddings
emb = HuggingFaceEmbeddings(model_name="sentence-transformers/all-MiniLM-L6-v2")
```

  Remember to compute embeddings for both indexing and query with the **same** model. |

---

## 📦 6.  Full Minimal `requirements.txt`

```
chromadb==0.4.24
langchain==0.2.0
openai==1.30.0
tiktoken==0.7.0          # optional, helps token counting
python-dotenv==1.0.1     # if you want to load .env files
```

---

## 🎉 7.  Run the Demo

```bash
export OPENAI_API_KEY="sk-..."
python vector_chatgpt1.py
```

You'll see a prompt:

```
🗨️  Ask me anything about the docs! (type 'exit' to quit)

> What is ChromaDB?
```

The assistant will answer using the retrieved chunk(s) and show the source IDs, proving that the vector store is correctly feeding context to the LLM.

---

## 📚 8.  Where to Go Next?

| Goal | Recommended Next Step |
|------|------------------------|
| **Scale to millions of vectors** | Deploy Chroma in **client-server mode** (`chromadb --host 0.0.0.0 --port 8000`) and point the Python client at `http://localhost:8000`. |
| **Hybrid search (metadata + vector)** | Add metadata fields (`metadata={"category":"finance"}`) when calling `collection.add` and use `where=` filters in the retriever. |
| **Persist with SQLite/PG** | Use `Settings(chroma_db_impl="sqlite", ...)` or `Settings(chroma_db_impl="postgresql", ...)` for alternative back-ends. |
| **Better UI** | Wrap the loop in a **Gradio** or **Streamlit** front-end for a web chat UI. |
| **Evaluation** | Use LangChain's `RetrievalQA` evaluation utilities to measure relevance (e.g., `langchain.evaluation.qa`). |

---

## 🗂️ 9.  Reference Links

* **Chroma docs** - https://docs.trychroma.com  
* **LangChain vectorstores** - https://python.langchain.com/docs/integrations/vectorstores/chroma  
* **OpenAI embeddings** - https://platform.openai.com/docs/guides/embeddings/embedding-models  
* **Sentence-Transformers** - https://www.sbert.net  

---

### 🎈  TL;DR

1. `pip install chromadb langchain openai`  
2. Create a Chroma client (persisted directory).  
3. Load your texts, compute embeddings (same model for indexing & queries).  
4. Add them to a collection.  
5. Wrap the collection with LangChain's `Chroma` class.  
6. Build a `ConversationalRetrievalChain` (or any other chain) and start chatting!

Copy the whole markdown block above into `vector_chatgpt1.md` and you'll have a ready-to-run tutorial for a **ChromaDB + LangChain** chat-with-your-documents app. Happy coding! 🚀

# --- User ---
