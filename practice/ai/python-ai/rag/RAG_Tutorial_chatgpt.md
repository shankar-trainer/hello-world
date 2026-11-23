# RAG Tutorial: Retrieval-Augmented Generation

RAG (Retrieval-Augmented Generation) is a technique used to build AI applications that can answer questions using your own documents, PDFs, databases, or knowledge base.

In this tutorial, we'll learn RAG from basics to an advanced implementation using Python and Large Language Models (LLMs).

## 1\. What is RAG?

**RAG stands for Retrieval-Augmented Generation.**

It combines two capabilities:

- **Retrieval:** Finds relevant information from external documents or databases.
- **Generation:** Uses an LLM to generate an answer based on the retrieved information.

### Example

Imagine you have 100 PDF files containing company information.

You ask an AI assistant:

"What is our company's leave policy?"

A normal LLM might not know your company's policy.

A RAG-based application:

1. Searches your PDF documents.
2. Finds the relevant leave policy.
3. Sends the retrieved information to an LLM.
4. Generates an answer based on that information.

## 2\. RAG Architecture

A typical RAG application has two major workflows.

### A. Indexing Pipeline

This prepares your documents for searching.

text

```text
PDF / Documents
      |
      v
Document Loader
      |
      v
Text Extraction
      |
      v
Text Chunking
      |
      v
Embedding Model
      |
      v
Vector Database
```

### B. Retrieval and Generation Pipeline

This answers user questions.

text

```text
User Question
      |
      v
Query Embedding
      |
      v
Vector Database Search
      |
      v
Relevant Document Chunks
      |
      v
Prompt Construction
      |
      v
LLM
      |
      v
Final Answer
```

## 3\. Important Components of RAG

Let's understand the main components.

| Component | Purpose | Example |
| --- | --- | --- |
| Document Loader | Reads documents | PDF, TXT, DOCX |
| Text Splitter | Splits documents into smaller pieces | 500-token chunks |
| Embedding Model | Converts text into vectors | Sentence Transformers |
| Vector Database | Stores and searches vectors | FAISS, Chroma, Pinecone |
| Retriever | Finds relevant chunks | Similarity Search |
| LLM | Generates answers | GPT, Llama, Gemini |
| Prompt Template | Controls answer generation | Context-based prompt |

### What are embeddings?

Embeddings convert text into numerical vectors.

For example:

text

```text
"I love machine learning"
          |
          v
Embedding Model
          |
          v
[0.21, 0.45, 0.78, 0.12, ...]
```

Texts with similar meanings generally have vectors that are close together in vector space.

### What is a vector database?

A vector database stores embeddings and helps retrieve semantically similar information.

Popular options:

- FAISS
- ChromaDB
- Pinecone
- Weaviate
- Milvus

## 4\. Build Your First RAG Application Using Python

Let's build a simple RAG application that answers questions from a text document.

### Step 1: Install dependencies

bash

```bash
pip install sentence-transformers faiss-cpu numpy requests pypdf
```

We'll use:

- Python for implementation.
- Sentence Transformers for embeddings.
- FAISS for vector search.
- Ollama for running an LLM locally.

Install Ollama from its official website:

