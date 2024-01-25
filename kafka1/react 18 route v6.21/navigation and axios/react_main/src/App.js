import { NavLink, Route, Routes} from 'react-router-dom'
import ShowAllCustomer from './Customer_Hook/ShowAllCustomer';
import SearchCustomer from './Customer_Hook/SearchCustomer';

const App = () => {
    return (
        <div>
            <nav className="nav navbar-light bg-light text-white navbar-expand-sm w-50" style={{'marginLeft':'350px'}}>
                <NavLink to='/allcustomer' style={{marginLeft: '100px'}}>
                    All Customer
                </NavLink>
                <NavLink to='/searchbyid' style={{marginLeft: '100px'}}>
                    Search Customer
                </NavLink>
            </nav>

            <Routes>
                <Route path="/" element={<ShowAllCustomer/>}/>
                <Route path="/allcustomer" element={<ShowAllCustomer/>}/>
                <Route path="/searchbyid" element={<SearchCustomer></SearchCustomer>} />
            </Routes>
        </div>
    )
}
export default App;
