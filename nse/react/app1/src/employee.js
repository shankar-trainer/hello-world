import { Component } from "react";
import emp from './data/employees.json';
export default class Employee extends Component {
    render() {
        return (
            <div>
                <h1>Employee Page</h1>
                <table className="table table-striped table-bordered" style={{border:'solid blue 10px'}}>
                    <tr style={{border:'solid blue 5px'}}>
                        <th>Full Name</th>
                        <th>Image</th>
                        <th>Email</th>
                        <th>Phone Number </th>
                    </tr>
                    {
                        emp.map(e => 
                            <tr>
                                <td>{e.fullName}</td>
                                <td><img src={e.imageUrl} width='200' height={150}></img></td>
                                <td>{e.email}</td>
                                <td>{e.phoneNumber} </td>
                            </tr>
                        
                        )
                    }
                </table>
            </div>
        )
    }
}