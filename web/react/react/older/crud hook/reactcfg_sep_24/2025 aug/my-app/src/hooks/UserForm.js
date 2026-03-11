import { useState } from "react"

export const UserForm = () => {

    const [id, setId] = useState('')
    const [name, setName] = useState('')
    const [salary, setSalary] = useState('')
    const [err_id, setIdErr] = useState('')
    const [err_name, setNameErr] = useState('')
    const [err_salary, setSalaryErr] = useState('')


    return (
        <div className="container w-75 p-5 m-5 bg-warning">
            <form className="form-group">
                <h1>User Form</h1>

                <div>
                    <label>Enter Id</label>
                    <input className="form-control" value={id} onChange={(event) => {
                        setId(event.target.value)
                        if (event.target.value == '' || event.target.value == 0)
                            //alert("id is blank")
                            setIdErr('id is blank')
                        else if (isNaN(event.target.value))
                            //    alert("id is not a number")
                            setIdErr('id is not a number')
                    }} ></input>
                    <span className="bg-light text-danger">{err_id}</span>
                </div>

                <div>
                    <label>Enter Name</label>
                    <input className="form-control" value={name} onChange={(event) => {
                        setId(event.target.value)
                        if (event.target.value == '')
                            //alert("name is blank")
                            setNameErr('name is bklank')
                        else if (event.target.value.length < 5 || event.target.value.length > 15)
                            //    alert("name must of 5 -15 characters ")
                            setNameErr('name must of 5 -15 characters')

                    }} ></input>
                    <span className="bg-light text-danger">{err_name}</span>
                </div>

                <div>
                    <label>Enter Salary</label>
                    <input className="form-control" value={salary} onChange={(event) => {
                        setId(event.target.value)
                        if (event.target.value == '' || event.target.value == 0)
                            setSalaryErr('salary is blank')
                        //alert("salary is blank")
                        else if (isNaN(event.target.value))
                            //alert("salary is not a number")
                        setSalaryErr("salary is not a number")
                        else if (event.target.value < 10000 || event.target.value > 50000)
                            //alert("salary must between 10000 - 500000")
                            setSalaryErr("salary must between 10000 - 500000")
                    }} ></input>
                    <span className="bg-light text-danger">{err_salary}</span>

                </div>
            </form>
        </div>
    )
}