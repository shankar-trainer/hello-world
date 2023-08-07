import { Component } from "react";
import Address from "./Address";
import Car from './Car';
import UserCar from "./UserCar";

class UserForm extends Component{
  constructor(props){
   super(props);
  }
  render(){
    return(
    <div>
     <h1>User Page</h1>
        <div>
       Id is {this.props.id}
       </div>
       
        <div>
       Name is {this.props.name}
       </div>
       <Address city="noida" state="up" country="india"></Address>
       <UserCar car={Car}></UserCar>
    </div>)
  }
  
}
export default UserForm;