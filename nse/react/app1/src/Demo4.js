import React, { Component } from "react";

class Demo4 extends Component {
  constructor() {
    super();
    this.state = {
      showHideFName: true,
      showHideLName: true
    };
    this.hideComponent = this.hideComponent.bind(this);
  }

  hideComponent(name) {
    switch (name) {
      case "showHideFName":
        this.setState({ showHideFName: !this.state.showHideFName });
        break;
      case "showHideLName":
        this.setState({ showHideLName: !this.state.showHideLName });
        break;
      default:

    }
  }

  render() {
    const { showHideFName, showHideLName } = this.state;
    return (
      <div>
        <table>
          {showHideFName && (
            <tr>
              <td>First Name :</td>
              <td>
                <input type="text" id="fName" />
              </td>
            </tr>
          )}
          {showHideLName && (
            <tr>
              <td>Last Name :</td>
              <td>
                <input type="text" id="lName" />
              </td>
            </tr>
          )}
          {showHideFName && showHideLName && (
            <tr>
              <td>
                <button>Submit</button>
              </td>
            </tr>
          )}
          <tr>
            <td>
              <button onClick={() => this.hideComponent("showHideFName")}>
                Hide First Name
              </button>
            </td>
            <td>
              <button onClick={() => this.hideComponent("showHideLName")}>
                Hide Last Name
              </button>
            </td>
          </tr>
        </table>
      </div>
    );
  }
}

export default Demo4;
