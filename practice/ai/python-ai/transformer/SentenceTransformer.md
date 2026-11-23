## SentenceTransformer

**SentenceTransformer** is a Python framework used to convert sentences, paragraphs, or documents into numerical vectors called **embeddings**.

These embeddings capture the semantic meaning of text, allowing computers to understand how similar two pieces of text are.

It is part of the [Sentence Transformers library](<https://www.sbert.net/>), built on top of [Hugging Face Transformers](<https://huggingface.co/docs/transformers>).

### 1\. How does it work?

For example, consider these sentences:

- "I love machine learning."
- "I enjoy studying artificial intelligence."
- "The weather is very cold."

A SentenceTransformer model converts each sentence into a vector.

Example (illustrative):

python

```python
from sentence_transformers import SentenceTransformer

# Load a pretrained model
model = SentenceTransformer('all-MiniLM-L6-v2')

# Input sentences
sentences = [
    "I love machine learning.",
    "I enjoy studying artificial intelligence.",
    "The weather is very cold."
]

# Generate embeddings
embeddings = model.encode(sentences)

print(embeddings.shape)
```

Output:

text

```text
(3, 384)
```

Each sentence is represented by a 384-dimensional vector.

### 2\. Applications

SentenceTransformer is commonly used for:

1. **Semantic Search** – Finding relevant documents based on meaning.
2. **Text Similarity** – Measuring similarity between two sentences.
3. **Document Clustering** – Grouping similar documents.
4. **Question Answering** – Finding relevant answers from documents.
5. **Recommendation Systems** – Recommending semantically similar content.
6. **RAG Applications** – Retrieving relevant information for Large Language Models.

### 3\. Calculate Sentence Similarity

python

```python
from sentence_transformers import SentenceTransformer
from sklearn.metrics.pairwise import cosine_similarity

model = SentenceTransformer('all-MiniLM-L6-v2')

sentences = [
    "I love Python programming.",
    "Python is my favourite programming language."
]

embeddings = model.encode(sentences)

similarity = cosine_similarity(
    [embeddings[0]],
    [embeddings[1]]
)

print(similarity)
```

The output is a similarity score based on cosine similarity.

### 4\. Popular SentenceTransformer Models

| Model | Embedding Dimensions |
| --- | --- |
| all-MiniLM-L6-v2 | 384 |
| all-mpnet-base-v2 | 768 |
| paraphrase-MiniLM-L6-v2 | 384 |
| multi-qa-MiniLM-L6-cos-v1 | 384 |

### 5\. Install SentenceTransformer

bash

```bash
pip install sentence-transformers
```

**In simple words:** SentenceTransformer converts human language into numerical representations so that machines can compare and understand the semantic meaning of text.