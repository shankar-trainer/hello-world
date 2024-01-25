import React from 'react';
import { Routes, Route, useParams } from 'react-router-dom';
import { FlightList } from './components/FlightList';
import { EditFlight } from './components/EditFlight';
import { FlightData } from './models/FlightData';
import { Nav } from './components/Nav';
import './App.css';

class App extends React.Component {
  constructor(props) {
    super(props);
    this.state = { flightData: FlightData };
    this.updateFlight = this.updateFlight.bind(this);
  }
  render() {
    const Wrapper = (props) => {
      const params = useParams();
      console.log('WRAPPER PARAMS: ', params);
      return (
        <EditFlight
          flightData={this.state.flightData}
          updateFlight={this.updateFlight}
          {...{ ...props, match: { params } }}
        />
      );
    };
    return (
      <div className="App">
        <Nav flightData={this.state.flightData} />
        <Routes>
          <Route path="/" element={<h1>Home Page</h1>} />
          <Route
            path="/flights/:id"
            element={<FlightList flightData={this.state.flightData} />}
          />
          <Route path="/edit/:id" element={<Wrapper />} />
        </Routes>
      </div>
    );
  }
  updateFlight(idx, flight) {
    let temp = this.state.flightData;
    temp[idx] = flight;
    this.setState({ flightData: temp });
  }
}
export default App;
