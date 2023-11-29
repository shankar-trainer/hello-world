import { combineReducers } from "redux";
import CountReducer from "./CountReducer";

const mainReducer=combineReducers({

    c:CountReducer,

})
export default  mainReducer;