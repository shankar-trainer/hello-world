To use Hugging Face models in LangChain, install the official langchain-huggingface integration package. You can run models remotely via Hugging Face's Inference API (HuggingFaceEndpoint) or locally on your own hardware (HuggingFacePipeline).

1. Cloud Inference (HuggingFaceEndpoint)

This approach connects to models hosted on Hugging Face without downloading them to your machine. You need a free access token from your Hugging Face Settings.

Install dependencies:

bash

pip install langchain-huggingface huggingface_hub
Use code with caution.
Python example using ChatHuggingFace:
python

import os
from langchain_huggingface import ChatHuggingFace, HuggingFaceEndpoint

# Set your Hugging Face API token
os.environ["HUGGINGFACEHUB_API_TOKEN"] = "hf_your_token_here"

# Initialize the remote endpoint and wrap it in ChatHuggingFace
llm = HuggingFaceEndpoint(repo_id="microsoft/Phi-3-mini-4k-instruct", task="text-generation", max_new_tokens=512)

chat_model = ChatHuggingFace(llm=llm)

# Invoke the chat model
messages = [
    ("system", "You are a helpful assistant that explains concepts simply."),
    ("human", "What is LangChain in two sentences?"),
]
response = chat_model.invoke(messages)
print(response.content)
Use code with caution.
(Source: LangChain ChatHuggingFace Documentation)

2. Local Execution (HuggingFacePipeline)

To download and run open-source models locally on your CPU or GPU, use HuggingFacePipeline.
Install dependencies:
bash
pip install langchain-huggingface transformers torch
Use code with caution.
Python example using a local pipeline and LCEL:
python
from langchain_core.prompts import PromptTemplate
from langchain_huggingface import HuggingFacePipeline

# Load a lightweight model locally and chain it with a prompt template
llm = HuggingFacePipeline.from_model_id(model_id="gpt2", task="text-generation", pipeline_kwargs={"max_new_tokens": 100})
chain = PromptTemplate.from_template("Explain {topic} to a beginner:\n") | llm

result = chain.invoke({"topic": "machine learning"})
print(result)
Use code with caution.

3. Text Embeddings (RAG & Vector Search)

For Retrieval-Augmented Generation (RAG) or semantic search, use HuggingFaceEmbeddings with Sentence Transformers:
python
from langchain_huggingface import HuggingFaceEmbeddings

embeddings = HuggingFaceEmbeddings(model_name="sentence-transformers/all-MiniLM-L6-v2")
vector = embeddings.embed_query("Hello, world!")
print(f"Vector length: {len(vector)}")
Use code with caution.
For comprehensive parameters and additional classes, refer to the LangChain Hugging Face Integration Guide.
Are you trying to build a specific workflow (such as RAG, tool calling, or local GPU inference) or using a particular Hugging Face model? Let me know and I can tailor the code example for your setup.