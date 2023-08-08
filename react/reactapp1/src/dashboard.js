import {
    BrowserRouter as Router, Link, Switch, Route
} from 'react-router-dom';
import MyForm1 from './MyForm1';
import Counter2 from './Counter2';
import CustomerForm from './CustomerForm';
import BookStatePage from './BookStatePage'
import UserForm from './UserForm';

function Dashboard() {
    return (
        <Router>
            <div>
                <nav  className="nav navbar-dark bg-light text-primary navbar-expand-sm">
                    <ul className="navbar-nav ml-4">
                        <li className="nav-item"  style={{marginLeft:'300px'}}>
                            <Link to="/myform">User Form </Link>
                        </li>
                        <li className="nav-item"  style={{marginLeft:'30px'}}>
                            <Link to="/counter2">Counter Application</Link>
                        </li>
                        <li className="nav-item"  style={{marginLeft:'30px'}}>
                            <Link to="/customerform">CustomerForm</Link>
                        </li>
                        <li className="nav-item"  style={{marginLeft:'30px'}}>
                            <Link to="/book">BookStatePage</Link>
                        </li>

                    </ul>
                </nav>
                <Switch>
                    <Route path="/myform"> <MyForm1></MyForm1></Route>
                    <Route path="/counter2">
                        <Counter2></Counter2>
                    </Route>
                    <Route path="/customerform">
                        <CustomerForm>
                        </CustomerForm>
                    </Route>
                    <Route path="/book"> <BookStatePage>
                        </BookStatePage> </Route>
                </Switch>
            </div>
        </Router>
    )
}
export default Dashboard;

// npm i react-router-dom@5.3.4
// npm i react-router@5.3.4