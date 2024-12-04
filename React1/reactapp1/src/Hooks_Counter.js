import { useState } from "react";

//function Hooks_Counter() 
export const Hooks_Counter = () => {
    const [count1, setCount1] = useState(1);
    const [count2, setCount2] = useState(1);
    const [name, setName] = useState('shyam kumar');


    const nameChange=()=>{
        setName("kamal kumar")
    }

    return (
        
        <>
            <div className="border p-5 m-5 w-50 border-primary">
                <h2> Hooks Program </h2>
                <div>
                    My Name is  {name}
                </div>
                <button onClick={nameChange}> change name1</button>
                <button onClick={() => setName("suresh kumar")} className="btn btn-secondary mb-3">change name2</button>
                <div>
                    <button onClick={() => setCount1(count1 + 1)} className="btn btn-secondary">Increment {count1} </button>

                </div>
                <div>
                    <button onClick={() => setCount2(count2 - 1)} className="btn btn-secondary mt-5">Decrement {count2} </button>

                </div>
                <div>
                    <div>Counter Increment is {count1}</div>
                    <div>Counter Increment is {count2}</div>

                </div>
            </div>
        </>
    )

}
//export default Hooks_Counter;