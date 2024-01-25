import React from "react";

export default class RegistrationForm1 extends React.Component {
  constructor(props) {
    super(props);
    this.state = {};
  }

  handleChange = e => {
    const { name, value } = e.target;
    this.setState({
      [name]: value
    });
  };

  render() {
    return (
      <div>
        <div className="radio-buttons border border-primary p-5  w-25" style={{ 'marginLeft': '400px', 'marginTop': '40px' }}>
          <div>
            Windows
            <input
              id="windows"
              value="windows"
              name="platform"
              type="radio"
              onChange={this.handleChange}
            />
          </div>
          <div>
            Mac
            <input
              id="mac"
              value="mac"
              name="platform"
              type="radio"
              onChange={this.handleChange}
            />
          </div>
          <div>
            Linux
            <input
              id="linux"
              value="linux"
              name="platform"
              type="radio"
              onChange={this.handleChange}
            />
          </div>
          <div className="mt-3">
            Platform is     {this.state.platform}
          </div>
        </div>
      </div>
    );
  }
}