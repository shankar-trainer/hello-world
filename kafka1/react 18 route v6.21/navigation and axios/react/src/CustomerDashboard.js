import { NavLink, Route, Routes} from 'react-router-dom'
import AllCustomer from'./CustomerComponent/AllCustomer';

const CustomerDashBoard = () => {
    return (
        <div>
            <nav className="nav navbar-light bg-light text-white navbar-expand-sm w-50" style={{'marginLeft':'350px'}}>
                <NavLink to='/allcustomer' style={{marginLeft: '100px'}}>
                    All Customer
                </NavLink>
                

            </nav>

            <Routes>
                <Route path="/" element={<AllCustomer/>}/>
                <Route path="/allcustomer" element={<AllCustomer/>}/>
                
            </Routes>
        </div>
    )
}
export default CustomerDashBoard;
