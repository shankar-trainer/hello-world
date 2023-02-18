import React, { Component } from 'react';

var Hello=React.createElement('h1', null, 'hello ...')

class HelloWorld extends Component {

    render() {
        return (
            //React.createElement('h1', null, 'hello ')
              <div>
               {Hello}
              </div>
              );
        }
}


export default HelloWorld