MongoDB and Mongoose are related, but they are not the same.

- MongoDB: A NoSQL database that stores your application data.
- Mongoose: A Node.js library (ODM) that connects to MongoDB and helps manage data using schemas and models.

### 1. Install Mongoose

bash

```bash
npm install mongoose
```

### 2. Connect MongoDB without a password

If MongoDB is running locally without authentication:

javascript

```javascript
const mongoose = require("mongoose");

mongoose.connect("mongodb://127.0.0.1:27017/mydatabase")
  .then(() => console.log("MongoDB connected"))
  .catch((err) => console.log(err));
```

No username or password is required.

### 3. Create a Mongoose schema

javascript

```javascript
const userSchema = new mongoose.Schema({
  name: String,
  email: String,
  age: Number
});

const User = mongoose.model("User", userSchema);
```

### 4. Insert data

javascript

```javascript
const user = new User({
  name: "John",
  email: "john@gmail.com",
  age: 25
});

await user.save();
```

### 5. Fetch data

javascript

```javascript
const users = await User.find();
console.log(users);
```

### MongoDB connection comparison

| MongoDB setup | Mongoose connection |
| --- | --- |
| No password | `mongodb://127.0.0.1:27017/mydb` |
| Username/password | `mongodb://username:password@127.0.0.1:27017/mydb?authSource=admin` |

Are you using MongoDB locally (MongoDB Compass / Community Server) or MongoDB Atlas (cloud database)? I can show you the correct Mongoose connection setup.