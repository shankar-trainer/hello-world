// to be done 
import axios from "axios"
import { useEffect, useState } from "react"
import { useParams } from "react-router-dom"

export const UpdateBook1 = () => {
    const [error, setError] = useState(null)
    const [errors, setErrors] = useState({})
    const [loading, setLoading] = useState(true)
    const [status, setStaus] = useState(true)
    // const [book, setBook] = useState({})
    const [isbn, setIsbn] = useState(0);

    const [book, setBook] = useState({
        'isbn': 0,
        'name': '',
        'publishDate': '',
        'cost': 0
    })
    const [msg, setMsg] = useState('')

    const submit = (e) => {
        e.preventDefault();
        axios.get('http://localhost:8082/book/' + isbn).then(response => {
            if (response.status === 200) {
                 setMsg(' ')
                setStaus(false)
                setBook(response.data)
            }
            setLoading(false)
        }).catch(e => {
            // console.log(e.response.data)
            setError(e.response.data)
            setMsg('book not found with isbn '+isbn)
            setLoading(false)
        });
    };
    // if (loading) return <p>loading</p>
    // if (error) return <p>{error.message}</p>



    const submit1 = (e) => {
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
        <>   {status &&
            <div className="container col-6" style={{ 'marginLeft': '40pt' }}>
                <form onSubmit={submit}>
                    <div className="form-group row" >
                        <label className="col-4">Enter Isbn</label>
                        <input className="form-control" onChange={(e) => {
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

                    <div>
                        <button type="submit" className="btn btn-secondary" style={{ 'marginTop': "5pt" }}>Search By isbn</button>
                        <button type="reset" className="btn btn-secondary" style={{ 'marginLeft': "2pt", 'marginTop': "5pt" }}>Cancel</button>
                    </div>

                    {/* <button type="button" className="btn btn-primary" 
                           onClick={nav_allbook}> navigate all book</button> */}
                </form>
                        {msg && <>{msg}</>}

            </div>
        }
            {
                !status &&

                <div className="container">
                    <form onSubmit={submit1} className="bg-info p-5 m-5">
                        <h3>Update Page</h3>
                        <div className="form-group">
                            <label>ISBN</label>
                            <input className="form-control" disabled value={book.isbn}></input>
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

                        <div style={{ 'marginTop': "8pt" }}>
                            <button type="submit" className="btn btn-secondary">Update Record </button>
                            <button type="reset" className="btn btn-secondary" style={{ 'marginLeft': "5pt" }} >Cancel</button>
                        </div>
                        {msg && <>{msg}</>}
                    </form>
                </div>

            }
        </>

    )

}