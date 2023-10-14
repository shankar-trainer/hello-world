import { Component } from "react";
import data from './bookdata';

class BookStatePage extends Component {
    constructor(props) {
        super(props);
        this.state = {
            book1: []
        }
    }
    
    bookData = () => {
        this.setState({
            book1: data
        })
    }
    bookData1 = () => {
        this.setState({
            book1: []
        })
    }
    render() {
        return (
            <>
                <div className="border border-primary p-5">
                    <div>
                        <h2>Employee Book</h2>
                        <table className="table table-striped">
                            {
                                this.state.book1.map((a) => (
                                    <tr>
                                        <td>{a.isbn}</td>
                                        <td>{a.name}</td>
                                        <td>{a.cost}</td>
                                    </tr>
                                ))
                            }
                        </table>
                    </div>

                    <button type="button" onClick={this.bookData}>Show Employee Data</button>
                    <button type="button" onClick={this.bookData1}>Hide Employee Data</button>
                </div>

            </>
        )
    }
}
export default BookStatePage;