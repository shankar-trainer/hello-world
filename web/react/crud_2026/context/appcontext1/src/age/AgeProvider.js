import { useState } from "react"
import {AgeContext} from "./AgeContext";

export const AgeProvider = ({ children }) => {

    const [age, setAge] = useState(30);

    return (
        <>
        <AgeContext.Provider value={{ age, setAge }}>
            {children}
        </AgeContext.Provider>
        </>
    )
}