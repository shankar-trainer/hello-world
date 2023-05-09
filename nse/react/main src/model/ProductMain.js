import React, { Component } from 'react';
import Product from './Product';

class ProductMain extends Component {

    constructor(props) {
        super(props);
        this.state = {
            product: [
                { prdId: 90004, prdName: 'react book' },
                { prdId: 90005, prdName: 'angular book' },
                { prdId: 90006, prdName: 'java book' },
            ]
        }
    }
    addProductCost = () => {
        this.setState(
            {
                product: [
                    { prdId: 90004, prdName: 'react book', prdCost: 700 },
                    { prdId: 90005, prdName: 'angular book', prdCost: 2300 },
                    { prdId: 90006, prdName: 'java book', prdCost: 1300 },
                ]
            }
        )
    }

    render() {
        return (
            <div className='ProductMain'>
                <button onClick={this.addProductCost}>
                    Update Product
              </button>
                <Product click={this.addProductCost}
                    prdId={this.state.product[0].prdId}
                    prdName={this.state.product[0].prdName}
                    prdCost={this.state.product[0].prdCost}
                />
                <Product click={this.addProductCost}
                    prdId={this.state.product[1].prdId}
                    prdName={this.state.product[1].prdName}
                    prdCost={this.state.product[1].prdCost}
                />
                <Product click={this.addProductCost}
                    prdId={this.state.product[2].prdId}
                    prdName={this.state.product[2].prdName}
                    prdCost={this.state.product[2].prdCost}
                />
            </div>
        )
    }
}

export default ProductMain
