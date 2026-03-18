import {createContext, useState} from "react";
import {EmployeeComponent1} from "./EmployeeComponent1";

export const EmployeeContext=createContext(null);

export const EmployeeProvider=({children})=>{
    const [name, setName] = useState('amit kumar');

    return(
        <>
        <EmployeeContext.Provider value={{name,setName}}>
            {/*name is {name}*/}
            {children}
        </EmployeeContext.Provider>
        </>
    )
}