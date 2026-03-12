import { useState } from "react"

export const Counter = () => {
   const [c, increment] = useState(0);
   const [customer1, setCustomer] = useState(customer);

   return (
      <div>
         <div className="container p-5 m-5 bg-info w-25" style={{"float":"left"}}>
            <p>
               Count is {c}
            </p>
            <p>
               <button type="button" className="btn btn-danger" onClick={
                  () => increment(c + 1)
               } >increment</button>
            </p>
            <p>
               <button type="button" className="btn btn-danger" onClick={
                  () => increment(c - 1)
               } >decrement</button>
            </p>

         </div>

         <div className="container p-5 m-5 bg-info w-25" style={{"float":"left"}}>
            <p>
               Customer  Data 
               <div> Id is {customer1.id}</div> 
               <div> Name is {customer1.name}</div> 
               <div> DOB {customer1.dob}</div> 
               <div> Location {customer1.location}</div> 
            </p>
            <p>
               <button className="btn btn-warning" onClick={
                  ()=>setCustomer(
                     {
                        "id": 767676,
                        "name": "rajendra kumar",
                        "dob": "1995-12-24",
                        "location": "mumbai"
                     }
                  )
               }>Change Customer </button>
            </p>
         </div>

      </div>
   )
}

var customer = {
   "id": 78787789,
   "name": "amit kumar",
   "dob": "1999-1-12",
   "location": "chennai"
}