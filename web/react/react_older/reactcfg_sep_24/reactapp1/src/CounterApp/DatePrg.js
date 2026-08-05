import { Component } from "react";

class DatePrg extends Component{
    constructor(){
        super();
        this.state={
            date:new Date().toLocaleDateString()
        }
        this.mydate()
    }
    render(){
        return(
            <>
              <div className="container p-4 m-4 bg-warning text-muted w-75 border border-dark" 
              style={{"border-radius":"20pt","font-size":"20pt"}}>
                {this.state.date}
              </div>
            </>
        )
    }
    mydate=()=>{
        setInterval(() => {
            this.setState(
                {date:new Date().toLocaleDateString()})
        }, 1000)
      }
}
export default DatePrg;