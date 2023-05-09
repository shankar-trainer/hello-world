import React from 'react';

class ChildComponent extends React.Component {
    constructor(props) {
        super(props);
    }
      handleClick = (e) => {
         this.props.changeColor(e.target.value)
        };

    render() {
        return (
            <div className="child-component">
                <h3>Child Component </h3>
                <button value="Red" onClick={this.handleClick}>Red</button>
                <button value="Blue" onClick={this.handleClick}>Blue</button>
                <button value="White" onClick={this.handleClick}>White</button>
            </div>
        );
    };
}

export default  ChildComponent
