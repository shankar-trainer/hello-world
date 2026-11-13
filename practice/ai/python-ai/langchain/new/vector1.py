import chromadb
from sentence_transformers import SentenceTransformer
model = SentenceTransformer(
    "all-MiniLM-L6-v2"
)


client = chromadb.Client()

collection = client.create_collection(
    name="my_documents"
)

documents = [
    "Python is a programming language",
    "Machine learning is a branch of AI",
    "Deep learning uses neural networks",
    "ChromaDB is a vector database",
    "Python is widely used in data science"
]

embeddings = model.encode(
    documents
).tolist()

collection.add(
    ids=["1", "2", "3", "4", "5"],
    documents=documents,
    embeddings=embeddings
)

query = "What is artificial intelligence?"

query_embedding = model.encode(
    [query]
).tolist()

results = collection.query(
    query_embeddings=query_embedding,
    n_results=3
)

print(results["documents"])
