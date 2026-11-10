
## 1. What Is LangChain?

| Feature | Why It Matters |
|---------|----------------|
| **Composable** - Build complex LLM pipelines from small, reusable blocks (prompts, models, tools, memory). | Keeps your code clean and testable. |
| **Provider-agnostic** - Works with OpenAI, Anthropic, Cohere, HuggingFace, Azure, Bedrock, etc. | Switch LLMs without rewriting logic. |
| **Built-in integrations** - Vector stores, document loaders, callbacks, evaluation, tracing. | Jump-start retrieval-augmented generation (RAG), chat bots, data extraction, etc. |
| **Agents** - LLMs can call external tools (APIs, Python functions, DB queries). | Build autonomous assistants. |
| **Memory** - Persist conversation state across turns. | Enable coherent multi-turn chats. |

---

## 2. Installation

```bash
# Core library
pip install langchain

# Optional extras you'll likely need
pip install "langchain[openai]"          # OpenAI API
pip install "langchain[anthropic]"      # Anthropic API
pip install "langchain[cohere]"         # Cohere API
pip install "langchain[chromadb]"       # Simple vector store
pip install "langchain[faiss]"          # FAISS vector DB
pip install "langchain[all]"            # Install *all* optional deps
```

> **Tip:** Keep your API keys in environment variables (`OPENAI_API_KEY`, `ANTHROPIC_API_KEY`, ...) or a `.env` file and load them with `python-dotenv`.

```python
# .env
OPENAI_API_KEY=sk-...
```

```python
# load .env automatically
from dotenv import load_dotenv
load_dotenv()
```

---

## 3. Core Concepts

| Concept | Description | Typical Class |
|---------|-------------|---------------|
| **LLM** | The language model you query. | `OpenAI`, `ChatOpenAI`, `Anthropic`, `Cohere` |
| **PromptTemplate** | A reusable prompt with variables. | `PromptTemplate` |
| **LLMChain** | Prompt -> LLM -> output (the most basic chain). | `LLMChain` |
| **Agent** | LLM + tool-calling logic (decides *what* to do). | `AgentExecutor`, `Tool`, `OpenAIFunctionsAgent` |
| **Memory** | Stores past interactions for context. | `ConversationBufferMemory`, `ConversationSummaryMemory` |
| **Retriever** | Finds relevant docs from a vector store. | `FAISS`, `Chroma`, `Pinecone`, `Weaviate` |
| **RetrievalQA** | Combine retriever + LLM to answer questions. | `RetrievalQA` |
| **Callbacks** | Hooks for logging, tracing, streaming. | `ConsoleCallbackHandler`, `LangChainTracer` |

---

## 4. "Hello-World" - A Simple LLMChain

```python
from langchain.llms import OpenAI
from langchain.prompts import PromptTemplate
from langchain.chains import LLMChain

# 1. Define the LLM (defaults to gpt-3.5-turbo)
llm = OpenAI(model_name="gpt-3.5-turbo", temperature=0.7)

# 2. Create a prompt template with a variable `{topic}`
prompt = PromptTemplate(
    input_variables=["topic"],
    template="Write a short, witty paragraph about {topic}."
)

# 3. Wire them together into a chain
chain = LLMChain(llm=llm, prompt=prompt)

# 4. Run it
result = chain.run(topic="quantum computing")
print(result)
```

**Output (example)**  

> "Quantum computing is like trying to solve a Rubik's cube while the colors keep changing..."

---

## 5. Adding a **Retriever** - Retrieval-Augmented Generation (RAG)

### 5.1 Load Documents

```python
from langchain.document_loaders import TextLoader
from langchain.text_splitter import RecursiveCharacterTextSplitter

loader = TextLoader("data/ai_research_overview.txt")
documents = loader.load()

splitter = RecursiveCharacterTextSplitter(chunk_size=1000, chunk_overlap=200)
chunks = splitter.split_documents(documents)
```

### 5.2 Create a Vector Store (FAISS example)

