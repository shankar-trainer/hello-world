import { useState } from "react";

export default function MultipleState(){
        const [age, setAge] = useState(42);
        const [fruit, setFruit] = useState('banana');
        const [todos, setTodos] = useState([{ text: 'Learn Hooks' }]);
       
        return(
        <div>
       <h1>Multiple State</h1>
         <p>Age is {age}</p>
         <button onClick={()=>setAge('25')}>ChangeAge</button>
         <br></br>
         <p>Fruit is {fruit}</p>
         <button onClick={()=>setFruit('Orange')}>ChangeFruit</button>
           {/* <p>Todos  is {todos}</p>   */}
{/* 
          <button onClick={()=>setTodos(text)}>ChangeFruit</button> */}
         
        </div>

        )


}