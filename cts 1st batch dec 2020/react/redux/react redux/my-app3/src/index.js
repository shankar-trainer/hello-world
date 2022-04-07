import React from 'react';
import ReactDOM from 'react-dom';
import { Provider } from 'react-redux';
import { createStore, combineReducers } from 'redux';
import App from './App';


let reducer = (state=0, action) => {
  switch (action.type) {
    case 'INCREASE':
            return state+1
    case 'DECREASE':
            return state-1
    default: return state
  }
}

// not working
/*const rootReducer = combineReducers({
    reducer:reducer
});
*/

//let store = createStore(rootReducer);

// working
let store = createStore(reducer);

ReactDOM.render(
    <Provider store={store}>
      <App />
    </Provider>,
  document.getElementById('root')
);

//serviceWorker.unregister();
