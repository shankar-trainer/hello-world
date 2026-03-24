import {useContext} from "react";
import {UserContext} from "./UserContext";

export const UserDisplay = () => {
    const {name} = useContext(UserContext);

    return (
        <>
            name is {name}
        </>
    )
}