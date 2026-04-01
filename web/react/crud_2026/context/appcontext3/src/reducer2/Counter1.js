import { useReducer, useState } from "react"

export const Counter1 = () => {
    const [count, setCounter] = useState(1);
    return (
        <>
            <h2>Counter App1 use State</h2>
            <button onClick={() => setCounter(count + 1)}>Count {count}</button>
        </>
    )
}

const reducer = (state, action) => {
    switch (action.type) {
        case 'increment':
            return  state + 1 ;

        case 'decrement':
            return state - 1 ;

        case 'reset':
            return {state:0} ;
    }
}

export const Counter2 = () => {
    const [state, dispatch] = useReducer(reducer, 0);
    return (
        <>
            <p>App 2 useReducer </p>
            {
                console.log('state    ' + state + '  dispatch    ' + dispatch)
            }
            <br></br>
            Count is {state}
            <br></br>
            <label onClick={() => dispatch({ type: 'increment' })}>increment</label>
            <br></br>
            <label onClick={() => dispatch({ type: 'decrement' })}>decrement</label>
            <br></br>
            <label onClick={() => dispatch({ type: 'decrement' })}>reset</label>
        </>
    )
}