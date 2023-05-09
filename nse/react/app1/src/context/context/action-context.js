export const fireAlertMessage=(message)=>()=>{
    alert(message)
}

export const fireAsyncAlertMessage=(message,duration)=>async()=>{
     const theMessage=await messagePromise(message,duration)
     alert(message)
}
const messagePromise=(message,duration)=>{
    return new Promise(message,duration)=>{
        setTimeout(()=>{
            if(!message){
                resolve(mesaage)
            }
            else {
                reject ('Empty message found')
            }
        },duration)
    }
}