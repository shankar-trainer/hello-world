import { NavLink } from 'react-router-dom'
import UserForm from './UserForm1'

export const Navbar = () => {

  return (
    <>
      <nav className="nav navbar-dark bg-light text-primary navbar-expand-sm">
        <NavLink to='/userform' style={{ marginLeft: '100px' }} >
          User Form
        </NavLink>

        <NavLink to='/uncontrolledform' style={{ marginLeft: '100px' }} >
          UnControlled Form
        </NavLink>

        <NavLink to='/hookform' style={{ marginLeft: '100px' }} >
          Hook Form
        </NavLink>

        <NavLink to='/personinfo' style={{ marginLeft: '100px' }} >
          Person Info
        </NavLink>
        <NavLink to='/counter1' style={{ marginLeft: '100px' }} >
          Counter1
        </NavLink>
        <NavLink to='/hookcounter' style={{ marginLeft: '100px' }}>
          Hook Counter
        </NavLink>

        <NavLink to='/fetchdata' style={{ marginLeft: '100px' }}>
          Fetch Data
        </NavLink>

      </nav>
      {/* <UserForm></UserForm> */}
    </>
  )
}