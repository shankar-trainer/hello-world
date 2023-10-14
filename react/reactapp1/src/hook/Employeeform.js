import { useState } from "react";

export default function EmployeeForm() {

    const [id, changeId] = useState('');
    const [err_id, setErrorId] = useState('');
    const [name, changeName] = useState('');
    const [err_name, setErrorName] = useState('');
    const [age, setAge] = useState('');
    const [err_age, setErrorAge] = useState('');

    return (
        <div className="container border border-primary bg-info text-light p-5 w-100 m-5">

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

            <div className="border border-info bg-light text-primary p-5 m-5">
                <div>
                    Id is {id}
                </div>
                <div>
                    Name is {name}
                </div>

                <div>
                    Age is {age}
                </div>

            </div>
        </div>
    )
}