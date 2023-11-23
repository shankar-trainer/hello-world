import React from 'react'
import './App.css';

import {useSelector,useDispatch}from 'react-redux'

import {increment,decrement,signin,signout} from './actions/index'

function App4() {

  const counter = useSelector(state=>state.counter)
  const isLoggedIn = useSelector(state => state.isLoggedIn)

  const dispatch = useDispatch();

  

  return (
    <div className="App">
      <header className="App-header">
        <h2> Counter : {counter}</h2>

        <button onClick={()=>dispatch(increment(1))}>+</button>
        <button onClick={()=>dispatch(decrement(1))}>-</button>

        { 
          isLoggedIn ?
          <>
          <p> Secret Information - 81jbwdmnnBDnb2123nbn21nvnvjbka</p>
          <button onClick={()=>dispatch(signout())}> Logout </button>
          </>
           :
          <>
          <p> Please Login first </p>
          <button onClick={()=>dispatch(signin())}> Login </button>
          </>
        }

        

      </header>
    </div>
  );
}

export default App4;
