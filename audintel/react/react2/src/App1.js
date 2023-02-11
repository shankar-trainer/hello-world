import logo from './logo.svg';
import './App.css';
import item from './item.json'
function App() {
  return (
    <div className="App">
      <table style={{'border':'solid'}}>
      {
        item.map(i=>
           <tr style={{'border':'solid'}}>
            <td>{i.id}</td>
            <td>{i.prdname}</td>
            <td>{i.cost}</td>
            <td>{i.mfd}</td>
           </tr>
        )
      }
      </table>
    </div>
  );
}

export default App;
