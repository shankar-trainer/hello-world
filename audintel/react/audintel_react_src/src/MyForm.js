import { Component } from "react";
import CustomerForm from "./CustomerForm";
import ManagerForm from "./ManagerForm";
import UserForm from "./UserForm";
import UserForm1 from "./UserForm1";

class MyForm extends Component{
    render(){
        return(
            <div>
                 <UserForm></UserForm>
                <br></br><br></br><br></br><br></br><br></br>
                <UserForm1></UserForm1>
                <br></br><br></br><br></br><br></br><br></br>
                <CustomerForm></CustomerForm>    
                <ManagerForm></ManagerForm>    
            </div>
        )
    }
}
export default MyForm;