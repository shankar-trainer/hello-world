import React from 'react';
import { FlightForm } from './FlightForm';

export class EditFlight extends React.Component {
  constructor(props) {
    super(props);
  }
  render() {
    console.log(this.props);
    let { id } = this.props.match.params; // Unpacking and retrieving id
    let index = this.props.flightData.findIndex((e) => e.id === parseInt(id));
    let flight = this.props.flightData[index];
    return (
      <FlightForm
        flight={flight}
        handleChange={this.handleChange}
        handleSubmit={this.handleSubmit}
      />
    );
  }

  handleChange(event) {
    // Implementation here
  }

  handleSubmit(event) {
    event.preventDefault();
    // Implementation here
  }
}
