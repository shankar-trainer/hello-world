

=====================
async await vs promise

In JavaScript, async/await is a modern syntax built on top of Promises, providing a more readable, synchronous-like style for handling asynchronous operations. Promises are the underlying mechanism, while async/await is "syntactic sugar" that simplifies their use.

Core Differences
    Parameter 	Promises	Async/Await
    Syntax	Involves chaining .then() and .catch() methods. Code can become verbose with complex chains ("promise chains" or "callback hell").	Uses the async and await keywords. Code appears linear and synchronous, making the control flow easier to follow.

    Error Handling	Errors are managed using the .catch() method at the end of a chain. Errors propagate down the chain until caught.	Errors are handled using familiar try...catch blocks, similar to synchronous code error management. This allows for more granular, co-located error logic.

    Control Flow	Uses a chain of callbacks defined in .then() blocks. The code after the promise creation continues to execute while the promise is pending.	The await keyword pauses the execution of the async function until the promise is resolved, without blocking the main thread. Execution resumes in a microtask after the awaited promise settles.

    Debugging	Can be tricky; stepping through chains with a debugger can be difficult because the debugger might not move to the next .then() correctly.	Debugging is generally simpler, as breakpoints work more intuitively with the linear, synchronous-like flow, and stack traces are cleaner.

When to Use Which

Async/Await is generally preferred in modern JavaScript for its cleaner syntax and improved readability, especially for sequential operations or complex conditional logic. It makes code easier to write, read, and maintain.
Promises (used in tandem with async/await) are essential for managing multiple independent operations that need to run in parallel. Methods like Promise.all() and Promise.race() can be used within an async function to achieve concurrency efficiently.

In practice, developers often mix both approaches, using async/await as the default for most tasks and falling back to Promise.all() (which is then awaited) when parallel execution is required.


================================
https://dev.to/eidorianavi/async-and-await-in-javascript-3l7e#:~:text=Now%20we%27re%20getting%20somewhere,log(e)%3B%20%7D%20%7D
Async and Await in JavaScript

Do you really know JavaScript if you don't know how to use an asynchronous function? Sure, I'm not here to gatekeep but it doesn't mean you shouldn't know what they are and how to use them. Today I'll be briefly going over exactly that using the more recent async and await format.

What is an asynchronous function and why use them?

Asynchronous functions in JavaScript are functions that enable promise based behavior to be used within your code.

First thing you'll need to know is what the heck is a promise? Think of it as a placeholder you can work with for incoming data. This is necessary for handling data from an external API that is part of your page but takes a moment to fetch. So you're able to use a Promise in place of the data and set conditions for what happens to do the data if it successfully comes through or doesn't.

A promise can be in three separate states:

pending: initial state, neither fulfilled nor rejected.
fulfilled: meaning that the operation was completed successfully.
rejected: meaning that the operation failed.
The async and await keywords were added to make promise handling more readable. It use to be more prevalent to do callback functions but I won't be getting into that today.

Async
To create an asynchronous function you must first prepend it with the async keyword. When you do this you're stating that the function will be handling a Promise or a placeholder for incoming data. This could be done in the older function format or through the use of an arrow function like so.

async function fetchAPI(){
   console.log("fetched");
}

const fetchAPI = async() => {
   console.log("fetched");
}

Now these functions clearly aren't doing much at the moment except logging the string "fetched". What matters is what they actually return upon invocation. If you invoke you will see in your console that actually logs a Promise object that should look like:

Promise {<fulfilled>: "fetched"}
The promise is in the fulfilled state since the data was immediately available considering it's just a string within the function.

Where it counts is when the data takes time to load such as from a fetch. Today I will be using jsonplaceholder as my API to fetch from for examples sake. If you're not familiar with it it's a super useful resource for fetching dummy data for practice.

const fetchAPI = async () => {
    let data = fetch("https://jsonplaceholder.typicode.com/todos")
    console.log(data);
}
Now what happens when you log the return of this fetch? It still logs a Promise yes but if you'll notice it is now pending.

Promise {<pending>}
In both cases we have a Promise object to work with which is the point entirely. Even if the data you're reaching out is pending or still being fetched you at least have the Promise to work with which is crucial for working with APIs.

