import React, { Component } from 'react';
import logo from './logo.svg';
import ChildComponent  from './ChangeColor';
class ParentComponent extends Component {

    constructor(props) {
        super(props);
        this.state = {
            color: 'Select a color'
        }
    }

    changeColor=(newColor)=>{
        this.setState({
            color:newColor
        });
    }

    render() {
        const { color } = this.state;

        return (
            <div className="parent-component">

                <header className="header">
                    <img src={logo} className="react-logo"></img>
                    <h4>Parent Component </h4>
                    <p>{color}</p>
                </header>
                <ChildComponent changeColor={this.changeColor}></ChildComponent>
            </div>
        );
    }
}
export default ParentComponent