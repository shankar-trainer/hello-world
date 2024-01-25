import { useEffect, useState } from "react";
import CustomerService from "./services/CustomerService";
const SearchCustomer1 = () => {
    const [customer, getAllCustomer] = useState([]);

    useEffect(() => {
        new CustomerService().getCustomerById(1)
            .then(response => {
                getAllCustomer(response.data)
            })
            .catch(e => {
                console.log(e);
                console.log(e.response);
            })
    }, [])

    return (
        <div>
            <h1>search customer</h1>
            <table className="table table-striped table-bordered">
                <tr>
                    <th>id</th>
                    <th>name</th>
                    <th>salary</th>
                </tr>

                <tr>
                    <td>{customer.customerId}</td>
                    <td>{customer.customerName}</td>
                    <td>{customer.customerSalary}</td>
                </tr>
            </table>
        </div>
    )
}
export default SearchCustomer1;