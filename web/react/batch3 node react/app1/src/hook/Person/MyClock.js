import { useEffect, useState } from "react"

export const MyClock = () => {
  var time = new Date().toLocaleTimeString()
  const [t, setTime] = useState(time)
  const [c, setTime1] = useState(time)

  var updateTime = () => {
    setTime1(c => new Date().toLocaleTimeString())
  }
  useEffect(() => {
    setInterval(() => {
      setTime(t => new Date().toLocaleTimeString())
    }, 1000);
  })

  return (
    <>
      <div onLoad={setInterval(updateTime, 1000)}>{c}</div>
      <div >{t}</div>
    </>
  )
}
// export default MyClock;
