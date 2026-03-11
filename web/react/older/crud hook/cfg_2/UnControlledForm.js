import React, { Component } from "react";

export default class UnControlledForm extends Component {
    constructor(props) {
        super(props);
        this.t1 = React.createRef();
        this.t2 = React.createRef();
    }

    formSubmit = () => {
        if (this.t1.current.value == '')
            alert('id is blank')

        else if (this.t2.current.value == '')
            alert('name is blank')
        else {
            alert('id is ' + this.t1.current.value)
            alert('name is ' + this.t2.current.value)
        }
    }

    render() {
        return (
            <div className="container">
                <form onSubmit={this.formSubmit} className="w-50 p-5 m-5 border border-secondary">
                    <div className="form-group">
                        <label>Enter Id</label>
                        <input className="form-control" ref={this.t1}></input>
                    </div>
                    <div className="form-group">
                        <label>Enter Name</label>
                        <input className="form-control" ref={this.t2}></input>
                    </div>
                    <div className="form-group">
                        <button className="btn btn-primary mt-3" type="submit">Submit</button>
                        <button className="btn btn-primary mt-3" type="reset" style={{ 'marginLeft': '4px' }}>Cancel</button>
                    </div>
                </form>
            </div>
        )
    }

}