import { Component } from "react";

export default class Clock extends Component {
    constructor(props) {
        super(props);
        this.state = {
            time: new Date().toLocaleTimeString()
        };
        this.changetime();
    }
    render() {
        return (
            <div>
              <b>{this.state.time}</b>
            </div>

        )
    }
    changetime(){
        setInterval(()=>{
                this.setState({time: new Date().toLocaleTimeString()})
            },1000
        )
    }
    
}