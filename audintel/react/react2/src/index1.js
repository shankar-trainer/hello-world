import React from 'react';
import ReactDOM from 'react-dom/client';
import './index.css';
import App from './App';
import NameForm from './NameForm';
import StartRating from './StarRating';
import reportWebVitals from './reportWebVitals';
import Counter1 from './Counter1';
import MyApp1 from './MyApp1';

const root = ReactDOM.createRoot(document.getElementById('root'));
root.render(
  <React.StrictMode>
    {/* <NameForm /> */}
    {/* <StartRating></StartRating> */}
    {/* <Counter1></Counter1> */}
    <MyApp1></MyApp1>
  </React.StrictMode>
);

// If you want to start measuring performance in your app, pass a function
// to log results (for example: reportWebVitals(console.log))
// or send to an analytics endpoint. Learn more: https://bit.ly/CRA-vitals
reportWebVitals();