[Ollama](<https://ollama.com/?utm_source=chatgpt.com>)

Download a model:

bash

```bash
ollama pull llama3.2
```

### Step 2: Prepare documents

Create a file called `knowledge.txt`.

text

```text
Python is a high-level programming language.

Machine learning is a subset of artificial intelligence.

Deep learning uses neural networks
to learn complex patterns from data.

RAG stands for Retrieval-Augmented Generation.

RAG combines information retrieval
with large language models.
```

### Step 3: Create text chunks

Why do we need chunking?

Suppose a document contains 10,000 words. Sending the entire document to an LLM for every question is inefficient.

Instead, split it into smaller chunks.

python

```python
def chunk_text(text, chunk_size=500, overlap=50):
    words = text.split()
    chunks = []

    for i in range(0, len(words), chunk_size - overlap):
        chunk = words[i:i + chunk_size]
        chunks.append(" ".join(chunk))

    return chunks
```

**Important terms:**

- Chunk size: Number of words or tokens in each chunk.
- Overlap: Shared text between consecutive chunks.

Overlap helps preserve context across chunk boundaries.

### Step 4: Generate embeddings

Use Sentence Transformers.

python

```python
from sentence_transformers import SentenceTransformer

embedding_model = SentenceTransformer(
    "all-MiniLM-L6-v2"
)

chunks = [
    "Python is a programming language.",
    "Machine learning is a subset of AI.",
    "RAG combines retrieval and generation."
]

embeddings = embedding_model.encode(chunks)

print(embeddings.shape)
```

Each chunk is converted into a numerical vector.

### Step 5: Store embeddings in FAISS

python

```python
import faiss
import numpy as np

dimension = embeddings.shape[1]

index = faiss.IndexFlatL2(dimension)

index.add(
    np.array(embeddings).astype("float32")
)

print("Documents stored successfully!")
```

Now we have a searchable vector index.

### Step 6: Retrieve relevant documents

When a user asks a question, convert the question into an embedding and search FAISS.

python

```python
def retrieve_documents(question, top_k=2):

    query_embedding = embedding_model.encode(
        [question]
    )

    distances, indices = index.search(
        np.array(query_embedding).astype("float32"),
        top_k
    )

    results = []

    for i in indices[0]:
        results.append(chunks[i])

    return results
```

Example:

python

```python
question = "What is RAG?"

results = retrieve_documents(question)

for result in results:
    print(result)
```

The retriever returns the most relevant document chunks.

### Step 7: Generate an answer using an LLM

Now pass the retrieved context to an LLM.

We'll use Ollama's local API.

python

```python
import requests

def generate_answer(question, context):

    prompt = f"""
    You are a helpful AI assistant.

    Answer the question using only the
    information provided in the context.

    Context:
    {context}

    Question:
    {question}

    Answer:
    """

    response = requests.post(
        "http://localhost:11434/api/generate",
        json={
            "model": "llama3.2",
            "prompt": prompt,
            "stream": False
        },
        timeout=120
    )

    response.raise_for_status()

    return response.json()["response"]
```

### Step 8: Connect everything

This is the complete RAG workflow.

python

```python
def rag_pipeline(question):

    # 1. Retrieve relevant documents
    retrieved_docs = retrieve_documents(question)

    # 2. Create context
    context = "\n".join(retrieved_docs)

    # 3. Generate answer
    answer = generate_answer(
        question,
        context
    )

    return answer


question = "What is RAG?"

answer = rag_pipeline(question)

print(answer)
```

Congratulations\! You've built a basic RAG application.

---

## 5\. Advanced RAG Concepts

Once you understand basic RAG, learn these advanced concepts.

| Concept | What it does |
| --- | --- |
| Semantic Search | Searches based on meaning |
| Hybrid Search | Combines keyword and vector search |
| Reranking | Reorders retrieved documents by relevance |
| Query Expansion | Generates alternative search queries |
| Metadata Filtering | Filters documents using metadata |
| Multi-Query Retrieval | Searches using multiple queries |
| Contextual Compression | Removes irrelevant context |
| Parent-Child Retrieval | Retrieves small chunks with larger context |
| Agentic RAG | Uses agents to control retrieval |
| Graph RAG | Uses knowledge graphs for retrieval |

### Basic RAG vs Advanced RAG

**Basic RAG:**

text

```text
Question
   |
   v
Vector Search
   |
   v
Retrieved Documents
   |
   v
LLM
   |
   v
Answer
```

**Advanced RAG:**

text

```text
Question
   |
   v
Query Transformation
   |
   v
Hybrid Retrieval
   |
   v
Reranking
   |
   v
Context Filtering
   |
   v
LLM
   |
   v
Answer with Citations
```

## 6\. RAG Frameworks You Should Learn

After implementing RAG from scratch, explore these frameworks.

### 1\. LangChain

LangChain

Used for:

- Document loading.
- Text splitting.
- Retrieval chains.
- Prompt management.
- LLM integration.

Website: [LangChain Documentation](<https://python.langchain.com/docs/introduction/?utm_source=chatgpt.com>)

### 2\. LlamaIndex

LlamaIndex

Used for:

- Building document-based chatbots.
- Data ingestion.
- Indexing.
- Advanced retrieval.
- Query engines.

Website: [LlamaIndex Documentation](<https://docs.llamaindex.ai/?utm_source=chatgpt.com>)

### 3\. LangGraph

LangGraph

Used for:

- Agentic RAG.
- Multi-agent workflows.
- Conditional retrieval.
- Stateful AI applications.

Website: [LangGraph Documentation](<https://docs.langchain.com/oss/python/langgraph/overview?utm_source=chatgpt.com>)

## 7\. Real-World RAG Projects

Practice with these projects to develop practical skills.

| Level | Project | Concepts |
| --- | --- | --- |
| Beginner | PDF Chatbot | Chunking, embeddings |
| Beginner | FAQ Chatbot | Semantic search |
| Intermediate | Multiple PDF Chatbot | Document ingestion |
| Intermediate | Website Chatbot | Web scraping, indexing |
| Intermediate | SQL + RAG Assistant | Structured data |
| Advanced | Enterprise Knowledge Assistant | Hybrid search, reranking |
| Advanced | Agentic RAG | AI agents, tools |
| Advanced | Multi-Agent Research Assistant | Agent orchestration |

## 8\. Recommended RAG Learning Roadmap

Follow this order:

1. Python fundamentals.
2. LLM fundamentals.
3. Prompt engineering.
4. Embeddings and semantic search.
5. Vector databases.
6. Document loading and chunking.
7. Basic RAG implementation.
8. LangChain and LlamaIndex.
9. Hybrid search and reranking.
10. Advanced RAG architectures.
11. Agentic RAG and LangGraph.
12. RAG evaluation and deployment.

## 9\. Important RAG Interview Questions

Make sure you understand these concepts:

1. What is RAG and why do we need it?
2. RAG vs fine-tuning?
3. What are embeddings?
4. What is cosine similarity?
5. What is vector search?
6. What is chunking?
7. What is chunk overlap?
8. What is semantic search?
9. What is hybrid search?
10. What is reranking?
11. What is a retriever?
12. What is the difference between FAISS and ChromaDB?
13. What is Agentic RAG?
14. How do you reduce hallucinations in RAG?
15. How do you evaluate RAG performance?

---

## 10\. Important: Make Your First RAG Project Production-Ready

The basic implementation above is for learning. For a more realistic application, also implement:

- PDF ingestion and document parsing.
- Persistent vector storage.
- Metadata filtering.
- Hybrid retrieval.
- Reranking.
- Source citations.
- Retrieval evaluation.
- Hallucination checks.
- API development using FastAPI.
- Deployment using Docker.

**One important distinction:** RAG does not train or modify the LLM. It retrieves external information and provides that information to the LLM as context.

### My recommendation

Don't start directly with LangChain. First build RAG from scratch using Python, embeddings and FAISS. This will help you understand what's happening internally.

Then move to LangChain, LlamaIndex and Agentic RAG.