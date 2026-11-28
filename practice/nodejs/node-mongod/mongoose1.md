const mongoose = require("mongoose");

async function main() {
  try {
    // Connect to MongoDB
    await mongoose.connect("mongodb://127.0.0.1:27017/mydb");
    console.log("MongoDB connected");

    // Create schema
    const userSchema = new mongoose.Schema({
      name: String,
      email: String,
      age: Number
    });

    // Create model
    const User = mongoose.model("User", userSchema);

    // Insert data
    const user = new User({
      name: "John",
      email: "john@gmail.com",
      age: 25
    });

    await user.save();
    console.log("User saved successfully");

    // Fetch all users
    const users = await User.find();
    console.log(users);

  } catch (err) {
    console.log(err);
  } finally {
    await mongoose.disconnect();
  }
}

main();


In your Mongoose code, the collection name is `users` (by default).

javascript

```javascript
const User = mongoose.model("User", userSchema);
```

Mongoose automatically converts the model name `"User"` into the collection name `"users"` (lowercase and pluralized).

### Your MongoDB structure

Database: mydb

Collection: users

Document

javascript

```javascript
{
  _id: ObjectId("..."),
  name: "John",
  email: "john@gmail.com",
  age: 25,
  __v: 0
}
```

### How to check in mongosh

javascript

```javascript
use mydb

show collections
```

Output:

text

```text
users
```

Show all data:

javascript

```javascript
db.users.find()
```

### What if you want a custom collection name?

You can explicitly specify it:

javascript

```javascript
const User = mongoose.model(
  "User",
  userSchema,
  "testCollection"
);
```

Now the collection name will be `testCollection`, not `users`.

Remember:

| Mongoose model | Default MongoDB collection |
| --- | --- |
| `User` | `users` |
| `Student` | `students` |
| `Product` | `products` |
| `Employee` | `employees` |

Mongoose automatically pluralizes model names unless you explicitly specify a collection name.