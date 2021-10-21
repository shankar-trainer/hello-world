import React, {Component} from 'react';

class Student1 extends Component{
  constructor(props){
    super(props);
  }

  render(){
    return(
      <div>
              <p onClick={this.props.click}> Hi I am {this.props.name} and my roll: {this.props.roll}, email: {this.props.email}</p>
              <p> {this.props.children}</p>
      </div>
    )
  }
}


export default Student1
