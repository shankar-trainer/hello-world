import { Component } from "react";

class Customer extends Component {
    constructor(props) {
        super(props);
        this.state = {
            "id": 10001,
            "name": "amit kumar",
            "age": 20,
        }
    }
    customerChange = () => {
        this.setState(
            {
                "id": 10009,
                "name": "sumit kumar",
                "age": 25,
            }
        )
    }
    render() {
        return (
            <div className="container p-5 w-50 m-5 border border-info bg-dark text-light"
                style={{ "textAlign": "left" }} >
                <h1>Customer Component</h1>
                <div>
                    Id is {this.state.id}
                </div>
                <div>
                    Name is {this.state.name}
                </div>
                <div>
                    Age is {this.state.age}
                </div>
                <div>
                 <div>
                     Country  
                    name {this.props.country1.name}
                    </div>
                    <div>
                    Country  
                    isd {this.props.country1.isd}
                    </div>
                </div>
                <div>
                    <h3>Address</h3>
                    {/* {this.props.address} */}
                    {
                        this.props.address[0].addr_id
                    }
                    {
                        this.props.address[0].location
                    }

                    <table>
                             {
                            this.props.address.map(
                                a => 
                                    <tr>
                                        <td>
                                            {a.addr_id}
                                        </td>
                                        <td>
                                            {a.location}
                                        </td>
                                        <td>
                                            {a.city}
                                        </td>
                                    </tr>
                                
                            )
                        } 
                    </table> 
                </div>

                <div>
                    <button type="button" onClick={this.customerChange}>Change Data</button>
                </div>
            </div>
        )
    }
}
export default Customer