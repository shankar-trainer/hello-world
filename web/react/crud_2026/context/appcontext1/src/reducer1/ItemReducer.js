import React, { createContext, useReducer, useContext } from 'react';

// 1. Initial State

// 2. Reducer Function
function ItemReducer(state, action) {
  switch (action.type) {
    case 'ADD_ITEM':
      return { items: [...state.items, { id: Date.now(), text: action.payload }] };
    case 'REMOVE_ITEM':
      return { items: state.items.filter(item => item.id !== action.payload) };
    default:
      return state;
  }
}
export default ItemReducer;
