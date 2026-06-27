import { useDispatch, useSelector } from "react-redux"
//import {increment} from './action/Counter';
//import {increment} from './action/Counter';
//import {increment,decrement} from './action/Counter';
import {increment,decrement} from './action/';

const CounterApp=()=>{
    const counter=useSelector(state=>state);
    const dispatch=useDispatch();
    return(
        <>
        <div style={{'border':'solid','color':'blue','background':'white','width':'40%','padding':'30px','margin-left':'350px'}}>
          
          Count is.. {counter}
          <br></br>

          <button onClick={()=>dispatch(increment())}> increment button </button>
          <br></br><br></br>
          <button onClick={()=>dispatch(decrement())}> decrement button </button>
          
          
          </div>
        </>
    )
}
export default CounterApp;