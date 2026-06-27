const CountReducer=(state=0,action)=>{
     switch(action.type){
        case 'INCREMENT':{
            console.log('increment called  '+state)
            return state+1;
        }
        default:
            return state;
     }
}
export default CountReducer;