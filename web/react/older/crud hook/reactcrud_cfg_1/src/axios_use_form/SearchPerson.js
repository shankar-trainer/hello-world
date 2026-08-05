import React from 'react';
import { useForm } from 'react-hook-form';
import axios from 'axios';
//import {useHis}

//const { register, formState: { errors }, handleSubmit } = useForm();

export const SearchPerson = (props) => {
    const { register, handleSubmit, formState: { errors } } = useForm();
    const onSubmit = data => {
        axios.get('http://localhost:9090/allPerson', data).then(result => {
            props.history.push("/");
            
        })
    };

    return (
        <div className="card w-50 p-5 m-5 bg-info">
            <div className="card-body">
                <h5 className="card-title">Person Search</h5>
                <div className="card-text">
                    <form onSubmit={handleSubmit(onSubmit)}>
                        <div>

                        </div>
                        <div className="form-group">
                            <label>Enter Id</label>
                            <input type="text" className="form-control"  {...register('id', { required: true })} />
                            <small className="form-text text-danger">{errors.id?.type === 'required' && 'invalid id'}</small>
                        </div>
                         
                        <button type="submit" className="btn btn-primary">Search</button>
                    </form>
                </div>
            </div>
        </div>
    );
}

// npm install react-hook-form