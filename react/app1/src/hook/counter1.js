import { useState } from "react"

export default function Counter(props){
   const [count1,setCount1]=useState(0);
   const [count2,setCount2]=useState(0);
   const [count3,setCount3]=useState(100);


   
   return(
    <div className="bg-dark w-50  text-info" style={{margin:'auto',marginTop:'auto','text-align':'center'}}>
        <h1>Welcome to hooks </h1>
        
        <p>Increment  count is {count1} </p>
        <button onClick={()=>setCount1(count1+1)}>Click to Increment</button>
        <br></br>
        <p>Decrement  count is {count2} </p>
        <button onClick={()=>setCount2(count2-1)}>Click to Decrement</button>
       <br></br>
       
        <p>Decrement  count is {count3} </p>
        <button onClick={()=>setCount3(count3-1)}>Click to Decrement</button>
       <br></br>

    </div>
        )

}