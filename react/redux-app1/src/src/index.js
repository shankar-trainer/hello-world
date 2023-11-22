import React from 'react';
import ReactDOM from 'react-dom';
import './index.css';
import App from './App';
import * as serviceWorker from './serviceWorker';
import {createStore,combineReducers} from 'redux';
import allReducers from './example1/reducers/index';
import {Provider} from 'react-redux';
import Example1 from './example1/Example1';
import Example2 from './example2';
import Example11 from './example11/Example11';
import App3 from './example3/App';
import Example5 from './example5/App';
import Index from './example5/js';
//const store=createStore(counterReducer,loggedReducer)
const store=createStore(allReducers,
    window.__REDUX_DEVTOOLS_EXTENSION__ && window.__REDUX_DEVTOOLS_EXTENSION__()
    );
ReactDOM.render( 
    <Provider store={store}>
      {/* <App /> */}
      {/* <Example1></Example1> */}
      {/* <Example2></Example2> */}
      {/* <Example11></Example11> */}
      {/* <App3></App3> */}
      <Index></Index>
    </Provider>,
  document.getElementById('root')
);

// If you want your app to work offline and load faster, you can change
// unregister() to register() below. Note this comes with some pitfalls.
// Learn more about service workers: https://bit.ly/CRA-PWA
serviceWorker.unregister();
