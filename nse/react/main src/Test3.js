import React, {Component} from 'react';
 


class Welcome extends Component{


  render(){
    //return (React.createElement('h1',null,'welcome to my application '))
    //return (React.createElement('h1',this.props,'welcome to '+this.props.country))
     return <h1>Welcome to {this.props.country}</h1>  
  }
}
Welcome.defaultProps={

    country:"india"
}

export default Welcome

