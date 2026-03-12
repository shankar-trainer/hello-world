import React, { useEffect, useState } from "react";
import axios from "axios";

const AddEmployee = () => {

    const [employee, setEmployee] = useState({});
    const [employee1, setEmployee1] = useState({});
    const [msg, setMessage] = useState('');

    const handleForm = (e) => {
        console.log(employee);
        sendDataToPostAPI(employee);
        e.preventDefault();
    };

    const sendDataToPostAPI = (data) => {
        axios.post('http://localhost:7070/employee', data).then(
            (response) => {
                //setMessage("Record Added id "+response.data.id+" name  "+response.data.name+" dob "+response.data.dob)
                  setMessage("Record Added")
                  setEmployee1(response.data)
                console.log(JSON.stringify(response))
                console.log(response.data)
                console.log(employee1)
            },
            (error) => {
                <p>Some error {error} </p>

            }
        );
    };

    useEffect(() => {
        document.title = "Add Employee";
    }, []);

    return (
        <form className="bg-info p-5 m-5 w-75 form-group" onSubmit={handleForm}>
            <div>
                <label htmlFor="name">Employee Name</label>
                <input className="form-control"
                    onChange={(e) => {
                        setEmployee({ ...employee, name: e.target.value })
                    }}
                />
            </div>
            <div>
                <label>DOB</label>
                <input className="form-control" type="date"
                    onChange={(e) => {
                        setEmployee({ ...employee, dob: e.target.value })
                    }}
                />
            </div>
            <div>
                      {
                     msg.trim() && <div className="border border-info p-2 m-2  bg-success w-50">
                      <p className="mt-3">{msg} </p>
                      <p>{employee1.id} {employee1.name}{employee1.dob}</p>
                      </div>
                      }
            </div>

            <div>
                <button type="submit" style={{ marginRight: 5 }} className="btn btn-primary">Submit</button>
                <button type="reset" onClick={() => { setEmployee({ name: "", dob: "" }) }} style={{ marginLeft: 5 }} className="btn btn-primary">Reset</button>
            </div>
        </form>
    );
};

export default AddEmployee;