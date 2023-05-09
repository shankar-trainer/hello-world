import React, { Component } from 'react';

class Product extends Component {

    constructor(props) {
        super(props);
    }

    render() {
        return (
            <div>
                <p onClick={this.props.click}>
                    Product is<br></br>
                    Id is {this.props.prdId}<br></br>
                    Name   {this.props.prdName} <br></br>
                    Cost  {this.props.prdCost}<br></br>
                </p>
                <p>
                    {this.props.children}
                </p>
            </div>
        )
    }
}

export default Product