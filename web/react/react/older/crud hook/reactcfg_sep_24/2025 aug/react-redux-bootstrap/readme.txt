================
npm i bootstrap

in index.js   add 
 
import '../node_modules/bootstrap/dist/css/bootstrap.min.css';

======================  
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

