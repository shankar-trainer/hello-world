//action 

const { act } = require("react-dom/test-utils")
const { createStore } = require("redux")

const increment = () => {
    return {
        type: 'INCREMENT'
    }
}

const decrement = () => {
    return {
        type: 'DECREMENT'
    }
}


//reducer 

const counter = (state = 0, action) => {
    switch (action.type) {
        case 'INCREMENT':
            return state + 1;

        case 'DECREMENT':
            return state - 1;
    }
}

//store 

let store=createStore(counter);
store.subscribe(()=>console.log('state '+store.getState()))

//dispatch 

store.dispatch(increment())
store.dispatch(increment())
store.dispatch(increment())
store.dispatch(increment())







