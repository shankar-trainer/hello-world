import { Component } from "react";
import Content from "./Content";
import Header from "./Header";

export default class MainPage extends Component {
    constructor(props) {
        super(props);


        this.state = {
            header: "Header from props",
            content: "Content from props"
        }
    }
    render() {
        return (
            <div>
                <Header headerProp={this.state.header}></Header>
                <Content contentProp={this.state.content}></Content>

            </div>)
    }
}