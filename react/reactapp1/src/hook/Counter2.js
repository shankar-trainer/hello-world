import { useState } from "react";

export default function Counter2() {
    const [count1, setCount] = useState(0);
    const [count2, decrementCount] = useState(100);
    const [id, changeId] = useState('76');
    const [err_id, setErrorId] = useState('0');
    const [name, changeName] = useState('shyam kumar');
    const [err_name, setErrorName] = useState('');
    const [age, setAge] = useState('10');
    const [err_age, setErrorAge] = useState('10');

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

            <form className="bg-secondary w-100 p-5 m-5">
                <div className="form-group">
                    <label>Enter Id</label>
                    <input className="form-control" onChange={(e) => {
                        if (e.target.value == '')
                            setErrorId('id is blank')
                        else if (e.target.value <= 0)
                            setErrorId('id  cannot be zero or -ve')
                        else if (isNaN(e.target.value))
                            setErrorId('id must be numeric only')
                        else {
                            setErrorId('')
                            changeId(e.target.value)
                        }
                    }} />
                    <div className="text-warning">{err_id}</div>
                </div>
                <div className="form-group">
                    <label>Enter Name</label>
                    <input className="form-control" onChange={
                        (e) => {
                            if (e.target.value == '')
                                setErrorName('name is blank')

                            else if (e.target.value.length < 5 || e.target.value.length > 15)
                                setErrorName('name length must be of 5 - 15 characters')
                            else {
                                setErrorName('')
                                changeName(e.target.value)
                            }
                        }

                    }></input>
                    <div className="text-warning">{err_name}</div>

                </div>

                <div className="form-group">
                    <label>Enter Age</label>
                    <input className="form-control"
                        onChange={(e) => {
                            if (e.target.value == '')
                                setErrorAge('age can not be blank')

                            else if (e.target.value < 0)
                                setErrorAge('age can not be 0 or -ve')

                            else if (isNaN(e.target.value))
                                setErrorAge('age must of number ')
                            else {
                              setErrorAge('')
                              setAge(e.target.value)
                            }

                        }}
                    ></input>
                    <div className="text-warning">{err_age}</div>

                </div>

            </form>
        </div>
    )
}