```python
from langchain.embeddings import OpenAIEmbeddings
from langchain.vectorstores import FAISS

embeddings = OpenAIEmbeddings()
vectorstore = FAISS.from_documents(chunks, embeddings)
retriever = vectorstore.as_retriever(search_kwargs={"k": 4})   # return top-4 docs
```

### 5.3 Build a RetrievalQA chain

```python
from langchain.chains import RetrievalQA
from langchain.llms import OpenAI

qa = RetrievalQA.from_chain_type(
    llm=OpenAI(temperature=0),
    chain_type="stuff",          # "map_reduce" or "refine" also work
    retriever=retriever,
    return_source_documents=True
)

question = "What are the main challenges of scaling quantum computers?"
answer = qa(question)
print(answer["result"])
print("\n--- Sources ---")
for doc in answer["source_documents"]:
    print("- ", doc.metadata.get("source", "unknown"))
```

**Result** - You get a concise answer **plus** the source snippets that the LLM used.

---

## 6. Conversational Agents with **Tools**

LangChain agents can call external tools (APIs, Python functions, DB queries). Below is a minimal example that lets the LLM **search the web** using the `requests` library.

### 6.1 Define a tool

```python
import requests
from typing import Any, Dict
from langchain.tools import BaseTool

class SearchTool(BaseTool):
    name = "search"
    description = "Search the web for a query and return the raw HTML."

    def _run(self, query: str) -> str:
        # Simple GET request to DuckDuckGo's HTML endpoint (no API key needed)
        resp = requests.get(
            "https://duckduckgo.com/html/",
            params={"q": query},
            headers={"User-Agent": "langchain-tutorial/1.0"}
        )
        resp.raise_for_status()
        return resp.text[:2000]   # truncate for brevity
```

### 6.2 Build the agent

```python
from langchain.agents import initialize_agent, AgentType
from langchain.llms import OpenAI

llm = OpenAI(temperature=0)
tools = [SearchTool()]

agent = initialize_agent(
    tools,
    llm,
    agent=AgentType.OPENAI_FUNCTIONS,   # uses OpenAI function-calling
    verbose=True
)

# Ask the agent to perform a search
response = agent.run("Find the latest headline about AI safety from the web.")
print(response)
```

**What happens under the hood**

1. The LLM decides it needs the `search` tool.  
2. LangChain formats a **function call** payload.  
3. The `SearchTool._run` method executes, returns HTML.  
4. The LLM consumes the result and produces a final answer.

---

## 7. Memory - Keeping Context Across Turns

```python
from langchain.memory import ConversationBufferMemory
from langchain.chains import ConversationChain
from langchain.llms import OpenAI

memory = ConversationBufferMemory(memory_key="history")
conv = ConversationChain(
    llm=OpenAI(temperature=0.7),
    memory=memory,
    verbose=True
)

print(conv.predict(input="Hi! What's your name?"))
print(conv.predict(input="What did I just ask you?"))
```

**Result** - The second turn knows the user previously asked for the bot's name because the conversation history is stored in `memory`.

### 7.1 Summarizing Long Histories

```python
from langchain.memory import ConversationSummaryMemory

summary_memory = ConversationSummaryMemory(
    llm=OpenAI(temperature=0),
    memory_key="summary"
)

summary_chain = ConversationChain(
    llm=OpenAI(temperature=0),
    memory=summary_memory,
    verbose=True
)
```

Use `ConversationSummaryMemory` when you need a *compact* representation of a very long chat.

---

## 8. Streaming Responses (Real-time UI)

```python
from langchain.callbacks.streaming_stdout import StreamingStdOutCallbackHandler
from langchain.llms import OpenAI

stream_handler = StreamingStdOutCallbackHandler()
llm = OpenAI(streaming=True, callbacks=[stream_handler], temperature=0.7)

print(llm("Write a poem about the night sky in 3 lines."))
```

The poem appears token-by-token in the console, perfect for a UI that streams text.

---

## 9. Putting It All Together - A Mini Chat-Bot with Retrieval & Memory

