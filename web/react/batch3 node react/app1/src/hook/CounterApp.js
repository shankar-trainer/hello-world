import { useState } from "react";

function CounterApp() {
    const [c, increment] = useState(1)
    const incrementBy2 = () => increment(c + 2)

    return (
        <div className="container bg-info p-5 w-50 m-5 border-success">
            <h1>Hello world</h1>
            <div>Count is {c}</div>
            <div className="mt-2">
                <button onClick={() => increment(c + 1)} className="btn btn-secondary" >Increment</button>
                <button onClick={() => increment(c - 1)} className="btn btn-secondary"
                    style={{ "marginLeft": "10pt" }}
                >Decrement</button>

                <button onClick={incrementBy2} className="btn btn-secondary"
                    style={{ "marginLeft": "10pt" }}
                >incrementBy2</button>
            </div>
        </div>
    )
}
export default CounterApp;