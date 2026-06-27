import {createContext, useState} from "react";

export const UserContext=createContext();

export const UserProvider=({children})=>{
const [name,setName]=useState('')

    return(
         <UserContext.Provider value={{name,setName}}>
             {children}
         </UserContext.Provider>
    )

}