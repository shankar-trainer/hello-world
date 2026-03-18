import {EmployeeContext} from "./EmployeeProvider";
import {useContext} from "react";

export const EmployeeComponent1 =()=> {
    const {name} = useContext(EmployeeContext);

    return(
    <>
    <h1>
        Employee Component1
        name is {name}
    </h1>
   </>
  )
}