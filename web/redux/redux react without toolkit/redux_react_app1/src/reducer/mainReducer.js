import { combineReducers } from "redux"
import changeNameReducer from "./changeNameReducer";
import counter from "./counterReducer"
import loggerReducer from "./loggerReducer";

const mainReducer = combineReducers(
    {
        mylogger: loggerReducer,
        mycount: counter,
        mychangename:changeNameReducer
    }
)

export default mainReducer;
