import { Component } from "react";

export default class Counter extends Component {
    constructor() {
        super()
        this.state = {
            "c1": 1,
            "c2": 1
        }
    }
    hello1=()=>{
        this.setState({
            "c1":this.state.c1+1
        })
    }
    hello2=()=>{
        this.setState({
            "c2":this.state.c2-1
        })
    }

    render() {
        return (
            <div className="border border-primary bg-primary text-info p-5 m-5 w-50">
                <h2> Counter Application</h2>

                <div>
                    <button onClick={this.hello1}> Increment </button>    {this.state.c1}
                </div>

                <div className="mt-2">
                    <button onClick={this.hello2}> Decrement </button>
                    {this.state.c2}
                </div>
            </div>

        )
    }

}