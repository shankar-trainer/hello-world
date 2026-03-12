import { createStore } from "redux";

const Store1 = (state = { counter: 0 }, action) => {

  if (action.type === 'increment')
    return { counter: state.counter + 1 };
  if (action.type === 'decrement')
    return { counter: state.counter - 1 };
  return state;
}

export default createStore(Store1)