```python
from langchain.llms import OpenAI
from langchain.prompts import PromptTemplate
from langchain.chains import ConversationalRetrievalChain
from langchain.memory import ConversationBufferMemory
from langchain.vectorstores import FAISS
from langchain.embeddings import OpenAIEmbeddings
from langchain.document_loaders import TextLoader
from langchain.text_splitter import RecursiveCharacterTextSplitter

# ---- Load & index docs -------------------------------------------------
loader = TextLoader("data/company_policy.txt")
docs = loader.load()
splitter = RecursiveCharacterTextSplitter(chunk_size=1000, chunk_overlap=200)
chunks = splitter.split_documents(docs)

emb = OpenAIEmbeddings()
vectorstore = FAISS.from_documents(chunks, emb)
retriever = vectorstore.as_retriever(search_kwargs={"k": 3})

# ---- Build the chain ---------------------------------------------------
llm = OpenAI(temperature=0.2)
memory = ConversationBufferMemory(memory_key="chat_history", return_messages=True)

qa_chain = ConversationalRetrievalChain.from_llm(
    llm,
    retriever,
    memory=memory,
    return_source_documents=False
)

# ---- Interactive loop --------------------------------------------------
def chat():
    print("🗨️  Ask anything about the company policy (type 'exit' to quit)")
    while True:
        query = input("\nYou: ")
        if query.lower() in {"exit", "quit"}:
            break
        answer = qa_chain({"question": query})
        print("\nBot:", answer["answer"])

if __name__ == "__main__":
    chat()
```

*Features demonstrated*:  
- **Document ingestion** -> vector store.  
- **Retriever** for relevant passages.  
- **Conversation memory** so follow-up questions are contextual.  
- **LLM** produces the final answer.

---

## 10. Debugging & Observability

| Goal | Tool |
|------|------|
| **Print every LLM request/response** | `ConsoleCallbackHandler` (set `verbose=True` on chains). |
| **Trace in a UI (e.g., LangSmith)** | `from langchain import LangSmithTracer` -> `tracer = LangSmithTracer(project_name="my-app")` |
| **Measure token usage** | `OpenAICallbackHandler` provides `total_tokens`, `prompt_tokens`, `completion_tokens`. |
| **Unit-test chains** | Mock the LLM (`from langchain.llms.fake import FakeListLLM`) and assert outputs. |

```python
from langchain.callbacks import get_openai_callback

with get_openai_callback() as cb:
    result = chain.run(topic="deep learning")
    print("Tokens used:", cb.total_tokens)
```

---

## 11. Frequently Asked Questions

| Question | Answer |
|----------|--------|
| **Do I need an OpenAI account?** | Only if you use OpenAI models. LangChain works with many providers; just install the appropriate extra and set the provider's API key. |
| **How do I keep my API keys safe?** | Store them in environment variables (`export OPENAI_API_KEY=...`) or a `.env` file loaded with `python-dotenv`. Never hard-code them. |
| **Can I run LangChain offline?** | Yes, if you use a local LLM (e.g., Llama-2 via `llama_cpp_python` or HuggingFace `transformers`). Replace `OpenAI` with a local model wrapper. |
| **What vector store should I pick?** | For prototypes, **FAISS** (in-memory) or **Chroma** are easiest. For production, consider **Pinecone**, **Weaviate**, **Qdrant**, or **Milvus**. |
| **Is LangChain only for chat bots?** | No. It's a generic orchestration framework for any LLM-driven workflow: data extraction, summarization, code generation, tool-augmented reasoning, etc. |

---

## 12. Next Steps & Resources

| Resource | What You'll Find |
|----------|------------------|
| **Official Docs** | <https://python.langchain.com/> - full API reference, tutorials, cookbook. |
| **LangChain Hub** | <https://smith.langchain.com/hub> - community-shared prompts, chains, agents. |
| **LangSmith (Observability)** |

# --- User ---


=================================================
# --- System ---
You are an expert programming agent. Focus on correctness and simplicity.

# --- User ---
File: None
```
langchain tutorial and example with ollama 

```

