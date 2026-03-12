import axios from "axios"
import { useEffect, useState } from "react"

export const GetAllEmployee = () => {
    const [employee, setAllEmployee] = useState([])

    useEffect(() => {
        axios.get("http://localhost:9090/employee").then(
            response => {
                setAllEmployee(response.data)
            }
        )
    }, [])

    return (
        <div className="container p-5 w-50 m-5 bg-light text-dark">
            <table className="table table-striped table-border"
            >
                <tr>
                    <th>id</th>
                    <th>name</th>
                    <th>salary</th>
                </tr>

                {
                    employee.map(a =>
                        <tr>
                            <td>{a.id}</td>
                            <td>{a.name}</td>
                            <td>{a.dob}</td>
                        </tr>
                    )
                }

            </table>


        </div>

    )

}