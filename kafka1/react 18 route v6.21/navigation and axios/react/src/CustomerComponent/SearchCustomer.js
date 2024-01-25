import { Component } from "react";
import CustomerService from "./services/CustomerService";
import { useParams } from 'react-router-dom';
// not working
export function withRouter(Children) {
    return (props) => {
        const match = { params: useParams() };
        return <Children {...props} match={match} />
    }
}

class SearchCustomer extends Component {

    constructor(props) {
        super(props);
        this.service = new CustomerService();
        this.state = {
            id: this.props,
            id_error: '',
            customer: {}
        }
    }

    componentDidMount() {
        this.service.getCustomerById(this.state.id).then((res) => {
            this.setState({ customer: res.data })
        })
    }
    render() {
        return (
            <div className="container">
                <div className="form-group" >
                    <label>Enter Id</label>
                    <input className="form-control" onChange={
                        (e) => {
                            if (e.target.value == '')
                                this.setState({ id_error: 'id is blank' })
                            else if (isNaN(e.target.value))
                                this.setState({ id_error: 'id is not a number' })
                            else {
                                this.setState({ id_error: '' })
                                this.setState({ id: e.target.value })
                            }
                        }
                    }></input>
                </div>
                <div>
                    <button type="submit" onClick={(e=>{
                        
                    })} >search</button>
                </div>

                <div>{this.state.id_error}</div>
            </div>
        )
    }
}
export default withRouter(SearchCustomer);