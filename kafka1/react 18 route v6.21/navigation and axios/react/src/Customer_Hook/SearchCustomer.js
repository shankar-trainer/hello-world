import React, { useEffect, useState } from 'react';
import CustomerService from './services/CustomerService';

function SearchCustomer() {
    const [id, setId] = useState('');
    const [err_id, setErrorId] = useState('');
    const [err, setError] = useState('');
    const [customer, setCustomer] = useState([]);
    const [customer_found, setCustomerFound] = useState(false);

    useEffect(() => {
        
    })
    const findById = async () => {
        await new CustomerService().getCustomerById(id)
            .then(response => {
                setCustomer(response.data)
                setCustomerFound(true)
                console.log("found "+response.data)
            })
            .catch(e => {
                setError(e.response.data)
                console.log(e);
                console.log(e.response.data);
                console.log('error is '+e.response.data);
            })
    }
    return (
        <div className='container w-50'>
            <h1>Search Customer </h1>
            <div className="form-group" >
                <label>Enter Id</label>
                <input className="form-control" onChange={
                    (e) => {
                        setCustomerFound(false);
                        if (e.target.value == '')
                            setErrorId('id is blank')
                        //   else if (e.target.value.length < 2 || e.target.value.length > 5)
                        //     setErrorId('id must of min 2 digit or max 5 digit')
                        else {
                            setErrorId('')
                            setId(e.target.value)
                        }
                    }
                }></input>
                <div className="text-info">{err_id}</div>
            </div>
            <div>
                <button type="submit" onClick={findById}>Submit</button>
            </div>
            <div>
                {
                    customer_found &&
                    <div>
                        <h2>Customer Found with id {id} </h2>
                        <p>Id: {customer.customerId}</p>
                        <p>Name: {customer.customerName}</p>
                        <p>Salary: {customer.customerSalary}</p>
                    </div>
                }
            </div>
            {
                (!customer_found) &&
                <div>
                    <h2>Customer not  Found with id {id} </h2>
                    <p>Error is {err}</p>
                </div>
            }
        </div>
    )
}
export default SearchCustomer;