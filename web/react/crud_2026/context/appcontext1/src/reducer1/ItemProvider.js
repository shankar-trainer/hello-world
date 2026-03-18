import { createContext, useContext, useReducer } from "react";
import ItemReducer from "./ItemReducer";

const ItemContext = createContext();
const initialState = { items: [] };


export const ItemProvider = ({ children }) => {
  const [state, dispatch] = useReducer(ItemReducer, initialState);

  return (
    <ItemContext.Provider value={{ state, dispatch }}>
      {children}
    </ItemContext.Provider>
  );
};

// Custom hook for easy access
export const useItems = () => useContext(ItemContext);