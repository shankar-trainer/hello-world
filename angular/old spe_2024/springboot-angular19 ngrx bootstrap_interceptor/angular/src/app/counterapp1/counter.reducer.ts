    // counter.reducer.ts
    import { createReducer, on } from '@ngrx/store';
    import { increment, decrement, reset } from './counter.action';

    export interface CounterState {
      count: number;
    }

    export const initialCounterState: CounterState = {
      count: 0,
    };

    export const counterReducer = createReducer(
      initialCounterState,
      on(increment, (state) => ({ ...state, count: state.count + 1 })),
      on(decrement, (state) => ({ ...state, count: state.count - 1 })),
      on(reset, (state) => ({ ...state, count: 0 }))
    );