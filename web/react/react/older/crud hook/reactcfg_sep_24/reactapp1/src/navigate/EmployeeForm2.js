import { useState } from "react"
import { useNavigate } from "react-router";

export const EmployeeForm2 = () => {

    const [id, setId] = useState('');
    const [err_id, setIdErr] = useState(' ');
    const [name, setName] = useState('');
    const [err_name, setNameErr] = useState(' ');
    const [salary, setSalary] = useState('');
    const [err_salary, setSalaryErr] = useState(' ');
    const [status, setStatus] = useState(true);
    var show = () => {
        if (err_id == '' && err_name == '' && err_salary == '') {
            // if(err_id=='' && err_name=='') {     
            setStatus(false)
            setSalaryErr('')
        }
    }

    var cancel = () => {
        setStatus(true)
        setId('')
        setName('')
        setSalary('')
    }

    const navigate = useNavigate()

    return (
        <>
            <div className="container p-5 m-5 w-75 bg-dark text-light">
                <div className="form-group">
                    <label>Enter Id</label>
                    <input value={id} onChange={(event) => {
                        setId(event.target.value)
                        if (event.target.value == '' || event.target.value == 0)
                            //alert('id is blank')
                            setIdErr('id is blank')
                        else if (isNaN(event.target.value))
                            setIdErr('id is not a number')
                    }}
                        className="form-control"
                    ></input>
                    <span className="text-warning"> {err_id}</span>
                </div>

                <div className="form-group">
                    <label>Enter Name</label>
                    <input onChange={(e) => {
                        setName(e.target.value)
                        if (e.target.value == '') {
                            //alert('name is blank')
                            setNameErr('name is blank')
                            setIdErr('')
                        }
                    }}
                        className="form-control"
                        value={name}
                    ></input>
                    <span className="text-warning"> {err_name}</span>

                </div>
                <div className="form-group">
                    <label>Enter Salary</label>
                    <input onChange={(e) => {
                        setSalary(e.target.value)
                        if (e.target.value == '') {
                            //alert('salary  is blank')
                            setSalaryErr('salary is blank')
                            setNameErr('')
                        }
                        else if (e.target.value != '') {
                            setIdErr('')
                            setSalaryErr('')
                            setNameErr('')
                        }
                    }}
                        className="form-control"
                        value={salary}
                    ></input>
                    <span className="text-warning"> {err_salary}</span>
                </div>
                <div>
                    <input type="submit" onClick={() => navigate('/emp_data', { state: { id: id, name: name, salary: salary } })} value="Counter Hook" className="btn btn-primary m-3" />
                    {/* <input type="submit" className="btn btn-primary" value="login" onClick={show}></input> */}
                    <input type="reset" className="btn btn-primary" value="cancel" style={{ "marginLeft": "10pt" }} onClick={cancel}></input>
                </div>

                <div hidden={status} >
                    <div>Id is {id}</div>
                    <div>Name is {name}</div>
                    <div>Salary is {salary}</div>
                </div>
            </div>
        </>
    )
}


