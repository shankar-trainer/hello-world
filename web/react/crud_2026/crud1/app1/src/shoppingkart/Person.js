const { Component } = require("react");

class Person extends Component {
    constructor(props) {
        super();
        this.state = {
            id: 100091,
            name: 'pooja',
            salary: 60000,
            location: 'chennai',
        }
    }
    render() {
        return (
            <div className="container bg-info text-dark w-75 p-5 m-5">
                <table className="table table-striped table-bordered">
                    <tr>
                        <td>Id</td><td>{this.state.id}</td>
                    </tr>
                    <tr>
                        <td>Name</td><td>{this.state.name}</td>
                    </tr>
                    <tr>
                        <td>Salary</td><td>{this.state.salary}</td>
                    </tr>
                    <tr>
                        <td>Location</td><td>{this.state.location}</td>
                    </tr>
                </table>

                <ul>
                    {
                        this.props.car.map(c =>
                            <li>{c.carId}- {c.carModel}- {c.cost}</li>
                        )
                    }
                </ul>
                <p>Car cost greater than 2000000</p>
                <ul>
                    {
                        this.props.car.filter(a => a.cost > 2000000).map(c =>
                            <li>{c.carId}- {c.carModel}- {c.cost}</li>
                        )
                    }
                </ul>
                <p>Car sorted by name</p>
                <ul>
                    {
                        this.props.car.sort((a, b) => a.carModel.localeCompare(b.carModel)).map(c =>
                            <li>{c.carId}- {c.carModel}- {c.cost}</li>
                        )
                    }
                </ul>

                <table className="table table-bordered table-striped">
                    <tr><th>Id</th> <th>Model</th><th>Cost</th></tr>
                    {
                        this.props.car.map(c => 
                            <tr key={c.carId}>
                                <td>{c.carId}</td>
                                <td>{c.carModel}</td>
                                <td>{c.cost}</td>
                            </tr>
                        
                        )
                    }
                </table>
                <h3>Sorted By cost in ascending</h3>
                <table className="table table-bordered table-striped bg-dark text-light">
                    <tr><th>Id</th> <th>Model</th><th>Cost</th></tr>
                    {
                        this.props.car.sort((a,b)=>(a.cost-b.cost)).map(c => 
                            <tr key={c.carId}>
                                <td>{c.carId}</td>
                                <td>{c.carModel}</td>
                                <td>{c.cost}</td>
                            </tr>
                        )
                    }
                </table>
                
            </div>
        )
    }
}
export default Person;