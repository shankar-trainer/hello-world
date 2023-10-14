import {
    BrowserRouter as Router, Link, Switch, Route
} from 'react-router-dom';
import MyForm1 from './MyForm1';
import Counter2 from './Counter2';
import CustomerForm from './CustomerForm';
import BookStatePage from './BookStatePage'
import UserForm from './UserForm';
import UserForm1 from './formsubmit/UserForm';
import UserData from './formsubmit/UserData';
import Fetch from './Fetch';

function Dashboard() {
    return (
        <Router>
            <div>
                <nav className="nav navbar-dark bg-light text-primary navbar-expand-sm">
                    <ul className="navbar-nav">
                        
                        <li className="nav-item" style={{ marginLeft: '200px' }}>
                            <Link to="/myform">My Form </Link>
                        </li>

                        <li className="nav-item" style={{ marginLeft: '30px' }}>
                            <Link to="/userform">User Form </Link>
                        </li>

                         <li className="nav-item" style={{ marginLeft: '30px' }}>
                            <Link to="/userform1">User Form1 </Link>
                        </li>

                        
                        <li className="nav-item" style={{ marginLeft: '30px' }}>
                          <Link to="/login"></Link>
                        </li>



                        <li className="nav-item" style={{ marginLeft: '30px' }}>
                            <Link to="/counter2">Counter Application</Link>
                        </li>
                        <li className="nav-item" style={{ marginLeft: '30px' }}>
                            <Link to="/customerform">CustomerForm</Link>
                        </li>
                        <li className="nav-item" style={{ marginLeft: '30px' }}>
                            <Link to="/book">BookStatePage</Link>
                        </li>
                        <li className="nav-item" style={{ marginLeft: '30px' }}>
                            <Link to="/pdata">Product Data</Link>
                        </li>

                    </ul>
                </nav>
                <Switch>
                    <Route path="/myform"> 
                        <MyForm1></MyForm1>
                    </Route>

                    <Route path="/userform"> 
                        <UserForm></UserForm>
                    </Route>
                    
                  
                     <Route path="/userform1"> 
                        <UserForm1></UserForm1>
                     </Route>
                 *
                      {/*<Route  path="/" exact component={UserForm1}/> */}

                     {/*
                     <Route  path="/login/:name">
                      <UserData></UserData>
                     </Route>
                   */}

                    <Route  path="/login/:name" exact component={UserData}/> 

                    <Route path="/counter2">
                        <Counter2></Counter2>
                    </Route>

                    <Route path="/customerform">
                        <CustomerForm>
                        </CustomerForm>
                    </Route>
                    
                    <Route path="/book">
                     <BookStatePage>
                     </BookStatePage> 
                    </Route>

                    <Route path="/pdata"> 
                        <Fetch>
                        </Fetch>
                    </Route>
                </Switch>
            </div>
        </Router>
    )
}
export default Dashboard;