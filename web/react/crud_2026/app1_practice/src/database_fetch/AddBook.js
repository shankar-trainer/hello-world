import axios from "axios"
import { useState } from "react"

export const AddBook = () => {
    const [error, setError] = useState(null)
    const [errors, setErrors] = useState({})
    const [loading, setLoading] = useState(true)
    const [book, setBook] = useState({})
    const [msg, setMsg] = useState('')

    const submit = (e) => {
        e.preventDefault();
        console.log(JSON.stringify(book))
        axios.post('http://localhost:8082/book', book).then(response => {
            setBook(response.data);
            
            setMsg('Record added ' + JSON.stringify(response.data)+"<p> status code :"+(response.status)+"</p>")
            setLoading(false)
        }).catch(e => {
            setError(e.message)
        }
        );  
    }
    return (
        <div className="container">
            <form onSubmit={submit} className="bg-info p-5 m-5">
                <div className="form-group">
                    <label>Enter Name</label>
                    <input className="form-control" onChange={(e) => {
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
                    <label>Enter publish date</label>
                    <input type="date" className="form-control"
                        onChange={(e) => {
                            const val = e.target.value
                            setBook({ ...book, publishDate: val })
                            if (val == "")
                                setErrors({ ...errors, publishDate: 'date is empty' })
                            else setErrors({ ...errors, publishDate: null })
                        }}
                    ></input>
                    {errors.pdate && <span className="text-danger">{errors.pdate}</span>}
                </div>

                <div className="form-group">
                    <label>Enter Cost</label>
                    <input className="form-control" type="number" onChange={(e) => {
                        const val = e.target.value
                        setBook({ ...book, cost: val })
                        if (val == "")
                            setErrors({ ...errors, cost: 'cost is empty' })
                        else if (val <= 0)
                            setErrors({ ...errors, cost: 'cost is zero or -ve ' })
                        else
                            setErrors({ ...errors, cost: null })
                    }}></input>
                    {errors.cost && <span className="text-danger">{errors.cost}</span>}
                </div>
                <div>
                    <button type="submit" className="btn btn-secondary">Add Record </button>
                    <button type="reset" className="btn btn-secondary">Cancel</button>
                </div>
                {msg && <>{msg}</>}
            </form>
        </div>
    )

}