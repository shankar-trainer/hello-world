import { useReducer } from "react"

const reducer=(state,action)=>{
    return state+1;
}
export const Counter2=()=>{

    const [state,dispatch]=useReducer(reducer,0)

    return(
        <>
        count is {state}
        <button onClick={()=>dispatch()}>increment</button>
        </>
    )
}