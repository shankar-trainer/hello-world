import {useContext} from "react";
import {UserContext} from "./UserProvider";

export const UserInput = () => {
    const {setName} = useContext(UserContext);
    return (
        <>
            <label> enter name</label>
            <input onChange={e =>
                setName(e.target.value)
            }/>
        </>
    )
}