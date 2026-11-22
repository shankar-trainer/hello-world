Here is a simple, modern Streamlit UI for your LangChain + Ollama chatbot using the `smollm2:135m` model.

## 1. Install dependencies

bash

```bash
pip install streamlit langchain-community ollama
```

Make sure Ollama is running and your model is downloaded:

bash

```bash
ollama pull smollm2:135m
```

## 2. Create `app.py`

python

```python

import streamlit as st
from langchain_community.llms import Ollama

# Page configuration
st.set_page_config(
    page_title="Ollama AI Chatbot",
    page_icon="🤖",
    layout="centered"
)

# Custom CSS
st.markdown("""
<style>
.stApp {
    background-color: #111827;
    color: white;
}

.title {
    text-align: center;
    font-size: 36px;
    font-weight: bold;
    color: #38bdf8;
}

.subtitle {
    text-align: center;
    color: #9ca3af;
    margin-bottom: 30px;
}

.stTextInput input {
    border-radius: 10px;
}

.stButton button {
    width: 100%;
    background-color: #0284c7;
    color: white;
    border-radius: 10px;
    height: 45px;
    font-size: 16px;
}

.response {
    background-color: #1f2937;
    padding: 20px;
    border-radius: 12px;
    border-left: 4px solid #38bdf8;
    margin-top: 20px;
}
</style>
""", unsafe_allow_html=True)

# Load Ollama model
@st.cache_resource
def load_model():
    return Ollama(model="smollm2:135m")

llm = load_model()

# Header
st.markdown(
    '<div class="title">🤖 Ollama AI Chatbot</div>',
    unsafe_allow_html=True
)

st.markdown(
    '<div class="subtitle">Powered by LangChain and SmolLM2</div>',
    unsafe_allow_html=True
)

st.divider()

# Input section
st.subheader("💬 Ask Anything")

topic = st.text_input(
    "Enter your topic",
    placeholder="Example: Explain Artificial Intelligence"
)

# Generate button
if st.button("🚀 Generate Response"):

    if topic.strip():

        with st.spinner("AI is thinking..."):

            try:
                response = llm.invoke(topic)

                st.success("Response generated successfully!")

                st.markdown("### 🤖 AI Response")

                st.markdown(
                    f'<div class="response">{response}</div>',
                    unsafe_allow_html=True
                )

            except Exception as e:
                st.error(f"Error: {e}")

    else:
        st.warning("Please enter a topic first!")

# Footer
st.divider()

st.caption(
    "Built with ❤️ using Streamlit, LangChain and Ollama"
)
```

## 3. Project structure

text

```text
ollama-chatbot/
│
└── app.py
```

## 4. Run the application

First, make sure Ollama is running:

bash

```bash
ollama serve
```

Then open another terminal:

bash

```bash
streamlit run app.py
```

Open the browser:

`http://localhost:8501`

## 5. Expected UI

# 🤖 Ollama AI Chatbot

Powered by LangChain and SmolLM2

💬 Ask Anything

Enter your topic

Explain Artificial Intelligence

🚀 Generate Response

🤖 AI Response

Artificial Intelligence (AI) is a field of computer science that focuses on creating machines that can perform tasks requiring human-like intelligence.

Built with Streamlit, LangChain and Ollama

Note: This version uses your original single-prompt approach. It generates one response per click; it does not yet maintain conversation memory.