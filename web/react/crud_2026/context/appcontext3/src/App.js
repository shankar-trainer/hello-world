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
import { User, User1, User2 } from './destructure/User';
import { Counter1, Counter2 } from './reducer2/Counter1';
import ParentComponent from './parent-child/ParentComponent';
import ChildComponent from './parent-child/ChildComponent';
import { Cart1 } from './Cart/Cart1';

function App() {
  return (
    <div>
     {/* <UserProvider>
         <UserInput></UserInput>
         <UserDisplay></UserDisplay>
     </UserProvider>
        <CountDisplay></CountDisplay> */}
        {/* <UserForm></UserForm> */}
        {/* <SignupForm></SignupForm> */}
        {/* <SignupForm1></SignupForm1> */}
        {/* <UserForm1></UserForm1> */}
        {/* <User  id={10019} name={'ram'}></User>
        <User1  id={10001} name={'ram'}></User1>
        <User2  {...cars}></User2>
        <Counter1></Counter1>
        <Counter2></Counter2> */}
        {/* <ParentComponent>
          <ChildComponent></ChildComponent>
        </ParentComponent> */}
        <Cart1></Cart1>
    </div>
  );
}



 const cars=[
    "maruti","alto","hundai"
 ]
export default App;
