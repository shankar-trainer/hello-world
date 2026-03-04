import { Component } from "react";

class Date1 extends Component{

    constructor(){
        super()
        this.state={
            date:new Date().toLocaleDateString()
        }
        this.changeDate()
    }
    render(){
        return(
            <>
              {this.state.date}
            </>
        )
    }
    changeDate=()=>{
        setInterval(() => {
             this.setState({
                   date1:new Date().toLocaleDateString()
             })
        },1000);
    }
}
export default Date1;
