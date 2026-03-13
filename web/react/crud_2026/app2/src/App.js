import logo from './logo.svg';
import './App.css';
import User from './user/user';
import Counter from './user/Counter';
import Person from './shoppingkart/Person';
import { cardata } from './shoppingkart/data/Car';
import Employee from './Employee/EmployeeForm';
import { Counter1 } from './hook/Counter1';
import { UserForm } from './hook/UserForm';
import { AllBook } from './UsingFetch/AllBook';
import { AllBook1 } from './UsingFetch/AllBook1';
import { AddBook } from './UsingFetch/AddBook';
import { SearchBook } from './UsingFetch/SearchBook';
import { BookUseForm } from './UsingFetch/BookUseForm';
import { Link, Route, Routes } from 'react-router-dom';
import { UpdateBook } from './UsingFetch/UpdateBook';

function App() {
  return (
    <div>
      {/* <div className='row'>
        <div className='col-8'>
          <User></User>
        </div>
        <div className='col-4'>
           <Counter color='red' size='20pt'></Counter> 
          <Counter></Counter>
        </div>
      </div>
       */}

       {/* <Person car={cardata}></Person> */}
       {/* <Employee></Employee> */}
       {/* <Counter1></Counter1> */}
       {/* <UserForm></UserForm> */}
       {/* <AllBook></AllBook> */}
       {/* <AllBook1></AllBook1> */}
     {/* <AddBook></AddBook>
        <AllBook1></AllBook1>  */}
        {/* <AddBook></AddBook> */}
        {/* <SearchBook></SearchBook> */}
        {/* <BookUseForm></BookUseForm> */}
        <nav>
          <Link to="/">Home</Link>
          <Link to="/counter" style={{'marginLeft':'10pt'}}>Counter</Link>
          <Link to="/counter1" style={{'marginLeft':'10pt'}}>Counter1</Link>
          <Link to="/allbook" style={{'marginLeft':'10pt'}}>All Book</Link>
          <Link to="/searchbook" style={{'marginLeft':'10pt'}}>Search Book</Link>
          <Link to="/addbook" style={{'marginLeft':'10pt'}}>Add Book Form</Link>
          <Link to="/bookform" style={{'marginLeft':'10pt'}}>Book Form</Link>
          <Link to="/updatebook" style={{'marginLeft':'10pt'}}>Update Form</Link>
          
        </nav>
        <Routes>
          <Route path="/" element={<Counter/>}></Route>
          <Route path="/counter" element={<Counter/>}></Route>
          <Route path="/counter1" element={<Counter1/>}></Route>
          <Route path="/allbook" element={<AllBook/>}></Route>
          <Route path="/addbook" element={<AddBook/>}></Route>
          <Route path="/searchbook/:isbn1" element={<SearchBook/>}></Route>
          <Route path="/bookform" element={<BookUseForm/>}></Route>
          <Route path="/updatebook/:isbn1" element={<UpdateBook/>}></Route>
          {/* <Route path="/updatebook" element={<UpdateBook/>}></Route> */}
        </Routes>
    </div>
  );
}

export default App;
