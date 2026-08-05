import { Component } from "react";

class Address extends Component {
    constructor() {
        super()
        this.state = {
            "addr_id": "add100001",
            "city": "new delhi",
            "state": "delhi",
        }
    }

    render() {
        return (
            <div className="bg-primary text-info pt-5 w-50 border border-secondary"
                style={{ "marginLeft": "100pt", "marginTop": "10pt", "padding": "20pt", "border-radius": "40pt" }} >
                this is address class
                <div>id {this.state.addr_id}</div>
                <div>city {this.state.city}</div>
                <div>state{this.state.state}</div>

                <div>
                    <button className="btn btn-light" onClick={this.changeAddress}>Change Address</button>
                </div>
            </div>
        )
    }

    changeAddress=()=>{
        this.setState({
            "addr_id": "add100002",
            "city": "cuttak",
            "state": "odisha",
        })
    }
}
export default Address;