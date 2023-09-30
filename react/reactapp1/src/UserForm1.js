import { Component } from "react";

class UserForm extends Component {

    constructor(props) {
        super(props);
        this.state = {
            id: '',
            name: '',
            id_error: '',
            name_error: ''
        }
    }
    id_change = (event) => {
        if (event.target.value == '')
            this.setState({ id_error: 'id is blank' })
        else
            this.setState({ id: event.target.value })
    }
    name_change = (event) => {
        if (event.target.value == '')
            this.setState({ name_error: 'name is blank' })
        else
            this.setState({ name: event.target.value })
    }

    render() {
        return (
            <div className="border border-primary p-5 m-5 w-50 bg-info">
                <form>
                    <div className="form-group">
                        <label>Enter Id</label>
                        <input className="form-control" onChange={this.id_change}></input>
                        <span>{this.state.id_error}</span>
                    </div>

                    <div className="form-group">
                        <label>Enter Name</label>
                        <input className="form-control" onChange={this.name_change}></input>
                        <span>{this.state.name_error}</span>
                    </div>

                    <div className="form-group">
                    </div>
                </form>

                <div className="border border-primary p-5 mt-5 bg-secondary text-light">
                    <p>id is {this.state.id}</p>
                    <p>name is {this.state.name}</p>

                </div>
            </div>
        )
    }
}
export default UserForm;
