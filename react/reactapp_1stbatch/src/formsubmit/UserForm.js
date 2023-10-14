import React, { Component } from 'react';
//import React, { useState, Fragment, Component } from "react";

import { withRouter } from 'react-router-dom';
class UserForm1 extends Component {
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
      //this.props.history.push(`/login/${this.state.firstName}`)
      this.props.history.push(`/login/${this.state.firstName}`)
      
      this.setState({
        showName: true
      });
    }
  }
  render() {
    return (
      <div class="container">
      <div class="p-5 w-75  bg-info" style={{ marginLeft: '150px',marginTop: '100px', }}>
        <h1 style={{ marginLeft: '250px'}}>User Form</h1>
        <form    onSubmit={this.onSubmitHandler}>
         <div className="form-group">
          <label>Enter the Name</label>
          <input type="text"
            name="firstName" onChange={this.inputHandler} value={this.state.firstName} 
            className="form-control mt-3" 
              
            />
          </div>

          <div className="form-group mt-4">
          {this.state.showName && <p>"FirstName: " {this.state.firstName}</p>}
          <button type="submit" onClick={this.onSubmitHandler}>Submit</button>
          </div>
        </form>
       </div>
      </div>
    );
  }
}
export default withRouter(UserForm1);
//export default (UserForm1);
