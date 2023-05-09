import { Route,BrowserRouter as   Router, Switch,Link } from "react-router-dom";
import Entertainment from "./Entertainment";
import Health from "./Health";
import Mobile from "./Mobile";
import Technology from "./Technology";
import Auto from "./Auto";
import  "./routing.css";

export default function MyPage(props) {
    return (
        <Router>
            <div className="bg-warning text-dark m-2 border border-primary" style={{'text-align':'left','height':'400pt','margin':'auto'}}>
                <nav>
                    <ul>
                        <li>
                            <Link to="/health">Health</Link>
                        </li>
                        <li>
                            <Link to="/auto">Auto</Link>
                        </li>
                        <li>
                            <Link to="/entertainment">Entertainment</Link>
                        </li>
                        <li>
                            <Link to="/mobile">Mobile</Link>
                        </li>
                        <li>
                            <Link to="/technology">Technology</Link>
                        </li>
                    </ul>
                </nav>
                <Switch>
                    <Route path="/health">
                        <Health></Health>
                    </Route>
                    <Route path="/mobile">
                        <Mobile></Mobile>
                    </Route>
                    <Route path="/technology">
                        <Technology></Technology>
                    </Route>
                    <Route path="/auto">
                        <Auto></Auto>
                    </Route>
                    <Route path="/entertainment">
                        <Entertainment></Entertainment>
                    </Route>
                </Switch>
            </div>

        </Router>
    )
}