import {Component} from 'react';  
import Clock from './Clock';

class User1 extends Component{
    constructor(props){
        super(props);
        this.state={
                      id:1001,
                      name:'ram kumar',
                      age:30   
        }
    };
    changeValue=()=>{
        this.setState({
            id:1009,
            name:'surendra kumar',
            age:27,
            email:'surendar@gmail.com',
        })
    }
    userInfo(){
    alert('method called ')
    }
     render(){
        return(
            <div>
                <table className='table table-striped table-bordered table-hover table-warning' style={{'width':'50%'}}>
                
                <tr><td>Id is </td><td>{this.state.id}</td></tr>                
                <tr><td>Name is</td><td></td> <td>{this.state.name}</td></tr>
                <tr><td>Age is</td> <td>{this.state.age}</td></tr>
                <tr><td>city is </td><td>{this.props.city}</td></tr>
                <tr><td>country is</td><td> {this.props.country}</td></tr>
                <tr><td><button onClick={this.changeValue} className="btn btn-primary">Change Value</button>
                </td><td/>
                </tr>
                <tr>
                    <td> Email Id 
                    </td>
                    <td>{
                        this.state.email
                    }
                    </td>
                </tr>
                </table>
                <div className='m-5 p-2 bg-primary text-light' style={{width:'30%','margin-left':300}}>
                <Clock></Clock>
                </div>
            </div>
        )
    }
}

export default User1;