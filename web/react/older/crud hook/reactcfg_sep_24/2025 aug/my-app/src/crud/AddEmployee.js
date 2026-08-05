import axios from "axios"
import { useState } from "react"

export const AddEmployee=()=>{
const [employee,setEmployee]=useState({})
const [msg,setMessage]=useState('')

const submitData=(event)=>{
    event.preventDefault()
    axios.post('http://localhost:9090/employee',employee).then(
        response=>{
             setMessage('Record Added')
        },
        error=>{
            console.log(error)
            setMessage(error)
        }
    )
}

return(
<div className="container w-75 p-5 m-5 bg-warning">
            <form className="form-group" onSubmit={submitData}>
                <h1>User Form</h1>

                <div className="form-group">
                    <label>Enter Name</label>
                    <input className="form-control" onChange={(event)=>{
                        setEmployee({...employee, name:event.target.value})
                    }}/>   
                </div>
                
                <div className="form-group">
                    <label>Enter Dob</label>
                    <input className="form-control" type="date" onChange={(event)=>{
                        setEmployee({...employee, dob:event.target.value})
                    }}/>      
                </div>
                <div className="form-group">
                        <button type="submit" className="btn btn-primary" style={{"marginTop":"5pt"}}>Add Employee</button>
                        <button type="reset" className="btn btn-primary " style={{"marginLeft":"10pt","marginTop":"5pt"}}> Cancel</button>
                </div>
                <div>

                   {msg.trim() && <p className="bg-light">{msg}</p>}

                </div>

               </form>
 </div>
 )
}