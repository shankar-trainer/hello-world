const { Component } = require("react");

export class Student extends Component {

    constructor(props) {
        super(props);
        this.state = {
            'roll': 10001,
            'name': 'rahul kumar',
            'subject': 'math',
            'marks': 78,
            'dob': new Date('1998-11-30').toDateString(),
        }
    }
    changeStudentData=()=>{
        this.setState({
            roll:90001,
            name:'kamal kant',
            subject:'hindi',
            marks:96,
            dob:new Date(1995-10-12).toDateString()
    })
}
    render() {
        return (
            <>
                <div className="container border border-primary bg-warning w-50 mt-5" style={{ 'borderRadius': '20px' }}>
                    <div style={{ 'border': 'inset 20px' }}>
                        <div>Roll is {this.state.roll}</div>
                        <div>Name is {this.state.name}</div>
                        <div>Subject is {this.state.subject}</div>
                        <div>Marks is {this.state.marks}</div>
                        <div>Dob is {this.state.dob}</div>
                    </div>
                </div>

                <div className="container bg-info text-primary w-50 mt-5" style={{ 'borderRadius': '20px' }}>
                    <hr></hr>
                    <h2>School Address</h2>
                    <div>Registation No {this.props.regno}</div>
                    <div>Name {this.props.name}</div>
                    <div>Location{this.props.location}</div>
                </div>

                <div className="container w-50 mt-5">

                    <button className="btn btn-primary" onClick={this.changeStudentData}> Change Student Data
                    </button>

                </div>

            </>
        )
    }
}