const loggerReducer=(state=false,action)=>{
    if(action.type==='SIGN_IN')
     return !state
     else 
     return state 
}
export default  loggerReducer;
