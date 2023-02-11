import { Component } from "react";

class Customer extends Component{
    constructor(props){
     super(props);
     this.state={
          city:'hyderabad',
          state:'telengana'
     }
    }
     changeCityStat=()=>{
        this.setState({
            city:'banglore',
            state:'karanataka'
        })
    }
     render(){
         return(
             <div  className="bg-primary text-light" style={{'border':'inset 20px','width':'40%','margin-left':'100px','font-size':'20px'}}> 
                 <span>Name {this.props.name} </span><br></br>
                 <label>Age {this.props.age}</label><br></br>
                 <label>City {this.state.city}</label><br></br>
                 <label>City {this.state.state}</label><br></br>
                 <button onClick={this.changeCityStat}>Change City And State </button>
             </div>
         )
     }

     shouldComponentUpdate(){
        console.log('component will be update ? false')
        return false;
     }

     componentWillUnmount(){
        console.log('component will unmount')
     }

     componentDidMount(){
        console.log('component has mounted ');
     }

     componentDidUpdate(){
        console.log('after  component  update ')
     }


 } 
 Customer.defaultProps={
     name:'ram kumar',
     age:'34'
 }
 export default Customer;