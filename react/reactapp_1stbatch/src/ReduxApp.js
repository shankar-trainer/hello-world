import { useDispatch, useSelector } from "react-redux";
import { decrement, increment } from "./action";

function ReduxApp(){
   const counter=useSelector(state=>state.counter)
   const dispatch=useDispatch()
   return(
    <div>
      <h2> Counter</h2>
      
      <div>{counter}
      </div>
      <button onClick={()=>dispatch(increment)}>increment</button>
      <button onClick={()=>dispatch(decrement)}>decrement</button>
    </div>
   )
}
export default ReduxApp;