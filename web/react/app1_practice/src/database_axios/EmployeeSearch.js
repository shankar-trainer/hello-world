import axios from "axios"
import { useParams } from "react-router-dom"

const { useState, useEffect } = require("react")

export const EmployeeSearch = () => {
  //  function   EmployeeCrud(){
  const [employee, setEmployee] = useState([])
  const [loading, setLoading] = useState(true)
  const [error, setError] = useState(null)
  const [name, setName] = useState("")
  const [id, setId] = useState(0)
  const [salary, setSalary] = useState("")
  const [msg, setMessage] = useState("");


  // const { id } = useParams();

  const submit = (e) => {
    e.preventDefault();
    axios.get('http://localhost:2000/employee/' + id)
      .then(response => {
        const data = response.data;
        setName(data.name);
        setSalary(data.salary);
        setMessage("record found " + JSON.stringify(data));
        setLoading(false);
      })
      .catch(e => {
        setError(e.message);
        setLoading(false);
      });
  }; // Removed the trailing comma and [id]

  // if (loading) return <p>Loading</p>
  if (error) return <p>Error {error}</p>
  //}
  return (
    <div className="container">
      <form onSubmit={submit}>
        <div className="form-group">
          <label>enter id</label>
          <input className="form-control" onChange={e => setId(e.target.value)}></input>
        </div>
        <div>
          <button type="submit">search record</button>
          <button type="reset">cancel record</button>
        </div>
        
        {msg && <div className="alert">{msg}</div>}

      </form>
    </div>
  )
}