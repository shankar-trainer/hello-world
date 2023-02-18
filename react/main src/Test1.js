import React, { Component } from 'react';
 
var p1=React.createElement('h1',null,"hi..."  )

class Test1 extends Component{

    render(){
        return(
        //     <div>
        // <h1> Test1 works </h1>
        // {p1}
        // </div>
        //React.createElement('h1',null,"hello to react..."  )
        React.createElement('h1',this.props,"hello to ..."+this.props.name)
        )
    }

}
export default Test1
