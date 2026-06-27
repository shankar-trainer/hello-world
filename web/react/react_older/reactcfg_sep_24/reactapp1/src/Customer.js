import { Component } from "react";
import img1 from './image/customer.jfif';

class Customer extends Component {
    constructor(props) {
        super(props);
        this.state = {
            id: 100001,
            name: "suresh sharma",
            salary: 34000
        }
    }
    render() {
        return (
            <>
                <div className="container p-5 m-5 w-50 border border-primary bg-success text-light">
                    <h2>Customer Class </h2>
                    <div>
                        <img src={img1} width={200} height={150} border={10}></img>
                    </div>
                    <div>Id is {this.state.id}</div>
                    <div>Name is {this.state.name}</div>
                    <div>Salary is {this.state.salary}</div>
                    <div>Country is  {this.props.country}</div>
                    <div className="border border-warning p-2 m-2">
                        <h2>Address</h2>
                        <div>Id : {this.props.myaddr.addr_id}</div>
                        <div>Location : {this.props.myaddr.location}</div>
                        <div>City : {this.props.myaddr.city}</div>
                        <div>State : {this.props.myaddr.state}</div>
                    </div>
                    <div>
                    <button onClick={this.changevalue} className="btn btn-info mt-3">change value </button>
                </div>
                </div>
            </>
        )
    }
    changevalue = () => {
        this.setState(
            {
                id: 8778878,
                name: "sarath kumar",
                salary: 67000
            }
        )
    }
}
export default Customer;