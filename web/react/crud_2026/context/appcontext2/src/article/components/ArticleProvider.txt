import { createContext, useReducer } from "react";
import { reducer } from "./reducer";

export const ArticleContext = createContext()
export const ArticleProvider = ({ children }) => {

    const [articles, dispatch] = useReducer(reducer, [
        { id: 1, title: "post 1", body: "learning react js" },
        { id: 2, title: "post 2", body: "will learn redux" }
    ]);

    return (
        <ArticleContext.Provider value={{ articles, dispatch }}>
            {children}
        </ArticleContext.Provider>
    );


}
