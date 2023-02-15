import React, { Component } from 'react'
import ReactDOM from 'react-dom'

class MyApp1 extends Component {
  constructor() {
    super()
    this.state = {
      name: 'React',
      isLiked: false
    }
  }
  handleBtnClick = () => {
    this.setState({
      isLiked: !this.state.isLiked
    })
  }
  render () {
    return (
      <div>
        <h1>welcome to{this.state.name}world</h1>
        <button onClick={this.handleBtnClick}>
          {
            this.state.isLiked ? '❤️cancellation' : 'collection'
          }
        </button>
      </div>
  	)
  }
}
export default MyApp1;