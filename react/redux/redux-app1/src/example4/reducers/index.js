import counterReducer from './counter.js'
import isLoggedInReducer from './isLogged.js'

import { combineReducers } from 'redux'

const allReducers = combineReducers(
    {
        counter: counterReducer,
        isLoggedIn: isLoggedInReducer
        
    }
)

export default allReducers;