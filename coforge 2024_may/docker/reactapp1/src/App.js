import logo from './logo.svg';
import './App.css';
import Hello from './Hello';
import Customer from './Customer';
import Counter from './Counter';
import { address } from './Address';
import  {Country}  from './Country';
import User1 from './User1';
import { Address } from './data/Address';

function App() {
  return (
    <div className="App">
      {/* <Hello></Hello> */}
        {/* <Customer country="India"></Customer> */}
      <Customer country="India" country1={Country} address={address}></Customer> 
       {/* <Counter></Counter> 
      <User1 name="ram kumar" address={Address}></User1> */}
    </div>
  );
}

export default App;
