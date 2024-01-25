import React, { useEffect, useState } from 'react';
import CustomerService from './services/CustomerService';
import { useNavigate } from 'react-router-dom';

function SearchCustomer() {
    const [id, setId] = useState('');
    const [err_id, setErrorId] = useState('');
    const [err, setError] = useState('');
    const [customer, setCustomer] = useState([]);
    const [customer_found, setCustomerFound] = useState(false);
    const [customer_hidden1, setCustomerHidden1] = useState(true);
    const [customer_hidden2, setCustomerHidden2] = useState(true);

    const navigate = useNavigate();

    useEffect(() => {

    })
    //const findById = async () => {
    const findById =() => {
        //await 
        new CustomerService().getCustomerById(id)
            .then(response => {
                setCustomer(response.data)
                setCustomerFound(true)
                console.log("found " + response.data)
                setCustomerHidden1(false);
                setCustomerHidden2(true);
            })
            .catch(e => {
                setError(e.response.data)
                setCustomerHidden2(false);
                setCustomerHidden1(true);
            })
    }
    return (
        <div className='container'>
            <div className='bg-info p-5 m-5 w-75' style={{ 'border-radius': '20pt' }}>
                <h1>Search Customer </h1>
                <div className="form-group" >
                    <label>Enter Id</label>
                    <input className="form-control mt-2" onChange={
                        (e) => {
                            setCustomerFound(false);
                            setCustomerHidden1(true);
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
                    <div className="text-danger mt-2">{err_id}</div>
                </div>
                <div>
                    <button type="submit" className='mt-2 btn btn-primary' onClick={findById}>Submit</button>
                    <button type="button" className='mt-2 btn btn-primary' style={{'marginLeft':'5px'}} onClick={(a) =>
                        navigate('/allcustomer/')
                    }>ShowAll</button>
                </div>
                
            </div>
            <div hidden={customer_hidden1} className='bg-warning p-5 m-5 w-75' style={{ 'border-radius': '20pt' }}>
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
            <div hidden={customer_hidden2} className='bg-danger p-5 m-5 w-75' style={{ 'border-radius': '20pt' }}>
                {
                    (!customer_found) &&
                    <div>
                        <p></p>
                        <p>Customer not  Found with id {id} </p>
                        <p>Error is {err}</p>
                    </div>
                }
            </div>
        </div>
    )
}
export default SearchCustomer;