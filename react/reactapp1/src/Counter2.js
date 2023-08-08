import { useState } from "react";

function Counter2() {
    const [x, increment] = useState(0);
    const [y, decrement] = useState(100);
    return (
        <div className="m-5 border border-primary w-50 p-5 bg-info">
            <div>
                Count1  is {x}
            </div>
            <div>
                <button type="button" className="btn btn-primary"
                    onClick={() => increment(x + 1)}
                > Increment
                </button>
            </div>
            <div>
                Count2  is {y}
            </div>
            <div>
                <button type="button" className="btn btn-primary"
                    onClick={() => decrement(y - 1)}
                > decrement
                </button>
            </div>
        </div>
    )
}
export default Counter2;