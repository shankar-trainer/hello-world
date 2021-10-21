import React, { Component } from 'react';
import ReactDOM from 'react-dom';

class LifeCycle extends Component {
    constructor(props) {
        super(props);
        this.state = {
            state: 'tamil nadu',
            capital: 'chennai'
        }
        console.log('this is constructor log')
    }

    componentWillMount() {
        console.log("componentWillMOunt " + ReactDOM.findDOMNode(this));
    }
    componentDidMount() {
        console.log("comnponent did mount ")
        console.dir(ReactDOM.findDOMNode(this))
    }

    componentWillUnmount() {
        console.log("comnponent will  unmount ")
        console.dir(ReactDOM.findDOMNode(this))
    }

    componentWillUpdate(newProps,newState) {
        console.log("component will  update ")
        console.dir(ReactDOM.findDOMNode(this))
    }
    componentWillReceiveProps(newProps){
    console.log('component will receive props')

    }
    shouldComponentUpdate(newProps,newState){
        return true;
    }

    update = () => {
        console.log('update method called')
        this.setState({
            state: 'kerala',
            capital: 'tiruanantpuram'
        })
    }
    render() {
        console.log("render  ...")

        return (
            <div>
                <button onClick={this.update}>Update</button>
                {React.createElement('h1', null, 'LifeCycle Program   ')}
                {React.createElement('h2', null, 'state is ' + this.state.state + '<br></br>capital is ' + this.state.capital)}
                <h3>state is {this.state.state}</h3>
                <h3>capital  is {this.state.capital}</h3>

            </div>
        );
    }

}

export default LifeCycle
