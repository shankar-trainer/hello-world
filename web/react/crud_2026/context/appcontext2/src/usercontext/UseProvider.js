import {useState} from "react";
import {UserContext} from "./UserContext";

export const UserProvider = ({children}) => {
const [name,setName]=useState('');
return(
    <UserContext.Provider value={{name,setName}}>
        {children}
    </UserContext.Provider>
)

}