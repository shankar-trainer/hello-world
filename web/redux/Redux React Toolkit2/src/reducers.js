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