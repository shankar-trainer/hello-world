import { Component } from "react";

class UserForm1 extends Component {
    constructor(props) {
        super(props);
        this.state = {
            id: '',
            name:''
        }
    }

    updateState = (e) => {
        this.setState({
             id: e.target.value            
            })
    }
    updateState1 = (e) => {
        this.setState({
             name: e.target.value
            })
    }

    render() {
        return (
            <div>
                <form className="w-50 m-3 border border-primary p-5 m-5 bg-dark text-light" style={{ 'border-radius': '30' }}>
                    <h1>First Form</h1>
                    <div className="form-group">
                        <label>Enter Id</label>
                    </div>

                    <input value={this.state.id} onChange={this.updateState} className="form-control"></input>
                    
                    <div className="form-group">
                        <label>Enter Name</label>
                    </div>

                    <input value={this.state.name} onChange={this.updateState1} className="form-control"></input>

                    <h2>My Id is {this.state.id}</h2>
                    <h2>My Name is {this.state.name}</h2>
                </form>
            </div>
        )
    }
}
export default UserForm1;