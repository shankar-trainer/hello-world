import { Component } from "react";

export default class Database1 extends Component {

    constructor() {
        super();
        this.state = {
            data: []
        }
    }

    componentDidMount() {
        fetch("http://localhost:9090/allPerson").then(result => result.json()).then(
            result => {
                this.setState({
                    data: result
                })
            }
        )
    }
    render() {
        return (
            <div className="p-5 m-5">
                <h1>Person data </h1>
                <table>
                    <tr>
                        <th>id</th>
                        <th>name</th>
                        <th>salary</th>

                    </tr>
                    {
                        this.state.data.map(
                            a =>
                                <tr>
                                    <td>{a.personId}</td>
                                    <td>{a.personName}</td>
                                    <td>{a.personSalary}</td>
                                </tr>
                        )
                    }
                </table>
            </div>

        )
    }
}
