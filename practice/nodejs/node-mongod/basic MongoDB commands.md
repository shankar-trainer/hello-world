C:\Users\shank>\mongodb-win32-x86_64-windows-8.0.12\bin\mongod.exe --dbpath="C:\data\db"

C:\Users\shank>\mongosh-2.5.6-win32-x64\bin\mongosh.exe


Here are the basic MongoDB commands to connect, create a database, create a collection, insert data, and find data using `mongosh`.

## 1. Connect to MongoDB
mongosh

If MongoDB has no password:
mongosh "mongodb://127.0.0.1:27017"

## 2. Show databases
show dbs

## 3. Create / switch database
use mydb
MongoDB creates the database when you first store data in it.

## 4. Create collection
db.createCollection("users")

## 5. Show collections:
show collections

## 5. Insert data
Insert one document:

db.users.insertOne({
  name: "John",
  email: "john@gmail.com",
  age: 25
})
Insert multiple documents:
db.users.insertMany([
  {
    name: "Rahul",
    email: "rahul@gmail.com",
    age: 22
  },
  {
    name: "Amit",
    email: "amit@gmail.com",
    age: 24
  },
  {
    name: "Priya",
    email: "priya@gmail.com",
    age: 23
  }
])

## 6. Find data
Find all documents:
db.users.find()

##Find one document:

db.users.findOne()

##Find by name:
db.users.find({ name: "John" })

##Find by age:
db.users.find({ age: 25 })

##Find with condition:
db.users.find({ age: { $gt: 22 } })

## 7. Update data
db.users.updateOne(
  { name: "John" },
  { $set: { age: 30 } }
)

## 8. Delete data
Delete one:
db.users.deleteOne({ name: "John" })

## Delete all:
db.users.deleteMany({})

## 9. Useful MongoDB commands

| Command | Purpose |
| --- | --- |
| `show dbs` | Show databases |
| `use mydb` | Switch database |
| `show collections` | Show collections |
| `db.users.find()` | Find all data |
| `db.users.findOne()` | Find one document |
| `db.users.countDocuments()` | Count documents |
| `db.users.drop()` | Delete collection |
| `db.dropDatabase()` | Delete current database |

## Complete MongoDB workflow

1. Connect
   `mongosh`
2. Create database
   `use mydb`
3. Create collection
   `db.createCollection("users")`
4. Insert data
   `db.users.insertOne({name:"John", age:25})`
5. Find data
   `db.users.find()`

Tip: MongoDB stores data in JSON-like documents (BSON), inside collections. A collection is similar to a table in MySQL, and a document is similar to a row.

======================


In MongoDB, Collection and Document are two important concepts.

- Collection = A group of documents.
- Document = An individual record containing data in JSON-like format (BSON).

## 1. Collection

A collection is a container that stores multiple documents.

For example, a `users` collection can store information about many users.

javascript

```javascript
db.createCollection("users")
```

Here:

- `db` = Current database.
- `users` = Collection name.

## 2. Document

A document is an individual record inside a collection.

Example:

javascript

```javascript
{
  name: "John",
  email: "john@gmail.com",
  age: 25
}
```

Another document:

javascript

```javascript
{
  name: "Rahul",
  email: "rahul@gmail.com",
  age: 22
}
```

## 3. Visual difference

Database: mydb

Collection: users

DOCUMENT 1

`{ name: "John", age: 25 }`

DOCUMENT 2

`{ name: "Rahul", age: 22 }`

DOCUMENT 3

`{ name: "Priya", age: 23 }`

One database → One collection → Multiple documents

## 4. MongoDB commands

Create collection:

javascript

```javascript
db.createCollection("users")
```

Insert documents:

javascript

```javascript
db.users.insertMany([
  { name: "John", age: 25 },
  { name: "Rahul", age: 22 },
  { name: "Priya", age: 23 }
])
```

Find all documents:

javascript

```javascript
db.users.find()
```

Find one document:

javascript

```javascript
db.users.findOne({ name: "John" })
```

## 5. MongoDB vs MySQL comparison

| MongoDB | MySQL |
| --- | --- |
| Database | Database |
| Collection | Table |
| Document | Row |
| Field | Column |
| `_id` | Primary key |

Remember this simple example:

- Database = School
- Collection = Students
- Document = One student's information
- Field = Student's name, age, email

This is the basic structure of MongoDB.