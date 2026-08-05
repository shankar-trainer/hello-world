import { Component } from "react";

class Book extends Component {
    render() {
        return (
            <div className="container bg-info p-5 m-5 w-50">
                <h1>Book Component</h1>
                <table className="table table-bordered table-striped bg-success text-light">
                    <tr>
                        <th>isbn</th>
                        <th>name</th>
                        <th>cost</th>
                    </tr>
                    <tr>
                        <td>{book1.isbn}</td>
                        <td>{book1.bname}</td>
                        <td>{book1.cost}</td>
                    </tr>
                </table>
            </div>
        )
    }
}
export default Book;
var book1 = {
    "isbn": 100001,
    "bname": "react for dummies",
    "cost": 1200,
}