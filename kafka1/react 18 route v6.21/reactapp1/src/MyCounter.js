import { Component } from "react";

export default class MyCounter extends Component {
    constructor(props) {
        super(props);
        this.state = {
            c1: 1,
            c2: 100,
        }
    }
    render() {
        return (
            <div className="container border border-primary p-5 m-5 bg-warning w-50">
                <div>
                    Count1 is {this.state.c1}
                </div>
                <div>
                    Count2 is {this.state.c2}
                </div>

                <button onClick={this.countIncrement1} >Increment1</button>
                <button onClick={this.countIncrement2} >Increment2</button>
            </div>
        )
    }

    countIncrement1 = () => {
        this.setState({
            c1: this.state.c1 + 1
        })
    }
    countIncrement2 = () => {
        this.setState({
            c2: this.state.c2 + 1
        })
    }
}