## --- Response ---
Below is a **step-by-step tutorial** that shows how to use **LangChain** together with **Ollama** - a local LLM server that can run models like Llama 2, Mistral, Gemma, etc.  
The guide covers:

| Section | What you'll learn |
|---------|-------------------|
| 1.  | Installing Ollama & pulling a model |
| 2.  | Installing LangChain & required Python packages |
| 3.  | Connecting LangChain to Ollama (LLM wrapper) |
| 4.  | Building a simple **LLMChain** (prompt -> model -> response) |
| 5.  | Adding **memory** (chat-style conversation) |
| 6.  | Using **retrieval** (vector store + RAG) with Ollama |
| 7.  | Running everything in a single script / Jupyter notebook |
| 8.  | Common pitfalls & debugging tips |

---

## 1. Install Ollama (the local LLM server)

> **TL;DR** - `curl -fsSL https://ollama.com/install.sh | sh` (Linux/macOS) or use the Windows installer from https://ollama.com.

1. **Download & install**  
   ```bash
   # Linux/macOS
   curl -fsSL https://ollama.com/install.sh | sh

   # Windows: download the .exe from https://ollama.com/download
   ```

2. **Start the Ollama daemon** (it runs on `http://localhost:11434` by default):
   ```bash
   ollama serve
   ```

3. **Pull a model** (e.g., `llama2`, `mistral`, `gemma`, `phi` ...).  
   ```bash
   ollama pull llama2   # ~4 GB download
   # or a smaller model for quick tests
   ollama pull tinyllama
   ```

4. **Test the model with the CLI** (optional but useful):
   ```bash
   ollama run llama2 "Write a haiku about sunrise."
   ```

   You should see a short haiku printed - that means Ollama is ready.

---

## 2. Install LangChain & supporting libraries

Create a fresh virtual environment (highly recommended):

```bash
python -m venv venv
source venv/bin/activate   # Windows: venv\Scripts\activate
```

Install the core LangChain packages and the HTTP client we'll need to talk to Ollama:

```bash
pip install --upgrade pip
pip install langchain==0.2.10  # adjust version as you like
pip install openai==1.30.0    # required for the generic LLM interface (even though we use Ollama)
pip install "langchain-community[all]"   # includes embeddings, vectorstores, etc.
pip install tqdm   # for nice progress bars when loading data
```

> **Why `openai`?**  
> LangChain's base `BaseLLM` uses the OpenAI-style JSON schema for request/response. The Ollama wrapper we'll use inherits from that class, so the `openai` package is a lightweight dependency.

---

## 3. Connect LangChain -> Ollama

LangChain already ships a **community-provided** Ollama LLM wrapper (`OllamaLLM`).  
If you need a custom wrapper, the code is only ~15 lines (see the *Advanced* section at the end).

```python
from langchain_community.llms import Ollama

# The default host is http://localhost:11434
ollama_llm = Ollama(model="llama2")   # or "tinyllama", "mistral", etc.
```

You can verify the connection:

```python
print(ollama_llm.invoke("What is the capital of France?"))
# -> "Paris."
```

---

## 4. Build a **simple LLMChain**

A *PromptTemplate* -> *LLM* -> *Response* pipeline.

```python
from langchain import PromptTemplate, LLMChain

# 1. Prompt template (Jinja-style)
template = """You are a helpful assistant. Answer the question below in a concise, friendly tone.

Question: {question}
Answer:"""

prompt = PromptTemplate(
    input_variables=["question"],
    template=template,
)

# 2. Chain everything together
chain = LLMChain(prompt=prompt, llm=ollama_llm)

# 3. Run it
response = chain.invoke({"question": "Explain the difference between a list and a tuple in Python."})
print(response["text"])
```

**Result (example)**  

```
A list is mutable (you can change, add, or remove items), while a tuple is immutable (once created, its contents cannot be altered). Lists use square brackets [] and tuples use parentheses (). Choose a list when you need to modify data; choose a tuple for fixed collections or as dictionary keys.
```

---

## 5. Add **conversation memory** (chat-style)

