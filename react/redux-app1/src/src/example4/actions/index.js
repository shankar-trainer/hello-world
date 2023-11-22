export const increment = (payload) => {
    return {
        type:'INCREMENT',
        payload
    }
}

export const decrement = (payload) => {
    return {
        type:'DECREMENT',
        payload
    }
}

export const signin = () => {
    return {
        type:'SIGN_IN'
    }
}

export const signout = () => {
    return {
        type:'SIGN_OUT'
    }
}

