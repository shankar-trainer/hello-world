import logo from './logo.svg';
import './App.css';
import Hello from './Hello';
import Customer from './Customer';
import Counter from './Counter';
import { address } from './Address';
import { country } from './Country';
import CustomerForm from './CustomerForm';
import Database1 from './Database1';
//import Hooks_Counter from './Hooks_Counter';
import { Hooks_Counter } from './Hooks_Counter';
import { Hooks_Forms } from './Hooks_Form';
import { Route, BrowserRouter as Router, Routes } from 'react-router-dom';
import { NavBar } from './NavBar';


function App() {
  return (
    <div>
      {/* <Hello></Hello> */}
      {/* <Customer country="India" country1={Country} address={address}></Customer>  */}
      {/* <Customer country1={country} address1={address}  country="India"></Customer> */}
      {/* <CustomerForm></CustomerForm> */}
      {/* <Database1></Database1> */}
      {/* <Hooks_Counter></Hooks_Counter> */}
      {/* <Hooks_Forms addr={address}></Hooks_Forms> */}

      <Router>
        <NavBar></NavBar>
        <Routes>
          <Route path="/" element={<Hello></Hello>}></Route>
          <Route path="/hello" element={<Hello></Hello>}></Route>
          <Route path="/customer" element={<Customer country1={country} address1={address}  country="India"></Customer>}></Route>
          <Route path="/customerform" element={<CustomerForm></CustomerForm>}></Route>
          <Route path="/database" element={<Database1></Database1>}></Route>
          <Route path="hookscounter" element={<Hooks_Counter></Hooks_Counter>}></Route>
          <Route path="hooksform" element={<Hooks_Forms addr={address}></Hooks_Forms>}></Route>
        </Routes>

      </Router>
    </div>
  );
}

//npm i react-router-dom

export default App;
