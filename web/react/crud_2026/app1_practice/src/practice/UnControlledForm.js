import React, { Component } from "react";

export default class UnControlledForm extends Component {

    constructor() {
        super();
        this.t1 = React.createRef();
        this.t2 = React.createRef();
    }
    formSubmit = () => {
        if (this.t1.current.value == "")
            alert("id is blank")

        else if (this.t2.current.value == "")
            alert("name is blank")
        else {
            alert("id is " + this.t1.current.value)
            alert("name is " + this.t1.current.value)
        }
    }
    render() {
        return (
            <>
                <form className="container border border-primary" onSubmit={this.formSubmit}>
                    <div className="form-group">
                        <label>enter id </label>
                        <input className="form-control" ref={this.t1}></input>
                    </div>

                    <div className="form-group">
                        <label>enter name </label>
                        <input className="form-control" ref={this.t2}></input>
                    </div>

                    <div className="form-group">
                        <button className="btn btn-primary mt-3" type="submit">Submit</button>
                        <button className="btn btn-primary mt-3" type="reset" style={{ 'marginLeft': '4px' }}>Cancel</button>
                    </div>

                </form>
            </>
        )
    }
}