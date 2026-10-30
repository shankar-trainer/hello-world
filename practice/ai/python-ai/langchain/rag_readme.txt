Retrieval-Augmented Generation (RAG) bridges the gap between a Large Language Model's pre-trained knowledge and your private or specific data. Instead of training or fine-tuning an LLM, RAG fetches relevant snippets from your documents and injects them directly into the prompt as context.

How RAG Works in 4 Steps
	Ingest & Split: Break large documents (PDFs, text files, web pages) into smaller, manageable text chunks so they fit into the model's context window.

	Embed & Store: Convert these text chunks into numerical vectors (embeddings) using an embedding model and save them in a vector database (like Chroma, FAISS, or Pinecone).

	Retrieve: When a user asks a question, the system converts the question into an embedding and searches the vector database for the text chunks most semantically similar to the question.

	Generate: The retrieved chunks are combined with the user's question into a prompt and sent to the LLM to generate an accurate, grounded answer.

Complete Python Example
Example 1 

Here is a standalone script using LangChain, Chroma, and OpenAI that demonstrates the complete RAG workflow from start to finish.

Prerequisites
Bash
    pip install langchain langchain-community langchain-openai chromadb
Python Script (rag_demo.py)
Python

import os
from langchain_community.vectorstores import Chroma
from langchain_core.prompts import ChatPromptTemplate
from langchain_openai import ChatOpenAI, OpenAIEmbeddings
from langchain_text_splitters import RecursiveCharacterTextSplitter
from langchain.chains.combine_documents import create_stuff_documents_chain
from langchain.chains import create_retrieval_chain

# Ensure your OPENAI_API_KEY environment variable is set:
# os.environ["OPENAI_API_KEY"] = "your-api-key-here"

# 1. Define source text (your external knowledge base)
source_text = """
Project Orion is an experimental initiative launched in 2024 to explore sustainable urban farming. 

The project utilizes automated vertical hydroponics and consumes 75% less water than traditional agriculture. 

Dr. Elena Vance leads the research facility located in Zurich, Switzerland. 
Initial crop yields for leafy greens showed a 40% increase in growth speed during the winter trials.
"""

# 2. Step 1: Split the text into smaller chunks
text_splitter = RecursiveCharacterTextSplitter(chunk_size=200, chunk_overlap=20)
docs = text_splitter.create_documents([source_text])

# 3. Step 2: Embed chunks and store them in a local vector database (Chroma)
embeddings = OpenAIEmbeddings(model="text-embedding-3-small")
vectorstore = Chroma.from_documents(docs, embedding=embeddings)

# Create a retriever from the vector store
retriever = vectorstore.as_retriever(search_kwargs={"k": 2})

# 4. Step 3 & 4: Set up the LLM and RAG Prompt Chain
llm = ChatOpenAI(model="gpt-4o-mini", temperature=0)

system_prompt = (
    "You are an assistant for question-answering tasks. "
    "Use the following pieces of retrieved context to answer "
    "the question. If you don't know the answer, say that you "
    "don't know.\n\n"
    "{context}"
)

prompt = ChatPromptTemplate.from_messages([
    ("system", system_prompt),
    ("human", "{input}"),
])

question_answer_chain = create_stuff_documents_chain(llm, prompt)
rag_chain = create_retrieval_chain(retriever, question_answer_chain)

# Run a query against our RAG pipeline
response = rag_chain.invoke({"input": "Who leads Project Orion and where is it located?"})

print("Question: Who leads Project Orion and where is it located?")
print(f"Answer: {response['answer']}")

To build further upon this RAG script:

Load and chunk an actual PDF file instead of raw text

Use local open-source models with Ollama and Chroma

================================================

RAG (Retrieval-Augmented Generation) is an AI technique that combines the creative text generation of Large Language Models (LLMs) with the accurate, up-to-date data retrieval of a search system.

Instead of relying solely on the information the AI was trained on, a RAG system first searches an external knowledge base (like company documents, databases, or the web) for relevant facts, and then generates an answer using that precise context.

How RAG Works in 3 Steps

Retrieval: When you ask a question, the system converts your query into a mathematical vector and searches a specialized database (called a vector database) containing your documents to find the most relevant snippets.

Augmentation: The system takes your original question and combines it with the retrieved text snippets to create a comprehensive prompt.

Generation: The LLM reads the augmented prompt and generates a factual, grounded response based only on the provided retrieved data.

Why is RAG Important?
Eliminates Hallucinations: Because the AI is given the exact source text, it is far less likely to make up false information.

Access to Private Data: It allows companies to connect public LLMs (like GPT or Claude) to private internal documents, wikis, or customer databases without exposing sensitive data to the model's public training set.

Always Up-to-Date: Instead of retraining an entire AI model when new information arrives, you simply update the documents in the retrieval database.

