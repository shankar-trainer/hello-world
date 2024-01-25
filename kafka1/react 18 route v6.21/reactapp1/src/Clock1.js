import { Component } from "react";

export default class Clock1 extends Component{
    constructor(props){
        super(props);
        this.state={
            time:new Date().toLocaleTimeString()
        }
    }
    componentDidMount(){
            setInterval(()=>{
               this.setState({
                   time:new Date().toLocaleTimeString()
               })
            })
    }
    render(){
        return(
            <>
             Time is {this.state.time}
            </>
        )
    }
}