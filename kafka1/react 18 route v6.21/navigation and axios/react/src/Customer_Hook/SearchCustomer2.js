import { useEffect, useState } from "react";
import CustomerService from "./services/CustomerService";
const SearchCustomer2= () => {
    const [customer, getAllCustomer] = useState([]);
    const [customer1, getAllCustomer1] = useState([]);
    const [customer2, getAllCustomer2] = useState([]);

    useEffect(() => {
                getAllCustomer(customerdata)
                getAllCustomer1(customerdata1)
                getAllCustomer2(customerdata[0])
            })
    return (
        <div>
            <h1>all customer</h1>
            <table className="table table-striped table-bordered">
                <tr>
                    <th>id</th>
                    <th>name</th>
                </tr>
                {
                    customer.map(cust =>
                        <tr>
                            <td>{cust.id}</td>
                            <td>{cust.name}</td>
                        </tr>
                    )
                }

            </table>
            <h1>single customer</h1>
            <table className="table table-striped table-bordered">
                <tr>
                    <th>id</th>
                    <th>name</th>
                </tr>
                        <tr>
                            <td>{customer1.id}</td>
                            <td>{customer1.name}</td>
                        </tr>
            </table>
            
 
            <h1>single customer</h1>
            <table className="table table-striped table-bordered">
                <tr>
                    <th>id</th>
                    <th>name</th>
                </tr>
                        <tr>
                            <td>{customer2.id}</td>
                            <td>{customer2.name}</td>
                        </tr>
            </table>
        </div>
    )
}
const customerdata=[
    { 'id':10001,'name':'mohan'},
    { 'id':10002,'name':'aman'},
    { 'id':10003,'name':'vimal'},
    { 'id':10004,'name':'suman'},
]
const customerdata1=
    { 'id':90001,'name':'vimal'};

export default SearchCustomer2;