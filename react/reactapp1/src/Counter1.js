import React from "react";

class Counter1 extends React.Component {

    constructor(props) {
        super(props);
        this.state = {
            c1: 1,
            c2: 1
        }
    }

    increment = () => {
        this.setState(
            { c1: this.state.c1 + 1 }
        )
    }

    decrement = () => {
        this.setState(
            { c2: this.state.c2 - 1 }
        )
    }

    render() {
        return (
            <div className="border border-primary bg-info p-5 m-5 w-50">
                <div>
                    <button type="button" onClick={this.increment} className="btn btn-danger">Increment {this.state.c1}</button>
                </div>
                <div>
                    <button type="button"
                        className="btn btn-danger"
                        onClick={this.decrement} style={{marginTop:'5px'}}>Decrement {this.state.c2}</button>
                </div>
            </div>
        )
    }
}
export default Counter1;