import {useReducer} from "react";
import {countReducer} from "./countReducer";

export const  CountDisplay = ()=>{
                                          // reducer, initial value 
    const [state, dispatch] = useReducer(countReducer, {count:0})
    return (
        <div className='container bg-info p-5 ml-5 mt-5 w-50'>
         <div className="bg-info text-light">
           count is {state.count}
         </div>

        <button onClick={()=>dispatch({type:'INCREMENT'})} className='btn btn-success'>incrememt</button>
        <button onClick={()=>dispatch({type:'DECREMENT'})} className='btn btn-success ms-3'>decrement</button>
        </div>
    );
}