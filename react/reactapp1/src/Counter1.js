import { Component } from "react";
import data from './bookdata';

class Counter extends Component {
    constructor(props) {
        super(props);

        this.state = {
            val: 1,
            val1: 100,
            id: 1001,
            name: 'suman kumar',
            data: [],
            book1: []
        }
        this.counterChange = this.counterChange.bind(this);
    }
    render() {
        return (
            <>
                <div className="border border-primary p-5">
                    <p>Array is   {this.state.data}</p>
                    <button type="button" onClick={this.addData}>Add data</button>
                    <button type="button" onClick={this.removeData}>Remove data</button>
                </div>

                <div className="border border-primary p-5">
                    <p>count is {this.state.val}</p>
                    <button type="button" onClick={this.counterChange}>increment</button>
                </div>
                <div className="border border-primary p-5">
                    <p>count is {this.state.val1}</p>
                    <button type="button" onClick={this.counterChange1}>decrement</button>
                </div>

                <div className="border border-primary p-5">
                    <p>id is {this.state.id}</p>
                    <p>name is {this.state.name}</p>
                    <button type="button" onClick={this.dataChange}>Change Above Data</button>
                </div>


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
                </div>

            </>
        )
    }
    dataChange = () => {
        this.setState({
            id: 70001,
            name: 'parahlad kumar'
        })
    }
    counterChange = function () {
        this.setState({
            val: this.state.val + 1
        })
    }

    bookData = () => {

        this.setState({
            book1: data
        })
    }

    addData = () => {
        var item = "hello ";
        var dataarray = this.state.data.slice();
        dataarray.push(item);
        this.setState({
            data: dataarray
        })
    }
    removeData = () => {
        var item = "hello ";
        var dataarray = this.state.data.slice();
        dataarray.pop();
        this.setState({
            data: dataarray
        })
    }
}
export default Counter;