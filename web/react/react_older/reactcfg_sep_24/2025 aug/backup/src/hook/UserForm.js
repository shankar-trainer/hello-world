import { useState } from "react"

export const  UserForm=()=>{

    const [id,setId] =useState('')
    const [name,setName] =useState('')
    const [salary,setSalary] =useState('')

    return(
        <div className="container w-75 p-5 m-5 bg-warning">
            <form className="form-group">
           <h1>User Form</h1>
           
           <div>
            <label>Enter Id</label>
            <input className="form-control" value={id} onChange={(event)=>{
                setId(event.target.value)
                if(event.target.value==''|| event.target.value==0)
                    alert("id is blank")
                else if(isNaN(event.target.value))
                    alert("id is not a number")
            }} ></input>
           </div>
           
           <div>
            <label>Enter Name</label>
            <input className="form-control"value={name} onChange={(event)=>{
                setId(event.target.value)
                if(event.target.value=='')
                    alert("name is blank")
                else if(event.target.value.length<5 || event.target.value.length>15)
                    alert("name must of 5 -15 characters ")
            }} ></input>
           </div>
           
           <div>
            <label>Enter Salary</label>
            <input className="form-control"value={salary} onChange={(event)=>{
                setId(event.target.value)
                if(event.target.value==''|| event.target.value==0)
                    alert("salary is blank")
                else if(isNaN(event.target.value))
                    alert("salary is not a number")
                else if(event.target.value<10000 || event.target.value>50000)
                    alert("salary must between 10000 - 500000")

            }} ></input>
           </div>
           </form>
        </div>
    )
}