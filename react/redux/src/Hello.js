import React from 'react';
import ReactDOM from 'react-dom/client';
import './index.css';
import App from './App';
import reportWebVitals from './reportWebVitals';
import { createStore } from 'redux';

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
  switch(action.type){
    case 'INCREMENT':
      return state+1;
    case 'DECREMENT':
      return state-1;
  }
};
//STORE
let store=createStore(counter);
store.subscribe(()=>console.log(store.getState()))

//DISPATCH 
store.dispatch(increment());
store.dispatch(increment());
store.dispatch(increment());
store.dispatch(decrement());
store.dispatch(decrement());
store.dispatch(decrement());
