async function fetchData() {
    try {
        // "await" pauses the function until the promise is resolved
        const response = await fetch('https://jsonplaceholder.typicode.com/todos/');
        const data = await response.json();
        console.log(data);
    } catch (error) {
        console.error('Error fetching data:', error);
    }
}
fetchData();
