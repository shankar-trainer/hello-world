# it has some error 
# set OLLAMA_BASE_URL=https://ollama.com/api
# set OLLAMA_API_KEY=83e8e6bea3294c04b0cdffaa5f3d49cc.nfiNsZs4z_0t_MQlO9bTceBY
import os

from langchain_chroma import Chroma
from langchain_core.prompts import ChatPromptTemplate
from langchain_ollama import ChatOllama, OllamaEmbeddings
from langchain_text_splitters import RecursiveCharacterTextSplitter
from langchain_classic.chains.combine_documents import create_stuff_documents_chain
from langchain_classic.chains import create_retrieval_chain

api_key = os.environ.get("OLLAMA_API_KEY")
base_url = os.environ.get("OLLAMA_BASE_URL")
if not api_key or not base_url:
    raise RuntimeError(
        "Set OLLAMA_API_KEY and OLLAMA_BASE_URL to your Ollama Cloud credentials and endpoint."
    )
base_url = base_url.rstrip("/")
if base_url.endswith("/api"):
    base_url = base_url[:-4]

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

# 3. Step 2: Embed chunks using Ollama and store them in Chroma
# Authenticate Ollama Cloud requests with the configured API key.
embeddings = OllamaEmbeddings(
    model="nomic-embed-text",
    base_url=base_url,
    client_kwargs={"headers": {"Authorization": f"Bearer {api_key}"}}
)
vectorstore = Chroma.from_documents(docs, embedding=embeddings)

# Create a retriever from the vector store
retriever = vectorstore.as_retriever(search_kwargs={"k": 2})

# 4. Step 3 & 4: Set up the Ollama LLM and RAG Prompt Chain
llm = ChatOllama(
    model="llama3",
    temperature=0,
    base_url=base_url,
    client_kwargs={"headers": {"Authorization": f"Bearer {api_key}"}}
)

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