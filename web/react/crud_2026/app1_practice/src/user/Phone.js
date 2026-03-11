import { Component } from "react";

class Phone extends Component {

    constructor() {
        super();
        this.state = {
            "id": 9898898,
            "model": "Nokia",
            "cost": 10000
        }
    }
    changeIt=()=>{
        this.setState({
             "id": 9898891,
            "model": "Samsung",
            "cost": 19000
        })
    }

    render() {
        return (
            <div className="container border border-danger p-5 w-100 ml-5 bg-success text-light"
                style={{ 'borderRadius': "30pt" }}
            >
                <h2>Phone Component</h2>
                <p>Phone id {this.state.id}</p>
                <p>Phone model {this.state.model}</p>
                <p>Phone cost {this.state.cost}</p>
                <ul>
                    <li>country is {this.props.country}</li>
                    <li>state is {this.props.state}</li>
                </ul>
                <button type="button" className="btn btn-primary" onClick={this.changeIt}>change phone</button>
            </div>
        )
    }

}

export default Phone;