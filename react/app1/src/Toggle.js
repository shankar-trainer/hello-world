import { Component } from "react";

export default class Toggle extends Component {

    constructor(props) {
        super(props);
        this.state = { isToggleOn: true }
    }

    handleClick = () => {
        this.setState(prevState => (
            {
                isToggleOn: !prevState.isToggleOn
            }
        )
        )
    }

    render() {
        return (
            <button onClick={this.handleClick}>{
                this.state.isToggleOn ? 'ON' : 'OFF'
            }
            </button>
        )
    }
}