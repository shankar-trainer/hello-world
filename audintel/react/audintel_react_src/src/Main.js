import { Component } from "react";
import NewsPaper from "./NewsPaper";

class Main extends Component{
     constructor(props){
        super(props);
        this.headervalues={
                            name:'nav bharat times',
                            edition:'march 22 edition'    
        }
     }
    
    render(){
        return(
            <div>
                <NewsPaper name={this.headervalues.name} edition={this.headervalues.edition}></NewsPaper>
               
            </div>
        );
    }

}
export default Main;