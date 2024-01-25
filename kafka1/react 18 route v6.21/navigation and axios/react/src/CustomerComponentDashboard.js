import { NavLink, Route, Routes} from 'react-router-dom'
import AllCustomer from'./CustomerComponent/AllCustomer';
import SearchCustomer from './CustomerComponent/SearchCustomer';

const CustomerComponentDashboard = () => {
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
                <Route path="/" element={<AllCustomer/>}/>
                <Route path="/allcustomer" element={<AllCustomer/>}/>
                <Route path="/searchbyid/:id" render={({ match }) => <SearchCustomer id={match.params.id} />} />
            </Routes>
        </div>
    )
}
export default CustomerComponentDashboard;
