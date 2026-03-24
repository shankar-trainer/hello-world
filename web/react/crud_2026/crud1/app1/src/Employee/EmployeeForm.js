import { Component } from "react";

export default class Employee extends Component {

    constructor() {
        super();
        this.state = {
            "id": 0,
            "name": "",
            "salary": 0,
            "id_err": "",
            "name_err": "",
            "salary_err": "",
            "status": true
        }
    }

    submit = (event) => {
        event.preventDefault() 
        this.setState({ status: false })
    }

    changeId = (event) => {
        this.setState({ id: event.target.value })
        event.preventDefault()
        if (event.target.value == '')
            //alert('id is blank')
            this.setState({ id_err: 'id is blank' })

        else if (event.target.value < 0 || event.target.value > 50000)
            // alert('id must between 0 and 50000')
            this.setState({ id_err: 'id must between 0 and 50000' })
        else {
            this.setState({ id_err: '' })
        }
    }

    changeName = (e) => {
        this.setState({ name: e.target.value })
        e.preventDefault()
        var val = e.target.value
        if (val == "")
            // alert("name is blank")
            this.setState({ name_err: 'name is blank' })

        else if (val.length < 5 || val.length > 20)
            // alert("name  must of 5- 20 character")
            this.setState({ name_err: 'name  must of 5- 20 character' })
        else {
            this.setState({ name_err: '' })
        }
    }

    changeSalary = (e) => {
        this.setState({ salary: e.target.value })
        e.preventDefault()
        var val = e.target.value
        if (val < 0)
            this.setState({ salary_err: 'invalid salary' })
        else if (isNaN(val))
            this.setState({ salary_err: 'salary must be number' })

        else if (val <= 10000 || val > 50000)
            // alert('salary must between 10000 - 50000')
            this.setState({ salary_err: 'salary must between 10000 - 50000' })

        else {
            this.setState({ salary_err: '' })
        }
    }


    render() {
        return (
            <div className="container bg-success text-light p-5 mt-5 w-50" style={{ 'marginLeft': '200pt', 'borderRadius': '30pt' }}>
                <h2>Employee Form</h2>
                <form onSubmit={this.submit}>
                    <div className="form-group">
                        <label>Enter Id </label>
                        <input className="form-control" placeholder="Enter Id" onChange={this.changeId}></input>
                        <label className="text-warning"> {this.state.id_err}</label>
                    </div>
                    <div className="form-group">
                        <label>Enter Name </label>
                        <input className="form-control" placeholder="Enter Name" value={this.state.name} onChange={this.changeName}></input>
                        <label className="text-warning"> {this.state.name_err}</label>

                    </div>
                    <div className="form-group">
                        <label>Enter Salary </label>
                        <input className="form-control" onChange={this.changeSalary} placeholder="Enter Salary" value={this.state.salary}></input>
                        <label className="text-warning"> {this.state.salary_err}</label>

                    </div>
                    <div className="mt-2">
                        <button type="submit" className="btn btn-primary">send</button>
                        <button type="reset" className="btn btn-primary"
                            style={{ 'marginLeft': "10pt" }}
                        >cancel</button>
                    </div>

                </form>

                <div hidden={this.state.status} className="p-5 m-5" style={{'border':'inset blue 20pt','borderRadius':'20pt'}}>
                    <div>Id is {this.state.id}</div>
                    <div>Name is {this.state.name}</div>
                    <div>Salary is {this.state.salary}</div>
                </div>

            </div>
        )
    }

}