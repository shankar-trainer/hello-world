import React from 'react';
import ReactDOM from 'react-dom/client';
import { Provider } from 'react-redux';

import './index.css';
import App from './App';
import CounterApp from './CounterApp';
import CounterReducer from './reducer/CounterReducer';
//import {CounterReducer} from './reducer/CounterReducer';

import store from './store/index';
import { createStore } from 'redux';

const root = ReactDOM.createRoot(document.getElementById('root'));

const store1=createStore(CounterReducer);

root.render(
  <div>
    <Provider store={store}>
    {/* <App /> */}
     <App /> 
    </Provider> 

    <Provider store={store1}>
      <CounterApp></CounterApp> 
    </Provider>
   </div>
);
