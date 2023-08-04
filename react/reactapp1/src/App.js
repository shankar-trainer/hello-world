import logo from './logo.svg';
import './App.css';
let ar=[1,2,3,4,5,6];
function App() {
  return (
    <div>
      <img src={logo} width='300' height='250'></img>
       <h1>Hello world</h1>
           <ul className='class1'>
           <li>{ar[0]}</li>
           <li>{ar[1]}</li>
           <li>{ar[2]}</li>
           <li>{ar[3]}</li>
           <li>{ar[4]}</li>
           <li>{ar[5]}</li>
           </ul>
            {ar}
       </div>
  );
}

export default App;
