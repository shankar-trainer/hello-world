import { useState } from "react"

export const Test=()=>{
    //const [id, setId] = useState('')
    const [count,increment] = useState(1);
    const hello=()=>{
        increment(count-1)
    }
    // const dec=()=>{
    //     count=count-1
    // }


    return(
        <div>
            <h2>Hello World</h2>
            <button onClick={()=>increment(count+1)}>
                increment
            </button>
            <button onClick={hello}>
                decrement1
            </button>
            
            {/* <button onClick={(increment(dec()))}>
                decrement2
            </button> */}
    
            <div>
                Count is {count}
            </div>
        </div>
    )
}