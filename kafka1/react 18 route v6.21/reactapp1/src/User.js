import { Component } from "react";
export class User extends Component{
    constructor(props){
      super();
      this.state={
        userid:10001,
        username:'amit kumar',
        usersalary:20000,
      }
    }
    render(){
        return (
            <div>
                <h1>User page</h1>
                <p>Id is {this.state.userid}</p>
                <p>Name is {this.state.username}</p>
                <p>Salary is {this.state.usersalary}</p>
                <p>Country is {this.props.country}</p>
            </div>
        )
    }
}
