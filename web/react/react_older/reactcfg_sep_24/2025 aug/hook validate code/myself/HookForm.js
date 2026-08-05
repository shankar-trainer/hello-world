import { useState } from "react";

export const HookForm = () => {
    const [id, setId] = useState('')
    const [name, setName] = useState('')
    const [error, setError] = useState('')

    const submit = (event) => {
        event.preventDefault()
        if (!error) {
            //submit
        }
    }

    return (
        <div className="container">
            <form className="bg-info p-5 m-5 w-75 form-group" onSubmit={
                (event) => {
                    event.preventDefault()
                    if (!error) {
                        //submit
                    }
                }
            }>
                {/* <form className="bg-info p-5 m-5 w-50 form-group" onSubmit={submit} > */}

                <h1>User Forms</h1>
                <div className="form-group">
                    <label>Enter id</label>
                    <input value={id} className="form-control" onChange={
                        (event) => {
                            const value = event.target.value
                            setId(value)
                            if (value == '') {
                                setError('id is blank')
                            }
                            else if (isNaN(value)) {
                                setError('id is not a number')
                            }
                            else {
                                setError('')
                            }
                        }
                    } />
                </div>
                <div className="form-group">
                    <label>Enter Name</label>
                    <input value={name} className="form-control" onChange={
                        (event) => {
                            const value = event.target.value
                            setId(value)
                            if (value == '') {
                                setError('name is blank')
                            }
                            else if (value.length < 5 || value.length > 15) {
                                setError('name must of 5 - 15 character')
                            }
                            else {
                                setError('')
                            }
                        }
                    }/>
                </div>
                <div>
                    <div className="text-danger">{error && <p>{error}</p>}</div>
                    {/* <div className="text-danger">{error}</div> */}
                    <button type="submit" className="btn btn-primary w-25 mt-2">submit</button>
                </div>
            </form>
        </div>
    )

}