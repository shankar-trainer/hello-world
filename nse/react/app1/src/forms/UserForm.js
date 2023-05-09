import { Component } from 'react';
import '../css/userform.css';

export default class UserForm extends Component {
    constructor(props) {
        super(props);
        this.state = {
            id: 10001,
            name: 'ram kumar',
            age: 30
        }
    }
    formSubmit = (event) => {
        alert('id is ' + this.state.id + '\nname is ' + this.state.name + '\nage is ' + this.state.age)
         event.preventDefault();
    }
    idChange=(event)=>{
        this.setState(
            {
                id:event.target.value
            }
        )
    }
    
    nameChange=(event)=>{
        this.setState(
            {
                name:event.target.value
            }
        )
    }
    ageChange=(event)=>{
        this.setState(
            {
                age:event.target.value
            }
        )
    }


    render() {
        return (
            <div>
            <form onSubmit={this.formSubmit}>
             <label>Id:</label>
             <input value={this.state.id} onChange={this.idChange}></input><br></br>
             
             <label>Name:</label>
             <input value={this.state.name} onChange={this.nameChange}></input><br></br>
             
             <label>Age:</label>
             <input value={this.state.age} onChange={this.ageChange}></input><br></br>
             <input type='submit'></input>
            </form>

            <div className='myform'>
             <label>Id : {this.state.id}</label><br></br>
             <label>Name : {this.state.name}</label><br></br>
             <label>Age : {this.state.age}</label>

            </div>
            </div>
        )
    }
}