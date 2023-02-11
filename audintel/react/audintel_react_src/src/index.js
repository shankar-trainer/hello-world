import React from 'react';
import ReactDOM from 'react-dom/client';
import './index.css';
import App from './App';
import App2 from './App2';
import App1 from './App';
import App22 from './App22';
import Hello from './Hello'
import User from './Hello'
import Employee from './Employee';
import Counter from './Counter';
import User1 from './User';
import Student1 from './Student1';
import Clock from './Clock';import NewsPaper  from './NewsPaper';
import reportWebVitals from './reportWebVitals';
import Main from './Main';
import Customer from './Customer';
import MyForm from './MyForm';

const root = ReactDOM.createRoot(document.getElementById('root'));
root.render(
  <React.StrictMode>
    {/* <User id='676776' name='mahesh kumar' age='56' /> */}
    {/* <User1 city='hyderabad' country='india'></User1> */}
    {/* <Counter></Counter>  */}
    {/* <Clock></Clock> */}
    {/* <User1> </User1> */}
    
    {/* <NewsPaper name='bhaskar' edition='2022'>
    </NewsPaper>
     */}
      {/* <Main></Main>  */}
{/* <Customer></Customer> */}
{/* <MyForm></MyForm> */}
<App2></App2>
  </React.StrictMode>
);

// If you want to start measuring performance in your app, pass a function
// to log results (for example: reportWebVitals(console.log))
// or send to an analytics endpoint. Learn more: https://bit.ly/CRA-vitals
reportWebVitals();
