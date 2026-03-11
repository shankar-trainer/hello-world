import axios from "axios"
import { Fragment, useEffect, useState } from "react"

export const AllEmployees1 = () => {
    const [employee, setAllEmployee] = useState([])
    const [error1, setError1] = useState(null)
    useEffect(() => {

        try {
            const response =  axios.get('http://localhost:7070/employee'); // This will trigger a 404
            //setData(response.data);
            setAllEmployee(response.data)  
        } catch (err) {
            if (err.response && err.response.status === 404) {
              setError1('Resource not found (404)');
            } else {
              setError1('An unexpected error occurred');
            }
          }
    
    }, [])
    return (
        <div className="container p-5 m-5 bg-success text-white">
          {
             console.log(JSON.stringify(error1))
          }
          {
             console.log(JSON.stringify(error1.message))
          }
          {
             console.log(error1.message)
          }

            {error1.length>0 && <p className="text-warn">Error is {error1.message}</p>} 

            {error1.length==0 && 

            <table className="table table-bordered table-striped">
                <tr>
                    <th>id</th>
                    <th>name</th>
                    <th>dob</th>
                </tr>
                {
                    employee.map(a=>
                        <tr>
                            <td>{a.id}</td>
                            <td>{a.name}</td>
                            <td>{a.dob}</td>
                        </tr>
                    )
                }
            </table>
             }
        </div>
    )
}