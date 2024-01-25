import { Component } from "react";

export class Author extends Component {
    constructor(props) {
        super(props);
        this.state = {
            'author_id': 78878787,
            'author_name': 'suman kumar',
            'author_location': 'kolkotta',
        }
    }
    render() {
        return (
            <div>
                <h2>Author Page</h2>
                <table className="table table-striped table-bordered " style={{'backgroundColor':'lightyellow'}}>
                    <tr>
                        <th>Id</th>
                        <td>{this.state.author_id}</td>
                    </tr>
                    <tr>
                        <th>Name</th>
                        <td>{this.state.author_name}</td>
                    </tr>
                    <tr>
                        <th>Location</th>
                        <td>{this.state.author_location}</td>
                    </tr>
                   <tr>
                    <th>Authors Cars</th>
                   </tr>
                   <tr>
                   <table className="table table-striped table-bordered">
                       <tr>
                        <th>Reg No</th>
                        <th>Model</th>
                        <th>Cost</th>
                       </tr>
                       {
                        this.props.car.map(a=>
                            <tr>
                                <td>{a.regno}</td>
                                <td>{a.model}</td>
                                <td>{a.cost}</td>
                            </tr>
                            )
                       }
                   </table>
                   </tr>
                </table>
            </div>
        )
    }

}