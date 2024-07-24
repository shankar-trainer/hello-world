import React from 'react';
import { Provider } from 'react-redux';
import reportWebVitals from './reportWebVitals';
import './index.css';
//import { createStore } from 'redux';
//import CounterApp from './CounterApp';
//import CountReducer from './reducer/CountReducer';
import ReactDOM from 'react-dom/client';
//import mainReducer from './reducer/mainReducer';
import { reducer } from './reducer';
import { App } from './App';
import thunk from "redux-thunk" 
import { createStore, applyMiddleware } from 'redux';


const root = ReactDOM.createRoot(document.getElementById('root'));
const store=createStore(reducer) 
//const store=createStore(reducer, applyMiddleware(thunk));


root.render(
  <React.StrictMode>
    <Provider store={store}>
   <App></App>
    </Provider>
  </React.StrictMode>
);

// If you want to start measuring performance in your app, pass a function
// to log results (for example: reportWebVitals(console.log))
// or send to an analytics endpoint. Learn more: https://bit.ly/CRA-vitals
reportWebVitals();
