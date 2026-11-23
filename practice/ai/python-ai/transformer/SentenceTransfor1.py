from sentence_transformers import SentenceTransformer

# Load a pretrained model
model = SentenceTransformer('all-MiniLM-L6-v2')

sentences = [
    "I love machine learning.",
    "I enjoy studying artificial intelligence.",
    "The weather is very cold."
]

# Generate embeddings
embeddings = model.encode(sentences)

print(embeddings.shape)