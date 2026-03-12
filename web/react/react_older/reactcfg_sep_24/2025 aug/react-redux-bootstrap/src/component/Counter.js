import { useDispatch, useSelector } from "react-redux"

//useDispatch A hook to access the redux dispatch function.
//@returns — redux store's dispatch function

//useSelector  A hook to access the redux store's state. This hook takes a selector function as an argument. 
//The selector is called with the store state.

export const Counter = () => {
    //const Counter=()=>{
    const dispatch = useDispatch()

    const counter = useSelector((state) => state.counter);

    const increment = () => { dispatch({ type: 'increment' }) }
    const decrement = () => { dispatch({ type: 'decrement' }) }

    return (
        <div className='container bg-info text-primary'>
            <h1> Counter  Component </h1>
            <div>
                <div>Count is {counter}</div>
                <button type="button" onClick={increment} className="btn btn-primary">Increment</button>
                <button type="button" onClick={decrement} className="btn btn-primary">Decrement</button>
            </div>
        </div>
    )
}
//export  default Counter;