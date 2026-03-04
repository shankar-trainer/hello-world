import React, { Component } from 'react';

class Fetch extends Component {
    state = {
        data1: [],
    };

    componentDidMount() {
        // const url1 = "http://localhost:8080/all"
        const url1 = "http://localhost:2000/employee"

        fetch(url1)
            .then(result => result.json())
            .then(result => {
                this.setState({
                    data1: result
                })
            });
    }

    render() {
        const { data1 } = this.state;
        const head = <thead><tr><th>Id</th><th>Name</th><th>Salary</th></tr></thead>;
        const result1 = data1.map((entry) => {
            var mytable = <tbody>
                <tr>
                    <td>{entry.id}</td>
                    <td> {entry.name} </td>
                    <td>{entry.salary}</td>
                </tr>
            </tbody>;
            return mytable;
        });

        return <div className="container">
            <table className='table table-stripped table-bordered'>{head}{result1}</table>
        </div>;
    }
}

export default Fetch;