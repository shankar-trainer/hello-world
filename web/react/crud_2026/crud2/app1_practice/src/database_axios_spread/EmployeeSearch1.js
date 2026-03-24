import axios from "axios"
import { useParams } from "react-router-dom"

const { useState, useEffect } = require("react")

export const EmployeeSearch1 = () => {
    //  function   EmployeeCrud(){
    const [employee, setEmployee] = useState([])
    const [loading, setLoading] = useState(true)
    const [error, setError] = useState(null)
    const [id, setId] = useState(0)
    const [msg, setMessage] = useState("");

    const [errors, setErrors] = useState({});
    const submit = (e) => {
        e.preventDefault();
        axios.get('http://localhost:2000/employee/' + id)
            .then(response => {
                const data = response.data;
                if (data && (data).length > 0) {
                setMessage("record found " + JSON.stringify(data));
                console.log(JSON.stringify(data));
                }
                else 
                {
                setMessage('not found ')
                }
                setLoading(false);
            })
            .catch(e => {
                setMessage('not found ')
                setError(e.message);
                setLoading(false);
            });
    }; 
    // if (loading) return <p>Loading</p>
    if (error) return <p>Error {error}</p>
    //}
    return (
        <div className="container">
            <form onSubmit={submit}>
                <div className="form-group">
                    <label>Enter ID</label>
                    <input
                        className="form-control"
                        onChange={(e) => {
                            const value = e.target.value;
                            setId(e.target.value)
                            setEmployee({ ...employee, id: value });

                            if (value === "") {
                                setErrors({ ...errors, id: "id is empty" });
                            }
                            else if (Number(value) <= 0) {
                                setErrors({ ...errors, id: "invalid id" });
                            }
                            else if (Number(value) < 10000 || Number(value) > 50000) {
                                setErrors({ ...errors, id: "ID must be between 10000 - 50000" });
                            }
                            else {
                                setErrors({ ...errors, id: "" });
                            }
                        }}
                    />
                    {errors.id && <span className="text-danger">{errors.id}</span>}
                    {msg && <>{msg}</>}
                    {error && <>{error}</>}

                </div>
                <div>
                    <button type="submit">search record</button>
                    <button type="reset">cancel record</button>
                </div>

            </form>
        </div>
    )
}