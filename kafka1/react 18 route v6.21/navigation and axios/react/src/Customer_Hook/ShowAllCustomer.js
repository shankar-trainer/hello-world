import { useEffect, useState } from "react";
import CustomerService from "./services/CustomerService";
const ShowAllCustomer = () => {
    const [customer, getAllCustomer] = useState([]);

    useEffect(() => {
        new CustomerService().getAllCustomer()
            .then(response => {
                getAllCustomer(response.data)
            })
            .catch(e => {
                console.log(e);
            })
    }, [])

    return (
        <div>
            <h1>all customer</h1>
            <table className="table table-striped table-bordered">
                <tr>
                    <th>id</th>
                    <th>name</th>
                    <th>salary</th>
                </tr>
                {
                    customer.map(cust =>
                        <tr>
                            <td>{cust.customerId}</td>
                            <td>{cust.customerName}</td>
                            <td>{cust.customerSalary}</td>
                        </tr>
                    )
                }
            </table>
        </div>
    )
}
export default ShowAllCustomer;