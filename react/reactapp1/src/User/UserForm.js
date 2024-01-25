import React, { Component } from 'react';
//import React, { useState, Fragment, Component } from "react";

import { useParams} from 'react-router-dom';
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
      this.props.history.push(`/login/${this.state.firstName}`)
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
//export default withRouter(UserForm);
export default (UserForm);
