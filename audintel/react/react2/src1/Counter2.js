import { useState } from "react"

const Count2 = () => {
    var [count, setCount, userIncrement] = useState(1)
    userIncrement = () => {
        setCount(count + 1)
    }

    return (
        <>
            <h2>Counter2</h2>
            <button onClick={userIncrement}>  increment </button>   :  {count}
            <br></br><br></br><br></br><br></br>
            <button onClick={()=>{setCount(count-1)}}>  deccrement </button>   :  {count}
        </>

    )
}
export default Count2;