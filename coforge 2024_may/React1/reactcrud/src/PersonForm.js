import { Component } from "react";
import PersonService from "./service/PersonService";

export default class PersonForm extends Component {

    constructor() {
        super()
        this.state = {
            "id": 10001,
            "name": "amit kumar",
            "salary": 350000,
            "err_id": '',
            "err_name": '',
            "err_salary": '',
            show: true
        }
    }
    


    changeId = (event) => {
        if (event.target.value == '')
            this.setState({ 'err_id': 'id is blank' })
        else
            this.setState({ 'id': event.target.value })
       
    }

    changeName = (event) => {
        if (event.target.value == '')
            this.setState({ 'err_name': 'name is blank' })
        else
            this.setState({ 'name': event.target.value })
 
    }

    changeSalary = (event) => {
        if (event.target.value == '')
            this.setState({ 'err_salary': 'salary is blank' })
        else
            this.setState({ 'salary': event.target.value })
      
    }

    render() {
        return (
            <>
                <form className="border border-primary p-5 m-5 w-50 text-primary bg-warning">
                    <div className="form-group">
                        <label>Enter Id </label>
                        <input className="form-control" onChange={this.changeId}
                            onClick={this.changeId}
                        ></input>
                        <span>{this.state.err_id}</span>
                    </div>

                    <div className="form-group">
                        <label>Enter Name </label>
                        <input className="form-control" onChange={this.changeName}></input>
                        <span>{this.state.err_name}</span>
                    </div>

                    <div className="form-group">
                        <label>Enter Salary </label>
                        <input className="form-control" onChange={this.changeSalary}></input>
                        <span>{this.state.err_salary}</span>
                    </div>
                    <div className="form-group">

                       
                        <button type="button" className="form-control btn btn-primary mt-3 w-25"
                            onClick={this.savePerson}  >save Person
                           
                        </button> 

                        <button type="button" className="form-control btn btn-primary mt-3  w-25" style={{ 'marginLeft': '5px' }}>
                            reset
                        </button>

                    </div>

                </form>

                {/* <div className="border border-primary p-5 mt-5 bg-secondary text-light" hidden={this.state.show}>

                    <div>
                        Id is {this.state.id}
                    </div>
                    <div>
                        Name is {this.state.name}
                    </div>
                    <div>
                        Salary {this.state.salary}
                    </div>
                </div> */}
            </>
        )
    }
    savePerson=()=>{
        let person={personId:this.state.id,personName:this.state.name,personSalary:this.state.salary}
     let p=  PersonService.createPerson(person)
     alert("person added")
    }

}