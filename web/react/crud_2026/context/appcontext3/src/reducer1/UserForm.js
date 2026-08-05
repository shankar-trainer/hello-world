import React, { useReducer } from 'react';

// 1. Initial state
const initialState = { username: '', email: '', password: '' };

// 2. Reducer function to handle state updates
function reducer(state, action) {
    switch (action.type) {
        case 'UPDATE_FIELD':
            return { ...state, [action.field]: action.payload };
        case 'RESET_FORM':
            return initialState;
        default:
            return state;
    }
}

function UserForm() {
    const [state, dispatch] = useReducer(reducer, initialState);

    // 3. Dispatch actions
    const handleChange = (e) => {
        dispatch({
            type: 'UPDATE_FIELD',
            field: e.target.name,
            payload: e.target.value,
        });
    };

    return (
        <form>
            <div>
                user name   <input name="username" value={state.username} onChange={handleChange} />
            </div>
            <div>
                email <input name="email" value={state.email} onChange={handleChange} />
            </div>
            <div>
                passw <input name="password" value={state.password} onChange={handleChange} />
            </div>

            <p>user name {state.username}</p>
            <p>email {state.email}</p>
            <p>password {state.password}</p>

        </form>
    );
}


export default UserForm;