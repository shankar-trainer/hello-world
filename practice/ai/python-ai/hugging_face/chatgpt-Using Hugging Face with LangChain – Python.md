# Using Hugging Face with LangChain – Python Example

You can integrate Hugging Face models with LangChain to build AI applications such as chatbots, question-answering systems, text summarizers, and RAG applications.

LangChain provides Hugging Face integrations through `langchain-huggingface`.

## 1. Install dependencies

bash

```bash
pip install langchain langchain-huggingface huggingface_hub python-dotenv
```

## 2. Get your Hugging Face API token

1. Create an account at [Hugging Face](<https://huggingface.co/?utm_source=chatgpt.com>).
2. Open [Access Tokens](<https://huggingface.co/settings/tokens?utm_source=chatgpt.com>).
3. Generate an API token.
4. Set it as an environment variable:

python

```python
import os

os.environ["HUGGINGFACEHUB_API_TOKEN"] = "hf_your_token_here"
```

## 3. Simple example using LangChain and Hugging Face

This example uses a Hugging Face hosted model through LangChain.

python

```python

import os
from getpass import getpass

from langchain_huggingface import (
    HuggingFaceEndpoint,
    ChatHuggingFace
)

# 1. Set Hugging Face API token
os.environ["HUGGINGFACEHUB_API_TOKEN"] = getpass(
    "Enter Hugging Face token: "
)

# 2. Load Hugging Face model
llm = HuggingFaceEndpoint(
    repo_id="HuggingFaceH4/zephyr-7b-beta",
    task="text-generation",
    max_new_tokens=256,
    do_sample=True,
    temperature=0.7,
)

# 3. Convert LLM into a chat model
chat_model = ChatHuggingFace(llm=llm)

# 4. Send a prompt
response = chat_model.invoke(
    "Explain LangChain in simple words."
)

# 5. Print response
print(response.content)
```

Note: The model needs to be available through a compatible Hugging Face Inference Provider. You may need to select a provider or use a different model depending on current availability.

## 4. Example using a prompt template

LangChain allows you to create reusable prompts.

python

```python

from langchain_core.prompts import ChatPromptTemplate
from langchain_core.output_parsers import StrOutputParser

prompt = ChatPromptTemplate.from_messages([
    ("system", "You are a helpful AI assistant."),
    ("human", "Explain {topic} in simple words.")
])

# Create a chain
chain = prompt | chat_model | StrOutputParser()

# Execute
result = chain.invoke({
    "topic": "Machine Learning"
})

print(result)
```

## 5. Example using Hugging Face locally

If you don't want to use an API, you can download and run a model locally.

Install:

bash

```bash
pip install transformers torch sentencepiece
```

Example:

python

```python

from langchain_huggingface import HuggingFacePipeline
from transformers import pipeline

# Load model locally
pipe = pipeline(
    "text2text-generation",
    model="google/flan-t5-base",
    max_new_tokens=150
)

# Integrate with LangChain
llm = HuggingFacePipeline(
    pipeline=pipe
)

# Invoke model
response = llm.invoke(
    "What is artificial intelligence?"
)

print(response)
```

## 6. How LangChain and Hugging Face work together

User Input

Explain machine learning

LangChain

Prompt templates, chains and memory

Hugging Face

LLM inference using an open-source model

Generated Response

## 7. Which integration should you use?

| Integration | Purpose |
| --- | --- |
| `HuggingFaceEndpoint` | Cloud-hosted models |
| `ChatHuggingFace` | Chat-based applications |
| `HuggingFacePipeline` | Locally running models |
| `HuggingFaceEmbeddings` | Vector embeddings for RAG |

My recommendation: Start with `HuggingFaceEndpoint` and `ChatHuggingFace` to understand how LangChain connects to Hugging Face models.

Useful documentation:

- [LangChain Hugging Face integration](<https://docs.langchain.com/oss/python/integrations/providers/huggingface?utm_source=chatgpt.com>)
- [Hugging Face Inference Providers](<https://huggingface.co/docs/inference-providers/index?utm_source=chatgpt.com>)
- [LangChain Hugging Face API reference](<https://reference.langchain.com/python/langchain-huggingface/?utm_source=chatgpt.com>)