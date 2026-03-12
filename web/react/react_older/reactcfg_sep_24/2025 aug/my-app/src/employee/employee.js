// import React from "react";

import { Component } from "react";
import Address from "./address";
import Counter from "./Counter";

class Employee extends Component {
    constructor() {
        super();
        this.state = {
            "id": 10001,
            "name": "suman kumar",
            "age": 20
        }
    }
    render() {
        return (
            <>
                <div className="container p-5 bg-info m-5 border border-primary w-75">
                    <div style={{ "marginLeft": "100pt" ,"border":"solid 2pt","padding":"10pt"}}>
                        <h2>This is employee class </h2>
                        <div>id is {this.state.id}</div>
                        <div>name is {this.state.name}</div>
                        <div>age is {this.state.age}</div>
                        <div>
                            <button className="btn btn-primary" onClick={this.changeemp}>Change Employee</button>
                        </div>
                    </div>
                    <Address></Address>
                    <Counter></Counter>
                </div>
            </>
        )
    }
    changeemp=()=>{
        this.setState({
            "id": 10002,
            "name": "mayank agarwal",
            "age": 22
        })
    }
}
export default Employee;