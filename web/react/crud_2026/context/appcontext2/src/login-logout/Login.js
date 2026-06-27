import { useAuth } from "./AuthContext"

export const Login=()=>{

    const {login}=useAuth();
    const handleLogin=()=>{
        login({name:'ram kumar',email:'ram@gmail.com'})
    }
    return <button onClick={handleLogin}>LogIn</button>
}