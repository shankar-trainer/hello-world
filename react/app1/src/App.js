import logo from './logo.svg';
import './App.css';
import { Component } from 'react';
import Book from './book/book';
import Employee from './employee';
import { cdata } from './empdata/car_data';
import Customer from './hooks/Customer';
import Counter from './hooks/Countrer';
import UserForm from './hooks/UserForm';
import { BrowserRouter, Link, Route, Router, Routes } from 'react-router-dom';

// function App() {
//   return (
//     <div className="App">
//       <header className="App-header">
//         <img src={logo} className="App-logo" alt="logo" />
//         <p>
//           Edit <code>src/App.js</code> and save to reload.
//         </p>
//         <a
//           className="App-link"
//           href="https://reactjs.org"
//           target="_blank"
//           rel="noopener noreferrer"
//         >
//           Learn React
//         </a>
//       </header>
//     </div>
//   );
// }

class App extends Component {
  render() {
    return (
      <div>
        {/* hello world
      <Book></Book>
      <Employee country="india" state="up" car={cdata} ></Employee> */}
        {/* <Customer company="coforge"
      car={cdata}
      ></Customer> */}
        {/* <Counter></Counter> */}
        {/* <UserForm></UserForm> */}
        <nav>
          <Link to="/">Home</Link>
          <Link to="/counter" className='ms-2'>Counter</Link>
          <Link to="/employee" className='ms-2'>Employee</Link>
          <Link to="/book" className='ms-2'>Book</Link>
          <Link to="/customer" className='ms-2'>Customer</Link>
          <Link to="/counter" className='ms-2'>Employee</Link>
          <Link to="/userform" className='ms-2'>UserForm</Link>
        </nav>
          <Routes>
            <Route path='/' element={<Employee country="india" state="up" car={cdata}></Employee>}></Route>
            <Route path='/employee' element={<Employee country="india" state="up" car={cdata}></Employee>}></Route>
            <Route path='/book' element={<Book></Book>}></Route>
            <Route path='/counter' element={<Counter></Counter>}></Route>
            <Route path='/customer' element={<Customer  company="coforge"car={cdata}></Customer>}></Route >
            <Route path='/userform' element={<UserForm></UserForm>}></Route>
          </Routes>
      </div>
    )
  }
}

export default App;
