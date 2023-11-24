import { Provider, useDispatch, useSelector } from "react-redux";
import { createStore } from "redux";

import counter from "./reducer/counterReducer";
import increment from "./action/increment";
import decrement from "./action/decrement";
import logged from "./action/logged";
import changename from "./action/changename";


const App = () => {
   
    
    const count=useSelector(state=>state.mycount)
    const logger=useSelector(state=>state.mylogger)
    const name=useSelector(state=>state.mychangename)
    
  const dispatch=useDispatch()

    return (
        <>
       
            <h1>Redux App1</h1>
            <p>Count is {count}</p>
            <button onClick={() => dispatch(increment())}> increment </button>
            
            <button onClick={() => dispatch(decrement())}> decrement </button>
                 <hr></hr>
            <h2>Logged</h2>
            
            User Logged in :{
                logger?'true':'false'
            }
             <p></p>
            
            <button onClick={() => dispatch(logged())}> Change Log In </button>
            <hr>
            </hr>
            <h2>User Name </h2>
            {
                name
            } 
            <p></p>
            <button onClick={() => dispatch(changename())}> change name </button>
            
            {
                console.log('user logged in '+logger)
            }
            
            {
                console.log('count  '+count )
            }

        </>
    )
}

export default App; 