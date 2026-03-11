
bootstrap 
npm i bootstrap 
in index.html 
<link
    rel="stylesheet"
    href="../node_modules/bootstrap/dist/css/bootstrap.min.css"
  />

========
1st type 

export const CounterReducer=(state=0,action)=>{
	
}
import {CounterReducer} from './reducer/CounterReducer';


-------------------------------------------------------------
2nd type

const CounterReducer=(state=0,action)=>{
	
}
export default CounterReducer;


import CounterReducer from './reducer/CounterReducer';