LangChain provides a `ConversationBufferMemory` that keeps the last *k* turns and automatically injects them into the prompt.

```python
from langchain.memory import ConversationBufferMemory
from langchain.chains import ConversationChain

memory = ConversationBufferMemory(memory_key="history", return_messages=True)

chat = ConversationChain(
    llm=ollama_llm,
    memory=memory,
    verbose=False,   # set True to see the full prompt each turn
)

# Simulate a short dialogue
print(chat.predict(input="Hi! Who are you?"))
print(chat.predict(input="Can you tell me a joke about cats?"))
print(chat.predict(input="Now rewrite that joke in Shakespearean English."))
```

The wrapper automatically builds a prompt that looks like:

```
You are a helpful assistant. The conversation so far:
Human: Hi! Who are you?
Assistant: I am an AI running on Ollama...
Human: Can you tell me a joke about cats?
Assistant: ...
Human: Now rewrite that joke in Shakespearean English.
Assistant:
```

**Result** - you'll get a coherent, context-aware reply.

---

## 6. Retrieval-Augmented Generation (RAG) with a vector store

Let's retrieve relevant documents from a small knowledge base (e.g., a set of Markdown files) and feed them to the LLM.

### 6.1 Prepare some sample docs

```python
import pathlib, json, textwrap, os

docs_folder = pathlib.Path("sample_docs")
docs_folder.mkdir(exist_ok=True)

(docs_folder / "intro.md").write_text(
    textwrap.dedent("""\
    # LangChain & Ollama

    LangChain is a framework for building LLM-powered applications.
    Ollama runs LLMs locally and provides a simple HTTP API.
    Combining them lets you build private, fast, and cheap AI apps.
    """)
)

(docs_folder / "python.md").write_text(
    textwrap.dedent("""\
    # Python Lists vs Tuples

    * **List** - mutable, defined with [].
    * **Tuple** - immutable, defined with ().
    * Use a list when you need to modify the collection; use a tuple for fixed data.
    """)
)
```

### 6.2 Load docs -> embeddings -> vector store

We'll use **`SentenceTransformers`** embeddings (fast, no API key) and **FAISS** as the in-memory vector DB.

```python
from langchain_community.document_loaders import DirectoryLoader, TextLoader
from langchain.text_splitter import RecursiveCharacterTextSplitter
from langchain_community.embeddings import HuggingFaceEmbeddings
from langchain_community.vectorstores import FAISS

# Load markdown files
loader = DirectoryLoader(str(docs_folder), glob="*.md", loader_cls=TextLoader)
documents = loader.load()

# Split into manageable chunks (e.g., 500 chars)
splitter = RecursiveCharacterTextSplitter(chunk_size=500, chunk_overlap=50)
chunks = splitter.split_documents(documents)

# Embeddings - you can pick any model from sentence-transformers hub
embedder = HuggingFaceEmbeddings(model_name="sentence-transformers/all-MiniLM-L6-v2")

# Build FAISS index
vectorstore = FAISS.from_documents(chunks, embedder)
```

### 6.3 Retrieval QA chain

```python
from langchain.chains import RetrievalQA
from langchain.prompts import ChatPromptTemplate, HumanMessagePromptTemplate

# Prompt that tells the model to use the retrieved context
retrieval_prompt = ChatPromptTemplate.from_messages(
    [
        ("system", "You are an assistant that answers questions using ONLY the provided context. If the answer is not in the context, say you don't know."),
        ("human", "{question}\n\nContext:\n{context}"),
    ]
)

qa_chain = RetrievalQA.from_chain_type(
    llm=ollama_llm,
    retriever=vectorstore.as_retriever(search_kwargs={"k": 3}),
    chain_type="stuff",               # simple concatenation of docs
    return_source_documents=True,
    combine_prompt=retrieval_prompt,
)

# Ask a question that needs the docs
result = qa_chain({"query": "What does LangChain do?"})
print("Answer:", result["result"])
print("\nSources:")
for doc in result["source_documents"]:
    print("- ", doc.metadata["source"])
```

**Typical output**

