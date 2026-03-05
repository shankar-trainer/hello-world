import { Component } from "react";
import Clock from "../Clock";
import Date1 from "../Date1";

class CustomerForm extends Component {

    constructor() {
        super();
        this.state = {
            "id": 0,
            "name": "",
            "age": 0,
            "err_id": '',
            "err_name": '',
            "err_age": '',
            "status": true
        }
    }

    changeId = (e) => {
        if (e.target.value == '')
            // alert('id is blank')
            this.setState({ "err_id": "id is blank" })

        else if (isNaN(e.target.value))
            this.setState({ "err_id": "id must be numeric value" })
        else
            this.setState({ "id": e.target.value })
    }

    changeName = (e) => {
        if (e.target.value == '')
            this.setState({ "err_name": "name is blank" })
        else if (e.target.value.length < 5 || e.target.value.length > 15)
            this.setState({ "err_name": "name must of 5 -15 characters" })
        else
            this.setState({ "name": e.target.value })
    }
    changeAge = (e) => {
        if (e.target.value == '')
            this.setState({ "err_age": "age is blank" })
        else if (isNaN(e.target.value))
            this.setState({ "err_age": "age must be numeric value" })
        else if (e.target.value < 0 || e.target.value > 100)
            this.setState({ "err_age": "age should be 1 - 100" })
        else {
            this.setState({ "age": e.target.value })
          //  this.setState({ "status": false })

        }
    }
    onSubmit = (e) => {
        e.preventDefault();
        // this.state.status=false;
        this.setState({ "status": false })
    }

    render() {
        return (
            <>
                <div className="container">
                    <form className="bg-info p-5 m-5">
                        <div className="row">
                            <div className="col-sm-6" style={{ "float": "left" }}>
                                <Clock></Clock>
                            </div>

                            <div className="col-sm-6" style={{ "float": "right" }}>
                                <Date1></Date1>
                            </div>

                        </div>
                        <h1>Customer Form</h1>
                        <div className="form-group">
                            <label>enter id</label>
                            <input className="form-control" onChange={this.changeId}></input>
                            <span className="text-danger">{this.state.err_id}</span>
                        </div>

                        <div className="form-group">
                            <label>enter name</label>
                            <input className="form-control" onChange={this.changeName}></input>
                            <span className="text-danger">{this.state.err_name}</span>
                        </div>
                        <div className="form-group">
                            <label>enter age</label>
                            <input className="form-control" onChange={this.changeAge}></input>
                            <span className="text-danger">{this.state.err_age}</span>

                        </div>
                        <div>
                            <button className="btn btn-primary"
                                style={{ "marginLeft": "10pt", "marginTop": "10pt" }}
                                type="submit" onClick={this.onSubmit}>send</button>

                            <button type="reset" className="btn btn-primary"
                                style={{ "marginLeft": "10pt", "marginTop": "10pt" }}
                            >cancel</button>
                        </div>
                    </form>

                    <div className="bg-success p-5 m-5 w-50" hidden={this.state.status} >
                        <h2> Customer data</h2>
                        <div>Id is {this.state.id}
                        </div>

                        <div>Name is {this.state.name}
                        </div>
                        <div>Age is {this.state.age}
                        </div>
                    </div>
                </div>
            </>
        )
    }


}
export default CustomerForm;