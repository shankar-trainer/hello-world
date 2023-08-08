import React from 'react';
import ReactDOM from 'react-dom/client';
import './index.css';
import App from './App';
import reportWebVitals from './reportWebVitals';
import Hello1 from './Hello1';
import Person from './Person';
import BookMain from './bookmain';
import Employee from './Employee';
import BookStatePage from './BookStatePage';
import UserForm from './UserForm';
import UserCounter from './UserCounter';
import CustomerForm from './CustomerForm';
import Counter2  from './Counter2';
import MyForm1 from './MyForm1';
const root = ReactDOM.createRoot(document.getElementById('root'));
root.render(
  <React.StrictMode>
    {/* <App /> */}
    {/* <Hello1></Hello1> */}
    {/* <Person></Person> */}
    {/* <BookMain></BookMain> */}
    {/* <Employee id="10001" name="ram kumar"></Employee> */}
    {/* <BookStatePage></BookStatePage> */}
    {/* <UserForm id="1001" name="suresh kumar"></UserForm> */}
    {/* <UserCounter></UserCounter> */}
    {/* <CustomerForm></CustomerForm> */}
    {/* <Counter2></Counter2> */}
    <MyForm1></MyForm1>
  </React.StrictMode>
);

// If you want to start measuring performance in your app, pass a function
// to log results (for example: reportWebVitals(console.log))
// or send to an analytics endpoint. Learn more: https://bit.ly/CRA-vitals
reportWebVitals();
