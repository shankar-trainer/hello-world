import React from 'react';
import ReactDOM from 'react-dom/client';
import './index.css';
import App from './App';
import reportWebVitals from './reportWebVitals';
import App2 from './App2';
import Customer from './Customer';
import Main from './Main';
import Person from './Person';

const root = ReactDOM.createRoot(document.getElementById('root'));
root.render(
  <React.StrictMode>
     <App /> 
    {/* <App2></App2> */}
    {/* <Customer></Customer> */}
    {/* <Main></Main> */}
    {/* <Person id='10001' name='vimal kumar' salary='12000'></Person> */}
    {/* <Person></Person> */}

  </React.StrictMode>
);

// If you want to start measuring performance in your app, pass a function
// to log results (for example: reportWebVitals(console.log))
// or send to an analytics endpoint. Learn more: https://bit.ly/CRA-vitals
reportWebVitals();
