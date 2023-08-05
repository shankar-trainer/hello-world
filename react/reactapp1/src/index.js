import React from 'react';
import ReactDOM from 'react-dom/client';
import './index.css';
import App from './App';
import reportWebVitals from './reportWebVitals';
import Hello1 from './Hello1';
import Person from './Person';
import BookMain from './bookmain';
import Employee from './Employee';

const root = ReactDOM.createRoot(document.getElementById('root'));
root.render(
  <React.StrictMode>
    {/* <App /> */}
    {/* <Hello1></Hello1> */}
    {/* <Person></Person> */}
    {/* <BookMain></BookMain> */}
    <Employee id="10001" name="ram kumar"></Employee>
  </React.StrictMode>
);

// If you want to start measuring performance in your app, pass a function
// to log results (for example: reportWebVitals(console.log))
// or send to an analytics endpoint. Learn more: https://bit.ly/CRA-vitals
reportWebVitals();
