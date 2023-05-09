import React, { Component } from 'react';

class App5 extends Component {
    render() {
        return (
            <div>
                <h1>React Life Cycle</h1>
                <Counter name="Count Program"></Counter>
            </div>
        )
    }
}
class Counter extends Component {

    constructor() {
        super();
        this.state = {
            count: 0
        }
    }

    render() {
        return (
            <div>
                <h3>{this.props.name}
                </h3>
                 {this.state.count}

                 <br>
                 </br>
                 <button type='button' onClick={this.countIt}> increment it</button>
            </div>
        )
    }

    countIt=()=>{
        this.setState({count:this.state.count+1})
    }

    componentDidUpdate(){
        console.log("did component  updated");
    }
    componentWillUpdate(){

        console.log(" component will update");
    }
    componentWillUnmount(){
        console.log(" component will unmount");
    }
    componentWillMount(){
        console.log(" component  will mount");
    }
    componentDidMount(){
        console.log("did component mount");
    }

}

export default App5;