import { createReducer, on } from "@ngrx/store";
import { initialState } from "./counter.state";
import { increment1 } from "./counter.action";

export const counterReducer2=createReducer(initialState,
    on(increment1,(state)=>({...state,count:state.count+1}))
)