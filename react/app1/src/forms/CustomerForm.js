import { Component } from "react";

export default class CustomerForm extends Component {
    constructor(props) {
        super(props);
        this.state = {
            id: 0,
            name: ' ',
            marks: 0,
            errid: '',
            errname: '',
            errmarks: '',
            visible: false
        }

    }
    changeVisible = (e) => {
       this.setState({ visible: !this.state.visible });
    }
    changeId = (e) => {
        if (e.target.value <= 0) {
            this.setState({
                errid: 'invalid id'
            })
        }
        else {
            this.setState({
                id: 'id is ' + e.target.value
            })
        }
    }
    changeName = (e) => {
        if (e.target.value == "") {
            this.setState({
                errname: 'name is blank'
            })
        }
        else if (e.target.value.length <= 10) {
            this.setState({
                errname: 'name must of 10 chars'
            })
        }
        else {
            this.setState({
                errname: 'name is ' + e.target.value
            })
        }
    }
    changeMarks = (e) => {
        if (e.target.value <= 0) {
            this.setState({
                errmarks: 'invalid marks'
            })
        }
        else {
            this.setState({
                marks: 'marks is ' + e.target.value
            })
        }
    }


    render() {
        return (
            <div>
                <form className="w-50  p-5 m-5 bg-dark text-light border border-primary">
                    <div className="group-control">
                        <label>Enter Id</label>
                        <input className="form-control w-50" onChange={this.changeId} ></input>
                        <span className="text-warning mb-1">{this.state.errid}</span>
                    </div>

                    <div className="group-control">
                        <label>Enter Name</label>
                        <input className="form-control  w-50" onChange={this.changeName} ></input>
                        <span className="text-warning mb-1" >{this.state.errname}</span>
                    </div>

                    <div className="group-control">
                        <label>Enter marks</label>
                        <input className="form-control  w-50" onChange={this.changeMarks} ></input>
                        <span className="text-warning mb-1">{this.state.errmarks}</span>
                    </div>
                    <button type="submit" value="send" className="button button-primary" onClick={this.changeVisible}>Send</button>
                    <button type="reset" value="send" className="button button-primary" >Cancel</button>

                    <div>
                        
                        {
                            this.state.visible && (<div>
                        <h1>User Infortmation  </h1>
                        Id is {this.state.id}<br></br>
                        Name is {this.state.name}<br></br>
                        Marks is {this.state.marks}
                        </div>
                         )
                        }
                          </div>
                </form >
            </div >
        )
    }
}