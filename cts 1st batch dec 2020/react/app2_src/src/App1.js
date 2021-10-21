import React, {Component} from 'react';
import './App.css';
import Employee from './Employee'
class App1 extends Component {
  state = {
    employee : [
      {name: 'Stark', empId:'123'},
      {name: 'Mickel', empId:'124'},
      {name: 'John', empId:'125'}
    ]
  }

  addEmployeeEmail = () => {
    this.setState({
      employee : [
        {name: 'Stark', email:'123', email:'stark@react.com'},
        {name: 'Mickel', empId:'124', email:'mickel@react.com'},
        {name: 'John', empId:'125', email:'john@react.com'}
      ]
    })
  }
  render() {
    return (
      <div className="App">
        <h1>Welcome to react JS tutorial</h1>
        <button onClick = {this.addEmployeeEmail}>Update employee emails</button>
        <Employee click = {this.addEmployeeEmail} name={this.state.employee[0].name} empId={this.state.employee[0].empId} email={this.state.employee[0].email} />
        <Employee name={this.state.employee[1].name} empId={this.state.employee[1].empId} email={this.state.employee[1].email} />
        <Employee name={this.state.employee[2].name} empId={this.state.employee[2].empId} email={this.state.employee[2].email} />
      </div>
    );
  }
}

export default App1;
