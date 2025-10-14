// counter.selector.ts
import { createSelector, createFeatureSelector } from '@ngrx/store';
import { CounterState } from './counter.state';

// export const selectCounterState = createFeatureSelector<CounterState>('counter');
export const selectCounterState = createFeatureSelector<CounterState>('counter2');
//  constructor(private store:Store<{counter1:CounterState}>){

export const selectCount = createSelector(
    selectCounterState,
       (state: CounterState) => state.count
);