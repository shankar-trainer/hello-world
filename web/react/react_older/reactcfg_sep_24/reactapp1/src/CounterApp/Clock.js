import { Component } from "react";

class Clock extends Component{
    constructor(){
        super();
        this.state={
            clock:new Date().toLocaleTimeString()
        }
        this.myclock()
    }
    render(){
        return(
            <>
              <div className="container p-4 m-4 bg-danger text-light w-75 border border-light" 
              style={{"border-radius":"20pt","font-size":"20pt"}}>
                {this.state.clock}
              </div>
            </>
        )
    }
    myclock=()=>{
        setInterval(() => {
            this.setState(
                {clock:new  Date().toLocaleTimeString()})
        }, 1000)
      }
}
export default Clock;