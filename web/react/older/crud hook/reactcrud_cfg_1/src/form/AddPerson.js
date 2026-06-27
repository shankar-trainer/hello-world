import React from 'react';
import { useForm } from 'react-hook-form';
import axios from 'axios';

//const { register, formState: { errors }, handleSubmit } = useForm();

export const AddPerson = (props) => {
    const { register, handleSubmit, formState: { errors } } = useForm();
    const onSubmit = data => {
        //alert(JSON.stringify(data))
        console.log('id is '+data.id+'\nname is '+data.name)
        axios.post('http://localhost:9090/allPerson', data).then(result => {
            props.history.push("/");
        })
    };

    return (
        <div className="card w-50 p-5 m-5 bg-info">
            <div className="card-body">
                <h5 className="card-title">Person Add</h5>
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
                            <label>Autor</label>
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
        </div>
    );
}

// npm install react-hook-form