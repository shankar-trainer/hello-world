import React from 'react';
import ReactDOM from 'react-dom/client';
import './index.css';
import App from './App';
import reportWebVitals from './reportWebVitals';
import App2 from './App2';
import Customer from './Customer';
import Main from './Main';
import Person from './Person';
import Welcome from './welcome';
import Dashboard from './Dashboard';
import App11 from './App11';
import App20 from './navigate/App20';
import App21 from "./User/hello1";
const root = ReactDOM.createRoot(document.getElementById('root'));
root.render(
  <React.StrictMode>
    {/* <App />  */}
    {/* <App2></App2> */}
    {/* <Customer></Customer> */}
    {/* <Main></Main> */}
    {/* <Person id='10001' name='vimal kumar' salary='12000'></Person> */}
    {/* <Person></Person> */}
    {/* <Welcome></Welcome> */}
    {/*<Dashboard></Dashboard> */}
    {/* <App20></App20> */}
    {/* <App11></App11> */}
      <App21></App21>
  </React.StrictMode>
);

// If you want to start measuring performance in your app, pass a function
// to log results (for example: reportWebVitals(console.log))
// or send to an analytics endpoint. Learn more: https://bit.ly/CRA-vitals
reportWebVitals();
