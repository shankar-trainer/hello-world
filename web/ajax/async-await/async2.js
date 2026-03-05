var hello=async ()=>{

  //  var data=await fetch("http://api.restful-api.dev/objects")
  //  var data=await fetch("http://api.restful-api.dev/objects/1")
  var data= await fetch("http://jsonplaceholder.typicode.com/todos")
  console.log(data);
}
hello()

/*
The reason you aren't seeing your list of todos is that fetch doesn't return the actual data immediately. 
Instead, it returns a Response object, which is like a shipping container—it has headers and status codes, but the "cargo" (the JSON) is still locked inside.

To get the actual data, you need to "unpack" it using the .json() method, which also requires an await.

*/