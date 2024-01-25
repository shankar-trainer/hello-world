import React, { Component } from 'react'
import axios from 'axios';
import CustomerService from './services/CustomerService';


export class SearchCustomer3 extends Component {
    constructor(props) {
        super(props)

        this.state = {
            customer: {}
        }
    }
    componentDidMount() {
        this.hello()
    }
    async hello() {
        //   new CustomerService().getCustomerById(1)
        const result = await axios.get(`http://localhost:8080/customer/search/1`);

        result.then(res => {
            this.setState({ customer: res.data });
        }).catch(e => {
            console.log(e);
            console.log(e.response);
        })
    }

    render() {
        return (
            <div>
                <p>{this.state.customer.customerId}</p>
                <p>{this.state.customer.customerName}</p>
                <p>{this.state.customer.customerSalary}</p>
            </div>
        )
    }
}
