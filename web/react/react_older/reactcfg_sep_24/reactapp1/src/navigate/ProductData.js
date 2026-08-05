import { useLocation } from "react-router";

export const ProductData = () => {
    const { state } = useLocation();

    
 return (
    <div className="container">

    <div>Name is  {state.data1.firstName}  {state.data1.lastName}   </div>
    <div>Email is  {state.data1.email}    </div>
    <div>age is  {state.data1.age}    </div>

    </div>
 )
}