import { useEffect, useState } from "react";
import { AllBook } from "./AllBook";
import axios from "axios";

export const AllBook1 = () => {
    const [error, setError] = useState(null)
    const [loading, setLoading] = useState(true)
    const [employee, setEmployee] = useState([])

    useEffect(() => {
        axios.get("http://localhost:8082/book").then(response => {
            setEmployee(response.data)
            setLoading(false)
        }).catch(error => {
            setError(error.message)
            setLoading(false)
        }
        );
    }, [])
    if (loading) return <p>Loading</p>
    if (error) return <p>{error.message}</p>

    return (
        <div>
            <table>
                <tr><th>isbn</th><th>name</th><th>publish</th><th>cost</th></tr>
                {employee && employee.map(b => (
                    <tr key={b.isbn}>
                        <td>{b.isbn}</td>
                        <td>{b.name}</td>
                        <td>{b.publishDate}</td>
                        <td>{b.cost}</td>
                    </tr>
                ))}
            </table>
        </div>
    )
}