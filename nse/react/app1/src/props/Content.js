import { Component } from "react";

export default class Content extends Component{
    constructor(props){
        super(props);
         }
        render(){
            return(
                <div>
                <h1>{this.props.contentProp}</h1>

                </div>
            )
        }
    }
