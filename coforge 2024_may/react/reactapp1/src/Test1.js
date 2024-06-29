import { Component } from "react";

export default class Test1 extends Component {
    constructor() {
        super();
        this.state = {
            id: [1, 2, 3, 4, 5, 6]
        }
    }
    render() {
        return (
            <div>
                <div>    {this.state.id}</div>
                <div>
                    {
                        this.state.id.forEach(element => 
                          <div>Hi {element}</div>  
                        )
                    }
                </div>
                
                <div>
                    {
                        this.state.id.map(element => 
                          <div>Hi {element}</div>  
                        )
                    }
                </div>
            </div>

        )
    }
}