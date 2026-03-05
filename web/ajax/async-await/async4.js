var hello = async () => {
  // 1. Wait for the connection to the server
  var response = await fetch("http://jsonplaceholder.typicode.com/todos");

  // 2. Wait for the data to be parsed into a JavaScript object
  var data = await response.json();

  // 3. Now 'data' contains your array of todos
  console.log(data);
}

hello();


/*
The reason you aren't seeing your list of todos is that fetch doesn't return the actual data immediately. 
Instead, it returns a Response object, which is like a shipping container—it has headers and status codes, 
but the "cargo" (the JSON) is still locked inside.

To get the actual data, you need to "unpack" it using the .json() method, which also requires an await.

*/
