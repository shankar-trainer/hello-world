import React, { Component } from 'react';


class EventPrg1 extends Component {
    constructor(){
        super();
        this.state={
            n1:5
        }
      //  this.clickIt=this.clickIt.bind(this);
    }

    render() {

        return (
            <form>
                <button onClick={this.clickIt}>Button1</button>
            <br></br>  number is {this.state.n1}
            
            </form>

        );
    }

    /*clickIt(){
      this.setState({
          n1:this.state.n1+1
      });
      //alert("no is "+this.state.n1)
   }*/

   clickIt=()=>{
    this.setState({
        n1:this.state.n1+1
    });
    //alert("no is "+this.state.n1)
 }

}




export default EventPrg1
