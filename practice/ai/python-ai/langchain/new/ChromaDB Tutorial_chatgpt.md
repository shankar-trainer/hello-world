# ChromaDB Tutorial – Beginner to Advanced (Python)

ChromaDB is an open-source vector database used in AI applications, semantic search, chatbots, and Retrieval-Augmented Generation (RAG).

In this tutorial, we'll learn ChromaDB step by step with practical Python examples.

## 1. What is ChromaDB?

ChromaDB stores text and its numerical representations (called embeddings) so that AI applications can search for information based on meaning rather than exact keywords.

For example:

Suppose your database contains:

- "Python is a programming language."
- "Machine learning helps computers learn."
- "The weather is sunny today."

If you search:

"What language is used for software development?"

ChromaDB can retrieve the Python document even though the exact words are different.

## 2. How ChromaDB works

Building a Simple RAG Pipeline Using Local LLMs (Ollama + ChromaDB) | by Anil Kr | Apr, 2026 | Medium

[medium.com](<https://medium.com/%40tecanil/building-a-simple-rag-pipeline-using-local-llms-ollama-chromadb-8d6f2ffe4bb4?utm_source=chatgpt.com>)

The basic workflow:

1. Collect documents.
2. Convert documents into embeddings.
3. Store embeddings in ChromaDB.
4. Convert the user's query into an embedding.
5. Find similar documents.
6. Return relevant results to the application or LLM.

## 3. Install ChromaDB

First, install Python package:

bash

```bash
pip install chromadb
```

Import the library:

python

```python
import chromadb
```

## 4. Create your first ChromaDB database

We'll create a persistent database.

python

```python
import chromadb

client = chromadb.PersistentClient(
    path="./chroma_db"
)

print("Database created successfully!")
```

Explanation:

- `PersistentClient` creates a database that saves data on disk.
- `./chroma_db` is the storage directory.
- Your data remains available after restarting Python.

## 5. Create a collection

A collection is similar to a table in SQL.

python

```python
collection = client.create_collection(
    name="my_documents"
)

print("Collection created!")
```

You can also retrieve an existing collection:

python

```python
collection = client.get_or_create_collection(
    name="my_documents"
)
```

## 6. Insert documents into ChromaDB

Let's insert some documents.

python

```python
documents = [
    "Python is a popular programming language.",
    "Machine learning is a branch of artificial intelligence.",
    "Deep learning uses neural networks.",
    "ChromaDB is a vector database.",
    "Artificial intelligence enables machines to perform intelligent tasks."
]

ids = ["id1", "id2", "id3", "id4", "id5"]

collection.add(
    documents=documents,
    ids=ids
)

print("Documents inserted successfully!")
```

Important: ChromaDB automatically generates embeddings when you add documents using its configured embedding function.

## 7. Perform semantic search

Now let's search for similar documents.

python

```python
results = collection.query(
    query_texts=[
        "Tell me about AI and intelligent machines"
    ],
    n_results=3
)

print(results["documents"])
```

ChromaDB returns the three most similar documents.

This is called semantic search.

## 8. Add metadata

Metadata helps organize and filter documents.

python

```python
collection.add(
    ids=["id6", "id7"],
    documents=[
        "Python is used for data science.",
        "Java is used for enterprise applications."
    ],
    metadatas=[
        {"category": "programming", "language": "Python"},
        {"category": "programming", "language": "Java"}
    ]
)
```

Search using metadata filters:

python

```python
results = collection.query(
    query_texts=["programming language"],
    n_results=5,
    where={"language": "Python"}
)

print(results["documents"])
```

## 9. Update documents

You can update existing records.

python

```python
collection.update(
    ids=["id1"],
    documents=[
        "Python is widely used in AI and data science."
    ]
)
```

## 10. Delete documents

python

```python
collection.delete(
    ids=["id2"]
)
```

This removes the document with ID `id2`.

## 11. Retrieve all documents

python

```python
results = collection.get()

print(results["ids"])
print(results["documents"])
print(results["metadatas"])
```

## 12. ChromaDB important methods

| Method | Purpose |
| --- | --- |
| `create_collection()` | Create collection |
| `get_collection()` | Retrieve collection |
| `get_or_create_collection()` | Create or retrieve |
| `add()` | Insert documents |
| `query()` | Semantic search |
| `get()` | Retrieve records |
| `update()` | Update records |
| `delete()` | Delete records |
| `count()` | Count records |

## 13. Build a mini RAG application

One of the most important applications of ChromaDB is RAG.

Traditional RAG vs. Agentic RAG: The Evolution of Intelligent Systems | by Shantanu Sharma | Medium

[medium.com](<https://medium.com/%40shantanu_sharma/traditional-rag-vs-agentic-rag-the-evolution-of-intelligent-systems-20c6331e9cc7?utm_source=chatgpt.com>)

RAG stands for Retrieval-Augmented Generation.

It combines:

- ChromaDB for retrieving relevant information.
- An LLM for generating answers.
- Embeddings for understanding text meaning.

Example workflow:

python

```python
# Step 1: Search relevant documents

results = collection.query(
    query_texts=[
        "What is Python used for?"
    ],
    n_results=2
)

# Step 2: Get retrieved context

context = results["documents"][0]

# Step 3: Send context to an LLM
# The LLM uses this context to generate an answer.

print("Retrieved context:", context)
```

This is the retrieval part of a RAG application. You would connect an LLM separately to generate the final answer.

## 14. Recommended learning resources

- ChromaDB – [Official getting started documentation](<https://github.com/chroma-core/docs/blob/main/docs/getting-started.md?utm_source=chatgpt.com>)
- [Real Python: ChromaDB tutorial](<https://realpython.com/chromadb-vector-database/?utm_source=chatgpt.com>)
- [DataCamp: Step-by-step ChromaDB tutorial](<https://www.datacamp.com/tutorial/chromadb-tutorial-step-by-step-guide?utm_source=chatgpt.com>)

## Your ChromaDB learning roadmap

1. Beginner
   - Vector database concepts
   - Installation
   - Collections
   - Adding documents
2. Intermediate
   - Embeddings
   - Semantic search
   - Metadata filtering
   - Update and delete
3. Advanced
   - Custom embedding models
   - Similarity search
   - Document chunking
   - LangChain integration
4. Real-world project
   - Build an AI PDF chatbot
   - Store PDF embeddings in ChromaDB
   - Retrieve relevant PDF content
   - Generate answers using an LLM

## What would you like to build next?

Choose your next practical tutorial

PDF Chatbot using ChromaDB PDF Chatbot using ChromaDB

ChromaDB with LangChain

ChromaDB with OpenAI embeddings

ChromaDB with Hugging Face

Complete RAG application from scratch

ChromaDB interview questions

Your experience level

Beginner Beginner

Intermediate

Advanced

 Start tutorial