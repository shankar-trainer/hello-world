import axios from "axios";
import { useState } from "react";

export const EmployeeAdd = () => {
    const [id, setId] = useState(0);
    const [name, setName] = useState("");
    const [salary, setSalary] = useState(0);
    const [msg, setMessage] = useState("");

    const submit = (e) => {
        e.preventDefault();

        axios.post("http://localhost:2000/employee", { id, name, salary })
            .then(response => {
                const data = response.data;
                setMessage("record  added" + JSON.stringify(data));
            })
    }
    return (
        <div className="container">
            <form onSubmit={submit}>
                <div className="form-group">
                    <label>enter id</label>
                    <input className="form-control" onChange={e =>{ setId(e.target.value)
                              if(e.target.value=="")
                                alert("id is blank")
                            }
                    }></input>
                </div>
                <div className="form-group">
                    <label>enter name</label>
                    <input className="form-control" onChange={e => setName(e.target.value)}></input>
                </div>
                <div className="form-group">
                    <label>enter salary</label>
                    <input className="form-control" onChange={e => setSalary(e.target.value)}></input>
                </div>
                <div>
                    <button type="submit">add record</button>
                    <button type="reset">cancel record</button>
                </div>

            </form>
            {msg}
        </div>
    )
}