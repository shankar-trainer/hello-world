import {useState} from "react";

function CounterApp(){
    const [c, setC] = useState(1);

    return(
        <div>
            Count is {c}
            <div>
            <button onClick={() => setC(c+1)}>
                increment
            </button>
        </div>
        </div>
    )
}
export default CounterApp;
