//import logo from './logo.svg';
//import './App.css';
import { Component } from 'react';
import Book from './book/book';
import Employee from './employee';
import { cdata } from './empdata/car_data';
import Customer from './hooks/Customer';
import Counter from './hooks/Countrer';
import UserForm from './hooks/UserForm';
import { BrowserRouter, Link, Route, Router, Routes } from 'react-router-dom';
import AllBook from './crud/Allbook';
import { AddBook } from './crud/AddBook';
// import AddBook from './crud/AddBook';


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
          <Link to="/crud_all_book" className='ms-2'>Crud All Book</Link>
          <Link to="/crud_add_book" className='ms-2'>Crud Add Book</Link>
        </nav>
          <Routes>
            <Route path='/' element={<Employee country="india" state="up" car={cdata}></Employee>}></Route>
            <Route path='/employee' element={<Employee country="india" state="up" car={cdata}></Employee>}></Route>
            <Route path='/book' element={<Book></Book>}></Route>
            <Route path='/counter' element={<Counter></Counter>}></Route>
            <Route path='/customer' element={<Customer  company="coforge"car={cdata}></Customer>}></Route >
            <Route path='/userform' element={<UserForm></UserForm>}></Route>
            <Route path='/crud_all_book' element={<AllBook></AllBook>}></Route>
            <Route path='/crud_add_book' element={<AddBook></AddBook>}></Route>
          </Routes>
      </div>
    )
  }
}

export default App;
