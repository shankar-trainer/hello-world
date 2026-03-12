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
        <BookUseForm></BookUseForm>
    </div>
  );
}

export default App;
