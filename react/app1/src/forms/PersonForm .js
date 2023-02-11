import { Component } from 'react';

export default class PersonForm extends Component {
    constructor(props) {
        super(props);
        this.state = {
            id: '',
            name: '',
            age: '',
            comment: '',
            city: '',
            hobbies: false
        }
    }
    formSubmit = (event) => {
        if (this.state.id == 0 || this.state.id == '')
            alert('id is blank')

        else if (this.state.name.length == 0 || this.state.name == '')
            alert('name is blank')

        else if (this.state.age == 0 || this.state.age == '')
            alert('age is blank')

        else if (this.state.hobbies.length == 0 || this.state.hobbies == '')
            alert('select hobbies')

        else if (this.state.city.length == 0 || this.state.city == '')
            alert('please select city')

        else if (this.state.comment.length == 0 || this.state.comment == '')
            alert('please add comment')

        else {
            alert('id is ' + this.state.id + '\nname is ' + this.state.name + '\nage is ' + this.state.age + '\ncomment is ' + this.state.comment)
        }
        event.preventDefault();
    }

    reset = (event) => {
        this.setState(
            {
                id: '',
                name: '',
                age: '',
                comment: '',
                hobbies: false
            }
        )
    }
    hobbiesChange = (event) => {
        this.setState(
            {
                hobbies: event.target.value
            }
        )
    }
    idChange = (event) => {
        this.setState(
            {
                id: event.target.value
            }
        )
    }
    cityChange = (event) => {
        this.setState(
            {
                city: event.target.value
            }
        )
    }

    nameChange = (event) => {
        this.setState(
            {
                name: event.target.value
            }
        )
    }
    ageChange = (event) => {
        this.setState(
            {
                age: event.target.value
            }
        )
    }
    commentChange = (event) => {
        this.setState(
            {
                comment: event.target.value
            }
        )
    }
    render() {
        return (
            <div>
                <form onSubmit={this.formSubmit} className='bg-dark text-light border border-primary mt:5' >
                    <div class="form-group">
                        <label>Id:</label>
                        <input value={this.state.id} onChange={this.idChange} class="form-control"></input><br></br>
                    </div>
                    <div class="form-group">

                        <label>Name:</label>
                        <input value={this.state.name} onChange={this.nameChange} class="form-control"></input><br></br>
                    </div>
                    <div class="form-group">

                        <label>Age:</label>
                        <input value={this.state.age} onChange={this.ageChange} class="form-control"></input><br></br>
                    </div>


                    <div class="form-check">
                        <label class="form-check-label" >Hobbies:</label><br></br>
                        <input type='checkbox'
                            name='hobbies' checked={this.state.hobbies} onChange={this.hobbiesChange} class="form-check-input"></input>Music<br></br>
                        <input type='checkbox'
                            name='hobbies' checked={this.state.hobbies} onChange={this.hobbiesChange} class="form-check-input"></input>Movie<br></br>
                        <input type='checkbox'
                            name='hobbies' checked={this.state.hobbies} onChange={this.hobbiesChange} class="form-check-input"></input>Reading<br></br>
                        <input type='checkbox'
                            name='hobbies' checked={this.state.hobbies} onChange={this.hobbiesChange} class="form-check-input"></input>Flowering<br></br>
                        <input type='checkbox'
                            name='hobbies' checked={this.state.hobbies} onChange={this.hobbiesChange} class="form-check-input"></input>Shopping<br></br>
                    </div>

                    <div class="form-group">

                        <label>City:</label>
                        <select value={this.state.city} onChange={this.cityChange} class="form-control">
                            <option value={''}></option>
                            <option value={'New Delhi'}>New Delhi</option>
                            <option value={'Kolkotta'}>Kolkotta</option>
                            <option value={'Chennai'}>Chennai</option>
                            <option value={'Mumbai'}>Mumbai</option>
                            <option value={'Coimbtore'}>Coimbtore</option>
                        </select>
                        <br></br>
                    </div>

                    <div class="form-group">
                        <label>Add Comment</label>
                        <textarea cols={65} rows={5} value={this.state.comment} onChange={this.commentChange}>Comment here</textarea>
                    </div>

                    <div class="form-group">
                        <input type='submit' className='btn btn-primary'></input>
                        <input type='reset' style={{ 'margin-left': '20px' }} onClick={this.reset} className='btn btn-primary'></input>
                    </div>

                </form>

                <div className='bg-dark text-light border border-primary' style={{ width: '40%', 'marginLeft': '410px', 'marginTop': '40px', 'padding': '20px', 'height': '140px', 'marginBottom': '40px' }}>
                    <label>Id : {this.state.id}</label><br></br>
                    <label>Name : {this.state.name}</label><br></br>
                    <label>Age : {this.state.age}</label><br></br>
                    <label>Hobbies : {this.state.hobbies}</label><br></br>
                    <label>Comment : {this.state.comment}</label><br></br>
                    <label>City : {this.state.city}</label><br></br>

                </div>
            </div>
        )
    }
}