"C:\path\to\your\mongodb\bin\mongod.exe" --dbpath="C:\data\db"
mongosh


test> use mydb;
switched to db mydb
mydb> show collections
users
mydb> db.users.find()
[
  {
    _id: ObjectId('6ab653e5eb0237eb1cc91f12'),
    name: 'ganesh',
    email: 'ganesh@gmail.com',
    _class: 'com.example.model.User'
  }
]
mydb>


// show dbs-- show all databases
// use dbname -- create or use existing database
//show collections -- will show all collections(table) in database
// db.collectionname.find()-- will display all records
//db.dropDatabase() -- drop current database






















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

db.createCollection():
javascript

db.createCollection("logs")


. Retrieve DocumentsUse the find() method to read data back out of your collection:
 Retrieve ALL documents in the collection
db.users.find()

// Retrieve a specific document by matching a field (Filter)
db.users.find({ name: "Alice" })

// Retrieve documents based on a condition (e.g., age greater than 25)
db.users.find({ age: { $gt: 25 } })

