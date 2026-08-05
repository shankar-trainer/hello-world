import { Component } from "react";

export default class Counter extends Component {

    constructor() {
        super()
        this.state = {
            "c1": 1
        }
    }
    render() {
        return (
            <div class="border border-dark p-5 w-25 m-5">
                <h2>Counter Application</h2>
                <div>Count is {this.state.c1}</div>
                <div>
                    <button className="btn btn-warning" onClick={this.increment}
                     style={{"marginBottom":"5pt"}}
                    > increment</button>
                </div>

                <div>
                    <button className="btn btn-warning" onClick={this.decrement}> decrement</button>
                </div>

            </div>
        )
    }
    increment=()=>{
       this.setState({
        c1:this.state.c1+1
       }
       )
    }
    decrement=()=>{
       this.setState({
        c1:this.state.c1-1
       }
       )
    }
    

}