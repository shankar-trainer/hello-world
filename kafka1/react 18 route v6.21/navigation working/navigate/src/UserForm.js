import React, { Component, useState } from 'react';
import { useNavigate } from 'react-router-dom';
//import React, { useState, Fragment, Component } from "react";

export default function UserForm() {
    const [name, changeName] = useState('');
    const [err_name, setErrorName] = useState('');
    const navigate = useNavigate();

    return (
        <div>
            <div className="form-group">
                <label>Enter Name</label>
                <input className="form-control" onChange={
                    (e) => {
                        if (e.target.value == '')
                            setErrorName('name is blank')
                        else if (e.target.value.length < 5 || e.target.value.length > 15)
                            setErrorName('name length must be of 5 - 15 characters')
                        else {
                            setErrorName('')
                            changeName(e.target.value)
                        }
                    }
                }></input>
                <div className="text-warning">{err_name}</div>
            </div>
            <div>
                <button type="submit" onClick={(e) => {
                        navigate('/userdata/',{state:{name}})
                    }
                }>Submit</button>
            </div>
        </div>
    )
}
/*
class UserForm extends Component {
    constructor(props) {
        super(props);
        this.state = {
            firstName: '',
            showName: false
        }
    }
    inputHandler = (e) => {
        let updatedName = e.target.value;
        this.setState({ firstName: updatedName });
        console.log(updatedName+' updated name ');
    }
    onSubmitHandler = (e) => {
        e.preventDefault();
        if (this.state.firstName === "") {
            alert("First Name is  required");
            return;
        }
        else {
            //this.props.navigation.navigate('YouScreen', {paramsIfAny})
            this.props.navigation.navigate(`/userform/${this.state.firstName}`)
           // this.props.history.push(`/userform/${this.state.firstName}`)
            //this.props.history.push(`/welcome/${this.state.username}`)
            this.setState({
                showName: true
            });
        }
    }
    render() {
        return (
            <div>
                <h1>User Form</h1>
                <form
                    onSubmit={this.onSubmitHandler}>
                    <label>Enter the Name</label>
                    <input type="text"
                           name="firstName" onChange={this.inputHandler} value={this.state.firstName} />
                    <br></br>
                    {this.state.showName && <p>"FirstName: " {this.state.firstName}</p>}
                    <button type="submit" onClick={this.onSubmitHandler}>Submit</button>
                </form>
            </div>
        );
    }
}
*/
//export default withRouter(UserForm);
//export default (UserForm);
