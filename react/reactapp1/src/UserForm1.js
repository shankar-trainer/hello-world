import { Component } from "react";

class UserForm extends Component {

    constructor(props) {
        super(props);
        this.state = {
            id: 10001,
            name: 'suresh kumar'
        }
    }
    id_change = (event) => {
        this.setState({ id: event.target.value })
    }
    name_change = (event) => {
        this.setState({ name: event.target.value })
    }

    render() {
        return (
            <div className="border border-primary p-5 m-5 w-50">
                <form>
                    <div className="form-group">
                        <label>Enter Id</label>
                        <input className="form-control" onChange={this.id_change}></input>
                    </div>

                    <div className="form-group">
                        <label>Enter Name</label>
                        <input className="form-control" onChange={this.name_change}></input>
                    </div>

                    <div className="form-group">
                    </div>
                </form>

                <div className="border border-primary">
                    <p>id is {this.state.id}</p>
                    <p>name is {this.state.name}</p>

                </div>
            </div>
        )
    }
}
export default UserForm;
