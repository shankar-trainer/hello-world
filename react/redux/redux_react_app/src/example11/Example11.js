import React from 'react';
import {useSelector, useDispatch} from 'react-redux';
import { increment, decrement } from './action/index';


export default function Example11() {

  const counter=useSelector(state=>state.counter)
  //const isLogged=useSelector(state=>state.isLogged)
  const dispatch=useDispatch()
  
  return (
    <div className="App" style={{'border':'solid 10px','color':'red','width':'30%','margin':'50px','padding':'20px'}}>
      <h1>Counter Application 2</h1>
      
      <h2>Counter{counter}</h2>

      <button onClick={()=>dispatch(increment())}>+</button>
      <button onClick={()=>dispatch(decrement())}>-</button>
    {
    //  isLogged?<h3>Valubale information I donot see</h3>:''
    }
    </div>
  );
}

