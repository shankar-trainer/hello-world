import React from 'react';
import { Link } from 'react-router-dom';

export function Nav(props) {
  return (
    <div>
      <h1>Navigation</h1>
      <Link to="/">Home</Link>

      <ul className="no-style-list">
        {props.flightData.map((flight, index) => {
          return (
            <li key={index}>
              <Link className="nav-link" to={'/edit/' + flight.id}>
                Edit: {flight.flight_no}
              </Link>
            </li>
          );
        })}
      </ul>

      <ul className="no-style-list">
        {props.flightData.map((flight, index) => {
          return (
            <li key={index}>
              <Link className="nav-link" to={'/flights/' + flight.id}>
                Flight Details: {flight.flight_no}
              </Link>
            </li>
          );
        })}
      </ul>
    </div>
  );
}
