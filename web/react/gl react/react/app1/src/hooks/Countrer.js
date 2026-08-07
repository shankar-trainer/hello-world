import { useState } from "react";

// function Counter(){
const Counter = () => {
    const [c, setCounter] = useState(0)
    const [name, setName] = useState('parth kumar singh')
    return (
        <>
            <div className="container p-5 m-5 border border-primary w-75 row">
                <div className="col-6">
                    <h3>Counter Program</h3>

                    Count is {c}
                    <p></p>
                    <button className="btn btn-success" onClick={function () {
                        setCounter(c + 1)
                    }}>
                        increment
                    </button>

                    <button className="btn btn-success ms-2" onClick={function () {
                        setCounter(c - 1)
                    }}>
                        decrement
                    </button>
                </div>

                <div className="col-6 bg-warning">
                    Name change program
                    <div className="text-primary">
                    name is {name}
                    </div>
                    <button onClick={()=>{
                       setName("harsh sahu ji maharaj") 
                    }}>change name</button> 
                 </div>

            </div>
        </>
    )
}
export default Counter;