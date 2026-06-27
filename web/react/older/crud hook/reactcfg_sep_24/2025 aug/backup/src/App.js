import { BrowserRouter, Route,  Routes } from "react-router-dom";

import logo from './logo.svg';
import { HookForm } from "./hook/HookForm";
import RequiredFieldForm from './hook/RequiredFieldForm';
import { UserForm } from './hook/UserForm';
import MyForm from './hook/MyForm';
import Test1 from './conditional/Test1';
import { Conditional, Test2 } from './conditional/Conditional';
import MyForm1 from './hook/MyForm1';
import {  Router } from 'react-router';
import { AllEmployees } from "./crud/Employees";
import { AllEmployees1 } from "./crud/Employees1";
import AddEmployee from "./crud/AddEmployee";

import { NavBar } from "./NavBar";
import AddEmployee1 from "./crud/AddEmployee1";
function App() {
  return (
    <div className="App">
      {/* <Conditional></Conditional> */}
      {/* <Test2></Test2> */}
      {/* <Test1></Test1> */}
      {/* <Header></Header> */}
      {/* <MyForm></MyForm> */}
      {/* <MyForm1></MyForm1> */}
      {/* <HookForm></HookForm> */}
      {/* <RequiredFieldForm></RequiredFieldForm> */}
      {/* <UserForm></UserForm> */}
      {/* <MyTerminal></MyTerminal> */}
      {/* <MyTerminalHook></MyTerminalHook> */}

      <BrowserRouter>
      <NavBar></NavBar>
      <Routes>
        <Route path="/" element={<AllEmployees></AllEmployees>}></Route>
        <Route path="/allemp" element={<AllEmployees></AllEmployees>}></Route>
        <Route path="/allemp1" element={<AllEmployees1></AllEmployees1>}></Route>
        <Route path="/add_emp" element={<AddEmployee></AddEmployee>}></Route>
        <Route path="/add_emp1" element={<AddEmployee1></AddEmployee1>}></Route>
       
      </Routes>
     </BrowserRouter>
      </div> 
  );
}

export default App;
