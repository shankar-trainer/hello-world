import axios from "axios"

const { useState, useEffect } = require("react")

 export const  EmployeeSearch=()=>{
//  function   EmployeeCrud(){
  const [employee,setEmployee] =useState([])
  const [loading, setLoading]=useState(true)
  const [error,setError]=useState(null)
  const [name,setName]=useState("")
  const [salary,setSalary]=useState("")

     const { id } = useParams();
     useEffect(()=>{

    axios.get('http://localhost:2000/employee/'+id)
      .then(response=>{
        const data=response.data;
        setName(data.name);
        setSalary(data.salary);

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
         <div className="container">
             <form onSubmit={submit}>
                 <div className="form-group">
                     <label>enter id</label>
                     <input className="form-control" onChange={e=>setId(e.target.value)}></input>
                 </div>
                 <div>
                     <button type="submit">search recorad</button>
                     <button type="reset">cancel recorad</button>
                 </div>

             </form>
         </div>
     )
}
// export default EmployeeAll;

    
