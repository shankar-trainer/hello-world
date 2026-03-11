import { useLocation } from "react-router";

export const EmpData = () => {
    const { state } = useLocation();

    return (
        <div className="container">

            <div>Id is  {state.id}    </div>
            <div>Name is  {state.name}    </div>
            <div>Salary is  {state.salary}    </div>

        </div>
    )
}