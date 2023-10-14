import { Component } from "react";

export default class EmployeeBook extends Component {
    constructor(props) {
        super(props);
    }
    render() {
        return (
            <div>
                <h2>Employee book</h2>
                {
                    this.props.book.map((a) => (
                        <p>
                            {a.isbn}
                            {a.name}
                            {a.cost}
                        </p>
                    ))
                }
            </div>
        )
    }
}