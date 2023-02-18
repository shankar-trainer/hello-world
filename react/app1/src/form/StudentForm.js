import React, { Component } from 'react';

class StudentForm extends Component {

    constructor(props) {
        super(props);
        this.state = {
            id: '',
            name: '',
            marks: '',
            errId:'',
            errName:'',
            errMarks:'',
        }
    }

    onChangeId = (e) => {
        if (e.target.value <= 0) {
            this.setState({ errId:'Invalid Id' })
            //alert("Id is invalid")
        }
        else {
            this.setState({ id: 'Id is '+e.target.value })
        }
    }
    
    onChangeName = (e) => {
        if (e.target.value === "" || e.target.value.length<=3) {
            this.setState({ errName:'Invalid Name' })
        }
        else {
            this.setState({ name: 'Name is '+e.target.value })
        }
    }

    render() {
        return (
            <div>
                <form className="w-50 m-4 p-5 ml-5 bg-info text-light border border-primary">
                    <div className="group-control">
                        <label>Enter Id </label>
                        <input className="form-control" onChange={this.onChangeId}></input>
                         <span className='text-warning'>{this.state.errId}</span> 
                    </div>
                    <div>
                        <label>Enter Name </label>
                        <input className="form-control" onChange={this.onChangeName}></input>
                        <span>{this.state.errName}</span>
                    </div>
                    <div>
                        <label>Enter Marks </label>
                        <input className="form-control"></input>
                    </div>
                    <button type='submit' value='send'>Send</button>
                </form>
                 {this.state.id}<br></br>
                 {this.state.name}<br></br>
            </div>
        )
    }
}
export default StudentForm
