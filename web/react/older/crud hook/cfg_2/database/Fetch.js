import React, { Component } from 'react';

class Fetch extends Component {
    state = {
        data1: [],
    };

    componentDidMount() {
        const url1 = "http://localhost:8080/all"

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
        const head = <thead><tr><th>Id</th><th>Name</th><th>Cost</th></tr></thead>;
        const result1 = data1.map((entry) => {
            var mytable = <tbody>
                <tr>
                    <td>{entry.prdId}</td>
                    <td> {entry.prdName} </td>
                    <td>{entry.prdCost}</td>
                    <td>{entry.prdMfd}</td>
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