import { BrowserRouter as Router, Route, Routes } from 'react-router-dom'

import Counter1 from "./Counter1"
import Home from './Home'
import Counter2 from "./hook/Counter2"
import News from "./News"
import PersonInfo from "./person/PersonInfo"
import UnControlledForm from "./UnControlledForm"
import UserForm from "./UserForm1"

const Dashboard = () => {

    return (

        <Router>
                <Routes>
                    <Route exact path="/" element={<Home/>}/>
                    <Route  path="/userform" element={<UserForm/>}/>
                    <Route  path="/personinfo" element={<PersonInfo/>}/>
                    <Route  path="/counter1" element={<Counter1/>}/>
                    <Route  path="/counter2" element={<Counter2/>}/>
                </Routes>
        </Router>

    )
}
export default Dashboard