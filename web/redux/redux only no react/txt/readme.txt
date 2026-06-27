create redux app without react

You can create a Redux application using vanilla JavaScript or with other UI libraries/frameworks, as Redux itself is a standalone state management library. The key difference from a React setup is that you must manually subscribe to store changes and update the DOM. 

Here is a step-by-step guide to creating a basic Redux app without React using vanilla JavaScript:
Prerequisites
  Node.js and npm installed on your system.
  Basic knowledge of JavaScript and npm.
Setup and Installation
  Create a project folder and navigate into it:

  bash
  mkdir redux-vanilla-app
  cd redux-vanilla-app
  Initialize a package.json file:
  bash
  npm init -y

Install Redux (and Redux Toolkit, the recommended approach for modern Redux):
bash
npm install @reduxjs/toolkit
Core Redux Concepts (Vanilla JS Implementation)
The following steps involve setting up the store, reducers, and actions, and then connecting them to your HTML interface using plain JavaScript.
1. Define Actions
Actions are plain JavaScript objects that describe what happened. 
javascript
// actions.js
export const increment = () => ({
  type: 'counter/increment',
});

export const decrement = () => ({
  type: 'counter/decrement',
})
;
A reducer is a pure function that takes the previous state and an action, and returns the new state. 
  Level Up Coding
  Level Up Coding

  javascript

  // reducer.js
    const initialState = {
      counter: 0,
  };



  export function counterReducer(state = initialState, action) {
    switch (action.type) {
      case 'counter/increment':
        return { ...state,
          counter: state.counter + 1
        };

    case 'counter/decrement':
      return { ...state,
        counter: state.counter - 1
      };
    default:
      return state;
  }
}
Note: With Redux Toolkit's createSlice, the reducer and action creation are simplified, but the underlying concepts remain the same. 
freeCodeCamp
freeCodeCamp
 +1
3. Create the Store
The store holds the application state. Use the configureStore function from Redux Toolkit to create it. 
freeCodeCamp
freeCodeCamp
 +1
javascript
// store.js
import {
  configureStore
} from '@reduxjs/toolkit';
import {
  counterReducer
} from './reducer';

const store = configureStore({
  reducer: {
    counterApp: counterReducer
  },
});

export default store;
4. Manually Update the UI (Subscription) 
Without a library like React Redux to automatically handle UI updates, you must manually subscribe to the store's changes using store.subscribe() and update the DOM elements. 
SitePoint
SitePoint
javascript
// index.html (main application file)
import store from './store.js';
import {
  increment,
  decrement
} from './actions.js';

const counterValueElement = document.getElementById('counter-value');
const incrementButton = document.getElementById('increment-btn');
const decrementButton = document.getElementById('decrement-btn');

// Function to update the UI with the current state
function render() {
  const state = store.getState();
  counterValueElement.textContent = state.counterApp.counter;
}

// Subscribe to store changes. The render function will be called every time an action is dispatched.
store.subscribe(render);

// Event listeners to dispatch actions
incrementButton.addEventListener('click', () => {
  store.dispatch(increment());
});

decrementButton.addEventListener('click', () => {
  store.dispatch(decrement());
});

// Initial render
render();
5. Create the HTML Structure
Create an index.html file to house your UI elements and link your JavaScript file.
html
<!-- index.html -->
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Redux Without React</title>
</head>
<body>
    <h1>Redux Counter (Vanilla JS)</h1>
    <p>Current Value: <span id="counter-value">0</span></p>
    <button id="increment-btn">Increment</button>
    <button id="decrement-btn">Decrement</button>

    <!-- Make sure to use type="module" if using ES6 imports -->
    <script type="module" src="index.html"></script>
</body>
</html>
This setup provides a complete, working Redux application using only plain JavaScript and HTML, demonstrating that Redux is UI-agnostic. You would run this application in a browser, potentially using a local development server. 
