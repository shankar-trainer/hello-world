import React, { Component } from 'react';

class Assignment extends Component {
    state = {
        data1: [],
    };

    componentDidMount() {
        const url1 = "https://api.quicksell.co/v1/internal/frontend-assignment";

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
            var mytable = <tbody> <tr><td>{entry.id}</td><td> {entry.name} </td><td>{entry.cost}</td></tr></tbody>;
            return mytable;
        });

        return <div className="container">
            <table className='table table-stripped table-bordered'>{head}{result1}</table>
        </div>;
    }
}

export default Fetch;