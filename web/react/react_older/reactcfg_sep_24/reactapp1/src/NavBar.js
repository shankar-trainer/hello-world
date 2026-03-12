import { NavLink } from "react-router-dom"

export const NavBar = () => {
  return (
    <div className="container">
      <nav className="nav navbar-dark bg-light navbar-expand-sm">
        <NavLink to='user' style={{ "marginLeft": "50pt" }}>
          User
        </NavLink>

        <NavLink to='counter_hook' style={{ "marginLeft": "50pt" }}>
          Counter-Hook
        </NavLink>
        <NavLink to='counter_class' style={{ "marginLeft": "50pt" }}>
          Counter class
        </NavLink>


        <NavLink to='prdform' style={{ "marginLeft": "50pt" }}>
          Product Hook Form
        </NavLink>

        <NavLink to='empform_class' style={{ "marginLeft": "50pt" }}>
          Employee Form(class)
        </NavLink>

        <NavLink to='empform_hook' style={{ "marginLeft": "50pt" }}>
          Employee Form(hook-form)
        </NavLink>
        
        <NavLink to='empform2' style={{ "marginLeft": "50pt" }}>
          Employee Form2(hook normal)
        </NavLink>


        <NavLink to='prd_data1' style={{ "marginLeft": "50pt" }}>
          Product Data1
        </NavLink>



      </nav>
    </div>
  )
}