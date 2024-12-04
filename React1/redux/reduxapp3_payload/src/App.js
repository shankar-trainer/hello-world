import React from 'react';

import { useSelector, useDispatch } from "react-redux";
import {increment,decrement} from "./Actions/counterActions"

function App() {

  const counter = useSelector(state => state.counter);
  const isLogged = useSelector(state => state.isLogged);
  const dispatch=useDispatch();

  return (
    <div className="App">

      <h1>Counter: {counter}</h1>

      <button onClick={()=>dispatch(increment(5))}>Increment</button>
      <button onClick={()=>dispatch(decrement(5))}>Decrement</button>
      
      
      {isLogged ? <h1>Logged In</h1> : null}

    </div>
  );
}

export default App;

//https://github.com/CodeWUsama/Redux-counter-with-payload/tree/master