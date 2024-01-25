import { NavLink, Route, Routes} from 'react-router-dom'
import UserForm from "./User/UserForm";
import UserData from "./User/UserData";

const App = () => {
    return (
        <div>
            <nav className="nav navbar-light bg-light text-white navbar-expand-sm w-50" style={{'marginLeft':'350px'}}>
                <NavLink to='/userform' style={{marginLeft: '100px'}}>
                    User Form
                </NavLink>
                
                <NavLink to='/userdata' style={{marginLeft: '100px'}}>
                </NavLink>
            </nav>

            <Routes>
                <Route path="/" element={<UserForm/>}/>
                <Route path="/userform" element={<UserForm/>}/>
                <Route path="/userdata" element={<UserData/>}/>
            </Routes>
        </div>
    )
}
export default App;
