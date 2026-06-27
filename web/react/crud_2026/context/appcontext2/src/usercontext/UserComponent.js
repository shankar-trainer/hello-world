import {useContext} from "react";
import {UserContext} from "./UserContext";

export const UserComponent=()=>{
    const {setName}=useContext(UserContext);

    return (
        <>
            <label>Enter Name</label>
            <input  onChange={(e)=>setName(e.target.value)} />
        </>
    )


}