import React, { Component } from "react";

export default class EmployeeForm extends Component {

    constructor(props) {
        super(props);
        this.idinput = React.createRef();
        this.nameinput = React.createRef();
    }

    focus_idinput = () => {
        this.idinput.current.focus()
    }

    formSubmit = (event) => {

        if (this.idinput.current.value == 0 || this.idinput.current.value == '')
            alert('id is blank')

        else if (this.nameinput.current.value == '' || this.nameinput.current.length == 0)
            alert('name is blank')
        else {
            alert('id is ' + this.idinput.current.value + '\nname is ' + this.nameinput.current.value)
        }
        event.preventDefault();
    }

    render() {
        return (

            <div>
                <h1>Employee Form</h1>
                <form onSubmit={this.formSubmit} className='bg-dark text-light border border-primary mt:5' >
                    <div class="form-group">
                        <label>Enter Id </label>
                        <input ref={this.idinput} onClick={this.focus_idinput}></input>
                    </div>

                    <div class="form-group">
                        <label>Enter Name </label>
                        <input ref={this.nameinput} ></input>
                    </div>

                    <div class="form-group">
                        <input type='submit' value='submit' ></input>
                    </div>
                    

                </form>
            </div>

        )
    }

}