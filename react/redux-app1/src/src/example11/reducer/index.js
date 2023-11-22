import { combineReducers } from "redux";
import { counterReducer } from "./counterReducer";

export const allReducers=combineReducers({
counter: counterReducer

})