Await
Great we got a Promise after fetching an API. Now what?

Now my friend comes the await keyword.

We can place the await keyword inside async functions to indicate that piece of data will be the one that may take a moment to fulfill. We simply include it prior to the fetch.

const fetchAPI = async () => {
        let data = await fetch("https://jsonplaceholder.typicode.com/todos/1")
    console.log(data)
}
This will now turn that promise into it's response once fulfilled.

Response {type: "cors", url: "https://jsonplaceholder.typicode.com/todos/1", redirected: false, status: 200, ok: true, …}body: (...)bodyUsed: falseheaders: Headers {}ok: trueredirected: falsestatus: 200statusText: ""type: "cors"url: "https://jsonplaceholder.typicode.com/todos/1"__proto__: Response
Now we're getting somewhere.

You will want to translate it to it's actual data so you can perform a .json() on your fetch or do it to the variable its assigned. Since that data is asynchronous make sure to still include the await keyword.

const fetchAPI = async () => {
    let response = await fetch("https://jsonplaceholder.typicode.com/todos/1")
    let data = await response.json()
    console.log(data)
}
Which will turn that response into it's JSON format and it should look like:

{userId: 1, id: 1, title: "delectus aut autem", completed: false}completed: falseid: 1title: "delectus aut autem"userId: 1__proto__: Object
Error Handling: Try/Catch
The thing about pulling data from an external source is there can be hiccups along the way. Maybe it's on their end or maybe your fetch has a typo. Either way there can be errors when it comes to Promise handling.

In an async function you can use a try/catch block to determine how to process the Promise whether it was properly fulfilled or rejected.

const fetchAPI = async () => {
    try {
        let response = await fetch("https://jsonplaceholder.typicode.com/todos/1")
        let data = await response.json();

        console.log(data);
    } catch(e) {
        console.log(e);
    }
}
First the function tries to get the response and if it works it will log the data in JSON format. If it doesn't work out it hits the catch and you will see what kind of error is occurring logged the console.

Wrap Up
There's just an introduction to the async/await format of promise handling JavaScript. There's of course always more to it but I'd recommend exploring the topic further on your own as there are plenty of nuances and approaches to how you work with these. If you're new to async functions I hope this shed some light on how they work and what they do. That'll be it for today. Happy coding!



================================================================
async and await are modern JavaScript keywords that allow you to write asynchronous, promise-based code in a clean, synchronous-looking style. An async function always returns a Promise, and the await keyword is used inside an async function to pause its execution until a Promise is resolved or rejected.

Basic Example: Fetching Data

A common use case is fetching data from an API using the built-in fetch() function, which returns a promise.

async function fetchUserData() {
  try {
    // Await the fetch call to get the Response object
    const response = await fetch('https://api.example.com/users/1');

    // Check if the response was successful
    if (!response.ok) {
      throw new Error(`HTTP error: ${response.status}`);
    }

    // Await the json() call to parse the body
    const user = await response.json();

    console.log('User data:', user);
    return user;
  } catch (error) {
    // Catches any errors in the try block, including network errors
    console.error('Error fetching user data:', error);
  }
}

// Call the async function
fetchUserData();
Explanation:
async function fetchUserData(): The async keyword marks the function as asynchronous, allowing the use of await inside it. The function will implicitly return a Promise.
await fetch(...): The function pauses at this line, without blocking the main JavaScript thread, and waits for the network request to complete.
const user = await response.json(): The function pauses again, waiting for the response body to be fully parsed into a JavaScript object.
try...catch block: This handles any errors that might occur during the asynchronous operations, such as a network failure or a non-OK HTTP status, similar to a .catch() in a promise chain.
YouTube
YouTube
 +6
Key Concepts
async Keyword: Used before a function declaration to indicate that the function will handle asynchronous operations and will always return a Promise.
await Keyword: Can only be used inside an async function (or top-level in ES modules). It pauses the execution of the async function until the Promise settles (resolves or rejects) and returns the resolved value.
Error Handling: Traditional try...catch blocks are used for error handling, making it look like synchronous error handling.
Readability: async/await significantly improves the readability of asynchronous code compared to chaining multiple .then() and .catch() methods (often called "callback hell").
Parallelism: For concurrent operations that do not depend on each other, use Promise.all() to run them in parallel and then await the result of all of them.

