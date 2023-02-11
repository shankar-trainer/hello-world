import { Component } from "react";

class CustomerForm extends Component {
    constructor() {
        super();
        this.state = {
            id: '',
            name: '',
            topic: '',
            errid:'',
            errname:'',
            errtopic:''
        }
    }
    handleForm=(e)=>{
     alert(`id is ${this.state.id}\nname is ${this.state.name}\ntopic is ${this.state.topic}`)
    }
    changeId=(e)=>{
        console.log('id length '+e.target.value.length)

        if(e.target.value.length==0)
         this.setState({errid:'id is blank'})
         
       else if(e.target.value<=0)
         this.setState({errid:'id is zero or negative'})

         else
         this.setState({id:e.target.value})
    }
    changeName=(e)=>{
        console.log('name length '+e.target.value.length)
        if(e.target.value.length==0)
         this.setState({errname:'name is blank'})
         else 
        this.setState({name:e.target.value})
    }
    changeTopic=(e)=>{
        if(e.target.value=='')
         this.setState({errtopic:'topic is blank'})
         else
         this.setState({topic:e.target.value})
    }
    render() {
        const {id,name,topic}=this.state
        return (
            <div>
                <form  onSubmit={this.handleForm} className="w-50 m-3 border border-primary p-5 m-5 bg-info text-dark" style={{ 'border-radius': '30' }}>
                    <div className="form-group">
                        <label>Enter Id</label>
                    </div>
                    <input value={id} className="form-control" onChange={this.changeId}></input>
                    <span className="text-warning">{this.state.errid}</span>

                    <div className="form-group">
                        <label>Enter Name</label>
                    </div>
                    <input value={name} className="form-control" onChange={this.changeName}></input>
                    <span className="text-warning">{this.state.errname}</span>

                    <div className="form-group">
                        <label>Select Topic</label>
                    </div>
                    <select  onChange={this.changeTopic} className="form-control">
                        <option value={topic}>{topic}</option>
                        <option value='angular'>Angular</option>
                        <option value='Jquery'>JQuery</option>
                        <option value='VueJs'>VueJs</option>
                    </select>
                    <span className="text-warning">{this.state.errtopic}</span>
                    <br></br>
                    <button  type='submit'   className="btn btn-primary" >Send</button>
                    <button  type='reset'  className="btn btn-primary m-5"    >Reset</button>
                </form>

                 <div className="border border-primary"  >
                      id is {this.state.id}<br></br>
                      name is {this.state.name}<br></br>
                      topic is {this.state.topic}<br></br>
                 </div><br></br><br></br><br></br><br></br><br></br>
            </div>
        )
    }
}
export default CustomerForm;