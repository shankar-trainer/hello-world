import { useState } from "react"

export const  Counter1=()=>{
     const [c,increment]=useState(1)

    return(
        <>
         <h1>Hello</h1>
         <p>Count is {c}</p>
         //code works for a single click
         <button type="button" onClick={()=>increment(c+1)}> increment</button>
         
         <button type="button" onClick={()=>increment(c=>c+1)}> increment__updater</button>

// it will increment by 1 only not by 2 as not using updater function  
         <button type="button" onClick={()=>{
         increment(c+1)
         increment(c+1)
         }
         }> increment__2</button>
       // it will increment by 2  as  using updater function  

         <button type="button" onClick={()=>{
         increment(c=>c+1)
         increment(c=>c+1)
         }
         }> increment__2_updater</button>

        </>
    )
}