import React, { Component } from 'react';
import logo1 from '../src/image/animal1.jpg';
import logo2 from '../src/image/elephant2.jpg';

 function  getUrl() {
    return "http://www.google.com";
 }

class Form3 extends Component {
   constructor(){
       super();
   }

    render() {
        return (
            <div>         
                <a href={getUrl()}>
                    Google.com
                </a>
                <img src={logo1} alt="img1" width='150' height='200'/>
                <img src={logo2} alt="img2" width='150' height='200'/>
            </div>
        );
    }
}

export default Form3