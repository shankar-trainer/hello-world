from sentence_transformers import SentenceTransformer

### Step 4: Generate embeddings
#Use Sentence Transformers.

embedding_model = SentenceTransformer(
    "all-MiniLM-L6-v2"
)

chunks = [
    "Python is a programming language.",
    "Machine learning is a subset of AI.",
    "RAG combines retrieval and generation."
]

embeddings = embedding_model.encode(chunks)

print('shape of embeddings ',embeddings.shape)

#Each chunk is converted into a numerical vector.

### Step 5: Store embeddings in FAISS

import faiss
import numpy as np

dimension = embeddings.shape[1]

index = faiss.IndexFlatL2(dimension)

index.add(
    np.array(embeddings).astype("float32")
)

print("Documents stored successfully!")
