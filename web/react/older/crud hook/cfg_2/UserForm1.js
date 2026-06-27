import { Component } from "react";
import Clock from "./Clock";
import Clock1 from "./Clock1";

class UserForm extends Component {

    constructor(props) {
        super(props);
        this.state = {
            id: '',
            name: '',
            salary: '',
            city: '',
            id_error: '',
            name_error: '',
            salary_error: '',
            city_error: '',
            show: true
        }
    }

    toggle = () => this.setState((currentState) => ({ show: !currentState.show }));


    id_change = (event) => {
        if (event.target.value == '')
            this.setState({ id_error: 'id is blank' })
        else if (isNaN(event.target.value))
            this.setState({ id_error: 'id must be number only' })
        else
            this.setState({ id: event.target.value })
    }

    name_change = (event) => {
        if (event.target.value == '')
            this.setState({ name_error: 'name is blank' })
        else if (event.target.value.length < 5)
            this.setState({ name_error: 'name must of 5 characters ' })
        else
            this.setState({ name: event.target.value })
    }
    salary_change = (event) => {
        if (event.target.value == '')
            this.setState({ salary_error: 'salary is blank' })
        else if (isNaN(event.target.value))
            this.setState({ id_error: 'salary must be number only' })
        else
            this.setState({ salary: event.target.value })
    }
    city_change = (event) => {
        if (event.target.value == '')
            this.setState({ city_error: 'city is blank' })
        else
            this.setState({ city: event.target.value })
    }

    render() {
        return (
            <div className="border border-primary p-5 m-5 w-50 bg-info">
                <form>
                    <span style={{ float: 'left' }} className="text-light"><Clock></Clock></span>
                    <span style={{ float: 'right' }} className="text-light"><Clock1></Clock1></span>
                    <br></br>
                    <div className="form-group mt-3">
                        <label>Enter Id</label>
                        <input className="form-control" onClick={this.id_change} onChange={this.id_change}></input>
                        <span className="text-danger">{this.state.id_error}</span>
                    </div>

                    <div className="form-group">
                        <label>Enter Name</label>
                        <input className="form-control" onClick={this.name_change} onChange={this.name_change}></input>
                        <span className="text-danger">{this.state.name_error}</span>
                    </div>
                    <div className="form-group">
                        <label>Enter Salary</label>
                        <input className="form-control" onClick={this.salary_change} onChange={this.salary_change}></input>
                        <span className="text-danger">{this.state.salary_error}</span>
                    </div>
                    <div className="form-group">
                        <label>Enter City</label>
                        <select className="form-control" onClick={this.city_change} onChange={this.city_change}>
                            <option value=''></option>
                            <option value='delhi'>Delhi</option>
                            <option value='chennai'>Chennai</option>
                            <option value='mumbai'>Mumbai</option>
                            <option value='klkotta'>Kolkotta</option>
                        </select>
                        <span className="text-danger">{this.state.city_error}</span>
                    </div>

                    <div className="form-group">

                        <button type="button" className="form-control btn btn-primary mt-3 w-25"
                            onClick={this.toggle}  > show and hide
                            {/* {this.state.show ? 'show' : 'hide'} */}
                        </button>

                        <button type="button" className="form-control btn btn-primary mt-3  w-25" style={{ 'marginLeft': '5px' }}>
                            reset
                        </button>

                    </div>
                </form>

                <div className="border border-primary p-5 mt-5 bg-secondary text-light" hidden={this.state.show}>
                    <p>id is {this.state.id}</p>
                    <p>name is {this.state.name}</p>
                    <p>salary is {this.state.salary}</p>
                    <p>city is {this.state.city}</p>

                </div>
            </div>
        )
    }
}
export default UserForm;
