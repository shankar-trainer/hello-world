import { Component } from "react";

export default class Person extends Component {

    constructor(props) {
        super(props);

        this.state = {
            id: 10001,
            name: 'suresh kumar',
            age: 30
        }
        this.myaddress = this.props.addr;
        this.myheader = this.props.header;
        this.personcar = this.props.mycar;
        this.personcar_header = this.props.carheader;
    }

    change_person = () => {
        this.setState({
            id: 10009,
            name: 'amites kumar',
            age: 37
        })
    }

    render() {
        return (
            <div className="container w-75 m-5">
                <table className="table table-stripped table-bordered table-info bg-light">
                    <tr>
                        <td>Id is {this.state.id}</td>
                    </tr>
                    <tr>
                        <td>Name is {this.state.name}</td>
                    </tr>
                    <tr>
                        <td>Age is {this.state.age}</td>
                    </tr>
                </table>

                <div >
                    <button className="btn btn-secondary" onClick={this.change_person}>
                        change person details
                    </button>
                </div>

                <table className="table table-stripped table-bordered  mt-5 bg-dark text-light">
                    <thead>
                        <tr>
                            <th>{this.myheader[0]}</th>
                            <th>{this.myheader[1]}</th>
                            <th>{this.myheader[2]}</th>
                        </tr>
                    </thead>

                    {
                        this.myaddress.map(a =>
                            <tr>
                                <td>{a.addr_id}</td>
                                <td>{a.city}</td>
                                <td>{a.state}</td>
                            </tr>
                        )
                    }
                </table>

                <table className="table table-stripped table-bordered  mt-5 bg-info text-light">
                    <tr>
                        <th>{this.personcar_header[0]}</th>
                        <th>{this.personcar_header[1]}</th>
                        <th>{this.personcar_header[2]}</th>
                    </tr>
                    {
                        this.personcar.map(c =>
                            <tr>
                                <td>{c.regno}</td>
                                <td>{c.model}</td>
                                <td>{c.cost}</td>
                            </tr>
                        )
                    }
                </table>

            </div>
        )
    }

}

