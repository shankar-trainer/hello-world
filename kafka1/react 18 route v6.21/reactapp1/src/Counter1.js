import { Component } from "react";

export class Counter1 extends Component{

    constructor(props){
         super(props);
         this.state={
            counter:1,
         }
         this.increment=this.increment.bind(this);
    }
    
    decrement=()=>{
        this.setState({
            counter:this.state.counter-1
        })
    }

    increment(){
        this.setState({
            counter:this.state.counter+1
        })
    }

    render(){
        return(
            <div className="container border border-primary p-5 m-5 w-50">
                     <div>
                     Count is {this.state.counter}
                     </div>
                     <div>
                        <button onClick={this.increment}> Increment</button>
                     </div>
                     <div>
                        <button onClick={this.decrement}> Decrement</button>
                     </div>
            </div>
        )
    }

}