import { useEffect } from "react";
import { useParams } from "react-router";

export const ProductData1 = () => {
   const { fname } = useParams();
   return (
      <div className="container">
         <div>Name is  {fname}   </div>
      </div>
   )
//    useEffect(() => {
//       console.log({fname});
//   },[]);

}

//http://localhost:3000/prd_data1/ram