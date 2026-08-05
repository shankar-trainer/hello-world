import logo from './logo.svg';
import './App.css';
import { Component } from 'react';
import Book from './book/book';
import Employee from './employee';
import { cdata } from './empdata/car_data';

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

class App extends Component{
 render(){
  return(
    <div>
      hello world
      <Book></Book>
      <Employee country="india" state="up" car={cdata} ></Employee>
    </div>
  )
 }
}

export default App;
