import axios from "axios";
import { useEffect, useState } from "react";
import { useNavigate, useParams } from "react-router-dom";

export const SearchBook1 = () => {
    const [isbn, setIsbn] = useState(0);
    const [error, setError] = useState(null)
    const [errors, setErrors] = useState({})
    const [msg, setMsg] = useState('')
    const [loading, setLoading] = useState(true)

    const [book, setBook] = useState({
        'isbn': 0,
        'name': '',
        'publishDate': '',
        'cost': 0
    })

    const navigate = useNavigate()
    const nav_allbook = () => {
        navigate('/allbook')
    }

    const { isbn1 } = useParams();
    // const isbn2=Number(isbn1)

    useEffect((e) => {

        axios.get('http://localhost:8082/book/' + isbn1).then(response => {

            setMsg('book found with id ' + isbn1 + ' ' + JSON.stringify(response.data))
            setError('')
            setLoading(false)
            setBook(response.data)

        }).catch(e => {
            console.log(e.response.data)
            setError(e.response.data)
            setMsg('')
            setLoading(false)
        });
    }, [isbn1])

    // if (loading) return <p>loading</p>
    // if (error) return <p>{error.message}</p>
    return (
        <div className="container">
            <table className="table p-5 m-5">
                <tr>
                    <td>{msg && <>{msg}</>}</td>
                </tr>
                <tr>
                    <td>
                        {error && <>{error}</>}
                    </td>
                </tr>
            </table>
            <table>
                <tr>
                    <td>
                        id
                    </td>
                    <td>
                        {book.isbn}
                    </td>
                </tr>
                <tr>
                    <td>
                        cost
                    </td>
                    <td>
                        {book.cost}
                    </td>
                </tr>
                <tr>
                    <td>
                        name
                    </td>
                    <td>
                        {book.name}
                    </td>
                </tr>
                <tr>
                    <td>
                        cost
                    </td>
                    <td>
                        {book.cost}
                    </td>
                </tr>


                <tr>
                    <td>
                        <button type="button" className="btn btn-primary"
                            onClick={nav_allbook}> navigate all book</button>

                    </td>
                </tr>
            </table>

        </div>
    )
} 