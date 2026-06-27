import {useContext} from "react";
import {UserContext} from "./UserProvider";

export const UserDisplay =()=> {
    const {name}=useContext(UserContext);
    return(
     <>
         name is {name}
     </>
    )

}