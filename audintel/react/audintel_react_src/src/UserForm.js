import { Component } from "react";

class UserForm extends Component {
    constructor(props) {
        super(props);
        this.state = {
            data: ''
        }
    }

    updateState = (e) => {
        console.log('value ' + e.target.value)
        console.log('name ' + e.target.name)
        this.setState({ data: e.target.value })
    }

    render() {
        return (
            <div>
                <form className="w-50 m-3 border border-primary p-5 m-5 bg-dark text-light" style={{'border-radius':'30'}}>
                    <h1>First Form</h1>
                    <div className="form-group">
                    <label>Enter Name</label>
                    </div>

        <input value={this.state.data} onChange={this.updateState} className="form-control"></input>
                    <h2>My name is {this.state.data}</h2>
                </form>
            </div>
        )
    }
}
export default UserForm;