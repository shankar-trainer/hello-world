import { useDispatch, useSelector } from "react-redux";
import Increment from "./action/Increment";
import Decrement from "./action/decrement";

const CounterApp = () => {
    const counter = useSelector(state => state)
    //const counter = useSelector(state => state.c)
    const dispatch = useDispatch();

    return (
        <>
            <h1> Count  Application</h1>
            <div>
                <div>Count is {counter}  </div>
                <div>
                    <button onClick={() => dispatch(Increment())}>increment </button>
                </div>
            </div>

            <div>
                <div>Count is {counter}  </div>
                <div>
                    <button onClick={() => dispatch(Decrement())}>decrement </button>
                </div>
            </div>
        </>
    )
}

export default CounterApp;
