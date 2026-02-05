import logo from './logo.svg';
import './App.css';
import Book from './book/book';
import Employee from './employee/Employee';
import Counter from './employee/Counter';
import { address } from './employee/data/addressdata';
import { cars } from './employee/data/cardata';
import CustomerForm from './customer/CustomerForm';
import Clock from './Clock';
import CounterApp from './hook/CounterApp';
import PersonForm from './hook/Person/model/PersonForm';
import { phone_data } from './hook/Person/data/Phone';
import MyClock from './hook/Person/MyClock';
import { BrowserRouter, Route, Routes } from 'react-router-dom';
import Navbar from './Navbar';
import Fetch from './database/employee_class';

function App() {
  return (
    <>
     {/* <h1>hello world</h1> */}
     {/* <Book></Book> */}
     {/* <Employee country="india" capital="new delhi"></Employee> */}
     {/* <Employee addr={address} mycar={cars}></Employee> */}
     {/* <Counter></Counter> */}
     {/* <CustomerForm></CustomerForm> */}
     {/* <Clock></Clock> */}
     {/* <CounterApp></CounterApp> */}
     {/* <PersonForm fone={phone_data}></PersonForm> */}
     {/* <MyClock></MyClock> */}

     <BrowserRouter>
     <Navbar></Navbar>
      <Routes>
        <Route path='/' element={<PersonForm fone={phone_data}></PersonForm>}>
        </Route>
        
        <Route path='/pform' element={<PersonForm fone={phone_data}></PersonForm>}>
        </Route>
        <Route path='/counter' element={<CounterApp></CounterApp>}>
        </Route>
        <Route path='/employee' element={<Employee addr={address} mycar={cars}></Employee>}>
        </Route>

        <Route path='/clock' element={<Clock></Clock>}>
        </Route>

        <Route path='/cform' element={<CustomerForm></CustomerForm>}>
        </Route>

        <Route path='/book' element={<Book></Book>}>
        </Route>
        
        <Route path='/emp_data_class' element={<Fetch></Fetch>}>
        </Route>


      </Routes>


     </BrowserRouter>

    </>
  );
}

export default App;
