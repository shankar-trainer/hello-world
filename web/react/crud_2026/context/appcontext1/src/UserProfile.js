import { useContext } from "react"
import { UserContext } from "./UserContext"

export const UserProfile=()=>{
 const userName= useContext(UserContext);
  return <>
     Welcome {userName}
  </>

}