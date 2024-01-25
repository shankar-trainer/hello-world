import { useState } from "react";

export const Clock_hook = () => {
    let time = new Date().toLocaleTimeString();
    const [ctime, newTime] = useState(time);

    function updateTime() {
        time = new Date().toLocaleTimeString();
        newTime(time);
    }
  setInterval(updateTime, 1000);
    return (
        <div>
            {ctime}
        </div>
    )
}