import { BrowserRouter as Router, Route, Routes } from 'react-router-dom'
import { Navigate } from 'react-router-dom';


import Counter1 from "./Counter1"
import Counter2 from "./hook/Counter2"
import { Navbar } from './Navbar'
import News from "./News"
import PersonInfo from "./person/PersonInfo"
import UnControlledForm from "./UnControlledForm"
import UserForm from "./UserForm1"
import Fetch from './database/Fetch'
import EmployeeForm from './hook/Employeeform';

const Dashboard = () => {

    return (
        <Router>

            <Navbar></Navbar>

            {/* <Navbar>inside routes will not render in every page   */}

            <Routes>
                {/* <Route exact path="/" element={<Navbar/>}/> */}
                {/* <Route index element={<Navbar />} /> */}
                {/* <Route exact path="/" component={UserForm} /> */}

                <Route path="/" element={<UserForm />} />
                <Route path="/userform" element={<UserForm />} />
                <Route path="/uncontrolledform" element={<UnControlledForm />} />
                <Route path="/hookform" element={<EmployeeForm />} />
                <Route path="/personinfo" element={<PersonInfo />} />
                <Route path="/counter1" element={<Counter1 />} />
                <Route path="/hookcounter" element={<Counter2 />} />
                <Route path="/fetchdata" element={<Fetch />} />

                {/* <Route path="*">
                    <Navigate to="/" />
                </Route>  */}

            </Routes>
        </Router>

    )
}
export default Dashboard