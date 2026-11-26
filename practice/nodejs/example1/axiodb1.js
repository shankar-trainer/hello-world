const { AxioDB } = require('axiodb');

async function main() {
  const db = new AxioDB();

  const app = await db.createDB('MyApp');
  const users = await app.createCollection('users');

  await users.insert({
    name: 'John',
    age: 25
  });

  const result = await users.query({
    age: { $gt: 20 }
  }).exec();

  console.log(result);
}

main();


