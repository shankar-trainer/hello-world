import { useEffect, useState } from "react";
import CustomerService from "./services/CustomerService";
import { useNavigate } from "react-router-dom";
const ShowAllCustomer = () => {
    const [customer, getAllCustomer] = useState([]);
    const navigate = useNavigate();

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
        <div className="container bg-secondary text-warning p-5  w-50 mt-5" style={{ 'marginLeft': '200 pt' }}>
            <h1>all customer</h1>
            <table className="table table-striped table-bordered" >
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
            <button type="button" className="btn btn-primary" onClick={(a) =>
                navigate('/searchbyid')
            }>Search By Id</button>
        </div>
    )
}
export default ShowAllCustomer;