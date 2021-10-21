import React, { Component } from 'react';

class App4 extends Component {
    render() {
        return (
            <div>
          <h1>App4 Class</h1>
          <Animal type="animal"></Animal>
           </div>
            )
    }
}
class Animal extends Component{
     constructor(props){
         super(props);
         this.state={
             color:"white",
             count:0
        }
        this.changeType=this.changeType.bind(this)
     }

    render(){
        return(
        <div>
        <h2>Animal class</h2>
         color is {this.state.color} 
         <br></br>
         animal type{this.props.type}
         <br></br>
         Count is {this.state.count}
         <br></br>
         <button type='button' onClick={this.changeType}> change type</button>
    <br></br>
    <button type='button' onClick={this.counteMe}> change type</button>
        </div>       
        )
    }
    changeType(){
        this.setState({color:"black"})
    }
    counteMe=()=>{
      this.setState(
             {count:this.state.count+1}
         
      );
    }
}

class Bird extends Component{

}

export default App4;
