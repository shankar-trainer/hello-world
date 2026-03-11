import { NavLink } from "react-router-dom"

export const NavBar = () => {
  return (
    <div className="container">
      <nav className="nav navbar-dark bg-light navbar-expand-sm">
        <NavLink to='allemp' style={{ "marginLeft": "50pt" }}>
          All Employee       
        </NavLink>

        <NavLink to='add_emp' style={{ "marginLeft": "50pt" }}>
          Add Employee
        </NavLink>
       
        <NavLink to='add_emp1' style={{ "marginLeft": "50pt" }}>
          Add Employee1
        </NavLink>
       

      </nav>
    </div>
  )
}