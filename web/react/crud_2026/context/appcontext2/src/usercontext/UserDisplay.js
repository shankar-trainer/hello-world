import {useContext} from "react";
import {UserContext} from "./UserContext";

export const UserDsiplay = () => {
    const {name} = useContext(UserContext);

    return (
        <>
            name is {name}
        </>
    )
}