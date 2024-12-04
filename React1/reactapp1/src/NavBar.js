import { NavLink } from "react-router-dom"

export const NavBar = () => {
    return(
    <div className="container">
        <nav className="nav navbar-dark bg-light navbar-expand-sm">
            <NavLink to='customer' style={{ 'marginLeft': '50pt' }}>
                Customer
            </NavLink>
            <NavLink to='customerform' style={{ 'marginLeft': '50pt' }}>
                Customer Form
            </NavLink>
            <NavLink to='database' style={{ 'marginLeft': '50pt' }}>
                Database
            </NavLink>
            <NavLink to='hookscounter' style={{ 'marginLeft': '50pt' }}>
                Hooks Counter
            </NavLink>
            <NavLink to='hooksform' style={{ 'marginLeft': '50pt' }}>
                Hooks Form
            </NavLink>
            <NavLink to='/hello' style={{ 'marginLeft': '50pt' }}>
                Hello App
            </NavLink>
        </nav>
    </div>
    )
}