import logo from './logo.svg';
import './App.css';
import User from './user/user';
import Item from './user/Item';
import UserProfile from './UserProfile';
import Counter from './user/Counter';
import { Counter1 } from './hook/Counter1';
// import {EmployeeData} from './database/EmployeeData';
 import {EmployeeAll} from './database_axios/EmployeeAll';
import {EmployeeAdd} from "./database_axios/EmployeeAdd";
//  import EmployeeCrud from './database_axios/EmployeeCrud';

function App() {
  return (
    <div>
     {/* <User></User> */}
     {/* <Item item={array}></Item> */}
     {/* <UserProfile userID='10001' username='suresh babu'></UserProfile> */}
     {/* {
     <Counter></Counter>
     } */}
   {/* <Counter1></Counter1> */}
  {/* <EmployeeData></EmployeeData> */}
  {/* <EmployeeCrud></EmployeeCrud>*/}
        <EmployeeAdd></EmployeeAdd>
    </div>
  );
}

export default App;

const array=[
    {"id":10,"name":"apple","cost":120},
    {"id":1,"name":"banana","cost":50},
    {"id":2,"name":"tomato","cost":40},
    {"id":5,"name":"potato","cost":30},
    {"id":3,"name":"chocalate","cost":12},
    {"id":4,"name":"icecream","cost":110},
]

