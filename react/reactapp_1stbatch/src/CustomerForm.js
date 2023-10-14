import { Component } from "react";

class CustomerForm extends Component {
    constructor(props) {
        super(props);
        this.state = {
            'id': 0,
            'name': '',
            'salary': 0,
            'city':'',
            'error_id': '',
            'error_name': '',
            'error_salary': '',
            'error_city': '',
        }
    }
    idchange = (event) => {
        if (event.target.value <= 0) {
            this.setState(
                { error_id: 'invalid id' }
            )
        }
        else {
            this.setState(
                { id: event.target.value }
            )
        }
    }
    citychange = (event) => {
        if (event.target.value=='') {
            alert('city is blank')
            this.setState(
                { error_city: 'invalid city' }
            )
        }
        else {
            this.setState(
                { city: event.target.value }
            )
        }
    }
    namechange = (event) => {
        if (event.target.value == '') {
            this.setState(
                { error_id: 'invalid name' }
            )
        }
        else {
            this.setState(
                { name: event.target.value }
            )
        }
    }
    salarychange = (event) => {
        if (event.target.value <= 0) {
            this.setState(
                { error_salary: 'invalid salary' }
            )
        }
        else {
            this.setState(
                { salary: event.target.value }
            )
        }
    }

    render() {
        return (
            <div>
                <form className="p-5  bg-info text-dark w-75 m-5">
                    <div className="form-group">
                        <label>Enter Id</label>
                        <input className="form-control" onChange={this.idchange}></input>
                        <span>{this.state.error_id}</span>
                    </div>

                    <div className="form-group">
                        <label>Enter Name</label>
                        <input className="form-control" onChange={this.namechange}></input>
                        <span>{this.state.error_name}</span>

                    </div>
                    <div className="form-group">
                        <label>Enter Salary</label>
                        <input className="form-control" onChange={this.salarychange}></input>
                        <span>{this.state.error_salary}</span>
                    </div>
                    <div className="form-group">
                        <label>Select City </label>
                        <select value={this.state.city} onChange={this.citychange}>
                            <option value=''></option>
                            <option value='new delhi'>New Delhi</option>
                            <option value='mumbai'>Mumbai</option>
                            <option value='kolkotta'>Kolkotta</option>
                            <option value='new delhi'>Chennai</option>
                            <option value='noida'>Noida</option>
                        </select>
                        <div>
                        <span>{this.state.error_city}</span>
                        </div>
                    </div>

                </form>
                <div>
                    <div>Id is {this.state.id}</div>
                    <div>Name is {this.state.name}</div>
                    <div>Salary is {this.state.salary}</div>
                    <div>City  is {this.state.city}</div>
                </div>
            </div>
        )
    }
}
export default CustomerForm;