import { Component } from "react";
import Counter2 from './Counter2';
export default class Counter1 extends Component {
    constructor(props) {
        super(props);
        this.state = {
            count: 1,
            count1:1
        }

    }
    increment = () => {
        this.setState({ count: this.state.count + 1 })
    }

    render() {
        return <div style={{ 'margin-left': '600px', 'margin-top': '100px' }}>
            <button onClick={this.increment}>  increment </button>   :  {this.state.count}
            <br></br><br></br><br></br>
            <button onClick={() => {
                this.setState({ count1: this.state.count1 - 1 })
            }}>  decrement </button>   :  {this.state.count1}
                 <hr></hr>
                 <br></br><br></br>
                 <Counter2/>
        </div>;
    }
}