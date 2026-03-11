import logo from './logo.svg';
import './App.css';
import Hello from './hello';
import Employee from './employee/employee';
import { User } from './User/Uers';
import { cars } from './User/data/Car';
import { Counter } from './hooks/Counter';
import { UserForm } from './hooks/UserForm';
import { BrowserRouter, NavLink, Route, Routes } from 'react-router';
import { NavBar } from './NavBar';
import { Crud } from './Crud';
import { AddEmployee } from './crud/AddEmployee';
import { GetAllEmployee } from './crud/GetAllEmployee';

function App() {
  return (
    <div>
      {/* <Hello></Hello> */}
      {/* <Employee></Employee> */}
      {/* <User country="india" capital="new delhi" mycar={cars}>
    </User> */}
      {/* <Counter></Counter> */}
      {/* <UserForm></UserForm> */}

      <BrowserRouter>
      <NavBar></NavBar>
        <Routes>
          <Route path='/' element={<Employee></Employee>}></Route>
          <Route path='/counter_hook' element={<Counter></Counter>}></Route>
          <Route path='/userform_hook' element={<UserForm></UserForm>}></Route>
          <Route path='/employee' element={<Employee></Employee>}></Route>
          <Route path='/addemployee' element={<AddEmployee></AddEmployee>}></Route>
          <Route path='/allemployee' element={<GetAllEmployee></GetAllEmployee>}></Route>
        </Routes>
      </BrowserRouter>
    </div>
  );
}

export default App;
