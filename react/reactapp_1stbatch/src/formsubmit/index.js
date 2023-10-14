//import { Route, Router, Switch } from "react-router"
import { Link, Route, BrowserRouter, Switch  } from "react-router-dom"
import UserForm from "./UserForm"
import UserData from "./UserData"

const  Welcome=()=> {
    return (
        <div>
            <BrowserRouter>
                <Link to="/"></Link>
                <Link to="/login"></Link>
                <Switch>
                    <Route  path="/" exact component={UserForm}/>
                        {/* <UserForm></UserForm>
                    </Route> */}

                    <Route  path="/login/:name" exact component={UserData}/>
                        {/* <UserData></UserData>
                    </Route> */}

                </Switch>
            </BrowserRouter>
        </div>
    )
}
export default Welcome;

// add the <Welcome></Welcome> to App.js or index.js