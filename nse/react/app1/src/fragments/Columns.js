import React, { Component } from "react";

export default class Columns extends Component {
    render() {
        /* return (
             <div>
                 <td>hello </td>
                 <td>world </td>
             </div> 
                )*/
                // using Fragment
        /*return(
            <React.Fragment>
                <td>hello</td>
                <td>world</td>
            </React.Fragment>
        )
        */
       //shortcut of  using Fragment as <></>
         return(
            <>
                <td>hello</td>
                <td>world</td>
            </>
        )
    }
}