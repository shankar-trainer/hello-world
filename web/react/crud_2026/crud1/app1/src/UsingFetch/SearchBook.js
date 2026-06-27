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


    const submit = (e) => {
        e.preventDefault();
        axios.get('http://localhost:8082/book/'+isbn).then(response => {
            if(response.status===200)
            console.log("book found");
            
            setMsg('book found with id ' + isbn + ' ' + JSON.stringify(response.data))
            setError('')
            setLoading(false)
        }).catch(e => {
            console.log(e.response);
            setError(e.response.data)
            setMsg('')
            setLoading(false)
        });
    };
    // if (loading) return <p>loading</p>
    // if (error) return <p>{error.message}</p>
    return (
        // <div className="container col-6" style={{'marginLeft':'40pt'}}>
        //     <form onSubmit={submit}>
        //         <div className="form-group row" >
        //                 <label className="col-4">Enter Isbn</label>
        //                 <input className="form-control" value={isbn}  onChange={(e) => {
        //                     const val = e.target.value
        //                     setIsbn(val)
        //                     if (val == "") {
        //                         setErrors({ ...errors, isbn1: 'isbn is empty' })
        //                     }
        //                     else if (val < 1 || val > 50000)
        //                         setErrors({ ...errors, isbn1: 'isbn must between 1 - 50000' })
        //                     else
        //                         setErrors({ ...errors, isbn1: null })
        //                 }}></input>
        //                 {errors.isbn1 && <span className="text-danger">{errors.isbn1}</span>}
        //         </div>

        //         <div>
        //             <button type="submit" className="btn btn-secondary" style={{'marginTop':"5pt"}}>Search By isbn</button>
        //             <button type="reset" className="btn btn-secondary" style={{'marginLeft':"2pt",'marginTop':"5pt"}}>Cancel</button>
        //         </div>
        //         {msg && <>{msg}</>}
        //         {error && <>{error}</> }
        //                    <button type="button" className="btn btn-primary" 
        //                    onClick={nav_allbook}> navigate all book</button>
        //     </form>

        // </div>
        <div className="container col-6 border border-primary p-5 mt-5" style={{ 'marginLeft': '40pt' }}>
    <form onSubmit={submit}>
        {/* Row 1: Input and Error Handling */}
        <div className="row mb-3 align-items-center">
            <div className="col-md-4">
                <label className="form-label">Enter Isbn</label>
            </div>
            <div className="col-md-8">
                <input 
                    className={`form-control ${errors.isbn1 ? 'is-invalid' : ''}`} 
                    value={isbn} 
                    onChange={(e) => {
                        const val = e.target.value;
                        setIsbn(val);
                        if (val === "") {
                            setErrors({ ...errors, isbn1: 'isbn is empty' });
                        } else if (val < 1 || val > 50000) {
                            setErrors({ ...errors, isbn1: 'isbn must be between 1 - 50000' });
                        } else {
                            setErrors({ ...errors, isbn1: null });
                        }
                    }} 
                />
                {errors.isbn1 && <div className="invalid-feedback">{errors.isbn1}</div>}
            </div>
        </div>

        {/* Row 2: Search and Cancel Buttons */}
        <div className="row mb-3">
            <div className="col-md-6">
                <button type="submit" className="btn btn-secondary w-100">Search By Isbn</button>
            </div>
            <div className="col-md-6">
                <button type="reset" className="btn btn-outline-secondary w-100">Cancel</button>
            </div>
        </div>

        {/* Row 3: Navigation and Status Messages */}
        <div className="row">
            <div className="col-12 text-center">
                <button type="button" className="btn btn-primary w-50 mb-2" style={{'float':'left'}} onClick={nav_allbook}>
                    Navigate All Books
                </button>
                {msg && <div className="alert alert-success">{msg}</div>}
                {error && <div className="alert alert-danger">{error}</div>}
            </div>
        </div>
    </form>
</div>
    )
} 



// why below code not give tow columns 
//  <div className="form-group row" >
//                         <label className="col-4">Enter Isbn</label>
//                          <input className="form-control" value={isbn}>
// </div>

// It looks like the issue is a classic Bootstrap layout conflict. When you use the form-control class on an input, Bootstrap by default gives it a width: 100%, which forces it to drop to its own line regardless of the grid classes on the parent.

// To get them to sit side-by-side in a two-column format, you need to wrap the input in its own column div.

// The Solution
// Here is the corrected structure. I’ve wrapped the input in a col-8 (since your label is col-4) to complete the 12-column grid:

// JavaScript
// <div className="form-group row">
//   <label className="col-sm-4 col-form-label">Enter Isbn</label>
//   <div className="col-sm-8">
//     <input 
//       className="form-control" 
//       value={isbn} 
//       onChange={(e) => setIsbn(e.target.value)} 
//     />
//   </div>
// </div>