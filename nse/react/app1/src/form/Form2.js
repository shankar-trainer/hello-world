import React, { Component } from 'react';

class Form2 extends Component {
    constructor(props) {
        super(props);
        this.state={
            id:1001,
            name:"ram kumar"
        }
    }

    updateSubmit = (event) => {
        alert(' id ' +this.state.id+'and  name '+this.state.name+' added successfuly')
        event.preventDefault();
    }

    changeSubmit=(event)=>{
        this.setState({
            id:event.target.value,
            name:event.target.value,
        })
    }


    render() {
        return (
            <div>
                <h1>Employee Form </h1>

                <form 
                 onSubmit={this.updateSubmit}
                
                className="w-50 m-3 border border-dark p-5 m-5">
                    <div className="form-group">
                        <label >Enter Id</label>
                        <input  className="form-control" onChange={this.changeSubmit} />
                    </div>
                    <div className="form-group">

                        <label >Enter Name</label>
                        <input  className="form-control"  onChange={this.changeSubmit} />
                    </div>
                    <button type='submit'>Submit</button>
                </form>
            </div>
        )
    }
}

export default Form2

