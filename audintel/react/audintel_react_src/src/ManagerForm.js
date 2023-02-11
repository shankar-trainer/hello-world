import { Component } from "react";

class ManagerForm extends Component {
    constructor() {
        super();
        this.state = {
            id: '',
            name: '',
            age: '',
            radiogroup: {
                male: true,
                female: false
            },
            checkboxgroup: {
                music: true,
                movie: true,
                reading: true,
                touring: false
            }
        }
    }

    changeId = (e) => {
        this.setState({id:e.target.value})
    }
    changeName = (e) => {
        this.setState({name:e.target.value})        
    }

    genderselected(){
        return  this.radiogroup.value
    }
    changeAge = (e) => {
        this.setState({age:e.target.value})
    }

    changeRadioGroup = (e) => {
        //this.genderselected()
        this.setState({radiogroup:e.target.value})
    }

    changeCheckBox = (e) => {
        this.setState({checkboxgroup:e.target.value})
    }
    render() {
        return (
            <div>
                {/* <form onSubmit={this.handleForm} className="w-100 m-3 border border-primary p-5 m-5 bg-info text-dark"> */}
                <form onSubmit={this.handleForm} className="w-100 m-3 border border-primary p-5 m-5 bg-info text-dark">
                    <div className="form-group">
                        <label>Enter Id</label>
                    </div>
                    <input value={this.state.id} className="form-control" onChange={this.changeId}/>

                    <div className="form-group">
                        <label>Enter Name</label>
                    </div>
                    <input value={this.state.name} className="form-control" onChange={this.changeName}/>

                    <div className="form-group">
                        <label>Enter Age</label>
                    </div>
                    <input value={this.state.age} className="form-control" onChange={this.changeAge}/>

                     <div className="form-group">
                        <label>Select Gender</label>
                    </div>
                    <input value={this.state.radiogroup} name='radiogroup' className="radio" 
                          onChange={this.changeRadioGroup}
                        type='radio' checked={this.state.radiogroup == "male"}/>Male

                    <input value={this.state.gender} name='radiogroup' className="radio" onChange={this.changeRadioGroup}
                        type='radio' checked={this.state.radiogroup == "female"}/>Female

                    <div className="form-group">
                        <label>Select Hobbies</label>
                    </div>
                    <input name='checkboxgroup' className="checkbox" onChange={this.changeCheckBox}
                        type='checkbox' value='music' checked={this.state.checkboxgroup['music']}/>Music

                    <input name='checkboxgroup' className="checkbox" onChange={this.changeCheckBox}
                        type='checkbox' value='music' checked={this.state.checkboxgroup['movie']}/>Movie
                    <input name='checkboxgroup' className="checkbox" onChange={this.changeCheckBox}
                        type='checkbox' value='music' checked={this.state.checkboxgroup['touring']}/>Touring 
                    <input name='checkboxgroup' className="checkbox" onChange={this.changeCheckBox}
                        type='checkbox' value='music' checked={this.state.checkboxgroup['reading']}/>Reading  

                    <br></br>
                    <button type='submit' className="btn btn-primary" >Send</button>
                    <button type='reset' className="btn btn-primary m-5"    >Reset</button>
                </form>
                <div>
                     Id is {this.state.id}<br></br>
                     Name is {this.state.name}<br></br>
                     Age is {this.state.age}<br></br>
                     Gender is {this.genderselected}<br></br>
                </div>
            </div>
        )
    }
}
export default ManagerForm;