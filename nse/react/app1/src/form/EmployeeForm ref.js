import React, { Component } from 'react'
import ReactDOM from 'react-dom';

class EmployeeForm extends Component {

    constructor(){
        super();
        this.state={
            email:'',
            comment:''
        }
    }
    submit = (event) => {
        console.log(' event called  ')
        let email1 = this.refs.emailAddress
        let comment1 = this.refs.comments
        console.log(ReactDOM.findDOMNode(email1).value)
        console.log(ReactDOM.findDOMNode(comment1).value)
        event.preventDefault();
      
            this.setState({ email: (ReactDOM.findDOMNode(email1).value)})
            this.setState({ comment: (ReactDOM.findDOMNode(comment1).value)})
        
    }

    render() {
        return (
            <form className="w-50 m-4 ml-5 p-5">
                <div className="form-group">
                    <label>EMail</label>
                    <input placeholder='Enter Email'
                        ref="emailAddress" className="form-control"
                    />
                </div>
                <div className="form-group">
                    <label>Comment</label>
                    <input placeholder='Add Comment'
                        type="textarea"
                        ref="comments" className="form-control"
                    />

                </div>

                <div className="form-group">
                    <input type='submit' value='send'

                        onClick={this.submit}></input>
                </div>
               Email {this.state.email}<br></br>
               Comment {this.state.comment}
            </form>
        )
    }
}
export default EmployeeForm
