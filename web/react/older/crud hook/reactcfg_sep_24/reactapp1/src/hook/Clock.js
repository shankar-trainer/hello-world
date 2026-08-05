import { useState } from "react"

export const Clock = () => {
   var  time=new Date().toLocaleTimeString()
   const [c, setTime] = useState(time);
   
   var  updateTime=()=>{
    setTime(c=>new Date().toLocaleTimeString())
   }

    return (
        <div>
            {
            setInterval(updateTime,1000)}
            <h1>Clock </h1>
            <div onLoad={()=>setInterval(setTime(c=>new Date().toLocaleTimeString()),1000)}>{c}</div>
            <div onLoad={()=>setInterval(time,1000)}>{c}</div>
            <div onLoad={()=>setInterval(setTime(time,1000))}>{c}</div>
          
            <div onLoad={setInterval(updateTime,1000)}>{c}</div>
            <div>{c}</div>
            
        </div>
    )

}