import { useEffect, useState } from "react";

export default function MyHook() {
    const [name, setName] = useState('mohan');
    const [count, setCount] = useState(1);

    const nameChange = () => {
        setName('suman kumar');
    }
    useEffect(() => {
        console.log(' use effect called ')
       document.title='count is '+count
        // setName('aman kumar')
        //setCount(10)
    })

    const Increment = () => {
        setCount(count + 1);
    }

    return (
        <>
            <h1> Hook Example</h1>
            name is {name}
            <p>
                count is {count}
            </p>
            <p>
                <button onClick={nameChange}>change name </button>
            </p>
            <p>
                <button onClick={Increment}>Increment Count</button>
            </p>
            <p>
                <button onClick={()=>setCount(count-1)}>Decrement Count</button>
            </p>

        </>
    )
}