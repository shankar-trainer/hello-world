import { Component } from "react";

class User1 extends Component {
    constructor(props) {
        super(props);
    }
    render(){
        return(
            <div>
              <h2>Hello User</h2>
              <div>
                name is {this.props.name}
              </div>
              
              <div>
                Address id  {this.props.address.id}
              </div>
              <div>
                Address City  {this.props.address.city}
              </div>

            </div>
        )
    }
}
export default User1;