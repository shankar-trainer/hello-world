npm i -g create-react-app
create-react-app app1

open terminal 
npm start


==================
Axios Error Structure: When Spring Boot responds with a status code outside the 2xx range (like 404 Not Found), Axios treats it as an error and wraps the server's response inside error.response.data. Your Spring Boot controller returns e.getMessage() as a plain string, which means the actual error message lives at error.response.data, not error.message.  
Axios

React Rendering Error: In your conditional check, you wrote if(error) return <p>{error.message}</p>. Since error in your state was saved as a string (error.message), trying to access {error.message} crashes because a string does not have a .message property.

Solution
Update your frontend code to properly extract the error coming from error.response?.data if it exists, or fallback to the generic Axios error message:

JavaScript
import React, { useState, useEffect } from 'react';
import axios from 'axios';

function AllBook() {
    const [book, setAllBook] = useState([]);
    const [error, setError] = useState(null);
    const [loading, setLoading] = useState(true);

    useEffect(() => {
        axios.get("http://localhost:9090/book")
            .then(response => {
                setAllBook(response.data);
                setLoading(false);
            })
            .catch(err => {
                console.log("error " + JSON.stringify(err));
                
                // Check if Spring Boot sent a response error payload, 
                // otherwise fallback to Axios network/general error message
                const errorMsg = err.response?.data || err.message;
                
                setError(errorMsg);
                setLoading(false);
            });
    }, []);

    if (loading)
        return <p>Loading...</p>;

    if (error) 
        return <p className="text-danger">Error: {error}</p>;   

    return (
        <div className="container">
            <table className="table table-bordered bg-warning p-2 m-3 w-75">
                <tbody>
                    {
                        book.map(b => (
                            <tr key={b.isbn}>
                                <td>{b.isbn}</td>
                                <td>{b.bname}</td>
                                <td>{b.cost}</td>
                            </tr>
                        ))
                    }
                </tbody>
            </table>
        </div>
    );
}

export default AllBook;
