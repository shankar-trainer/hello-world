import logo from './logo.svg';
import './App.css';
import { Counter1 } from './Counter1';
import { Student } from './student';

function App() {
  return (
          <>
         {/* <h1>hello world</h1>
         <p>no1 is{x} </p>
         <p>no2 is{y} </p>
         <p>sum is{z} </p> */}
         {/* <Counter1></Counter1> */}
        <Student regno='676767' name='laxmmi bai school' location='bhopal'></Student>
        </>
  );
}
let x=10; 
let y=20; 
let z=x+y; 

export default App;
