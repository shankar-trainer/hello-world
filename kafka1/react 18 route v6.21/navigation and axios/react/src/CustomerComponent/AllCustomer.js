import { Component } from "react";
import CustomerService from "./services/CustomerService";
export default class AllCustomer extends Component {

    constructor(props) {
        super(props);
       this.service=new CustomerService();
        this.state = {
            customer: []
        }
    }
    
    componentDidMount(){
       this.service.getAllCustomer().then((res)=>{
       //new CustomerService().getAllCustomer().then((res)=>{
        this.setState({customer:res.data})
       })
    }
    render(){
        return(
            <div className="container">
                <p>all customer</p>
                <table className="table table-striped table-bordered">
                    <tr>
                        <th>id</th>
                        <th>name</th>
                        <th>salary</th>
                    </tr>
                    
                {
                    this.state.customer.map(cust=>
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
}