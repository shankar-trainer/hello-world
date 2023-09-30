import { Component } from "react";

export default class Clock extends Component{

    constructor(props){
        super(props);
        this.state={
            time:new Date().toLocaleTimeString()
        };
        this.clockChange()
    }

    clockChange=()=>{
      setInterval(()=>{
        this.setState({time:new Date().toLocaleTimeString()})
      },1000)
    }

    render(){
        return(
         <div>
            {this.state.time}
         </div>
        )
    }

}