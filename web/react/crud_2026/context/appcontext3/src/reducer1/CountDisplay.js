import {useReducer} from "react";
import {countReducer} from "./countReducer";

export const  CountDisplay = ()=>{
    const [state, dispatch] = useReducer(countReducer, {count:0})
    return (
        <div>

            count is {state.count}
        <button onClick={()=>dispatch({type:'INCREMENT'})}>incrememt</button>
        </div>
    );
}