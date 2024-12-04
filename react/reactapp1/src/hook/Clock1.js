import { useState } from "react"

export const Clock1 = () => {
   var  time=new Date().toLocaleTimeString()
   var  date=new Date().toLocaleDateString()
   const [c, setTime] = useState(time);
   const [d, setDate] = useState(date);
   
   var  updateTime=()=>{
    setTime(c=>new Date().toLocaleTimeString())
   }
   
   var  updateDate=()=>{
    setDate(c=>new Date().toLocaleDateString())
   }

    return (
        <div>
            <span onLoad={setInterval(updateTime,1000)} style={{"float":"left"}}>{c}</span>
            <span onLoad={setInterval(updateDate,1000)} style={{"float":"right"}}>{d}</span>
        </div>
    )

}