import React from 'react';
import ReactDOM from 'react-dom';
import * as serviceWorker from './serviceWorker';
import {createStore} from 'redux';
import App from './App'; 
//ACTION
  const increment=()=>{
    return {
    type:'INCREMENT'
    }
  }
  const decrement=()=>{
    return {
    type:'DECREMENT'
    }
  }

  //REDUCER
  const counter=(state=0,action)=>{
    switch (action.type) {

      case 'INCREMENT':
           return state+1;
      case 'DECREMENT':
           return state-1;
      default:
         return state;     
    }
  };

  //STORE
  let store=createStore(counter);
  store.subscribe(()=>console.log("state - - "+store.getState()));

  //DiSPATCH
  store.dispatch(increment());
  store.dispatch(increment());
  store.dispatch(decrement());
  store.dispatch(decrement());

ReactDOM.render(
    <App />,
  document.getElementById('root')
);

// If you want your app to work offline and load faster, you can change
// unregister() to register() below. Note this comes with some pitfalls.
// Learn more about service workers: https://bit.ly/CRA-PWA
serviceWorker.unregister();