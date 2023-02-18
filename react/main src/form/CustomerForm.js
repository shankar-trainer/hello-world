import React, { Component } from 'react';

class CustomerForm extends Component {
    constructor(props) {
        super(props);
        this.state = {
               id:'',
               password:'',
               name:'',
               errors:{
                 id:'',password:'',name:'',email:''    
               }
        };
    }

   validateForm=(e)=>{
         e.preventDefault();
         const {errName,value}=e.target
         let errors=this.state.errors;

         switch(errName){
             case 'id':
                 if(value<=0)
                    errors.id='invalid id'
                 break;

                case 'password':
                    errors.password=value.length<5?'invalid password':'' 
                    break;

                case 'name':
                    errors.name=value.length<5?'invalid name':'' 
                    break;
                case 'email':
                    errors.email=value.length<10?'invalid email':'' 
                    break;
                default:
                    break;                        
         }
            
          this.setState({errors,[errName]:value},()=>
                  {
                      console.log("errors are "+errors)
                      console.log("Id error are "+errors.id)
                      console.log("Password error are "+errors.password)
                  }
             )

   }

    render() {
        return (
            <div>
                <form className="text-dark w-50 m-5 border border-dark p-5">
                    <h1>Customer Form</h1>
                    <div className="group-control">
                        <label>Enter Id</label>
                        <input className="form-control" name='id' onChange={this.validateForm}  noValidate ></input>
                    </div>

                    <div className="group-control">
                        <label>Enter Password</label>
                        <input type='password' className="form-control" name='password'  onChange={this.validateForm}
                        noValidate
                        ></input>
                    </div>

                    <div className="group-control">
                        <label>Enter Name</label>
                        <input className="form-control" name='name'  onChange={this.validateForm}
                        noValidate
                        ></input>
                    </div>
                    <div className="group-control">
                        <label>Enter Email</label>
                        <input className="form-control" name='email' onChange={this.validateForm}
                        noValidate
                        ></input>
                    </div>
                    <div className="group-control">       
                        <button type='submit' className="btn btn-primary mt-4" > Send</button>
                        <button type='reset'  className="btn btn-primary ml-4 mt-4"  > Cancel</button>
                    </div>

                </form>

            </div>
        );
    }
}
export default CustomerForm