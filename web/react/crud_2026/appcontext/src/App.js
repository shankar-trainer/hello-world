import logo from './logo.svg';
import './App.css';
import { ThemeContext } from './ThemeContext';
import { ThemeComponent } from './ThemeComponent';
import { useState } from 'react';
import { UserContext } from './UserContext';
import { UserProfile } from './UserProfile';
import { EmployeeProvider } from './employeecontext/EmployeeContext';
import AddEmployees from './employeecontext/AddEmployees';
import EmployeeList from './employeecontext/EmployeeList';
import { BrowserRouter, Link, NavLink, Route, Routes } from 'react-router-dom';

function App() {
  const [theme, setTheme] = useState('red')
  const [userName, setUserName] = useState('Guest')
  return (
    <div>
      {/* <ThemeContext.Provider value={theme}>
        <ThemeComponent></ThemeComponent>
      </ThemeContext.Provider>
      <UserContext.Provider value={userName}>
        <UserProfile></UserProfile>
      </UserContext.Provider>

      <EmployeeProvider>
        <div>
          <h1>Employee Management</h1>
          <AddEmployees />
          <EmployeeList />
        </div>
      </EmployeeProvider> */}

      <Routes>

        <Route path='context_addemployee' element={<AddEmployees></AddEmployees>}></Route>
        <Route path='context_employeelist' element={<EmployeeList></EmployeeList>}></Route>
      </Routes>

      <nav className="nav navbar-dark bg-light">
        <NavLink to='/context_addemployee' style={{ 'marginLeft': '10pt' }}>Add Employee_con</NavLink>
        <NavLink to='/context_employeelist' style={{ 'marginLeft': '10pt' }}>List Employee_con</NavLink>
      </nav>

    </div>

  );
}

export default App;
