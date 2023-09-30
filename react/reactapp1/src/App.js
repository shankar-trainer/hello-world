import logo from './logo.svg';
import './App.css';

function App() {
  var x = 100;
  var y = 50;
  return (
    <div className='container'>
      <div className='border border-warning p-5 m-5 w-75 bg-info text-danger' style={{ 'color': 'yellow' }}>
        <h1> welcome to react application</h1>
        <img src={logo} width='200' height='150'></img>
        <div>
          No1 is {x}
        </div>
        <div>
          No2 is {y}
        </div>

        <div>
          sum of  {x}  and {y} is {x + y}
        </div>
      </div>
    </div>
  )
}

export default App;
