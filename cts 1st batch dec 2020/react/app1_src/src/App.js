import logo from './logo.svg';
import './App.css';

function App() {
  var roll=1001;
  var name="ram kumar";
  var city="chennai";
  return (
    <div className="bg-success text-light m-5 p-3 w-25 border border-dark;">
    <h1>hello world</h1>
     <span>roll is {roll}</span><br/>
     <span>name is {name}</span><br/>
     <span>city is {city}</span>
    </div>
  );
}

function App1(){
   return(<h1>hello to reactjs</h1>)

}

export default App1;
