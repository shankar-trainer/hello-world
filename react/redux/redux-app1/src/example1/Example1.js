import React from 'react';
import {useSelector, useDispatch} from 'react-redux';
//import { increment, decrement } from './actions';
import { increment, decrement } from './actions/myaction';

export default function Example1() {

  const counter=useSelector(state=>state.counter)
  const isLogged=useSelector(state=>state.isLogged)
  const dispatch=useDispatch()
  
  return (
<div className="App" style={{'border':'solid 10px','color':'blue','width':'30%','margin':'100px','padding':'20px'}}>
      <h1>Counter Application 1</h1>
      <h2>Counter{counter}</h2>
      <button onClick={()=>dispatch(increment())}>+</button>
      <button onClick={()=>dispatch(decrement())}>-</button>
    {
      isLogged?<h3>Valubale information I do not see</h3>:''
    }
    </div>
  );
}

