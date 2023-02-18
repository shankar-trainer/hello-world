import React,{Component} from 'react';

// function App2() {
//     return (<span>react test application</span>)
// }

class App2 extends Component {
    constructor(){
        super();
        this.state={country:"india",capital:"delhi"}            
    }
    render() {
        return (
            <div>
            <h1>This is react application</h1>
            <h2>Country is {this.state.country}</h2>
            <h2>Capital is {this.state.capital}</h2>
            <h3>language  is {this.props.language}</h3>
            <h3>company   is {this.props.company}</h3>
            <div>date is {new Date()}</div>
            </div>
        );
    }
}



export default App2;
