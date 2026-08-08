import axios from "axios"
import { useEffect, useState } from "react"

export const AddBook = () => {
  const  [msg,setMsg] =useState('')
   const [book,setBook] =useState({})
   const [error,setError] =useState({})

    const submit=(event)=>{
        event.preventDefault();
        console.log(JSON.stringify(book))
        axios.post("http://localhost:9090/book",book).then(resp=>{
            const data=resp.data
            setMsg("record added "+JSON.stringify(data))
            alert('record added ')
        }).catch(error=>{
            const errorMsg = error.response?.data || error.message;
            setError(errorMsg)
        })
    }
    return (
        <div className="container border border-info m-5 p-5 w-100 bg-warning">
            <form onSubmit={submit}>
                <div className="row md-3">
                    <label className="col-3">enter name</label>
                    <input className="col-6"  onChange={(e)=>{
                        const value=e.target.value
                        setBook({...book,bname:value})
                        if(value=='')
                            setError({...error,bname:'name is blank'})
                        else 
                        setError({...error,bname:''})

                    }}></input>
                   <span className="col-3 text-danger"> {error.bname && <>{error.bname}</>}</span>
                </div>

                <div className="row md-3 mt-1">
                    <label className="col-3">enter cost</label>
                    <input className="col-6" onChange={(e)=>{
                        const value=e.target.value
                        setBook({...book,cost:value})
                        if(value=='')
                            setError({...error,cost:'cost is blank'})
                        else 
                        setError({...error,cost:''})

                    }}></input>
                   <span className="col-3 text-danger"> {error.cost && <>{error.cost}</>}</span>

                </div>

                <div className="mt-2">
                    <button type="submit" className="btn btn-success">add record</button>
                    <button type="reset" className="btn btn-success ms-1">cancel</button>
                </div>
            </form>
           <>{msg && <>{msg}</>}</>
        </div>
    )
}
// export default AddBook;