Cost-Effective: Fine-tuning an LLM requires massive computing power and money. RAG simply feeds existing documents into the prompt at runtime, which is much cheaper.

Want to know how vector databases store and search data for RAG?
==================================
how vector databases store and search data for RAG?

How They Store Data (The Ingestion Pipeline)

1. Chunking: Large documents (like PDFs, manuals, or articles) are broken down into smaller, digestible segments called chunks.

2. Embedding Generation: An embedding model (such as those from OpenAI, Hugging Face, or Voyage) converts each text chunk into a high-dimensional vector—a long list of numbers that mathematically represents the meaning of the text.

3. Indexing: The vector database stores these vectors alongside their original text chunks and helpful metadata (such as file names, dates, author names, or category tags).

4. Graph/Tree Structures: To make searching fast across millions or billions of vectors, the database organizes them using specialized indexing algorithms like HNSW (Hierarchical Navigable Small World) graphs or IVF (Inverted File) indices.

How They Search Data (The Retrieval Phase)

1. Query Vectorization: When a user asks a question, the RAG system passes that question through the same embedding model to turn the query into a query vector.

2. Similarity Calculation: The vector database compares the query vector against all stored vectors using mathematical distance metrics:
    • Cosine Similarity: Measures the angle between two vectors.
    • Euclidean Distance: Measures the straight-line distance between two points in vector space.
    • Dot Product: Measures both magnitude and direction.

3. Approximate Nearest Neighbor (ANN) Search: Instead of scanning every single vector one-by-one (which is too slow), ANN algorithms traverse the indexed graph or clusters to quickly locate the Top-K most mathematically similar vectors.

4. Metadata Filtering & Hybrid Search: The system can combine the semantic search results with strict filters (e.g., “only documents from 2026”) or blend it with traditional keyword search (BM25 hybrid search) for higher precision.

5. Context Hand-off: The top-matching text chunks are retrieved and injected into the prompt of a Large Language Model (LLM) so it can generate an accurate, grounded answer.

Popular options used for this layer include Pinecone, Weaviate, Milvus, Qdrant, Chroma, and pgvector.

=============================
rag with python example

Retrieval-Augmented Generation (RAG) is an AI framework that fetches relevant information from an external knowledge base (like a private document or database) and feeds it to a Large Language Model (LLM) alongside the user's prompt. This allows the LLM to provide highly accurate, up-to-date answers grounded in your specific data without needing to fine-tune the model.

The `rag1.py` example uses Ollama's hosted cloud API for text generation and ChromaDB's default local embedding function for vector search.

Prerequisites

Create an API key at https://ollama.com/settings/keys and set it as an environment variable. In PowerShell:
bash

`$env:OLLAMA_API_KEY = "your_api_key"`

Install the Python clients:
bash
pip install ollama chromadb

The default cloud model is `gemma4:31b`. Set `OLLAMA_MODEL` to another model available through the Ollama cloud API to change it. ChromaDB computes embeddings locally and may download its default embedding model the first time it runs.

Python RAG Implementation

This script indexes a small custom knowledge base, performs a vector search based on a query, and passes the retrieved context to the LLM to get an informed response.

import os
import ollama
import chromadb
# example 1

api_key = os.environ.get("OLLAMA_API_KEY")
if not api_key:
    raise RuntimeError("Set the OLLAMA_API_KEY environment variable.")

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

# 2. Initialize ChromaDB (Ephemeral client resets every run; use PersistentClient for production)
chroma_client = chromadb.EphemeralClient()
collection = chroma_client.create_collection(name="acme_knowledge")

print("🔍 Vectorizing and indexing documents...")

# 3. Chroma generates and stores embeddings locally.
collection.add(
    ids=[f"doc_{i}" for i in range(len(documents))],
    documents=documents,
)

# 4. Define the user query
user_query = "What is the corporate color of Acme Corp and how much can I get for working from home?"

print(f"\n🙋 User Query: {user_query}")

# 5. Chroma embeds the query locally and retrieves the most relevant chunks.
results = collection.query(query_texts=[user_query], n_results=2)
retrieved_context = "\n".join(results["documents"][0])

print(f"\n📖 Retrieved Context:\n{retrieved_context}")

# 6. Construct the prompt augmenting the query with the context
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

Use code with caution.

How the Pipeline Works

Stage	Component	Description
Ingestion	ChromaDB default embedding function	Converts text documents into numerical vectors locally.

Storage	ChromaDB	Indexes and stores the vectors so they can be rapidly searched using vector similarity calculations.

Retrieval	Similarity Search	Embeds the user's question and locates the closest mathematical matches inside the vector database.

Generation	Ollama cloud model	Synthesizes the final answer using the fetched text fragments as a reliable reference sheet.

