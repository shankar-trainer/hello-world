import logo from './logo.svg';
import './App.css';
import User from './user/user';
import Item from './user/Item';
import UserProfile from './UserProfile';
import Counter from './user/Counter';
import { Counter1 } from './hook/Counter1';
// import {EmployeeData} from './database/EmployeeData';
import { EmployeeAll } from './database_axios/EmployeeAll';
import { EmployeeAdd } from "./database_axios/EmployeeAdd";
import { EmployeeSearch } from './database_axios/EmployeeSearch';
import { Conditional } from './practice/conditional';
import UseEffect1 from './practice/UseEffect1';
import { AddEmployee1 } from './database_fetch/AddEmployee1';
import UnControlledForm from './practice/UnControlledForm';
import { AddEmployee } from './database_axios_spread/AddEmployee';
import { Reacthookform } from './hook/useForm/Reacthookform';
import { PersonSpreadForm } from './hook/PersonSpreadForm';
import { EmployeeAdd2 } from './hook/useForm/EmployeeAdd2';
import { EmployeeSearch1 } from './database_axios_spread/EmployeeSearch1';
import { SearchBook } from './database_axios_spread/SearchBook';
import { Link, NavLink, Route, Routes } from 'react-router-dom';
import { BookUseForm } from './hook/useForm/BookUseForm';
import { AllBook } from './database_fetch/AllBook';
import { EmployeeData } from './database_fetch/EmployeeData';
import AddEmployees from './employeecontext/AddEmployees';
import EmployeeList from './employeecontext/EmployeeList';
import { EmployeeContext, EmployeeProvider } from './employeecontext/EmployeeContext';

//  import EmployeeCrud from './database_axios/EmployeeCrud';

function App() {
  return (
    <div>
      {/* <EmployeeProvider>
      // in index.js add <EmployeeProvider> or here
        <div>
          <h1>Employee Management</h1>
          <AddEmployees />
          <EmployeeList />
        </div>
      </EmployeeProvider> */}


      {/* <User></User> */}
      {/* <Item item={array}></Item> */}
      {/* <UserProfile userID='10001' username='suresh babu'></UserProfile> */}
      {/* {
     <Counter></Counter>
     } */}
      {/* <Counter1></Counter1> */}
      {/* <EmployeeData></EmployeeData> */}
      {/* <EmployeeCrud></EmployeeCrud>*/}
      {/* <EmployeeAdd></EmployeeAdd> */}
      {/* <EmployeeSearch></EmployeeSearch> */}
      {/* <Conditional></Conditional> */}
      {/* <UseEffect1></UseEffect1> */}
      {/* <AddEmployee1></AddEmployee1> */}
      {/* <EmployeeAll></EmployeeAll> */}
      {/* <UnControlledForm></UnControlledForm> */}
      {/* <AddEmployee></AddEmployee> */}
      {/* <Reacthookform></Reacthookform>        */}
      {/* <PersonSpreadForm></PersonSpreadForm> */}
      {/* <EmployeeAdd2></EmployeeAdd2> */}
      {/* <EmployeeSearch1></EmployeeSearch1> */}
      {/* <SearchBook></SearchBook> */}

      {/* <nav>
      <Link to='/addemployee'>AddEmployee_axios_spread</Link>
      <Link to='/allemployee'>All Employee</Link>
      <Link to='/addemployee1' style={{'marginLeft':'10pt'}}>Add Employee1</Link>
      <Link to='/addemployee2'  style={{'marginLeft':'10pt'}}>Add Employee useForm</Link>
      <Link to='/addemployee3'  style={{'marginLeft':'10pt'}}>Add Employee3</Link>
      <Link to='/bookuseform'  style={{'marginLeft':'15pt'}}>Add Book useForm</Link>
      <Link to='/allbook'  style={{'marginLeft':'10pt'}}>All Book</Link>
      <Link to='/counter'  style={{'marginLeft':'10pt'}}>Counter</Link>
      <Link to='/counter1'  style={{'marginLeft':'10pt'}}>Counter1</Link>
    </nav>
     */}
      <nav className="nav navbar-dark bg-light">

        <NavLink to='/addemployee'>AddEmployee_axios_spread</NavLink>
        <NavLink to='/allemployee'>All Employee</NavLink>
        <NavLink to='/addemployee1' style={{ 'marginLeft': '10pt' }}>Add Employee1</NavLink>

        <NavLink to='/addemployee2' style={{ 'marginLeft': '10pt' }}>Add Employee useForm</NavLink>
        <NavLink to='/addemployee3' style={{ 'marginLeft': '10pt' }}>Add Employee3</NavLink>

        <NavLink to='/bookuseform' style={{ 'marginLeft': '15pt' }}>Add Book useForm</NavLink>
        <NavLink to='/allbook' style={{ 'marginLeft': '10pt' }}>All Book</NavLink>
        <NavLink to='/counter' style={{ 'marginLeft': '10pt' }}>Counter</NavLink>
        <NavLink to='/counter1' style={{ 'marginLeft': '10pt' }}>Counter1</NavLink>
        <NavLink to='/context_addemployee' style={{ 'marginLeft': '10pt' }}>Add Employee_con</NavLink>
        <NavLink to='/context_employeelist' style={{ 'marginLeft': '10pt' }}>List Employee_con</NavLink>
      </nav>

      <Routes>
        <Route path='/addemployee' element={<AddEmployee></AddEmployee>}> </Route>
        <Route path='/addemployee1' element={<EmployeeAdd></EmployeeAdd>}> </Route>
        <Route path='/addemployee2' element={<AddEmployee1></AddEmployee1>}> </Route>
        <Route path='/allemployee' element={<EmployeeData></EmployeeData>}> </Route>
        <Route path='/addemployee3' element={<EmployeeAdd2></EmployeeAdd2>}></Route>
        <Route path='/bookuseform' element={<BookUseForm></BookUseForm>}></Route>
        <Route path='/allbook' element={<AllBook></AllBook>}>All Book </Route>
        <Route path='counter' element={<Counter></Counter>}>Counter</Route>
        <Route path='counter1' element={<Counter1></Counter1>}>Counter1</Route>


        <Route path='context_addemployee' element={<AddEmployees></AddEmployees>}></Route>
        <Route path='context_employeelist' element={<EmployeeList></EmployeeList>}></Route>
      </Routes>
    </div>
  );
}

export default App;

const array = [
  { "id": 10, "name": "apple", "cost": 120 },
  { "id": 1, "name": "banana", "cost": 50 },
  { "id": 2, "name": "tomato", "cost": 40 },
  { "id": 5, "name": "potato", "cost": 30 },
  { "id": 3, "name": "chocalate", "cost": 12 },
  { "id": 4, "name": "icecream", "cost": 110 },
]

