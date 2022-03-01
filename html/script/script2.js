var date=new Date()
alert(date)
var time1=date.getHours()+":"+date.getMinutes()+":"+date.getSeconds()
console.log("time is " +time1)
console.log("date1 is   " +date.toDateString())
console.log("locale date  is   " +date.toLocaleDateString())
console.log("time is   " +date.toTimeString())
console.log("locale time is   " +date.toLocaleTimeString())

