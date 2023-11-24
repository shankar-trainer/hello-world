import React from 'react';
import ReactDOM from 'react-dom/client';
import './index.css';
import App from './App';
import reportWebVitals from './reportWebVitals';
import MyHook from './hook/hook1';
import WithoutHook from './hook/withoutHook';
import Example1 from './example1/Example1';
import { Provider } from 'react-redux';
import { createStore } from 'redux';
import allReducers from './example4/reducers';
import App4 from './example4/App';
import Index from './example5/js';
import rootReducer from './example5/js/reducers';
import Calculater from './Calculator/components/Calculater';

// example4 -- allReducer
// example5 -- rootReducer

// const store = createStore(allReducers,
//   window.__REDUX_DEVTOOLS_EXTENSION__ && window.__REDUX_DEVTOOLS_EXTENSION__()
// );

const store = createStore(rootReducer,
  window.__REDUX_DEVTOOLS_EXTENSION__ && window.__REDUX_DEVTOOLS_EXTENSION__()
);

const root = ReactDOM.createRoot(document.getElementById('root'));
root.render(
  <Provider store={store}>
    <React.StrictMode>
      {/* <App /> */}
      {/* <MyHook></MyHook> */}
      {/* <WithoutHook></WithoutHook> */}

      {/* <Example1></Example1> */}
      {/* <Example2></Example2> */}
      {/* <Example11></Example11> */}
      {/* <App3></App3> */}
      <App4></App4>
      <Index></Index>
      <Calculater></Calculater>
    </React.StrictMode>
  </Provider>
);

// If you want to start measuring performance in your app, pass a function
// to log results (for example: reportWebVitals(console.log))
// or send to an analytics endpoint. Learn more: https://bit.ly/CRA-vitals
reportWebVitals();
