import { Component } from "react";

class Counter extends Component {

    constructor() {
        super();
        this.state = {
            count: 1,
            name: "mycounter",
            data: []
        }
        this.increment = this.increment.bind(this)
        this.changeName = this.changeName.bind(this)
        this.changedata = this.changedata.bind(this)
    }

    // JavaScript (ES6+), you can achieve the same result more concisely using the spread operator. This avoids the need for .slice() and .push():
    changedata() {
    this.setState({
        data: [...this.state.data, "Hello"]
    });
  }

//   In React, you should never modify the state directly (e.g., this.state.data.push(item)). Instead, you must create a copy, modify that copy, and tell React to update using setState.


    // changedata() {
    //     var item = "Hello"
    //     var myArray = this.state.data.slice();
    //     myArray.push(item);
    //     this.setState({ data: myArray })
    // }
    increment() {
        this.setState({ count: this.state.count + 1 })
    }

    changeName() {
        this.setState({ name: 'ur_counter' })
    }
    render() {
        return (
            <>
                <p>name is {this.state.name}   <button onClick={this.changeName}>change name</button> </p>
                <p>count is {this.state.count}  <button onClick={this.increment}>increment</button> </p>
                <p>data is {this.state.data}    <button onClick={this.changedata}>change data</button> </p>
            </>
        )
    }
}
export default Counter;