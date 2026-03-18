import {useContext} from "react";
import {AuthContext} from "./AuthProvider";

export const  LoginButton=()=>{
    const { isLoggedIn, setIsLoggedIn } = useContext(AuthContext);
    return (
        <button onClick={() => setIsLoggedIn(!isLoggedIn)}>
            {isLoggedIn ? 'Logout' : 'Login'}
        </button>
    );
}
