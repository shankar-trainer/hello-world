import axios from "axios";
import { useEffect, useState } from "react";

//npm i axiox
function AllBook() {
    const [book, setAllBook] = useState([])
    const [error, setError] = useState(null)
    const [loading, setLoading] = useState(true)

    useEffect(() => {
        axios.get("http://localhost:9090/book").then(respose => {
            setAllBook(respose.data)
            setLoading(false)
        }).catch(error => {
                const errorMsg = error.response?.data || error.message;

            setError(errorMsg)
            setLoading(false)
        })
    },[])

if(loading)
    return <p>Loading</p>
if(error) 
    // return <p>{error.message}</p>   
    return <p>{error}</p>   
  return(
    <div className="container">
        <table className="table table-bordered bg-warning p-2 m-3 w-75">
            {
                book.map(b=>(
                    <tr>
                        <td>{b.isbn}</td>
                        <td>{b.bname}</td>
                        <td>{b.cost}</td>
                    </tr>
                ))
            }
        </table>

    </div>
  )

}
export default AllBook;