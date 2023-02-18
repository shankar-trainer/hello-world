import React, { Component } from 'react';

class Form1 extends Component {
    constructor(props) {
        super(props);
    }

    updateForm = (event) => {
        alert(' id and  name added successfuly')
        event.preventDefault();
    }


    render() {
        return (
            <div>
                <h1>User Form </h1>

                <form 
                 onSubmit={this.updateForm}
                
                className="w-50 m-3 border border-dark p-5 m-5">
                    <div className="form-group">
                        <label >Enter Id</label>
                        <input ref='this.input' className="form-control" />
                    </div>
                    <div className="form-group">

                        <label >Enter Name</label>
                        <input ref='this.input' className="form-control" />
                    </div>
                    <button type='submit'>Submit</button>
                </form>
            </div>
        )
    }
}

export default Form1

