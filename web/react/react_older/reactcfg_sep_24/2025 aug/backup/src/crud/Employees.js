import axios from "axios"
import { Fragment, useEffect, useState } from "react"

export const AllEmployees = () => {
    const [employee, setAllEmployee] = useState([])

    useEffect(() => {
        axios.get("http://localhost:7070/employee").then(
            response => {
                setAllEmployee(response.data)
            }
        )
    }, [])
    return (
        <div className="container p-5 w-50 m-5 bg-light text-dark">
            <table className="table border border-primary bg-info p-5 w-100 m-5 table-bordered table-striped">
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