# Build an AI Chatbot using LangChain and Python

You can create an AI-powered chatbot using LangChain, Python, and OpenAI GPT models. The chatbot can:

- Understand natural-language questions.
- Generate intelligent responses.
- Remember previous conversation messages.
- Maintain context across multiple interactions.
- Be extended with PDFs, documents, databases, and APIs.

Let's build a basic chatbot first, then you can extend it into a full application.

## 1. Project structure

text

```text
langchain-chatbot/
│
├── app.py
├── .env
└── requirements.txt
```

## 2. Install dependencies

Create `requirements.txt`:

text

```text
langchain
langchain-openai
python-dotenv
```

Install:

bash

```bash
pip install -r requirements.txt
```

## 3. Configure API key

Create `.env`:

env

```env
OPENAI_API_KEY=your_openai_api_key_here
```

Get your API key from [OpenAI API Keys](<https://platform.openai.com/api-keys?utm_source=chatgpt.com>).

## 4. Create the chatbot

Create `app.py`:

python

```python

import os
from dotenv import load_dotenv

from langchain_openai import ChatOpenAI
from langchain_core.messages import HumanMessage, AIMessage, SystemMessage

# Load environment variables
load_dotenv()

# Initialize LLM
llm = ChatOpenAI(
    model="gpt-4o-mini",
    temperature=0.7,
    api_key=os.getenv("OPENAI_API_KEY")
)

# Store conversation history
chat_history = [
    SystemMessage(
        content="You are a helpful AI assistant. "
                "Answer questions clearly and accurately."
    )
]

print("AI Chatbot Started!")
print("Type 'exit' to stop.\n")

while True:
    user_input = input("You: ")

    if user_input.lower() in ["exit", "quit"]:
        print("Chatbot: Goodbye!")
        break

    # Add user message
    chat_history.append(HumanMessage(content=user_input))

    try:
        # Generate response
        response = llm.invoke(chat_history)

        # Save assistant response
        chat_history.append(
            AIMessage(content=response.content)
        )

        print("\nChatbot:", response.content, "\n")

    except Exception as e:
        print("Error:", e)
```

## 5. Run the chatbot

Open your terminal and execute:

bash

```bash
python app.py
```

Example conversation:

LangChain AI Chatbot

Online

You

What is LangChain?

AI Chatbot

LangChain is a framework for building applications powered by large language models (LLMs). It provides tools for connecting models with external data, APIs, memory, and other components.

You

What can I build using it?

AI Chatbot

You can build AI chatbots, document question-answering systems, RAG applications, AI agents, and intelligent automation workflows.

## 6. How the chatbot works

User Input

Chat History

LangChain

OpenAI GPT Model

AI Response

## 7. What would you like to build next?

You can extend this basic chatbot into one of these applications:

Choose your chatbot project

Basic AI chatbot with conversation memory

rag RAG chatbot – Chat with PDF and documents

Chatbot connected to SQL database

AI Agent chatbot with tools and functions

Website chatbot for customer support

Choose frontend

streamlit Streamlit

Gradio

FastAPI + HTML/CSS

Python terminal

 Build my chatbot


 ===============

 Let's create a modern ChatGPT-style frontend for your LangChain chatbot using Streamlit. It will have a chat interface, message history, sidebar, clear-chat option, and real-time responses from your LangChain backend.

## 1. Frontend preview

LangChain AI

AI Assistant

Menu

+ New Chat

Recent chats

LangChain basics

Python questions

## How can I help you?

Explain LangChain to me.

LangChain is a framework for building applications powered by language models.

Message your AI...

AI can make mistakes. Verify important information.

## 2. Install frontend dependencies

bash

```bash
pip install streamlit langchain langchain-openai python-dotenv
```

## 3. Create `app.py`

This is a complete frontend connected to your LangChain chatbot.

python

```python

import streamlit as st
import os
from dotenv import load_dotenv

from langchain_openai import ChatOpenAI
from langchain_core.messages import (
    SystemMessage,
    HumanMessage,
    AIMessage
)

# Load API key
load_dotenv()

# Page configuration
st.set_page_config(
    page_title="LangChain AI Chatbot",
    page_icon="🤖",
    layout="wide"
)

# Custom CSS
st.markdown("""
<style>
.stApp {
    background-color: #212121;
    color: white;
}

[data-testid="stSidebar"] {
    background-color: #171717;
}

.main-title {
    text-align: center;
    font-size: 35px;
    font-weight: bold;
    margin-top: 40px;
}

.subtitle {
    text-align: center;
    color: #aaaaaa;
    font-size: 16px;
    margin-bottom: 35px;
}

.stChatMessage {
    background-color: #2b2b2b;
    border-radius: 12px;
    padding: 12px;
}

.stChatInput textarea {
    background-color: #303030;
    color: white;
}

button[kind="primary"] {
    background-color: #10a37f;
}
</style>
""", unsafe_allow_html=True)

# Initialize LangChain model
@st.cache_resource
def get_model():
    return ChatOpenAI(
        model="gpt-4o-mini",
        temperature=0.7,
        api_key=os.getenv("OPENAI_API_KEY")
    )

llm = get_model()

# Initialize session state
if "messages" not in st.session_state:
    st.session_state.messages = []

if "history" not in st.session_state:
    st.session_state.history = [
        SystemMessage(
            content="You are a helpful AI assistant."
        )
    ]

# Sidebar
with st.sidebar:
    st.title("🤖 LangChain AI")

    if st.button("➕ New Chat", use_container_width=True):
        st.session_state.messages = []
        st.session_state.history = [
            SystemMessage(
                content="You are a helpful AI assistant."
            )
        ]
        st.rerun()

    st.divider()

    st.subheader("Recent Messages")

    for msg in st.session_state.messages[-5:]:
        if msg["role"] == "user":
            st.caption("👤 " + msg["content"][:35])

    st.divider()

    st.caption("Powered by LangChain + OpenAI")

# Main interface
st.markdown(
    '<div class="main-title">How can I help you today?</div>',
    unsafe_allow_html=True
)

st.markdown(
    '<div class="subtitle">Your intelligent AI assistant</div>',
    unsafe_allow_html=True
)

# Display previous messages
for msg in st.session_state.messages:
    with st.chat_message(msg["role"]):
        st.markdown(msg["content"])

# Chat input
user_input = st.chat_input("Message your AI assistant...")

if user_input:

    # Display user message
    st.session_state.messages.append({
        "role": "user",
        "content": user_input
    })

    st.session_state.history.append(
        HumanMessage(content=user_input)
    )

    with st.chat_message("user"):
        st.markdown(user_input)

    # Generate response
    with st.chat_message("assistant"):
        with st.spinner("Thinking..."):
            try:
                response = llm.invoke(
                    st.session_state.history
                )

                answer = response.content

                st.markdown(answer)

                st.session_state.history.append(
                    AIMessage(content=answer)
                )

                st.session_state.messages.append({
                    "role": "assistant",
                    "content": answer
                })

            except Exception as e:
                st.error(f"Error: {str(e)}")

                # Remove failed user message from model history
                st.session_state.history.pop()

                st.session_state.messages.pop()

```

## 4. Project structure

text

```text
langchain-chatbot/
│
├── app.py
├── .env
├── requirements.txt
│
└── README.md
```

## 5. Run your application

bash

```bash
streamlit run app.py
```

Your chatbot will open in your browser, usually at:

`http://localhost:8501`

## 6. Features included

- Interactive chat interface.
- Conversation history.
- New chat functionality.
- Sidebar navigation.
- LangChain + OpenAI integration.
- Loading indicator while AI responds.
- Responsive Streamlit layout.

Next improvement: I can also build a more advanced ChatGPT-style frontend with a dark/light theme toggle, animated typing effect, Markdown code highlighting, file upload for PDF chatting, and a polished sidebar.


===============================

Python can be used to build a front end (user interface) for web applications in several ways.

## Python front-end frameworks

Building simple dashboards with Streamlit - by Eric Matthes

1. Streamlit

Easy to build dashboards and web apps using only Python. Great for beginners.

Beginner friendly

[Official website](<https://streamlit.io/?utm_source=chatgpt.com>)

NiceGUI Reviews - 2026

2. NiceGUI

Create interactive web interfaces using Python.

[Official website](<https://nicegui.io/?utm_source=chatgpt.com>)

Run Gradio on Local Computer

3. Gradio

Build interfaces for AI, machine learning, and Python applications.

[Official website](<https://www.gradio.app/?utm_source=chatgpt.com>)

ToDo Tutorial - Flet

4. Flet

Build web, desktop, and mobile interfaces using Python.

[Official website](<https://flet.dev/?utm_source=chatgpt.com>)

## Simple Python front-end example

Using Streamlit:

python

```python
import streamlit as st

st.title("My First Website")

name = st.text_input("Enter your name")

if st.button("Submit"):
    st.success(f"Hello, {name}!")
```

Run it:

bash

```bash
pip install streamlit
streamlit run app.py
```

## What do you want to build?

1. What kind of front end do you want?

Website using only Python Website using only Python

Modern website with HTML, CSS and Python

Desktop application

Dashboard or admin panel

AI application front end

2. Your Python level

Beginner Beginner

Intermediate

Advanced

 Continue