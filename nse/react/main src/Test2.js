import React, { Component } from 'react';
 
var p1=React.createElement('h1',null,"framework " )

class Test2 extends Component{

    render(){
        return(
            // <div>
            //  {p1}
            // </div>
            React.createElement('h1',this.props,"framework "+this.props.framework )
           )
    }
}
export default Test2