==========


What is an asynchronous function and why use them?
I'm glad you asked.

Asynchronous functions in JavaScript are functions that enable promise based behavior to be used within your code.

First thing you'll need to know is what the heck is a promise? Think of it as a placeholder you can work with for incoming data. This is necessary for handling data from an external API that is part of your page but takes a moment to fetch. So you're able to use a Promise in place of the data and set conditions for what happens to do the data if it successfully comes through or doesn't.

A promise can be in three separate states:

pending: initial state, neither fulfilled nor rejected.
fulfilled: meaning that the operation was completed successfully.
rejected: meaning that the operation failed.
The async and await keywords were added to make promise handling more readable. It use to be more prevalent to do callback functions but I won't be getting into that today.

Async

To create an asynchronous function you must first prepend it with the async keyword. When you do this you're stating that the function will be handling a Promise or a placeholder for incoming data. This could be done in the older function format or through the use of an arrow function like so.

async function fetchAPI(){
   console.log("fetched");
}

const fetchAPI = async() => {
   console.log("fetched");
}
Now these functions clearly aren't doing much at the moment except logging the string "fetched". What matters is what they actually return upon invocation. If you invoke you will see in your console that actually logs a Promise object that should look like:

Promise {<fulfilled>: "fetched"}
The promise is in the fulfilled state since the data was immediately available considering it's just a string within the function.

Where it counts is when the data takes time to load such as from a fetch. Today I will be using jsonplaceholder as my API to fetch from for examples sake. If you're not familiar with it it's a super useful resource for fetching dummy data for practice.

const fetchAPI = async () => {
    let data = fetch("https://jsonplaceholder.typicode.com/todos")
    console.log(data);
}

Now what happens when you log the return of this fetch? It still logs a Promise yes but if you'll notice it is now pending.

Promise {<pending>}
In both cases we have a Promise object to work with which is the point entirely. Even if the data you're reaching out is pending or still being fetched you at least have the Promise to work with which is crucial for working with APIs.

Await
Great we got a Promise after fetching an API. Now what?

Now my friend comes the await keyword.

We can place the await keyword inside async functions to indicate that piece of data will be the one that may take a moment to fulfill. We simply include it prior to the fetch.

const fetchAPI = async () => {
    let data = await fetch("https://jsonplaceholder.typicode.com/todos/1")

    console.log(data)
}
This will now turn that promise into it's response once fulfilled.

Response {type: "cors", url: "https://jsonplaceholder.typicode.com/todos/1", redirected: false, status: 200, ok: true, …}body: (...)bodyUsed: falseheaders: Headers {}ok: trueredirected: falsestatus: 200statusText: ""type: "cors"url: "https://jsonplaceholder.typicode.com/todos/1"__proto__: Response
Now we're getting somewhere.

You will want to translate it to it's actual data so you can perform a .json() on your fetch or do it to the variable its assigned. Since that data is asynchronous make sure to still include the await keyword.

const fetchAPI = async () => {
    let response = await fetch("https://jsonplaceholder.typicode.com/todos/1")
    let data = await response.json()
    console.log(data)
}
Which will turn that response into it's JSON format and it should look like:

{userId: 1, id: 1, title: "delectus aut autem", completed: false}completed: falseid: 1title: "delectus aut autem"userId: 1__proto__: Object
Error Handling: Try/Catch
The thing about pulling data from an external source is there can be hiccups along the way. Maybe it's on their end or maybe your fetch has a typo. Either way there can be errors when it comes to Promise handling.

In an async function you can use a try/catch block to determine how to process the Promise whether it was properly fulfilled or rejected.

const fetchAPI = async () => {
    try {
        let response = await fetch("https://jsonplaceholder.typicode.com/todos/1")
        let data = await response.json();

        console.log(data);
    } catch(e) {
        console.log(e);
    }
}
First the function tries to get the response and if it works it will log the data in JSON format. If it doesn't work out it hits the catch and you will see what kind of error is occurring logged the console.

