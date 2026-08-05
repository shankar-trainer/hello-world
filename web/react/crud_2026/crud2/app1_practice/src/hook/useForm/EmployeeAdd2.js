import React, { useState } from 'react';
import { useForm } from 'react-hook-form';
import axios from 'axios';

export const EmployeeAdd2 = (props) => {
    const [msg, setMessage] = useState("");

    const { register, handleSubmit, formState: { errors } } = useForm();
    const onSubmit = data => {
        console.log('id is ' + data.id + '\nname is ' + data.name)
        axios.post('http://localhost:2000/employee', data).then(result => {
            const data = result.data;
            setMessage("record  added" + JSON.stringify(data));
        })
    };

    return (
        <div className="card w-50 p-5 m-5 bg-info">
            <div className="card-body">
                <h5 className="card-title">Add Employee</h5>
                <div className="card-text">
                    <form onSubmit={handleSubmit(onSubmit)}>
                        <div>

                        </div>
                        <div className="form-group">
                            <label>Enter Id</label>
                            <input type="text" className="form-control"  {...register('id', { required: true })} />
                            <small className="form-text text-danger">{errors.id?.type === 'required' && 'invalid id'}</small>
                        </div>
                        <div className="form-group">
                            <label>Name</label>
                            <input type="text" className="form-control" {...register('name', { required: true })} />
                            <small className="form-text text-danger">{errors.name && 'Invalid name'}</small>
                        </div>
                        <div className="form-group">
                            <label>Salary</label>
                            <input type="text" className="form-control" {...register('salary', { required: true })}></input>
                            <small className="form-text text-danger">{errors.salary && 'Invalid salary'}</small>
                        </div>
                        <button type="submit" className="btn btn-primary">Add</button>
                    </form>
                </div>
            </div>
                       {msg && <p>{msg}</p>}
 
        </div>
    );
}

// npm install react-hook-form