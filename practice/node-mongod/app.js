// let mongo = require('mongodb'); 

// let MongoClient = require('mongodb').MongoClient;
// let url = "mongodb://localhost:27017/mydb";

// MongoClient.connect(url, function(err, db) {
//   if (err) throw err;
//   console.log("Database created!");
//   db.close();
// });
// above old not work 
// npm i mongod

const { MongoClient } = require('mongodb');

const url = "mongodb://localhost:27017";
const client = new MongoClient(url);

async function run() {
  try {
    await client.connect();
    console.log("Connected successfully to server!");
    
    const db = client.db("mydb");
    // Perform database operations here...

    const collection = db.collection("testCollection");
    await collection.insertOne({ greeting: "Hello MongoDB!" });
    console.log("Document inserted! Database is now officially created.");

        // Display all documents added
        const documents = await collection.find({}).toArray();
        console.log("All documents in collection:", documents);
    
  } catch (err) {
    console.error("Connection failed:", err);
  } finally {
    await client.close();
  }
}

run();
