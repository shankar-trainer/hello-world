import { Component } from "react";

class Clock extends Component{
    constructor(props){
           super(props);
           this.state={
              time:new Date().toLocaleTimeString()
           };
            this.changeTime();
        }
           render(){
            return(
                <div className="bg-primary text-light" style={{'width':'20%','text-align':'center','float':'right'}}>
                  {this.state.time}
                </div>
            )
           }
           changeTime(){
            setInterval(()=>{
                this.setState({time:new Date().toLocaleTimeString()})
            },
            1000)
           }         
    }
export default Clock;