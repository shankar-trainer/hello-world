import { Component } from "react";

class Counter extends Component{

    constructor(props){
        super()
        this.state={
            c:1,
            name:'my counter app'
        }
        this.change_name=this.change_name.bind(this);
    }

    // change_name=()=>{
    change_name(){

        this.setState({
            name:'user counter app'
        })
    }
    increment=()=>{
        this.setState({
            c:this.state.c+1
        })
    }
    
    decrement=()=>{
        this.setState({
            c:this.state.c-1
        })
    }

    render(){
        return(
            <>
            <div className="container p-5 m-5 border border-warning w-50 bg-info">
              <h2> {this.state.name} Application</h2>
              
              <p>application color is{this.props.color} </p>
              
              <p>application size is{this.props.size} </p>

              <p>Count is {this.state.c}</p>
              <div>
                <button type="button" className="btn btn-success" onClick={this.increment}>Increment</button>
               
                <button type="button"
            className="btn btn-success"
            style={{'marginLeft':'5pt'}}
                onClick={this.decrement}>Decrement</button>

                 <button type="button"
            className="btn btn-success"
            style={{'marginLeft':'5pt'}}
                onClick={this.change_name}>Change Name</button>
              </div>
              </div>
            </>
        )
    }
}
export default Counter;

Counter.defaultProps={
 color:'yellow',
 size:'30pt'

}