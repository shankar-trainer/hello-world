export const countReducer=(state,action)=>{
    switch(action.type){
        case 'INCREMENT':
            return {
                // ...state,count:state.count+1,
                count: state.count + 1,
            }
           case 'DECREMENT':
            return{
              count:state.count-1,
            }
        default:
            return state;
    }
}



