import axios from "axios";
import { useState } from "react";
import { useNavigate, useParams } from "react-router-dom";

export const SearchBook = () => {
    const [isbn, setIsbn] = useState(0);
    const [error, setError] = useState(null)
    const [errors, setErrors] = useState({})
    const [msg, setMsg] = useState('')
    const [loading, setLoading] = useState(true)

    const navigate=useNavigate()
    const nav_allbook=()=>{
        navigate('/allbook')
    }

    const {isbn1}=useParams();
    const isbn2=Number(isbn1)

    const submit = (e) => {
        e.preventDefault();
         alert('parameter isbn is '+isbn2)
        // axios.get('http://localhost:8082/book/'+isbn).then(response => {
        axios.get('http://localhost:8082/book/'+isbn2).then(response => {
            
            setMsg('book found with id ' + isbn + ' ' + JSON.stringify(response.data))
            setError('')
            setLoading(false)
        }).catch(e => {
            // console.log(e.response.data)
            setError(e.response.data)
            setMsg('')
            setLoading(false)
        });
    };
    // if (loading) return <p>loading</p>
    // if (error) return <p>{error.message}</p>
    return (
        <div className="container">
            <form onSubmit={submit}>
                <div className="form-group">
                    <label>Enter Isbn</label>
                    <div>
                        <input className="form-control" value={isbn}  onChange={(e) => {
                            const val = e.target.value
                            setIsbn(val)
                            if (val == "") {
                                setErrors({ ...errors, isbn1: 'isbn is empty' })
                            }
                            else if (val < 1 || val > 50000)
                                setErrors({ ...errors, isbn1: 'isbn must between 1 - 50000' })
                            else
                                setErrors({ ...errors, isbn1: null })
                        }}></input>
                        {errors.isbn1 && <span className="text-danger">{errors.isbn1}</span>}
                    </div>
                </div>
                <div>
                    <button type="submit">Search By isbn</button>
                    <button type="reset">Cancel</button>
                </div>
                {msg && <>{msg}</>}
                {error && <>{error}</> }
                           <button type="button" className="btn btn-primary" 
                           onClick={nav_allbook}> navigate all book</button>
            </form>
        </div>
    )
} 