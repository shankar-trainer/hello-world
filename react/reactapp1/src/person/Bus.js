import { Component } from "react";

class Bus extends Component {

    constructor(props) {
        super(props);
        this.state =
            { 'country': 'india' }
    }

    render() {
        return (
            <div className="border border-primary m-5 p-5">
                <p>country is {this.state.country}</p>
                <p>Bus no is {this.props.no}</p>
                <p>bus route is {this.props.route}</p>
            </div>
        )
    }
}
export default Bus;

Bus.defaultProps = {
    'no': 989898,
    'route': 'noida'
};