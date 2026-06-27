import { Component } from "react";

class Counter extends Component {
    constructor() {
        super();
        this.state = {
            "c": 1
        }
    }
    increment = () => {
        this.setState({
            c: this.state.c + 1
        })
    }
    decrement = () => {
        this.setState({
            c: this.state.c -1 
        })
    }

    render() {
        return (
            <div className="container bg-info p-5">
                <div className="row">
                
                <div className="col-sm-4">
                    Count is {this.state.c}
                </div>
                
                <div  className="col-sm-4">
                    <button type="button" className="btn btn-primary" 
                    onClick={this.increment}>increment</button>
                </div>
                <div  className="col-sm-4">
                    <button type="button" 
                    className="btn btn-primary"
                    onClick={this.decrement}>decrement</button>
                </div>
            </div>
            </div>
        )
    }
}

export default Counter;