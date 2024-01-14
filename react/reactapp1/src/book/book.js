import { Component } from "react";
export class Book extends Component {

    constructor(props) {
        super(props);
        this.state = {
            'isbn': 1900909,
            'bname': 'react for beginner',
            'cost': 1200
        };
    }
    render() {
        return (
            <div>
               <div className="bg-warning text-primary p-5 m-5">
                 <h1>Book Component</h1>
                  <table className="table table-striped table-bordered" 
                      style={{'border':'solid blue'}}>
                    <tr>
                      <th>isbn</th>
                      <td>{this.state.isbn}</td>  
                    </tr>
                    
                    <tr>
                      <th>book name</th>
                      <td>{this.state.bname}</td>  
                    </tr>
                    <tr>
                      <th>cost</th>
                      <td>{this.state.cost}</td>  
                    </tr>
                      <tr>
                        <table className="table table-bordered" style={{'border':'dotted'}}>
                            <tr className="bg-dark text-light">
                                <th  colspan='3'>Publisher</th>
                            </tr>
                            <tr>
                                <th>Id</th>
                                <th>Name</th>
                                <th>Location</th>
                            </tr>
                            <tr>
                                <td>{this.props.book_publisher.id}</td>
                                <td>{this.props.book_publisher.name}</td>
                                <td>{this.props.book_publisher.location}</td>
                            </tr>
                        </table>
                      </tr>
                  </table>

                 </div> 
            </div>
        )
    }
}

