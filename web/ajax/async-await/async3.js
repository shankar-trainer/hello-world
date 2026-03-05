
const fetchAPI = async () => {
    // let data = await fetch("http://jsonplaceholder.typicode.com/todos")
    let data = await fetch("http://jsonplaceholder.typicode.com/todos")
    console.log(data);
}
fetchAPI()