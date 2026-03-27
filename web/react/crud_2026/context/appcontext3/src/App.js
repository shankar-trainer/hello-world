import logo from './logo.svg';
import './App.css';
import {UserProvider} from "./context1/UserProvider";
import {UserInput} from "./context1/UserInput";
import {UserDisplay} from "./context1/UserDisplay";
import {CountDisplay} from "./reducer1/CountDisplay";
import UserForm from './reducer1/UserForm';
import SignupForm from './reducer1/SignupForm';
import UserForm1 from './reducer1/UserForm1';
import SignupForm1 from './reducer1/SignupForm1';

function App() {
  return (
    <div className="App">
     {/* <UserProvider>
         <UserInput></UserInput>
         <UserDisplay></UserDisplay>
     </UserProvider>
        <CountDisplay></CountDisplay> */}
        {/* <UserForm></UserForm> */}
        {/* <SignupForm></SignupForm> */}
        <SignupForm1></SignupForm1>
        {/* <UserForm1></UserForm1> */}
    </div>
  );
}

export default App;
