import { Component } from "react";

export class User extends Component{
    
    constructor(){
        super();
        this.state={
            "id":100001,
            "name":"anand kumar",
        }
    }
    render(){
        return(
            <>
             <p class="container p-5 m-p 
             bg-dark text-light w-50">
                <div>
                    id is {this.state.id}
                </div>    
                <div>
                    name is {this.state.name}
                </div>    
                <div>
                 country  is {this.props.country}
                </div>    
                <div>
                 capital  is {this.props.capital}
                </div>

                <h2>User Cars</h2>
                    {
                        this.props.mycar.map(a=>
                         <ul>
                            <li>{a.car_id}</li>
                            <li>{a.model}</li>
                            <li>{a.cost}</li>
                         </ul>  
                        )
                    }
             </p>
            </>
        )
    }
}