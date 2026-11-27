// const mongoose = require("mongoose");

// mongoose.connect("mongodb://127.0.0.1:27017/mydb")
//   .then(() => console.log("MongoDB connected"))
//   .catch((err) => console.log(err));

// const userSchema = new mongoose.Schema({
//   name: String,
//   email: String,
//   age: Number
// });

// const User = mongoose.model("User", userSchema);

// const user = new User({
//   name: "John",
//   email: "john@gmail.com",
//   age: 25
// });

// await user.save();
// const users = await User.find();
// console.log(users);
//This error occurs because you're using await outside an async function.

// Since you're using require() (CommonJS), wrap your database operations inside an async function.

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
