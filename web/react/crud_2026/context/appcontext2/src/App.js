import logo from './logo.svg';
import './App.css';
import {UserComponent} from "./usercontext/UserComponent";
import {UserDsiplay} from "./usercontext/UserDisplay";
import {UserProvider} from "./usercontext/UseProvider";
import {EmployeeProvider} from "./usercontext1/EmployeeProvider";
import {EmployeeComponent1} from "./usercontext1/EmployeeComponent1";
import {AuthProvider} from "./usercontext2/AuthProvider";
import {LoginButton} from "./usercontext2/LoginButton";

function App() {
    return (
        <div className="container">
            <div className="row">
                <UserProvider>
                    <div className="col-6">
                         <UserComponent/>
                    </div>
                    <div className="col-6">
                        <UserDsiplay/>
                    </div>
                </UserProvider>
            </div>

            <div className="row">
                <EmployeeProvider>
                    <EmployeeComponent1>

                    </EmployeeComponent1>

                </EmployeeProvider>

            </div>
            <div className="row">
                <AuthProvider>
                    <LoginButton />
                </AuthProvider>

            </div>


            </div>
    );
}

export default App;
