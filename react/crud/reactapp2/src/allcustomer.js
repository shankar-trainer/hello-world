import axios from "axios"
import { useEffect, useState } from "react"

export const Allcustomer = () => {
    const [customer, setAllCustomer] = useState([])
    useEffect(() => {
        axios.get("http://localhost:6060/customer").then(result => {
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
                            <td>{a.customerId}</td>
                            <td>{a.customerName}</td>
                            <td>{a.customerDob}</td>
                        </tr>
                    )
                }

            </table>
        </div>
    )

}