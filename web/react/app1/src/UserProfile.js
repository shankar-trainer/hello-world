import React, { Component } from 'react';

class UserProfile extends Component {
  constructor(props) {
    super(props);
    // 1. Initialize state
    this.state = {
      isVisible: false
    };

    // Bind the handler (if not using arrow functions)
    this.toggleVisibility = this.toggleVisibility.bind(this);
  }

  // 2. The Handler function
  toggleVisibility() {
    this.setState({ isVisible: true });
  }

  render() {
    return (
      <div style={{ border: '1px solid #ccc', padding: '20px' }}>
        {/* <h3>User: {this.props.username}</h3> */}
        
        {/* 3. Conditional Rendering */}
        {this.state.isVisible && (
            <p>
          <p>User ID: {this.props.userID}</p>
          <p>User Name: {this.props.username}</p>
          </p>
        )}

        <button onClick={this.toggleVisibility}>
          Show Prop Details
        </button>
      </div>
    );
  }
}

export default UserProfile;