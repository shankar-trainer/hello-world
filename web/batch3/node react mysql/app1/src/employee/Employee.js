import { Component } from "react";

class Employee extends Component {
  constructor(){
    super();
    this.state={
        "id":10001,
        "name":"ram kumar",
        "age":20
    }
    this.change=this.change.bind(this);
  };
//   change=()=>
 change()
    {
    console.log('change called ')
    this.setState({
        "id":10002,
        "name":"sures parsad",
        "age":20 
    })
  }
  clock=()=>{
         
  }

    render() {
        return (
            <div className="container bg-success p-5">
                <div className="bg-info text-success border border-primary w-50 p-5"
                 style={{'border-radius':'20pt','margin-left':'200pt','marginTop':'50pt'}}
                >
                    <h1> Employee Component</h1>
                    <p>id is {this.state.id}</p>
                    <p>name is {this.state.name}</p>
                    <p>age is {this.state.age}</p>
                    <p>country is {this.props.country}</p>
                    <p>capital is {this.props.capital}</p>
                    <div>city is {this.props.addr.city}</div>
                    <div>state is {this.props.addr.state}</div>
                    <div>city is {this.props.addr.city}</div>
                </div>
                <div>
                    <button type="button" className="btn btn-secondary"
                    onClick={this.change}
                    >change employee data</button>
                </div>
                <div>
                    <h2>Cars </h2>
                    <table className="table w-75 table-striped bg-light text-success" style={{"borderRadius":"20pt"}}>
                        <tr>
                            <th>Model</th>
                            <th>Cost</th>
                            <th>MFD</th>
                        </tr>{
                        this.props.mycar.map(c=>
                            <tr>
                                <td>{c.model}</td>
                                <td>{c.cost}</td>
                                <td>{c.mfd}</td>
                            </tr>
                        )
                    }
                    </table>
                </div>
            </div>)
    }
}

export default Employee;

Employee.defaultProps={
    "country":"india",
    "capital":"new delhi"
}