import { NavLink } from "react-router-dom"

export const NavBar = () => {
    return (
        <div className="container">
            <nav className="nav navbar-dark bg-light navbar-expand-sm">
                <NavLink to='registrationform' style={{'marginLeft':'50px'}}>
                    Registration Form
                </NavLink>
                
                <NavLink to='counter1' style={{'marginLeft':'50px'}}>
                    Counter Application
                </NavLink>
                <NavLink to='bus' style={{'marginLeft':'50px'}}>
                    Bus App
                </NavLink>
                <NavLink to='customer' style={{'marginLeft':'50px'}}>
                    Customer Data 
                </NavLink>
                <NavLink to='hookform' style={{'marginLeft':'50px'}}>
                    Hook Form
                </NavLink>
                <NavLink to='registration_form1' style={{'marginLeft':'50px'}}>
                    Registration Form1
                </NavLink>

                <NavLink to='login' style={{'marginLeft':'50px'}}>
                   User Form
                </NavLink>

                {/*<NavLink to='app21' style={{'marginLeft':'50px'}}>*/}
                {/*    app21*/}
                {/*</NavLink>*/}

            </nav>

        </div>

    )
}