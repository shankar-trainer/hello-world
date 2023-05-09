import { Component } from "react";

export default class StudentForm extends Component {
    constructor(props) {
        super(props);
        this.state = {
            radioGroup: {
                male: true,
                female: false,
            },
            checkBoxGroup: {
                music: true,
                movie: false,
                touring: true,
                reading: false
            },
            id: '',
            name: ''
        }
    }
    onChangeId = (e) => {
        this.setState({ id: e.target.value })
    }
    onChangeName = (e) => {
        this.setState({ name: e.target.value })
    }

    handleGender = (e) => {
        let obj = {}
        obj[e.target.value] = e.target.checked
        this.setState({
            selectedOption: e.target.value
        })
        console.log('gender change called ', e.target.value, e.target.checked)
    }

    handleHobbies = (e) => {
        let obj = this.state.checkBoxGroup
        obj[e.target.valeu] = e.target.checked
        this.setState({ checkBoxGroup: obj })
        console.log('hobbies change is called', e.target.value, e.target.checked)
    }
    render() {
        return (
            <div className='container'>
                <form className="w-50 m-4 ml-5 p-5">
                    <h1>Student Form</h1>
                    <div className="form-group">
                        <label class="form-check-label">Enter Id</label>
                        <input name="id" onChange={this.onChangeId} className="form-control"/>
                    </div>

                    <div className="form-group">
                        <label class="form-check-label">Enter Name</label>
                        <input name="name" onChange={this.onChangeName} className="form-control"/>
                    </div>


                    <div className="form-check">
                        <label class="form-check-label">Select Gender</label><br></br>
                        <input type='radio' name="radioGroup" value='male' className="form-check-input"
                            onChange={this.handleGender}
                            checked={this.state.radioGroup === 'male'}
                        />Male<br></br>
                        <input type='radio' name="radioGroup" value='female' className="form-check-input"
                            onChange={this.handleGender}
                            checked={this.state.radioGroup === 'female'}
                        />Female
                    </div>
                    <br></br>
                    <div className="form-check">
                        <label class="form-check-label">Select Hobbies</label><br></br>
                        <input type='checkbox' onChange={this.handleHobbies} className="form-check-input"
                            name="checkBoxGroup" value='music'
                            checked={this.state.checkBoxGroup['music']}
                        />Music<br></br>
                        <input type='checkbox' onChange={this.handleHobbies} className="form-check-input"
                            name="checkBoxGroup" value='movie'
                            checked={this.state.checkBoxGroup['movie']}
                        />Movie<br></br>
                        <input type='checkbox' onChange={this.handleHobbies} className="form-check-input"
                            name="checkBoxGroup" value='touring'
                            checked={this.state.checkBoxGroup['touring']}
                        />Touring<br></br>
                        <input type='checkbox' onChange={this.handleHobbies} className="form-check-input"
                            name="checkBoxGroup" value='reading'
                            checked={this.state.checkBoxGroup['reading']}
                        />Reading<br></br>
                    </div>
                    <h2>Student Information</h2>
                    Id is { this.state.id }<br></br>
                    Name is { this.state.name }<br></br>
                    Gender is { this.state.gender }<br></br>
                    Hobbies  are { this.state.hobbies }<br></br>  
                </form>
               
            </div>
        )
    }

}