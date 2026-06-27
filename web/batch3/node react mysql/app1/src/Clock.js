import { Component } from "react";

class Clock extends Component{

    constructor(){
        super()
        this.state={
            clock:new Date().toLocaleTimeString()
        }
        // this.changeTime()
    }
    componentDidMount(){
        console.log('component did mount')
        this.changeTime();
    }
    componentWillUnmount(){
        console.log('component will  unmount')
    }
    componentDidUpdate(){
        console.log('component  did update')

    }


    render(){
        return(
            <>
              {this.state.clock}
            </>
        )
    }
    changeTime=()=>{
        setInterval(() => {
             this.setState({
                   clock:new Date().toLocaleTimeString()
             })
        },1000);
    }
}
export default Clock;
