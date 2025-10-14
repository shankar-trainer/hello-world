import { createReducer, on } from "@ngrx/store";
import { initialState } from "./counter.state";
import { increment } from "./counter.action";

export const counterReducer1=createReducer(initialState,
    on(increment,(state)=>({...state,count:state.count+1}))
)