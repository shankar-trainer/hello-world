import axios from "axios"
import { useEffect, useState } from "react"

export const Crud = () => {
    const [customer, setAllCustomer] = useState([])
    useEffect(() => {
        axios.get("http://localhost:9090/employee").then(result => {
            setAllCustomer(result.data)
        })
    }, [])
    return (
        <div className="container p-5 m-5 bg-success text-white">
            <table>
                <tr>
                    <th>id</th>
                    <th>name</th>
                    <th>dob</th>
                </tr>
                {
                    customer.map(a=>

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