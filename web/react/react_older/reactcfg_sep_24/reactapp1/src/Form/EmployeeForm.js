import { Component } from "react";
import Clock from "../CounterApp/Clock";
import DatePrg from "../CounterApp/DatePrg";

class EmployeeForm extends Component {

    constructor(props) {
        super(props);
        this.state = {
            "id": 0,
            "name": '',
            "salary": 0,
            "gender": '',
            "err_id": '',
            "err_name": '',
            "err_salary": '',
            "err_gender": '',
            "status": true
        }
    }

    changeId = (event) => {
        if (event.target.value == '')
            //alert('id is blank')
            this.setState({ 'err_id': 'id is blank' })
        else if (isNaN(event.target.value))
            this.setState({ 'err_id': 'id is not a number' })
        else
            this.setState({ 'id': event.target.value })
    }

    changeName = (event) => {
        if (event.target.value == '')
            this.setState({ 'err_name': 'name is blank' })
        else if (event.target.value != '') {
            //alert('name is blank')
            this.setState({ 'err_id': '' })
            this.setState({ 'name': event.target.value })
        }
    }

    changeSalary = (event) => {
        if (event.target.value == '')
            this.setState({ 'err_salary': 'salary is blank' })
        else if (event.target.value != '') {
            this.setState({ 'err_name': '' })
            this.setState({ 'salary': event.target.value })
        }
    }

    changeGender = (e) => {
        if (e.target.value == '')
            this.setState({ 'err_gender': 'select the gender' })
        else if (e.target.value != '') {
            this.setState({ 'err_salary': '' })
            this.setState({ 'err_gender': '' })
            this.setState({ 'gender': e.target.value })
            this.state.status = false
        }
    }

    render() {
        return (
            <>
                <div style={{ 'height': '80pt' }}>
                    <span style={{ 'float': 'left' }}>
                        <Clock></Clock>
                    </span>

                    <span style={{ 'float': 'right' }}>
                        <DatePrg></DatePrg>
                    </span>

                </div>
                <div className="container p-5 m-5 bg-success border w-75" >
                    <div className="form-group">
                        <label>Enter Id</label>
                        <input className="form-control" onChange={this.changeId} onClick={this.changeId}></input>
                        <span className="text-warning">{this.state.err_id}</span>
                    </div>

                    <div className="form-group">
                        <label>Enter Name</label>
                        <input className="form-control" onChange={this.changeName} onClick={this.changeName}></input>
                        <span className="text-warning">{this.state.err_name}</span>
                    </div>
                    <div className="form-group">
                        <label>Enter Salary</label>
                        <input className="form-control" onChange={this.changeSalary} onClick={this.changeSalary}></input>
                        <span className="text-warning">{this.state.err_salary}</span>
                    </div>
                    <div className="form-group">
                        <div><label>Select Gender</label></div>
                        <div>
                            <input type="radio" onChange={this.changeGender} onClick={this.changeGender} name="gender" value="male" />
                            <span>Male</span>
                        </div>
                        <div>
                            <input type="radio" onChange={this.changeGender} onClick={this.changeGender} name="gender" value="female" />
                            <span>Female</span>
                        </div>
                        <span className="text-warning">{this.state.err_gender}</span>
                    </div>

                    <div className="form-group mt-2">
                        <input type="submit" className="btn btn-primary"
                            onClick={this.changeGender}
                        ></input>
                        <input type="reset" className="btn btn-primary" style={{ 'marginLeft': 10 }}></input>
                    </div>
                </div>

                <div className="p-5 m-5 bg-info w-50" hidden={this.state.status}>
                    <div className="border p-5 m-5">
                        <h3>Employee Information </h3>
                        <div> Id is {this.state.id}</div>
                        <div> Name is {this.state.name}</div>
                        <div> Salary is {this.state.salary}</div>
                        <div> Gender is {this.state.gender}</div>
                    </div>
                    <div className="border p-5 m-5">
                        <h3>Address</h3>

                        <div> Id is {this.props.myaddress.addr_id}
                        </div>

                        <div> Location is {this.props.myaddress.addr_id}
                        </div>
                        <div> City is {this.props.myaddress.city}
                        </div>
                        <div> State is {this.props.myaddress.state}
                        </div>

                    </div>
                    <div className="border p-5 m-5">
                        <h3>Cars Are </h3>
                        <ol>
                            {
                                this.props.mycar.map(a =>
                                    <div>
                                        <li>{a.regno}
                                            -{a.model}
                                            -{a.cost}</li>
                                    </div>
                                )
                            }
                        </ol>
                    </div >

                </div >

            </>
        )

    }

}
export default EmployeeForm;