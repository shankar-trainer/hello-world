import React, { Component } from "react";
import SurveyData from "./SurevyData";

//export default function Survey(props) 
export default class Survey extends Component {
    constructor(props) {
        super(props);
    }

    // return(
    //     React.createElement('h1',{},'Survey Project without  jsx')
    // )

    // return(
    //     React.createElement('div',{},React.createElement('h1',{},'hello without jsx'))
    // )
    render() {
        return (
            <div className="bg-dark text-info">
                <h1> Hello world  using jsx</h1>
                <table className="table table-bordered table-striped" >
                    <tr>
                        <th>Id</th>
                        <th>Area</th>
                        <th>Sector </th>
                        <th>MFD</th>
                    </tr>
                     {
                        (this.props.data1||[]).map(p=>(
                            <tr>
                                <td>{p.id}</td>
                                <td>{p.area}</td>
                                <td>{p.sector}</td>
                            </tr>)
                        )} 
                </table>
            </div>)
    }
}