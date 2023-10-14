import { useState } from "react";

export default function Counter2() {
    const [count1, setCount] = useState(0);
    const [count2, decrementCount] = useState(100);


    return (
        <div className="container border border-primary bg-info text-light p-5 w-100 m-5">
            <table className="table   table-dark p-5 m-5 w-50">
                <tr>
                    <td><label>Increment   Count is {count1}</label></td>
                    <td><input type='button' onClick={() => setCount(count1 + 1)} value="increment" /></td>
                </tr>
                <tr>
                    <td><label>Decrement   Count is {count2}</label></td>
                    <td><input type='button' onClick={() => decrementCount(count2 - 1)} value="decrement" />
                    </td>
                </tr>
            </table>

        </div>
    )
}