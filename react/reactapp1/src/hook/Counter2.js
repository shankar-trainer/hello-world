import { useState } from "react";

export default function Counter2() {
    const [count1, setCount] = useState(0);
    const [count2, decrementCount] = useState(100);
    const [id, changeId] = useState('0');
    const [name, changeName] = useState('shyam kumar');
    const [age, changeAge] = useState('10');

    return (
        <div className="container border border-primary bg-info text-light p-5 w-50 m-5">
            <div className="form-group">
                <table>
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

                <form className="bg-secondary w-50 p-5 m-5">
                    <div className="form-group">
                      <label>Enter Id</label>
                      <input className="form-control" onChange={()=>changeId()}></input>
                    </div>
                    <div className="form-group">
                      <label>Enter Name</label>
                      <input className="form-control"></input>
                    </div>
                     
                    <div className="form-group">
                      <label>Enter Age</label>
                      <input className="form-control"></input>
                    </div>
                     
                </form>
        </div>
        </div>
    )
}