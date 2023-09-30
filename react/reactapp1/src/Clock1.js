import { Component } from "react";

export default class Clock1 extends Component{

    constructor(props){
        super(props);
        this.state={
            time:new Date().toLocaleTimeString(),
        };
    }

    render(){
        return(
         <div>
            {this.state.time}
         </div>
        )
    }


    componentDidMount(){
      console.log('component did mount')
      this.timerID= setInterval(()=>{
        this.setState({time:new Date().toLocaleTimeString()})
      },1000)
    }
    
    componentDidCatch(){
      
    }
    componentWillUnmount(){
      console.log('component will unmount')
      clearInterval(this.timerID);
    }
}