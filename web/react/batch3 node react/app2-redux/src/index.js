import React from 'react';
import ReactDOM from 'react-dom/client';
import './index.css';
import App from './App';
import reportWebVitals from './reportWebVitals';
import CounterApp from './CounterApp';
import { Provider } from 'react-redux';
import { createStore } from 'redux';
import CountReducer from './reducer/CountReducer';

const root = ReactDOM.createRoot(document.getElementById('root'));
const store=createStore(CountReducer)

root.render(
  <React.StrictMode>
    {/* <App /> */}
    <Provider store={store}>
    <CounterApp></CounterApp>
    </Provider>
  </React.StrictMode>
);

// If you want to start measuring performance in your app, pass a function
// to log results (for example: reportWebVitals(console.log))
// or send to an analytics endpoint. Learn more: https://bit.ly/CRA-vitals
reportWebVitals();
