from sentence_transformers import SentenceTransformer
import numpy as np

model = SentenceTransformer("all-MiniLM-L6-v2")

sentences = [
    "I love machine learning.",
    "I enjoy studying artificial intelligence.",
    "The weather is very cold."
]

emb = model.encode(sentences)          # shape -> (3, 384)
print("Shape:", emb.shape)            # (3, 384)

# Cosine similarity matrix
norm = np.linalg.norm(emb, axis=1, keepdims=True)
emb_norm = emb / norm
sim = emb_norm @ emb_norm.T           # (3, 3) matrix
print("\nCosine similarity matrix:\n", sim)
