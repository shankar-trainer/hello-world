import axios from "axios"
import { useEffect, useState } from "react"
import { useParams } from "react-router-dom"

export const UpdateBook = () => {
    const [error, setError] = useState(null)
    const [errors, setErrors] = useState({})
    const [loading, setLoading] = useState(true)
    // const [book, setBook] = useState({})
    const [book, setBook] = useState({
        'isbn': 0,
        'name': '',
        'publishDate': '',
        'cost': 0
    })
    const { isbn1 } = useParams();
    const [msg, setMsg] = useState('')

    useEffect((e) => {
        console.log("http://localhost:8082/book/" + isbn1)
        axios.get("http://localhost:8082/book/" + isbn1).then(response => {
            setBook(response.data)
            console.log(JSON.stringify(response.data))
            setLoading(false)
        }).catch(error => {
            setError(error.message)
            setLoading(false)
        }
        )
    }, [isbn1])

    const submit = (e) => {
        e.preventDefault();
        console.log(JSON.stringify(book))
        axios.put('http://localhost:8082/book', book).then(response => {
            setBook(response.data);

            setMsg('Record updated ' + JSON.stringify(response.data) + "<p> status code :" + (response.status) + "</p>")
            setLoading(false)
        }).catch(e => {
            setError(e.message)
        }
        );
    }
    return (
        <div className="container">
            <form onSubmit={submit} className="bg-info p-5 m-5">
                <h3>Update Page</h3>
                <div className="form-group">
                    <label>ISBN</label>
                    <input className="form-control" disabled value={isbn1}></input>
                </div>
                <div className="form-group">
                    <label>Enter Name</label>
                    <input className="form-control" value={book.name} onChange={(e) => {
                        const val = e.target.value
                        setBook({ ...book, name: val })
                        if (val == 0)
                            setErrors({ ...errors, name: "name is empty" })
                        else if (val.length < 5 || val.length > 20)
                            setErrors({ ...errors, name: "name must of 5 - 20 characters" })
                        else
                            setErrors({ ...errors, name: null })
                    }}></input>
                    {errors.name && <span className="text-danger">{errors.name}</span>}
                </div>
                <div className="form-group">
                    <label>Enter Cost</label>
                    <input className="form-control" value={book.cost} onChange={(e) => {
                        const val = e.target.value
                        setBook({ ...book, cost: val })
                        if (val == 0)
                            setErrors({ ...errors, cost: "cost is empty" })
                        else if (val.length < 5 || val.length > 20)
                            setErrors({ ...errors, cost: "name must of 5 - 20 characters" })
                        else
                            setErrors({ ...errors, cost: null })
                    }}></input>
                    {errors.name && <span className="text-danger">{errors.name}</span>}
                </div>

                <div className="form-group">
                    <label>Enter publish date</label>
                    <input type="date" value={book.publishDate} className="form-control"
                        onChange={(e) => {
                            const val = e.target.value
                            setBook({ ...book, publishDate: val })
                            if (!val)
                                setErrors({ ...errors, publishDate: 'Date, month, and year are required' })
                            else setErrors({ ...errors, publishDate: null })
                        }}
                    ></input>
                    {errors.publishDate && <span className="text-danger">{errors.publishDate}</span>}
                </div>

                <div style={{'marginTop':"8pt"}}>
                    <button type="submit" className="btn btn-secondary">Update Record </button>
                    <button type="reset" className="btn btn-secondary" style={{'marginLeft':"5pt"}} >Cancel</button>
                </div>
                {msg && <>{msg}</>}
            </form>
        </div>
    )

}