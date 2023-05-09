import React, { Component } from 'react';

class UserForm extends Component {

    constructor(props) {
        super(props);
        this.state = {
            radioGroup: {
                male: true,
                female: false
            },
            checkBoxGroup: {
                music: true,
                movie: false,
                touring: true,
                reading: false,
            },
            id: '',
            name: ''
        }
    }

    onChangeId = (event) => {
        this.setState({ id: event.target.value })
    }

    onChangeName = (event) => {
        this.setState({ name: event.target.value })
    }

    handleGender = (event) => {
        let obj = {}
        obj[event.target.value] = event.target.checked
        this.setState({ selectedOption: event.target.value })

        this.setState({ radioGroup: obj })
        console.log("gender change ", event.target.value, event.target.checked)
    }

    handleHobbies = (event) => {
     let obj=this.state.checkBoxGroup
     obj[event.target.value] = event.target.checked
     this.setState({checkBoxGroup:obj})
     console.log("hobbies change ", event.target.value, event.target.checked)
  
    }
    render() {
        return (
            <div className='container'>
                <form className="w-50 m-4 ml-5 p-5">
                    <h1>User Form </h1>
                    <div className="form-group">
                        <label>Enter Id </label>
                        <input name="Id" onChange={this.onChangeId} className="form-control"></input>
                    </div>
                    {
                        React.createElement('div', { className: 'form-group' },
                            React.createElement('label', null, 'Enter Name'),
                            React.createElement('input', { className: 'form-control', onChange: this.onChangeName }, null),
                        )}
                    <div className="form-group">
                        <label>Gender </label>
                        <input
                            className="form-control"
                            type='radio' name='radioGroup' value='male'
                            onChange={this.handleGender}
                            checked={this.state.radioGroup === "male"}
                        />Male
                         <input
                            className="form-control"
                            type='radio' name='radioGroup' value='female'
                            onChange={this.handleGender}
                            checked={this.state.radioGroup === "female"}
                        />Female
                        </div>
                           <hr></hr>
                        <div className="form-group">

                            <label>Select hobbies</label>
                            <input type='checkbox' 
                            onChange={this.handleHobbies}
                            className="form-control" name="checkBoxGroup" value='music'
                                    checked={this.state.checkBoxGroup['music']}
                            />Music
                            <input type='checkbox' className="form-control" name="checkBoxGroup" value='movie'
                                     checked={this.state.checkBoxGroup['movie']}
                                     onChange={this.handleHobbies}
                                     />Movie
                            <input type='checkbox' className="form-control" name="checkBoxGroup" value='touring'
                                     checked={this.state.checkBoxGroup['touring']}
                                     onChange={this.handleHobbies}
                                     />Touring
                            <input type='checkbox' 
                                     checked={this.state.checkBoxGroup['reading']}
                                     onChange={this.handleHobbies}
                                     className="form-control" name="checkBoxGroup" value='reading'/>Reading
                        
                        
                    </div>
                </form>
                <h2>User Information </h2>
                Id is {this.state.id}<br></br>
                Name is {this.state.name}<br></br>
                Your gender is {this.state.selectedOption}<br></br>
            </div>
        )
    }
}

export default UserForm
