import { Route, BrowserRouter as Router, Routes } from "react-router-dom"
import Clock from "./Clock"
import RegistrationForm from "./RegistrationForm"
import { Counter1 } from "./Counter1"
import { Hook_form1 } from "./hook_form1"
import Bus from "./Bus"
import { Customer } from "./Customer_database1"
import { NavBar } from "./NavBar"

 const Dashboard=()=>{

    return(
        
        <Router>
            <NavBar></NavBar>
            <Routes>
                <Route path="/" element={<Clock></Clock>}></Route>
                <Route path="/registrationform" element={<RegistrationForm></RegistrationForm>}></Route>
                <Route path="/counter1" element={<Counter1></Counter1>}></Route>
                <Route path="/hookform" element={<Hook_form1></Hook_form1>}></Route>
                <Route path="/bus" element={<Bus></Bus>}></Route>
                <Route path="/customer" element={<Customer></Customer>}></Route>
            </Routes>
        </Router>
    )
}
export default Dashboard;