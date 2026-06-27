import { useState } from "react"

export const Counter1 = () => {
    const [c, increment] = useState(1);

    return (
        <>
            <div className="row">
                <div className="col-4 bg-info border border-secondary p-5 mt-2">
                    <p>count is {c}</p>
                    <button className="btn btn-primary" onClick={() => increment(c + 1)}>increment</button>
                </div>
            </div>
        </>
    )
}