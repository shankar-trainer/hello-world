import { Component } from "react";
import {data} from '../data/customer.json';
export default class customerdata extends Component {
    
    render() {
        return (
            <div>
               {data}
                           </div>
        )
    }
}