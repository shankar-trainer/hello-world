import React from 'react';
import ReactDOM from 'react-dom';
//import './index.css';
//import './model/style.css';

import EmployeeForm from './EmployeeForm';
import ParentComponent from './ParentComponent';
import CtsApp from './CtsApp';
import StudentForm from './StudentForm';
import CustomerForm from './model/CustomerForm';
import CustomerForm1 from './model/CustomerForm1';
import reportWebVitals from './reportWebVitals';
import ProductMain from './model/ProductMain';
import Register  from './model/Register';
require('./model/style.css');

ReactDOM.render(
  <Register></Register>
,
  document.getElementById('root')
);


// If you want to start measuring performance in your app, pass a function
// to log results (for example: reportWebVitals(console.log))
// or send to an analytics endpoint. Learn more: https://bit.ly/CRA-vitals
reportWebVitals();
