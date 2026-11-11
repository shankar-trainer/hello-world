# --- System ---
You are an expert programming agent. Focus on correctness and simplicity.

# --- User ---
File: F:\ishaan\2026\ai\python-ai\langchain\new\langchain2_1.py
```
from langchain_community.llms import Ollama

llm = Ollama(model="smollm2:135m")

topic=input('enter topic   ')
msg=llm.invoke(topic)

print(msg)

#ollama run smollm2:135m
```
add front end code in reactjs


# --- Agent ---

## --- Thinking ---
>The user provides a Python script that uses LangChain's Ollama LLM. They ask: "add front end code in reactjs". Likely they want a simple React frontend that interacts with this backend. We need to suggest adding an API endpoint (e.g., using FastAPI or Flask) to serve the model, then a React component that calls it.
> 
> We should give code for a simple Express? But they have Python script, so perhaps use Flask or FastAPI to expose an endpoint that receives a topic and returns the LLM response. Then React front end with a form input, fetch to backend, display response.
> 
> Provide step-by-step instructions: create backend file (app.py) using FastAPI, include CORS. Then modify original script to be part of endpoint. Then React code: App.js, using useState, fetch.
> 
> Also provide package.json dependencies, maybe using create-react-app.
> 
> We need to ensure correctness and simplicity.
> 
> Thus answer with both backend and frontend code snippets.
> 
> Also note that Ollama might need to be running, etc.
> 
> Provide instructions to run.
> 
> Ok.

## --- Response ---
Below is a **minimal, end‑to‑end example** that lets a user type a topic in a React UI, sends it to a tiny Python API that runs the `Ollama` model via LangChain, and shows the model’s answer.

---

## 1. Backend (Python)

We'll expose a single HTTP endpoint (`POST /generate`) that receives a JSON body `{ "topic": "…" }` and returns the LLM response.

### 1‑1. Install the required packages

```bash
# Inside your python‑env (or venv)
pip install fastapi uvicorn langchain-community[ollama] python-multipart
```

> **Why FastAPI?**  
> * Very lightweight, async‑ready, and automatically creates OpenAPI docs.  
> * Works nicely with CORS for a React front‑end.

### 1‑2. `app.py`

```python
# app.py
from fastapi import FastAPI, HTTPException
from pydantic import BaseModel
from fastapi.middleware.cors import CORSMiddleware
from langchain_community.llms import Ollama

# ---- LLM setup -------------------------------------------------
# Choose the model you want to run (must be installed in Ollama)
# e.g. "smollm2:135m", "qwen3.5:2b", "llama3.2"
llm = Ollama(model="smollm2:135m")   # <-- change if you like
# ----------------------------------------------------------------

app = FastAPI(
    title="Ollama LangChain API",
    description="Simple wrapper around Ollama via LangChain",
    version="0.1.0",
)

# Allow the React dev server (localhost:3000) to call this API
app.add_middleware(
    CORSMiddleware,
    allow_origins=["*"],          # In production replace "*" with your front‑end origin
    allow_credentials=True,
    allow_methods=["*"],
    allow_headers=["*"],
)

class TopicRequest(BaseModel):
    topic: str

class GenerationResponse(BaseModel):
    answer: str

@app.post("/generate", response_model=GenerationResponse)
async def generate(request: TopicRequest):
    # Guard against empty input
    if not request.topic.strip():
        raise HTTPException(status_code=400, detail="Topic cannot be empty")
    try:
        # Ollama / LangChain call – this can be sync, FastAPI will run it in a thread pool
        answer = llm.invoke(request.topic)
        return GenerationResponse(answer=answer)
    except Exception as exc:
        raise HTTPException(status_code=500, detail=str(exc))
```

### 1‑3. Run the API

```bash
# Make sure Ollama is running (`ollama serve` or `ollama run …` in another terminal)
uvicorn app:app --host 0.0.0.0 --port 8000 --reload
```

You should now have a working endpoint:

```
POST http://localhost:8000/generate
Body: { "topic": "Explain genai and agentic ai in one sentence." }
```

Open `http://localhost:8000/docs` to see the auto‑generated Swagger UI.

---

## 2. Front‑end (React)

We'll create a tiny React app (using **Create‑React‑App** or **Vite**) with a single input field, a button, and a result area.

### 2‑1. Scaffold the project

```bash
# Using Create‑React‑App (CRA)
npx create-react-app ollama-frontend
cd ollama-frontend

# OR using Vite (lighter)
# npm create vite@latest ollama-frontend -- --template react
# cd ollama-frontend
# npm install
```

### 2‑2. Install any extra UI library (optional)

If you want a quick styled button/input you can add **Bootstrap** or **Material‑UI**.  
The example below uses plain HTML + minimal CSS, so no extra deps are required.

### 2‑3. `src/App.js`

