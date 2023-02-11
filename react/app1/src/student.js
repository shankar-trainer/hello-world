import { Component } from "react";

export default class student extends Component {
    constructor(props) {
        super(props);
        this.state = {
            roll: 10001,
            name: 'ram kumar',
            age: 30,
            subject: 'mathematics',
            marks: 67.0
        }
    }
    change = () => {
        this.setState({
            roll: 1000
        })
        this.setState({
            name:'anand kumar'
        })
        this.setState({
            age: 40
        })
        this.setState({
            subject: 'tamil'
        })
        this.setState({
            marks:  90
        })
    }
render() {
    return (
        <div className="table table-striped table-bordered m-auto bg-dark text-warning w-75 mt-5 p-5">
         <h1>Student Data </h1>
            <table>
            <tbody>
                <tr>
                    <th>roll</th>
                    <th>name</th>
                    <th>age</th>
                    <th>subject</th>
                    <th>marks</th>
                </tr>
                <tr>
                    <td>{this.state.roll}</td>
                    <td>{this.state.name}</td>
                    <td>{this.state.age}</td>
                    <td>{this.state.subject}</td>
                    <td>{this.state.marks}</td>
                </tr>
                </tbody>
            </table>
            <button type="button" onClick={() => this.change(false)} className="btn btn-primary">change student record</button>
            <hr></hr>
        </div>
    )
}
}