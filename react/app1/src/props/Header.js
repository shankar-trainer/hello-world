import { Component } from "react";

export default class Header extends Component{
    constructor(props){
        super(props);
       
    }
        render(){
            return(
                <div>
                <h1>{this.props.headerProp}</h1>

                </div>
            )
        }
    }
