import { Component } from "react";
import { messages } from "../context/hello-context";

class App11 extends Component{
    _toggleMessage=()=>{
        this.setState(prevState=>(
            {
                message:prevState.message===messages.message1?messages.message2:messages.message1
            }
        ))
    }
    state={
        
    }

}