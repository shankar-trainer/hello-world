import { useState } from "react"

export const Counter1 = () => {

    const [c, increment] = useState(0);
    const [c1, decrement] = useState(100);
    const [c2, increment1] = useState(3);

    const incrementby3=()=>{
        increment1(c2 + 3)
    }

    return (
        <div className="container bg-info" style={{'border':'solid yellow 20pt','borderRadius':'50pt'}}>
            <div className="row border border-primary p-5 m-5 w-75">
             <div className="col-4 bg-success p-3">
                <div>
                    Count is {c2}
                </div>
                <div>
                    <button className="btn btn-success" onClick={incrementby3}>
                        Increment By 3
                    </button>
                </div>
            </div>


             <div className="col-4 bg-primary p-3">
                <div>
                    Count is {c}
                </div>
                <div>
                    <button className="btn btn-success" onClick={() => {
                        increment(c + 1)
                    }}>
                        Increment
                    </button>
                </div>
            </div>    

             <div className="col-4  bg-secondary text-light p-3">
                <div>
                    Count is {c1}
                </div>

                <button className="btn btn-warning" onClick={() => {
                    decrement(c1 - 1)
                }}>
                    Decrement
                </button>
                </div>
            </div>
        </div>
    )
} 