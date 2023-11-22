import React from 'react';
import ReactDOM from 'react-dom';
import './index.css';
import App from './App';

import { Provider } from 'react-redux';

import {createStore} from 'redux'
import allReducer from './reducers'

const myStore = createStore(allReducer,/* preloadedState, */
  window.__REDUX_DEVTOOLS_EXTENSION__ && window.__REDUX_DEVTOOLS_EXTENSION__());

ReactDOM.render(
  <Provider store={myStore}>
    <App />
    </Provider>,
  document.getElementById('root')
);

