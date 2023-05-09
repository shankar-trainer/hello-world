import React, { Component } from 'react';

class App3 extends Component {
    render() {
        return (
            <p>
               <h1>Employee Data</h1>
              <Employee country="india" state="tamilnadu" now={new Date().toString()
                }
                now1={new Date().toDateString()}
                time={new Date().toTimeString()}
                   ></Employee>
            </p>
        );
    }
}

class Employee extends Component {

    constructor() {
        super();
        this.state = {
            employee: [
                {
                    "id": 1001,
                    "name": "mohan kumar",
                    "salary": 20000,
                    "location": "chennai"
                },
                {
                    "id": 1002,
                    "name": "ram kumar",
                    "salary": 30000,
                    "location": "kelpakkam"
                },
                {
                    "id": 1003,
                    "name": "surendra kumar",
                    "salary": 24000,
                    "location": "kanchipuram"
                },
                {
                    "id": 1004,
                    "name": "amrendra kumar",
                    "salary": 68000,
                    "location": "ooty"
                }
                ,
                {
                    "id": 1005,
                    "name": "vinod kumar",
                    "salary": 12000,
                    "location": "sivkashi"
                },
                {
                    "id": 1006,
                    "name": "shiv shankar kumar",
                    "salary": 15000,
                    "location": "madurai"
                }
            ]
        }
    }
    render() {
        return (<div>
            
            <h2>Date1 is {this.props.now}</h2>
            <h2>Date2 is {this.props.now1}</h2>
            <h2>Time is {this.props.time}</h2>
            <h2>Country is {this.props.country}</h2>
            <h2>State is {this.props.state}</h2>

            <span>First Record
           Id {this.state.employee[0].id}<br></br>
                name {this.state.employee[0].name}<br></br>
                Salary {this.state.employee[0].salary}<br></br>
                Location {this.state.employee[0].location}<br></br>
            </span>

            <table className=
    "table table-striped w-75 border border-primary table-bordered bg-primary">
                <tr>
                    <th>Id</th>
                    <th>Name</th>
                    <th>Salary</th>
                    <th>Location</th>
                </tr>
                {this.state.employee.map(emp =>
                    <tr>
                        <td>{emp.id}</td>
                        <td>{emp.name}</td>
                        <td>{emp.salary}</td>
                        <td>{emp.location}</td>
                    </tr>

                )}


            </table>

        </div>)
    }
}

export default App3;
