import React, { useReducer } from 'react';

// 1. Initial state now includes an errors object
const initialState = { 
    username: '', 
    email: '', 
    password: '',
    errors: {} 
};

// 2. Reducer handles field updates and error setting
function reducer(state, action) {
    switch (action.type) {
        case 'UPDATE_FIELD':
            return { 
                ...state, 
                [action.field]: action.payload,
                // Clear error for a field when the user starts typing in it again
                errors: { ...state.errors, [action.field]: '' }
            };
        case 'SET_ERRORS':
            return { ...state, errors: action.payload };
        case 'RESET_FORM':
            return initialState;
        default:
            return state;
    }
}

function UserForm1() {
    const [state, dispatch] = useReducer(reducer, initialState);

    // Validation Logic
    const validate = () => {
        let errors = {};
        if (!state.username) errors.username = "Username is required";
        
        if (!state.email) {
            errors.email = "Email is required";
        } else if (!/\S+@\S+\.\S+/.test(state.email)) {
            errors.email = "Email is invalid";
        }

        if (state.password.length < 6) {
            errors.password = "Password must be at least 6 characters";
        }

        return errors;
    };

    const handleChange = (e) => {
        dispatch({
            type: 'UPDATE_FIELD',
            field: e.target.name,
            payload: e.target.value,
        });
    };

    const handleSubmit = (e) => {
        e.preventDefault();
        const validationErrors = validate();
        
        if (Object.keys(validationErrors).length > 0) {
            dispatch({ type: 'SET_ERRORS', payload: validationErrors });
        } else {
            console.log("Form Submitted Successfully!", state);
            alert("Success!");
            // dispatch({ type: 'RESET_FORM' });
        }
    };

    return (
        <form onSubmit={handleSubmit} style={{ padding: '20px' }}>
            <div>
                <label>User name: </label>
                <input name="username" value={state.username} onChange={handleChange} />
                {state.errors.username && <p style={{ color: 'red' }}>{state.errors.username}</p>}
            </div>

            <div>
                <label>Email: </label>
                <input name="email" value={state.email} onChange={handleChange} />
                {state.errors.email && <p style={{ color: 'red' }}>{state.errors.email}</p>}
            </div>

            <div>
                <label>Password: </label>
                <input name="password" type="password" value={state.password} onChange={handleChange} />
                {state.errors.password && <p style={{ color: 'red' }}>{state.errors.password}</p>}
            </div>

            <button type="submit" style={{ marginTop: '10px' }}>Submit</button>

            <hr />
            <h4>Live Preview:</h4>
            <p>User: {state.username}</p>
            <p>Email: {state.email}</p>
        </form>
    );
}
export default UserForm1;