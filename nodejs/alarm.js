setTimeout(()=>{
    console.log('alarm will ring in 5 seconds')
},5000)

setInterval(()=>{
    console.log(new Date().toLocaleTimeString())
},1000)