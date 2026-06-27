import { useReducer } from "react"

const reducer = (state, action) => {

    if (action.type == 'increment')
        return state + 1;

    if (action.type == 'decrement')
        return state - 1;

    if (action.type == 'reset') {
        state = 0;
        return state;
    }
}

export const Counter3=() => {
    const [state, dispatch] = useReducer(reducer, 100)

    return (
        <>
            <p>Counter using usereducer</p>
            <p>Count is {state}</p>
            <div>
            <button onClick={()=>dispatch({'type':'increment'})}>Increment</button>
            </div>
            
            <div>
            <button onClick={()=>dispatch({'type':'decrement'})}>Decrement</button>
            </div>
            
            <div>
            <button onClick={()=>dispatch({'type':'reset'})}>Reset</button>
            </div>
        </>
    )
}