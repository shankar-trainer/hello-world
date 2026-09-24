extracted portable MongoDB bin folder or run mongod.exe with the explicit path and your data directory:
cmd "C:\path\to\your\mongodb\bin\mongod.exe" --dbpath="C:\data\db"
Use code with caution.Keep this terminal open. 

It shows waiting for connections when ready.2. Start mongoshOpen a new Command Prompt or PowerShell window.

Run the MongoDB Shell (mongosh) using its path or directly if it is added to your environment variables

mongosh

Use code with caution.(This connects automatically to the local server at mongodb://127.0.0.1:27017)3.

 Create a DatabaseMongoDB creates a database automatically the first time you store data in it.Switch to your new database name (e.g., myNewDB) using the use command:
  
 use myNewDB

Use code with caution.
Insert a document into a collection to finalize and create the database:javascript

db.myCollection.insertOne({ name: "test", active: true })

Use code with caution.Verify the database exists by listing all databases:javascript

show dbs

----------------------------
1. Insert a Single DocumentTo add one document (and implicitly create the collection if it doesn't exist), use the db.collection.insertOne() method:javascript// 1. Switch to your database (e.g., testDatabase)

use testDatabase

// 2. Insert a document into a collection (e.g., users)
db.users.insertOne({
   name: "Alice Smith",
   age: 28,
   status: "active"
})

Result: 

MongoDB will create the users collection automatically and assign a unique _id field to the document.

2. Insert Multiple DocumentsTo add multiple documents at the same time, pass an array of objects to the db.collection.insertMany() method:

db.users.insertMany([
   { name: "Bob Jones", age: 34, status: "pending" },
   { name: "Charlie Brown", age: 22, status: "active" }
])


Create an Empty Collection Explicitly

If you need to create a collection without inserting data right away—for instance, to configure specific options like maximum size or validation rules—use 

db.createCollection():javascriptdb.createCollection("logs")

-------------

2. Retrieve DocumentsUse the find() method to read data back out of your collection:
 Retrieve ALL documents in the collection
db.users.find()

// Retrieve a specific document by matching a field (Filter)
db.users.find({ name: "Alice" })

// Retrieve documents based on a condition (e.g., age greater than 25)
db.users.find({ age: { $gt: 25 } })

============================
mongodb create new collection

In MongoDB, you can create a new collection using two main approaches: 

creating it implicitly (automatically by inserting a document) or explicitly (using a specific command).

Method 1: Implicit Creation (Recommended for General Use)MongoDB automatically creates a collection the first time you insert data into it. 

If the collection does not exist, MongoDB will set it up for you on the fly.Switch to your target database and insert a document

use myDatabase

db.myNewCollection.insertOne({ name: "Alice", role: "Admin" })


Method 2: Explicit Creation (For Custom Options)

If you need to pre-create an empty collection—especially when you want to configure specific settings like maximum size limits (capped collections) or document data validation rules—use the db.createCollection() method.

// Simple explicit creation
db.createCollection("customers")

// Explicit creation with specific configurations (Optional)
db.createCollection("logDetails", { capped: true, size: 5242880, max: 5000 })

Verifying the CollectionTo confirm that your collection has been successfully created, run the following command in your shell:

show collections
Use code with caution.Alternative: Using MongoDB Compass (GUI)If you prefer a graphical user interface over the command line, you can manage your 

======================

In MongoDB, the structural hierarchy goes from Database → Collection → Document.

Here is the fundamental difference between a collection and a document:

A Collection is a structural container that groups related data together. 
It is equivalent to a Table in relational SQL databases.

A Document is an individual record stored inside a collection, written as a set of key-value pairs in a JSON/BSON format. 

It is equivalent to a Row or Tuple in relational databases.


Step-by-Step Example (Using mongosh)
You can create and interact with databases, collections, and documents directly using the MongoDB Shell (mongosh).

1. Setup your DatabaseFirst, switch to (or implicitly create) a database using the use command:

use companyDB

Create and Use a Collection & DocumentIn MongoDB, you don't actually need to create a collection beforehand. 

It is implicitly created the moment you insert your first document.
Alternatively, you can explicitly create a collection if you need to pass specific configurations (like setting a size limit).

Option A: Implicit Creation (Recommended for standard workflows)

Directly insert a document into a brand new collection named employees. 

MongoDB will create the collection automatically:

// Inserting a single document into the "employees" collection

db.employees.insertOne({
  name: "Alice Johnson",
  role: "Software Engineer",
  skills: ["JavaScript", "MongoDB", "Node.js"],
  experience_years: 4
});

Option B: Explicit Creation

If you prefer creating the empty collection structural container first, use db.createCollection():javascript// Explicitly creating the container
db.createCollection("contractors");

// Inserting a document into it afterwards
db.contractors.insertOne({
  name: "Bob Smith",
  hourly_rate: 75,
  active: true
});
Use code with caution.3. View Your SetupTo verify that your collection and documents were stored correctly, use the following commands:javascript// 1. Show all collections in the current database
show collections

// 2. Retrieve all documents from the "employees" collection
db.employees.find()
Use code with caution.When you run db.employees.find(), the output will show the document you inserted, complete with an automatically generated unique _id field:json{
  "_id": ObjectId("65123456789abcdef0123456"),
  "name": "Alice Johnson",
  "role": "Software Engineer",
  "skills": [ "JavaScript", "MongoDB", "Node.js" ],
  "experience_years": 4
}
Use code with caution.To best tailor the next step, let me know:Are you looking to implement this inside an application environment (like Node.js with Mongoose, or Python with PyMongo)?Do you want to see how to define schema validation rules so your collections enforce certain fields on your documents?YouTube·P