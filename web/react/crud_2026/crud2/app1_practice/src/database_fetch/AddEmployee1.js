import axios from "axios";
import { useState } from "react";

export const AddEmployee1 = () => {
    const [id, setId] = useState(0);
    const [name, setName] = useState("");
    const [salary, setSalary] = useState(0);
    const [msg, setMessage] = useState("");

    const submit = async (e) => {
        e.preventDefault();

        try {
            const response = await fetch("http://localhost:2000/employee", {
                method: "POST",
                headers: {
                    'Content-Type': 'application/json', // Indicate the content type
                },
                // body: JSON.stringify(postData),
                body: JSON.stringify( { id, name, salary }),
            })
            if (!response.ok) {
                // Handle HTTP errors (status codes outside 2xx range)
                throw new Error(`HTTP error! status: ${response.status}`);
            }

            const data = await response.json(); // Parse the JSON response
            
           setMessage("record  added" + JSON.stringify(data));
        }

        catch (e) {
            //setError(err.message);
            console.error('Error posting record:', e);
        }
       }
    return (
        <div className="container">
            <form onSubmit={submit}>
                <div className="form-group">
                    <label>enter id</label>
                    <input className="form-control" onChange={e => {
                        setId(e.target.value)
                        if (e.target.value == "")
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