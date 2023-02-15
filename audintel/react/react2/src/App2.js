import React from "react";

class App2 extends React.Component {
constructor(props) {
    super(props);
    this.state = { counter: 0 };
  }
  handleClick(event) {
    this.setState({ counter: ++this.state.counter });
  }
  render() {
    return(
      <div>
        <button    className="btn btn-primary" onClick={this.handleClick.bind(this)}>
        "Don't click me "        
        {this.state.counter}    " times!"
        </button>
        </div>
      )
  }
}
  export default App2;