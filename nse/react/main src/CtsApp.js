import React, { Component } from 'react';
import ReactDOM from 'react-dom'; 
import { BrowserRouter as Router, Switch, Route, Link } from "react-router-dom";
import  CtsHome  from './CtsHome';
import CtsTraining  from './CtsTraining';
import  CtsSales  from './CtsSales';
import './App.css';

class CtsApp extends Component {
  
render(){
  return (
    <Router>
      <div>
        <ul>
          <li>
            <Link to="/">Home</Link>
          </li>
          <li>
            <Link to="/training">Training</Link>
          </li>
          <li>
            <Link to="/sales">Sales</Link>
          </li>
        </ul>
        <hr />

        <Switch>
          <Route exact path="/">
            <CtsHome />
          </Route>
          <Route path="/training">
            <CtsTraining/>
          </Route>
          <Route path="/sales">
            <CtsSales/>
          </Route>
        </Switch>
      </div>
    </Router>
  );
}
}
export default CtsApp;
