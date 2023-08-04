import { Component } from "react";
import Hello1 from "./Hello1";

class Person extends Component{
    render(){
        return(
            <div>
            <h1>Hello Person</h1>
            <Hello1></Hello1>
            </div>
        )
    };
}
export default Person;