import { useDispatch, useSelector } from "react-redux"
import Increment from "./actions/increment";
import Decrement from "./actions/decrement";

const CounterApp = () => {

    const counter = useSelector(state => state)
    const dispatch = useDispatch();
    return (
        <div>
            <div>
                Count is {counter}
            </div>
            <button onClick={()=>dispatch(Increment())}>Increment</button>
            <button onClick={()=>dispatch(Decrement())}>Decrement</button>
        </div>
    )
}
export default CounterApp;