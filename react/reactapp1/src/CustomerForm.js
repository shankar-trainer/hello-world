import { Component } from "react";

class CustomerForm extends Component {
    constructor(props) {
        super(props);
        this.state = {
            'id': 0,
            'name': '',
            'salary': 0
        }
    }
    idchange=(event)=>{
      this.setState(
        {id:event.target.value}
      )  
    }
    namechange=(event)=>{
      this.setState(
        {name:event.target.value}
      )  
    }
    salarychange=(event)=>{
      this.setState(
        {salary:event.target.value}
      )  
    }

    render() {
        return (
            <div>
                <form className="p-5 w-60 bg-info text-dark">
                    <div className="form-group">
                        <label>Enter Id</label>
                        <input className="form-control" onChange={this.idchange}></input>
                    </div>

                    <div className="form-group">
                        <label>Enter Name</label>
                        <input className="form-control" onChange={this.namechange}></input>
                    </div>
                    <div className="form-group">
                        <label>Enter Salary</label>
                        <input className="form-control" onChange={this.salarychange}></input>
                    </div>
                    
                </form>
                  <div>
                     <div>Id is {this.state.id}</div>
                     <div>Name is {this.state.name}</div>
                     <div>Salary is {this.state.salary}</div>
                  </div>
            </div>
        )
    }
}
export default CustomerForm;