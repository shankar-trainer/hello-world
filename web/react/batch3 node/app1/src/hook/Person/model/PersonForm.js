import { useState } from "react";
import Date1 from "../../../Date1";
import { useNavigate } from "react-router-dom";
import {MyClock} from "../MyClock";
import { Clock } from "../Clock";

// function PersonForm()
const PersonForm = (props) => {
    const navigate=useNavigate()

    const [id, setId] = useState('')
    const [name, setName] = useState('')
    const [salary, setSalary] = useState('')
    const [id_err, setIdError] = useState('')
    const [name_err, setNameError] = useState('')
    const [salary_err, setSalaryError] = useState('')
    const [status, setStatus] = useState(true)
    const [status1, setStatus1] = useState(true)

    return (
        <div className="container">

            <form className="border border-primary p-5 m-5 w-50">
                <h2>Person Form</h2>
                <div className="row">
                    <div className="col">

                    </div>
                    <div className="col">

                    </div>
                </div>
                <div className="form-group">
                    <label>Enter Id </label>
                    <input className="form-control" placeholder="enter id" value={id}
                        onChange={(event) => {
                            setId(event.target.value)
                            if (event.target.value == '')
                                // alert('id isblank')
                                setIdError('id is blank')
                            else if (isNaN(event.target.value))
                                setIdError('id must be numeric')
                            else if (event.target.value < 1000 || event.target.value > 10000)
                                setIdError('id must be netween 1000 - 10000')
                            else
                                setIdError('')
                        }
                        }
                    ></input>
                    <span className="text-danger">{id_err}</span>
                </div>

                <div className="form-group">
                    <label>Enter Name </label>
                    <input className="form-control" placeholder="enter name" value={name}
                        onChange={(e) => {
                            setName(e.target.value)
                            if (e.target.value == '')
                                setNameError('name is blank')
                            // alert('name is blank')
                            else if (e.target.value.length < 5 || e.target.value > 15)
                                setNameError('name length must of 5 - 15 characters')
                            else
                                setNameError('')
                        }}
                    >
                    </input>
                    <span className="text-danger">{name_err}</span>
                </div>
                <div className="form-group">
                    <label>Enter Salary </label>
                    <input className="form-control" placeholder="enter salary"
                        value={salary}
                        onChange={
                            (e) => {
                                setSalary(e.target.value)
                                if (e.target.value == '')
                                    setSalaryError('salary is blank')
                                // alert('salary is zero or negative')
                                else if (e.target.value <= 0)
                                    setSalaryError('salary is zero or negative')
                                else if (e.target.value < 5000 || e.target.value > 500000)
                                    setSalaryError('salary must between 5000 - 50000')
                                else {
                                    setSalaryError('')
                                    //                  setStatus(false);
                                }
                            }
                        }
                    ></input>
                    <span className="text-danger">{salary_err}</span>
                </div>
            </form>
            <div hidden={status} className="border border-primary w-25 p-5 bg-info m-5">
                <div>
                    Id is {id}
                </div>
                <div>
                    Name is {name}
                </div>
                <div>
                    Salary is {salary}
                </div>
            </div>
            <div className="m-5 p-2">
                <button className="btn btn-secondary" style={{ "margin-right": "10pt" }} onClick={
                    () => 
                            setStatus1(false)
                }> show phone</button>
                <button className="btn btn-secondary" onClick={()=>{
                        if (id!== '' && name!== '' && salary!== '') {
                            setStatus(false)
                        }
                        else {
                            alert('add the values in id, name and salary')
                        }
                    }
                }> show person data</button>
                <button  className="btn btn-secondary" style={{ "margin-left": "10pt" }}
                onClick={()=>{
                    navigate('/cform')
                }}
                > go to customer form</button>
            </div>

            <div hidden={status1}>
                <ol className="border border-primary p-5 m-5 w-50 bg-success text-light"
                    style={{ "borderRadius": "20pt" }} type="a">
                    {
                        props.fone.map(f =>
                            <>
                                <li>
                                    <label className="border border-light" style={{ "width": "60pt", "marginLeft": "10pt" }}>{f.model}</label>
                                    <label className="border border-light" style={{ "width": "60pt" }}>{f.cost} </label>
                                    <label className="border border-light" style={{ "width": "60pt" }}> {f.location} </label>
                                </li>
                            </>
                        )
                    }
                </ol>
            </div>
            <MyClock></MyClock>
            <hr></hr>
            <Clock></Clock>

        </div>
    )
}

export default PersonForm;