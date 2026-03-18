import { useContext } from "react"
import { ThemeContext } from "./ThemeContext";

export const ThemeComponent = () => {

    const theme = useContext(ThemeContext);

    return <div className={`container bg-${theme}`}>Current theme: {theme}</div>;


}