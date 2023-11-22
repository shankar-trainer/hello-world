import { Component } from "react";

export default class WithoutHook extends Component {
     constructor(props){
      super(props);
        this.state={count:0};
     }
     incrementCount=()=>{
        this.setState({count:this.state.count+1})
    }
    componentDidMount(){
      //  console.log('componentDidMount called ....')
        this.setState({count:10})
        document.title='count '+this.state.count
        console.log(`count is ${this.state.count}`) 
    }
    componentDidUpdate(){
        console.log('update called ')
        document.title='count is '+this.state.count
    }

    render() {
        return (
            <>
            <h1>State Without  Hook</h1>
            <h2>Count is {this.state.count}</h2>
            <button onClick={this.incrementCount} >incrementCount</button>
            </>

        )
    }
}
