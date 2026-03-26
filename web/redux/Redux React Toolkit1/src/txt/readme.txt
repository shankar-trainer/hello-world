This example demonstrates a React-Redux application managing two distinct states (counter and name) using combined reducers, displaying them on two separate, specialized pages (Components). 
1. Actions (actions.js)
javascript
export const increment = () => ({ type: 'INCREMENT' });
export const decrement = () => ({ type: 'DECREMENT' });
export const changeName = (name) => ({ type: 'CHANGE_NAME', payload: name });
2. Reducers (reducers.js)
javascript
import { combineReducers } from 'redux';

const counterReducer = (state = 0, action) => {
  switch (action.type) {
    case 'INCREMENT': return state + 1;
    case 'DECREMENT': return state - 1;
    default: return state;
  }
};

const nameReducer = (state = 'Guest', action) => {
  switch (action.type) {
    case 'CHANGE_NAME': return action.payload;
    default: return state;
  }
};

// Combine reducers to handle two states
export default combineReducers({
  count: counterReducer,
  username: nameReducer
});
3. Store Setup (store.js) 
javascript
import { createStore } from 'redux';
import rootReducer from './reducers';
export const store = createStore(rootReducer);
4. Components (App.js)
javascript
import React from 'react';
import { useSelector, useDispatch } from 'react-redux';
import { increment, decrement, changeName } from './actions';

// Page 1: Counter Display
const CounterPage = () => {
  const count = useSelector(state => state.count);
  const dispatch = useDispatch();
  return (
    <div>
      <h1>Count: {count}</h1>
      <button onClick={() => dispatch(increment())}>+</button>
      <button onClick={() => dispatch(decrement())}>-</button>
    </div>
  );
};

// Page 2: Name Display
const NamePage = () => {
  const username = useSelector(state => state.username);
  const dispatch = useDispatch();
  return (
    <div>
      <h1>Name: {username}</h1>
      <input 
        type="text" 
        placeholder="Change name"
        onChange={(e) => dispatch(changeName(e.target.value))}
      />
    </div>
  );
};

function App() {
  return (
    <div>
      <CounterPage />
      <hr />
      <NamePage />
    </div>
  );
}
export default App;
Key Takeaways
    Combined Reducers: The combineReducers function allows managing multiple slices of state (count and username) within a single Redux store.
    useSelector: Components subscribe only to the specific part of the state they need.
    useDispatch: Actions are dispatched to update specific state slices independently.
