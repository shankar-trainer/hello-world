import { Component } from "react";

export default class Product extends Component {
    constructor(props) {
        super(props);
    }
    render() {
        return (
            <div className="bg-dark text-light p-5">
            <h2>Product data </h2>
             <div>Product Id is {this.props.id}</div>
             <div>Product Name is {this.props.name}</div>
             <div>Product Cost is {this.props.cost}</div>
            </div>
        )
    }



}