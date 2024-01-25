import { useEffect } from "react";
import { useLocation } from "react-router-dom";

const  UserData=(props)=>{
    const location = useLocation();


    return(
        <div>
            <h1>User Data </h1>
            Name is {location.state.name}
        </div>
    )
};
export default UserData;