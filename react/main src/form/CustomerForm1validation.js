import React, { Component } from 'react';

class CustomerForm1 extends Component {
    constructor(props) {
        super(props);
        this.state = {
            id: '',
            password: '',      
            name: '',
            email: '',

            errorId: '',
            errorPassword: '',
            errorName: '',
            errorEmail: '',
        };
    }
 emailRegx=/^[a-zA-Z0-9.!#$%&'*+/=?^_`{|}~-]+@[a-zA-Z0-9-]+(?:\.[a-zA-Z0-9-]+)*$/
passRegex=/^[A-Za-z]\w{7,14}$/

    
    validateId = (e) => {
        if (e.target.value <= 0) {
            this.setState({ errorId: 'invalid id' })
            console.log('error id ' + this.state.errorId)
        }

    }
    validateName = (e) => {
        e.preventDefault();
        if (e.target.value.length <= 5)
            this.setState({ errorName: 'invalid name' })
    }
    validatePassword = (e) => {
        e.preventDefault();
        //if (e.target.value.length <= 5)
        if(!this.passRegex.test(e.target.value))
            this.setState({ errorPassword: 'invalid password' })
    }
    validateEmail = (e) => {
        e.preventDefault();
        //if (e.target.value.length <= 8)
          if(!this.emailRegx.test(e.target.value))
             this.setState({ errorEmail: 'invalid email' })
     }


    render() {
        return (
            <div>
                <form className="text-dark w-50 m-5 border border-dark p-5">
                    <h1>Customer Form</h1>
                    <div className="group-control">
                        <label>Enter Id</label>
                        <input className="form-control" name='id' onChange={this.validateId} noValidate ></input>
                        <span>{this.state.errorId}</span>
                    </div>

                    <div className="group-control">
                        <label>Enter Password</label>
                        <input type='password' className="form-control" name='password' onChange={this.validatePassword}
                            noValidate
                        ></input>
                        <span>{this.state.errorPassword}</span>
                    </div>

                    <div className="group-control">
                        <label>Enter Name</label>
                        <input className="form-control" name='name' onChange={this.validateName}
                            noValidate
                        ></input>

                        <span>{this.state.errorName}</span>
                    </div>
                    <div className="group-control">
                        <label>Enter Email</label>
                        <input className="form-control" name='email' onChange={this.validateEmail}
                            noValidate
                        ></input>
                        <span>{this.state.errorEmail}</span>
                    </div>
                    <div className="group-control">
                        <button type='submit' className="btn btn-primary mt-4" > Send</button>
                        <button type='reset' className="btn btn-primary ml-4 mt-4"  > Cancel</button>
                    </div>

                </form>

            </div>
        );
    }
}
export default CustomerForm1