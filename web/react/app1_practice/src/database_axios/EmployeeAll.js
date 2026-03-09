import axios from "axios"

const { useState, useEffect } = require("react")

 export const  EmployeeAll=()=>{
//  function   EmployeeCrud(){
  const [employee,setEmployee] =useState([])
  const [loading, setLoading]=useState(true)
  const [error,setError]=useState(null)

  useEffect(()=>{

    axios.get('http://localhost:2000/employee')
      .then(response=>{
        setEmployee(response.data);
        setLoading(false);  
      })
      .catch(e=>{
        setError(e.message)
        setLoading(false)
      });
  },[])
    if(loading) return <p>Loading</p>
    if(error) return <p>Error {error}</p>
   return(
     <>
     <div className="container bg-info text-success">
        <ul>
          {
            employee.map(e=>
              <>
             <li>{e.id}-
             {e.name}-
             {e.salary}</li>
             </>
           )
           }
        </ul>
        </div>
     </>
   )
}
// export default EmployeeAll;

    
