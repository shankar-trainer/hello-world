import { Component } from "react";
import Toggle from "./Toggle";

export default class Clock1 extends Component {
    constructor(props){
          super(props);
          this.state={
            date:new Date()
          }
    }
    render() {
        return (
            <>
                <h1>Clock Page</h1>
                <h2>
                    Date is {this.state.date.toLocaleDateString()}
                </h2>
                <h2>
                    Time is {this.state.date.toLocaleTimeString()}
                </h2>
                <Toggle></Toggle>
            </>

        )
    }
    tick(){
        this.setState({
            date:new Date()
        })
    }
    componentDidMount(){
        console.log('component Did Mount')
         this.timerID=setInterval(
            ()=>this.tick(),1000
         )
    }
    componentWillUnmount(){
        console.log('component Will  Unmount ')
        clearInterval(this.timerID)
    }
    

}