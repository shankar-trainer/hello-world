import { Component } from "react";
import './css/user.css'
import car from './data/cardata';
export default class Car extends Component {
    render() {
        return (
            <div className="style1">
                <h1>Car Page..</h1>
                <table>
                    <tr>
                        <th>Car Id</th>
                        <th>Car Model</th>
                        <th>Car MFD</th>
                    </tr>
                    {
                        <tr>
                            <td>{car[0].carid}</td>
                            <td>{car[0].carmodel}</td>
                            <td>{car[0].carmfd}</td>
                        </tr>
                    }

                    {
                        car.map(c => (
                            <tr>
                                <td>{c.carid}</td>
                                <td>{c.carmodel}</td>
                                <td>{c.carmfd}</td>
                            </tr>
                        )
                        )
                    }

                </table>

            </div>
        )
    }
}