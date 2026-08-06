import { useState } from "react";

const UserForm = () => {
    const [id, setId] = useState(0);
    const [name, setName] = useState('');
    const [salary, setSalary] = useState(0);
    const [err_id, setErr_Id] = useState('');
    const [err_name, setErr_Name] = useState('');
    const [err_salary, setErr_Salary] = useState(0);

    return (
        <div className="container m-5 p-5 bg-info w-50">
            <div className="md-3 row">
                <label className="col-4">enter id</label>
                <input placeholder="enter id" className="col-4" name={id}
                    onChange={(e) => {
                        setId(e.target.value)
                        if (e.target.value == '') {
                            setErr_Id('id is blank')
                        }
                    }}
                ></input>
                <span className="text-danger col-4">{err_id}</span>
            </div>

            <div className="md-3 row">
                <label className="col-4">enter name</label>
                <input placeholder="enter name" className="col-4" name={name}
                    onChange={e => {
                        setName(e.target.value)
                        if (e.target.value == "")
                            setErr_Name('name is blank')
                    }}
                ></input>
                <span className="text-danger col-4">{err_name}</span>
            </div>
            <div className="md-3 row">
                <label className="col-4">enter salary</label>
                <input placeholder="enter salary" className="col-4" name={salary}
                    onChange={(e) => {
                        setSalary(e.target.value)
                        if (e.target.value == '')
                            setErr_Salary('salary is blank')

                        else if (e.target.value <= 0)
                            setErr_Salary('salary is zero or negative')
                    }}
                ></input>
                <span className="text-danger col-4">{err_salary}</span>

            </div>
        </div>
    )

}
export default UserForm;
