import { Component } from "react";
import Clock from "./clock";


export default class Counter extends Component {

    constructor(props) {
        super(props);
        this.increment = this.increment.bind(this);
        this.state = {
            count1: 1,
            count2:1
        }
    }

    increment() {
        this.setState({
            count1: this.state.count1 + 1
        })
    }
        decrement=()=> {
            this.setState({
                count2: this.state.count2 - 1
            })
    }


    render() {
        return (
            <div className="p-3 bg-dark text-light border border-white w-75 m-auto mt-5">
                <Clock></Clock>
                <h1>Counter example</h1>
                
                <button className='btn btn-primary' type="button" onClick={this.increment}>Increment</button>
                <span style={{marginLeft:10}}> : </span><span style={{marginLeft:30}}>    {this.state.count1} </span>
                <br></br>
                <br></br>
                <button  className='btn btn-primary'  type="button" onClick={this.decrement}>Decrement</button>
                <span style={{marginLeft:10}}> : </span><span style={{marginLeft:30}}> {this.state.count2}</span>
            </div>
        )
    }

}