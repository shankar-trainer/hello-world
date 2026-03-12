import { NavLink } from 'react-router';

export const NavBar = () =>
        <div className='container'>

                <nav className='nav navbar-dark bg-light'>
                        <NavLink to='counter_hook' style={{ 'marginLeft': '50pt' }}>
                                Counter
                        </NavLink>

                        <NavLink to='userform_hook' style={{ 'marginLeft': '50pt' }}>
                                User Form
                        </NavLink>
                        <NavLink to='employee' style={{ 'marginLeft': '50pt' }}>
                                Employee Page
                        </NavLink>

                        <NavLink to='addemployee' style={{ 'marginLeft': '50pt' }}>
                                Add  Employee Form
                        </NavLink>
                        <NavLink to='allemployee' style={{ 'marginLeft': '50pt' }}>
                                All  Employee 
                        </NavLink>

                </nav>
        </div>

