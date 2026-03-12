import { Component } from "react";
import DatePrg from "./DatePrg";
import Clock from "./Clock";

class Counter1 extends Component {
    constructor(props) {
        super();
        this.state = {
            c: 1,
            c2: 10,
            c3: 10
        }
        this.decrement1=this.decrement1.bind(this)
    }
    render() {
        return (
            <>
             <div style={{'height':'40pt'}}>
                <span style={{'float':'left'}}>
                    <DatePrg></DatePrg>
                </span>
                
                <span style={{'float':'right'}}>
                    <Clock></Clock>
                </span>

                </div>     
            
                <div className="container p-5  bg-info text-success w-100"
                style={{marginTop:50}}
                >
                      <h1>Counter Application One </h1>
                    <div>Count is {this.state.c}</div>
                    <div><button onClick={this.increment} className="btn btn-primary mt-2">Increment</button>
                        <button onClick={this.decrement} className="btn btn-primary mt-2"
                            style={{ 'marginLeft': '10pt' }}>Decrement</button></div>
                </div>
                <div className="container p-5 m-5 bg-success text-dark w-50">
                    <h1>Counter Application Two </h1>
                    <div>Count is {this.state.c2}</div>
                    <div><button onClick={this.increment1} className="btn btn-primary mt-2">Increment : {this.state.c2}</button>

                        <div>Count is {this.state.c3}</div>

                        <button onClick={this.decrement1} className="btn btn-primary mt-2"
                            style={{ 'marginLeft': '0pt' }}>Decrement : {this.state.c3}</button></div>
                </div>
            </>
        )
    }
    increment = () => {
        this.setState({
            c: this.state.c + 1
        })
    }
    decrement = () => {
        this.setState({
            c: this.state.c - 1
        })
    }
    increment1 = () => {
        this.setState({
            c2: this.state.c2 + 10
        })
    }
    //decrement1 = () => {
    decrement1 ()  {
        this.setState({
            c3: this.state.c3 - 10
        })
    }
}

export default Counter1;