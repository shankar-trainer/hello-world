import { Component } from "react";
import Columns from "./Columns";

export default class FragmentsExample1 extends Component{
    render(){
        return(
            <table>
                <tr>
                    <Columns></Columns>
                </tr>
            </table>
        )
    }
}