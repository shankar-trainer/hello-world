import { NavLink } from "react-router-dom"

 const Navbar=()=>{
   return(
    <div className="container">
        <nav className="nav navbar-dark bg-light">
          <NavLink to='pform'>
             Hook PersonForm 
          </NavLink>
             
          <NavLink to='counter' style={{"marginLeft":"10pt"}}>
             Hook Counter App 
          </NavLink>
          
          <NavLink to='employee' style={{"marginLeft":"10pt"}}>
              Employee
          </NavLink>
          <NavLink to='clock' style={{"marginLeft":"10pt"}}>
            Clock
          </NavLink>
          <NavLink to='cform' style={{"marginLeft":"10pt"}}>
              CustomerForm
          </NavLink>

          <NavLink to='book' style={{"marginLeft":"10pt"}}>
             Book
          </NavLink>
          
          <NavLink to='emp_data_class' style={{"marginLeft":"10pt"}}>
             EmployeeData
          </NavLink>



        </nav>
    </div>
   )
}
export default Navbar;