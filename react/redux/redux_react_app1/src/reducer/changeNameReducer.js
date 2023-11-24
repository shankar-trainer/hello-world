const changeNameReducer=(state='suresh',action)=>{
    if(action.type==='mohan'){
     console.log(action.type+' ..name ...');
        return state+' kumar';
    }
     else return state+ '  sharma'  
}
export default changeNameReducer;