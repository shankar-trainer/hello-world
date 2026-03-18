import { useContext } from "react"
import { UserContext } from "../UserContext"
import { AgeContext } from "./AgeContext";

export const AgeComponent = () => {
  const { age, setAge } = useContext(AgeContext); 

  const increaseAge = () => {
    setAge(age + 1);
  };

  return (
    <div>
      <h1>My age is {age} years old</h1>
      <button onClick={increaseAge}>Increase Age</button>
    </div>
  );
};