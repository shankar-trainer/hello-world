/*npm install mongodb mongodb-memory-server


### Code Example
Create an `index.js` file and add the following code to start an embedded MongoDB server, connect via the native MongoDB driver, perform a simple insert and read operation, and then clean up:

*/

const { MongoClient } = require('mongodb');
const { MongoMemoryServer } = require('mongodb-memory-server');

//const { MongoMemoryServer } = require('mongodb-memory-server');

// Pass the specific 4.4 version to avoid AVX requirements


async function runEmbeddedMongoExample() {
  // 1. Create and start an embedded MongoDB instance
  //const mongod = await MongoMemoryServer.create();
  
  const mongod = await MongoMemoryServer.create({
  binary: {
    version: '4.4.25' // or any stable 4.4.x version
  }
  });

  
  const uri = mongod.getUri();
  console.log(`Embedded MongoDB started at: ${uri}`);

  // 2. Connect to the embedded instance using the MongoDB client
  const client = new MongoClient(uri);
  await client.connect();
  console.log('Connected to embedded MongoDB successfully!');

  const db = client.db('testdb');
  const collection = db.collection('users');

  // 3. Perform a basic Insert operation
  const insertResult = await collection.insertOne({ name: 'Alice', age: 30 });
  console.log('Document inserted:', insertResult.insertedId);

  // 4. Perform a basic Read operation
  const user = await collection.findOne({ name: 'Alice' });
  console.log('Found user:', user);

  // 5. Close connection and stop the embedded server
  await client.close();
  await mongod.stop();
  console.log('Embedded MongoDB stopped.');
}

runEmbeddedMongoExample().catch(console.error);

