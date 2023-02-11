import React, {Component} from 'react';
import './App.css';
import Student1   from './Student1';

class App22 extends Component {
  state = {
    student : [
      {name: 'mohan kumar', roll:'123'},
      {name: 'ram kumar', roll:'124'},
      {name: 'amit kumar', roll:'125'}
    ]
  }

  addStudentEmail = () => {
    this.setState({
      student : [
        {name: 'mohan kumar', roll:'123', email:'mohan@ymail.com'},
        {name: 'ram kumar', roll:'124', email:'ram@ymail.com'},
        {name: 'amit kumar', roll:'125', email:'amit@ymail.com'}
      ]
    })
  }
  render() {
    return (
      <div className="App2">
        <h1>Welcome to react JS tutorial</h1>
        <button onClick = {this.addStudentEmail}>Update Student emails</button>
        <Student1 click = {this.addStudentEmail} name={this.state.student[0].name} empId={this.state.student[0].empId}
        email={this.state.student[0].email} />
        <Student1 name={this.state.student[1].name} roll={this.state.student[1].roll} email={this.state.student[1].email} />
        <Student1 name={this.state.student[2].name} roll={this.state.student[2].roll} email={this.state.student[2].email} />
      </div>
    );
  }
}

export default App22;
