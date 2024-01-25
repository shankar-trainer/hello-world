import React from 'react';

export function FlightForm(props) {
  let flight = props.flight;
  return (
    <div>
      <h1>Flight Form</h1>
      <div>
        <p>Flight Number: {flight.flight_no}</p>
        <p>Airline: {flight.airline}</p>
        <p>Departure Airport: {flight.departure_airport}</p>
        <p>Arrival Airport: {flight.arrival_airport}</p>
        <p>Depart Date: {flight.departure_date}</p>
        <p>Arrival Date: {flight.arrival_airport}</p>
      </div>
    </div>
  );
}
