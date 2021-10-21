import React, { Component } from 'react';

class Timer extends Component{
    constructor(props) {
        super(props);
        this.launchClock();
        this.state = { currentTime: new Date().toLocaleString() };
      }

launchClock() {
    setInterval(()=> {
      this.setState({ currentTime: new Date().toLocaleString() });
    }, 1000);
  }
      render() {
        return React.createElement(
          'div',
          null,
          this.state.currentTime
        );
      }
}

export default Timer
