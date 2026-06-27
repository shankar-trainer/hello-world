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
