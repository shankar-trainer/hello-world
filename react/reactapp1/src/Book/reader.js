import { Component } from "react";

export default class Reader extends Component {
    render() {
        return (
            <div>
                <div className="border border-primary w-50 mt-5" style={{ 'marginLeft': '200px' }}>
                    <h1>Reader page</h1>
                    <ul className="ml-5 p-5">
                        <li>{reader.id}</li>
                        <li>{reader.name}</li>
                        <li>{reader.location}</li>
                    </ul>
                    <table className="table table-striped table-border bg-info">
                        <thead>
                            <th>Id</th>
                            <th>Name</th>
                            <th>Location</th>
                        </thead>
                        <tbody>{
                            readers.map((a)=>(
                                <tr>
                                <td>{a.id}</td>
                                <td>{a.name}</td>
                                <td>{a.location}</td>
                            </tr>
                            ))
                            }
                        </tbody>
                    </table>
                </div>
            </div>
        )
    }
}

const reader = {
    id: 8989989,
    name: 'amit kumar',
    location: 'varanasi'
}
const readers = [
    {
        id: 8989990,
        name: 'sumit kumar',
        location: 'noida'
    },
    {
        id: 8989981,
        name: 'parshant kishor',
        location: 'mathura'
    },
    {
        id: 8989982,
        name: 'naval parsad',
        location: 'gaya'
    },
    {
        id: 8989983,
        name: 'priyansh kumar',
        location: 'gonda'
    },
    {
        id: 8989984,
        name: 'ravi kumar',
        location: 'vadohi'
    },
    {
        id: 8989985,
        name: 'rahul ranjan',
        location: 'mirzapur'
    },
    {
        id: 8989986,
        name: 'parmod kumar',
        location: 'balia'
    },
    {
        id: 8989987,
        name: 'mukul kumar',
        location: 'devaria'
    },
    {
        id: 8989988,
        name: 'lata devi',
        location: 'jaunpur'
    },

]