```
Answer: LangChain is a framework that helps you build applications powered by large language models. It provides utilities for prompt management, memory, retrieval, and chaining together multiple LLM calls.

Sources:
-  sample_docs/intro.md
```

---

## 7. Full-script / Jupyter notebook

Below is a **single-file example** you can copy-paste into `app.py` or a notebook cell. It combines everything: Ollama LLM, a chat with memory, and a RAG endpoint.

```python
# ------------------------------------------------------------
# app.py  (or a Jupyter cell)
# ------------------------------------------------------------
import os, pathlib, textwrap
from langchain_community.llms import Ollama
from langchain import PromptTemplate, LLMChain
from langchain.memory import ConversationBufferMemory
from langchain.chains import ConversationChain, RetrievalQA
from langchain.prompts import ChatPromptTemplate
from langchain_community.document_loaders import DirectoryLoader, TextLoader
from langchain.text_splitter import RecursiveCharacterTextSplitter
from langchain_community.embeddings import HuggingFaceEmbeddings
from langchain_community.vectorstores import FAISS
from tqdm.auto import tqdm

# ---------- 1.  Ollama LLM ----------
ollama_llm = Ollama(model="llama2")   # change model name if you prefer

# ---------- 2.  Simple LLMChain ----------
simple_template = """You are a concise assistant.

Question: {question}
Answer:"""
simple_prompt = PromptTemplate.from_template(simple_template)
simple_chain = LLMChain(prompt=simple_prompt, llm=ollama_llm)

print("\n=== Simple chain demo ===")
print(simple_chain.invoke({"question": "What is the speed of light in vacuum?"})["text"])

# ---------- 3.  Conversational chain ----------
memory = ConversationBufferMemory(memory_key="history")
chat = ConversationChain(llm=ollama_llm, memory=memory, verbose=False)

print("\n=== Chat with memory ===")
print(chat.predict(input="Hello!"))
print(chat.predict(input="Tell me a fun fact about cats."))

# ---------- 4.  RAG (retrieval-augmented generation) ----------
# Create a tiny knowledge base on the fly
docs_path = pathlib.Path("sample_docs")
docs_path.mkdir(exist_ok=True)
(docs_path / "intro.md").write_text(textwrap.dedent("""\
    # LangChain & Ollama
    LangChain lets you build LLM-powered apps.
    Ollama runs LLMs locally via a simple HTTP API.
    Together they enable private, fast AI tools.
    """))
(docs_path / "python.md").write_text(textwrap.dedent("""\
    # Python Lists vs Tuples
    * List - mutable, uses [].
    * Tuple - immutable, uses ().
    * Choose list for changeable data, tuple for fixed data.
    """))

loader = DirectoryLoader(str(docs_path), glob="*.md", loader_cls=TextLoader)
docs = loader.load()
splitter = RecursiveCharacterTextSplitter(chunk_size=500, chunk_overlap=50)
chunks = splitter.split_documents(docs)

embedder = HuggingFaceEmbeddings(model_name="sentence-transformers/all-MiniLM-L6-v2")
vectorstore = FAISS.from_documents(chunks, embedder)

retrieval_prompt = ChatPromptTemplate.from_messages(
    [
        ("system", "Answer using ONLY the provided context. If you don't know, say so."),
        ("human", "{question}\n\nContext:\n{context}"),
    ]
)

qa = RetrievalQA.from_chain_type(
    llm=ollama_llm,
    retriever=vectorstore.as_retriever(search_kwargs={"k": 2}),
    chain_type="stuff",
    combine_prompt=retrieval_prompt,
    return_source_documents=True,
)

print("\n=== Retrieval QA demo ===")
res = qa({"query": "How does LangChain help developers?"})
print("Answer:", res["result"])
print("\nSources:")
for d in res["source_documents"]:
    print("-", pathlib.Path(d.metadata["source"]).name)

# ------------------------------------------------------------
# End of script
# ------------------------------------------------------------
```

Run it:

```bash
python app.py
```

You should see three sections printed: a simple Q&A

# --- User ---
