import { useEffect, useState } from "react"

export default function UseEffectExample(props){
  const[count,countIncrement] =   useState(0)

   useEffect(()=>{
    document.title=`you have clicked ${count} times`
   })
    return(
        <div>
       <h1>UseEffect Example </h1>
       Count is {count}<br></br>
       <button onClick={()=>countIncrement(count+1)}> Increment </button>
       <br></br>{document.title}
       </div>
    )

}