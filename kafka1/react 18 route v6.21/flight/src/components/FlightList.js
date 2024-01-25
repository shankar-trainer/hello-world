import React from 'react';
import { useParams } from 'react-router-dom';

export function FlightList(props) {
  let { id } = useParams(); // Unpacking and retrieve id
  let index = props.flightData.findIndex((e) => e.id === parseInt(id));
  let flight = props.flightData[index];
  return (
    <div>
      <h1>Flight List Data</h1>
      <p>Flight Number: {flight.flight_no}</p>
      <p>Airline: {flight.airline}</p>
      <p>Departure Airport: {flight.departure_airport}</p>
      <p>Arrival Airport: {flight.arrival_airport}</p>
      <p>Depart Date: {flight.departure_date}</p>
      <p>Arrival Date: {flight.arrival_airport}</p>
    </div>
  );
}
