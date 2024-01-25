import React, { Component } from "react";

export default  class Leader extends Component {
    constructor(props) {
        super(props);
        this.state = {
            'id': 4343434,
            'name': 'pritam kumar',
            'age': 30
        }
        this.changeLeader=this.changeLeader.bind(this);
    }
    render() {
        return (
            <React.Fragment>
                <div className="container bg-warning text-dark border border-primary p-5 m-5" style={{'borderRadius':'20px'}}>
                        <h2>Leader data</h2>
                         <div>Id is {this.state.id}</div>
                         <div>Name is {this.state.name}</div>
                         <div>Age is {this.state.age}</div>
                         <hr>
                         </hr>
                <div className="mt-3">
                    <button type="button"  onClick={this.changeLeader}  className="btn btn-secondary">Change Leader data </button>
                </div>
                </div>
                        
                        <div className="container bg-info text-dark border border-primary p-5 m-5 w-50" style={{'borderRadius':'20px'}}>
                            <h2>Voter Data </h2>
                            <table className="table table-striped table-bordered" >
                                <tr>
                                    <th>Id</th>
                                    <th>Name</th>
                                    <th>Age</th>
                                </tr>
                                {
                                    this.props.voter.map(a=>
                                        <tr>
                                            <td>{a.voter_id}</td>
                                            <td>{a.Voter_name}</td>
                                            <td>{a.age}</td>
                                        </tr>
                                        )
                                }
                            </table>
                        </div>
            </React.Fragment>
        )
    }
    changeLeader(){
        this.setState({
            id:6776678768,
            name:'arvind kumar',
            age:60,
        })
    }
}