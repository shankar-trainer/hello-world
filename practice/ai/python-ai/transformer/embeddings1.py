from sentence_transformers import SentenceTransformer

model = SentenceTransformer(
    "all-MiniLM-L6-v2"
)

sentence = "I love learning artificial intelligence"

embedding = model.encode(sentence)

print(embedding)