```javascript
// src/App.js
import { useState } from "react";
import "./App.css";

function App() {
  const [topic, setTopic] = useState("");
  const [answer, setAnswer] = useState("");
  const [loading, setLoading] = useState(false);
  const [error, setError] = useState("");

  const handleSubmit = async (e) => {
    e.preventDefault();                // prevent page reload
    setLoading(true);
    setError("");
    setAnswer("");

    try {
      const response = await fetch("http://localhost:8000/generate", {
        method: "POST",
        headers: {
          "Content-Type": "application/json",
        },
        body: JSON.stringify({ topic }),
      });

      if (!response.ok) {
        const err = await response.json();
        throw new Error(err.detail || "Server error");
      }

      const data = await response.json();
      setAnswer(data.answer);
    } catch (err) {
      console.error(err);
      setError(err.message);
    } finally {
      setLoading(false);
    }
  };

  return (
    <div className="container">
      <h1>🧠 Ollama LLM Demo</h1>

      <form onSubmit={handleSubmit} className="form">
        <label htmlFor="topic">Enter a topic / prompt:</label>
        <input
          id="topic"
          type="text"
          placeholder="e.g. Explain genai and agentic ai in one sentence."
          value={topic}
          onChange={(e) => setTopic(e.target.value)}
          required
          disabled={loading}
        />
        <button type="submit" disabled={loading}>
          {loading ? "Thinking…" : "Ask Ollama"}
        </button>
      </form>

      {error && <p className="error">❗ {error}</p>}

      {answer && (
        <div className="result">
          <h2>Answer</h2>
          <p>{answer}</p>
        </div>
      )}
    </div>
  );
}

export default App;
```

### 2‑4. Minimal styling (`src/App.css`)

```css
/* src/App.css */
.container {
  max-width: 600px;
  margin: 2rem auto;
  font-family: Arial, Helvetica, sans-serif;
  padding: 1rem;
  border: 1px solid #ddd;
  border-radius: 8px;
  background: #fafafa;
}

h1 {
  text-align: center;
  margin-bottom: 1.5rem;
}

.form {
  display: flex;
  flex-direction: column;
  gap: 0.5rem;
}

input[type="text"] {
  padding: 0.5rem;
  font-size: 1rem;
}

button {
  padding: 0.6rem;
  font-size: 1rem;
  cursor: pointer;
  background: #0066ff;
  color: white;
  border: none;
  border-radius: 4px;
}
button:disabled {
  background: #999;
  cursor: not-allowed;
}

.error {
  color: #c00;
  margin-top: 1rem;
}

.result {
  margin-top: 2rem;
  padding: 1rem;
  background: #e6ffe6;
  border: 1px solid #8f8;
  border-radius: 4px;
}
```

### 2‑5. Run the React app

```bash
npm start
```

The dev server will be at `http://localhost:3000`.  
When you type a topic and hit **Ask Ollama**, the UI sends a POST request to the FastAPI backend (`http://localhost:8000/generate`) and displays the LLM’s answer.

---

## 3. Folder layout (one possible structure)

```
project-root/
│
├─ backend/
│   ├─ app.py               # FastAPI + Ollama wrapper
│   └─ (venv, requirements.txt, etc.)
│
└─ frontend/
    ├─ package.json
    ├─ src/
    │   ├─ App.js
    │   └─ App.css
    └─ public/
```

You can keep the two parts in separate folders (as shown) or merge them – the only requirement is that the Python server is reachable from the browser (CORS is already enabled).

---

## 4. Quick checklist before you run

| ✅ | Item |
|----|------|
| **Ollama** | Make sure `ollama serve` is running and the model (`smollm2:135m` or any you chose) is pulled (`ollama pull smollm2:135m`). |
| **Backend** | `uvicorn app:app --reload` (listens on `localhost:8000`). |
| **CORS** | `allow_origins=["*"]` works for local dev; tighten it for production (`["https://your‑domain.com"]`). |
| **Frontend** | `npm start` (dev server on `localhost:3000`). |
| **Network** | Both servers must be reachable from each other – on the same machine this works out‑of‑the‑box. |
| **Error handling** | The UI shows any server‑side error messages (e.g., empty prompt, model not loaded). |

---

## 5. Optional enhancements

| Feature | How to add (one‑liner) |
|---------|-----------------------|
| **Streaming / token‑by‑token output** | Use `llm.stream(...)` in FastAPI and a `EventSource` (Server‑Sent Events) on the front‑end. |
| **History / chat UI** | Store an array of `{role, content}` objects in React state and render them in order. |
| **Deploy** | Containerise the backend (`Dockerfile`) and serve the React build (`npm run build` → static files) via a simple Nginx or via FastAPI’s `StaticFiles`. |
| **Authentication** | Add a FastAPI `Depends` on an API‑key header and pass the key from the React app’s `.env`. |
| **Model selector** | Extend the request payload with `{ model: "...", topic: "…" }` and instantiate `Ollama(model=payload.model)` per request (or keep a dict of pre‑loaded LLM objects). |

---

### TL;DR

1. **Backend** – FastAPI + Ollama (`app.py`).  
2. **Frontend** – React component that POSTs to `/generate`.  
3. Run both, type a topic, and see the answer instantly.

Happy coding! 🚀

# --- User ---
