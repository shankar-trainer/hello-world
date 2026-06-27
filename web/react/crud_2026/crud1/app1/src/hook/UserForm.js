import { useState } from "react"

export const UserForm = () => {

    const [id, SetId] = useState(0);
    const [name, SetName] = useState("");
    const [salary, SetSalary] = useState(0);
    const [id_err, SetIdError] = useState("");
    const [name_err, SetNameError] = useState("");
    const [salary_err, SetSalaryError] = useState("");

    return (
        <div className="container bg-info p-5 m-5 w-50">
            <div className="form-group">
                <label>Enter Id</label>
                <input className="form-control" onChange={(e)=>{
                    SetId( e.target.value)
                    if(e.target.value<=0)
                        SetIdError('id is 0 or -ve')
                    else if(e.target.value<=5000 || e.target.value>50000)
                        SetIdError('id must be 5000 - 50000')
                    else if(isNaN(e.target.value))
                        SetIdError('id must be numeric')
                }} value={id}></input>
                <span className="text-warning">{id_err}</span>
            </div>

            <div className="form-group">
                <label>Enter Name</label>
                <input className="form-control" onChange={(e)=>{
                    var val=e.target.value;
                    SetName(val)
                    if(val=="")
                        SetNameError("name is empty")
                    else if(val.length<5 || val.length>15)
                        SetNameError("name length must beween 5 - 15 chars")
                }}></input>
                <span className="text-danger">{name_err}</span>
            </div>
            <div className="form-group">
                <label>Enter Salary</label>
                <input className="form-control"></input>
            </div>

            <div className="mt-2">
                <button type="submit" className="btn btn-primary">send</button>
                <button type="reset" className="btn btn-primary"
                    style={{ 'marginLeft': "10pt" }}
                >cancel</button>
            </div>
        </div>
    )
}