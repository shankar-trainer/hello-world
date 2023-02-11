import React from "react";
import {
    BrowserRouter as Router,
    Switch,
    Route,
    Link,
    useRouteMatch,
    useParams
  } 
from "react-router-dom";
import Book from "./book";
import Author from "./book-component/Author";
import Customer from "./book-component/Customer";
import Publisher from "./book-component/Publisher";

function App2() {
    return (
        <Router>
            <div>
                <nav>
                    <ul>
                        <li>
                            <Link to="/book">Home</Link>
                        </li>

                        <li>
                            <Link to="/publisher">Publisher</Link>
                        </li>
                        <li>
                            <Link to="/customer">Customer</Link>
                        </li>
                        <li>
                            <Link to="/author">Author</Link>
                        </li>

                    </ul>
                </nav>
                <Switch>
                  <Route path="/book">
                    <Book></Book>
                  </Route>
                  <Route path="/publisher">
                    <Publisher></Publisher>
                  </Route>
                  <Route path="/customer">
                    <Customer></Customer>
                  </Route>
                  <Route path="/author">
                    <Author></Author>
                  </Route>
                </Switch>
            </div>
        </Router>
    )
}
export default App2;