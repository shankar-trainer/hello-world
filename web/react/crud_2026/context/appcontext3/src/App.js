import logo from './logo.svg';
import './App.css';
import {UserProvider} from "./context1/UserProvider";
import {UserInput} from "./context1/UserInput";
import {UserDisplay} from "./context1/UserDisplay";
import {CountDisplay} from "./reducer1/CountDisplay";
import UserForm from './reducer1/UserForm';
import SignupForm from './reducer1/SignupForm';

function App() {
  return (
    <div className="App">
     {/* <UserProvider>
         <UserInput></UserInput>
         <UserDisplay></UserDisplay>
     </UserProvider>
        <CountDisplay></CountDisplay> */}
        {/* <UserForm></UserForm> */}
        <SignupForm></SignupForm>
    </div>
  );
}

export default App;
