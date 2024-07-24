import { Fragment } from "react"
import { useDispatch, useSelector } from "react-redux"
import { incr } from "./action1";

export const App=()=>{

    var c=useSelector(state=>state)
    var dispatch=useDispatch();

    return(
        <Fragment>
            <h2>Counter Application</h2>
            <p>count is {c}</p>
            <button onClick={()=>dispatch(incr())}>click to increment</button>

        </Fragment>
    )

}