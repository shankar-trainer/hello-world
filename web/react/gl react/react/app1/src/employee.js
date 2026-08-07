import { Component } from "react";

class Employee extends Component {
    constructor() {
        super();
        this.state = {
            "id": 10001,
            "name": "ram kumar",
            "salary": 20000
        }
    }
    change = () => {
        this.setState({
            "id": 10009,
            "name": "shyam kumar",
            "salary": 80000
        })
    }
    render() {
        return (
            <div className="container">
                <h3>Employee Component</h3>
                <div className="border border-primary w-75 m-5 p-2 bg-secondary text-warning">
                    <div>id is {this.state.id}</div>
                    <div>name is {this.state.name}</div>
                    <div>salary is {this.state.salary}</div>
                    <div>state is {this.props.state}</div>
                    <div>country is {this.props.country}</div>
                </div>
                <button type="button" onClick={this.change}>change employee </button>
                <h3>Car details </h3>
                <table className="table table-bordered bg-warning">
                    <tr><th>Reg No</th>
                        <th>Reg No</th>
                        <th>Model</th>
                        <th>Cost</th>
                    </tr>
                    {
                        this.props.car.map(c => 
                            <tr>
                                <td>{c.carReg}</td>
                                <td>{c.model}</td>
                                <td>{c.cost}</td>
                            </tr>
                        )
                    }
                </table>

            </div>
        )
    }
}

export default Employee;