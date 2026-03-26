//export 
const CounterReducer=(state=0,action)=>{
   switch (action.type) {
    case 'INCREMENT':
           console.log('increment called ')
         return state+1;
        break;
   
    case 'DECREMENT':
     console.log('decrement called ')
         return state-1;
        break;
   
    default:
    return state;
   }
}
export default CounterReducer;