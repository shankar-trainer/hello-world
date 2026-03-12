import { useDispatch, useSelector } from "react-redux";
import Increment from "./action/Increment";

const CounterApp = () => {
    //const counter = useSelector(state => state)
    const counter = useSelector(state => state.c)
    const dispatch = useDispatch();

    return (
        <>
            <h1> Count Application</h1>
            Count is {counter}  ..<br></br>
            <button onClick={() => dispatch(Increment())}>increment </button>
        </>
    )
}

export default CounterApp;
