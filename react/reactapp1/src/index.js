import React from 'react';
import ReactDOM from 'react-dom/client';
import './index.css';
//import App from './App';
import reportWebVitals from './reportWebVitals';
import User from './user';
import Hello1 from './Hello1';
import Book1 from './book';
import News from './News';
import Person from './person/person';
import Counter1 from './Counter1';
import Address from './person/PersonInfo';
import PersonInfo from './person/PersonInfo';
import UserForm from './UserForm1';
import UnControlledForm from './UnControlledForm';
import Counter2 from './hook/Counter2';
import Dashboard from './dashboard';
const root = ReactDOM.createRoot(document.getElementById('root'));
root.render(
  <React.StrictMode>
    {/* <App /> */}
    {/* <User /> */}
    {/* <Hello1></Hello1> */}
    {/* <Book1></Book1> */}
    {/* <News langugae="hindi" article="election 2024"></News> */}
    {/* <Counter1></Counter1> */}
    {/* <Person></Person> */}
    {/* <PersonInfo></PersonInfo> */}
    {/* <UserForm></UserForm> */}
    {/* <UnControlledForm></UnControlledForm>*/}
    {/* <Counter2></Counter2> */}
  <Dashboard></Dashboard>
    </React.StrictMode> 

);

// If you want to start measuring performance in your app, pass a function
// to log results (for example: reportWebVitals(console.log))
// or send to an analytics endpoint. Learn more: https://bit.ly/CRA-vitals
reportWebVitals();
