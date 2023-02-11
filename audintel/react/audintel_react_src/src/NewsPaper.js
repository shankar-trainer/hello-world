import { Component } from "react";
import App from "./App";
import Clock from "./Clock";
import Customer from "./Customer";
import Article from "./newspaper-components/Article";
import Shopping from "./newspaper-components/Shopping";

class NewsPaper extends Component{
   constructor(props){
    super(props);
   }
    render(){
        return(
            <div  style={{'border':'solid','width':'90%','margin-left':'20px'}}> 
                <Clock></Clock>
                <h1>New Paper {this.props.name} </h1>
                <h2>Edition {this.props.edition}</h2>
                <Article></Article>
                <Shopping></Shopping>
                <Customer></Customer>
            </div>
        )
    }
} 
NewsPaper.defaultProps={
    name:'hindu',
    edition:'2022 december'
}
export default NewsPaper;