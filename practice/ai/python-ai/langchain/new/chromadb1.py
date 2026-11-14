import sys
import pysqlite3
sys.modules["sqlite3"]=pysqlite3


import chromadb

client=chromadb.PersistentClient(
      path="./chromadb1"
	)

print("database created successfully")

#comment after created 
# collection=client.create_collection(
#           name="my_documents"
# 	)

print("collection created")
# retrieve 
collection=client.get_or_create_collection(
  name="my_documents"
	)

print(collection)


documents = [
    "Python is a popular programming language.",
    "Machine learning is a branch of artificial intelligence.",
    "Deep learning uses neural networks.",
    "ChromaDB is a vector database.",
    "Artificial intelligence enables machines to perform intelligent tasks."
]

ids = ["id1", "id2", "id3", "id4", "id5"]

collection.add(
    documents=documents,
    ids=ids
)

print("Documents inserted successfully!")

results = collection.query(
    query_texts=[
        "Tell me about AI and intelligent machines"
    ],
    n_results=3
)

print(results["documents"])