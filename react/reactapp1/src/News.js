import { Component } from "react";

export default class News extends Component {
    constructor(props) {
        super(props);

        this.state = {
            counter: 1,
            country: 'india'
        }
        this.changecountry = this.changecountry.bind(this);

    }
    changecountry() {
        console.log('change country called ...')
        this.setState({ country: 'nepal' })
    };

    increment = () => {
        this.setState({ counter: this.state.counter + 1 })
    }

    decrement = () => {
        this.setState({ counter: this.state.counter - 1 })
    }


    render() {
        return (
            <div className="bg-primary text-light p-5 m-5 w-50"
                style={{ "border": "double 40px", "border-radius": "25pt" }}>
                <p>
                    This is News  class Component
                </p>

                <p>
                    country is {this.state.country}
                </p>

                <p>
                    News section {this.props.language} language
                </p>

                <p>
                    News section for article {this.props.article}
                </p>
                <div >
                    <button type="button" onClick={this.changecountry}> change country </button>
                </div>
                <div className="mt-2">
                    <button type="button" onClick={this.increment}> increment </button>
                    <button type="button" onClick={this.decrement} style={{ 'marginLeft': '5px' }}> decrement </button>
                </div>

                <p>
                    counter is {this.state.counter}
                </p>


            </div>
        )
    }
}

