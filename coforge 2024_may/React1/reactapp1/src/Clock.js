import { Component } from "react";

export class Clock extends Component {

    constructor() {
        super();
        this.state = {
            date: new Date().toDateString(),
            clock: new Date().toLocaleTimeString()
        }
//        this.myclock()
    }
    // myclock=()=>{
    //     setInterval(()=>
    //           {
    //             this.setState({clock:new Date().toLocaleTimeString()})
    //           },1000
    //     )
    // }

    render() {
        return (
            <div>
                <h2>Date and clock </h2>
                <div>Date is {this.state.date}</div>
                <div>Time is {this.state.clock}</div>
            </div>
        )
    }


    componentDidMount(){
        setInterval(()=>
            {
              this.setState({clock:new Date().toLocaleTimeString()})
            },1000
      )
        console.log("component did mount called ")
    }

    componentWillUnmount(){
        console.log("component Will Unmount called ")
    }



}