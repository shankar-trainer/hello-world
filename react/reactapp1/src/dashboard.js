import { BrowserRouter as Router, Route, Routes } from 'react-router-dom'

import Counter1 from "./Counter1"
import Counter2 from "./hook/Counter2"
import { Navbar } from './Navbar'
import News from "./News"
import PersonInfo from "./person/PersonInfo"
import UnControlledForm from "./UnControlledForm"
import UserForm from "./UserForm1"

const Dashboard = () => {

    return (
        <Router>
            <Navbar></Navbar>
            <Routes>
                {/* <Route exact path="/" element={<Navbar/>}/> */}
                <Route exact path="/userform" element={<UserForm />} />
                <Route exact path="/personinfo" element={<PersonInfo />} />
                <Route exact path="/counter1" element={<Counter1 />} />
                <Route exact path="/counter2" element={<Counter2 />} />

            </Routes>
        </Router>

    )
}
export default Dashboard