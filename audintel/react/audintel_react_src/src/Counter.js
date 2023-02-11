import React from "react"
import 'bootstrap/dist/css/bootstrap.css'
class Counter extends React.Component{
 constructor(props){
    super(props);
   this.state={
    count1:0,
    count2:0
   }
 }  
 increment=()=>{
     this.setState({
        count1:this.state.count1+1
     })
 }
 decrement=()=>{
    this.setState({
        count2:this.state.count2-1
     })
 }
 render(){
    return(
        <div className="bg-primary text-white text-center p-2 " style={{'margin':200, 'width':'40%'}} >
             <br></br> {this.state.count1} <br></br>
             <button class="btn btn-warning" onClick={this.increment}> Increment it  </button>
             <br></br><br></br>
             {this.state.count2} <br></br>
             <button  class="btn btn-warning" onClick={this.decrement}> Decrement it </button>    
        </div>
    )
 }
}
export default Counter;