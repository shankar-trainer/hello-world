import logo from './logo.svg';
import './App.css';
import {UserProvider} from "./context1/UserProvider";
import {UserInput} from "./context1/UserInput";
import {UserDisplay} from "./context1/UserDisplay";
import {CountDisplay} from "./reducer1/CountDisplay";

function App() {
  return (
    <div className="App">
     <UserProvider>
         <UserInput></UserInput>
         <UserDisplay></UserDisplay>
     </UserProvider>
        <CountDisplay></CountDisplay>
    </div>
  );
}

export default App;
