import { useAuth } from "./AuthContext";

export const Navbar=()=>{
    const {user,logout}=useAuth();
    return(
        <nav>
            {
                user ? (
                    <>
                    <span>
                        Welocme, {user.name}
                    </span>
                    <button onClick={logout}></button>
                </>
                ):(
                    <span> Please log in</span>
                )
            }
        </nav>
    )
}
