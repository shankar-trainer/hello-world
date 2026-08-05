var date=new Date().toLocaleTimeString()
setInterval(() => {
    date=new Date().toLocaleTimeString()
    console.log(date)
}, 1000);