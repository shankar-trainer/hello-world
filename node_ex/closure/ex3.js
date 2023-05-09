function welcome(msg){
	return function  show(name){
		console.log(msg+"   "+name)
	}
}

hi=welcome('greeting')
hi('ram kumar')

for (var index = 1; index <= 3; index++) {
	console.log("\t\tindex : "+index)
    setTimeout(function () {
        console.log('after ' + index + ' second(s):' + index);
    }, index * 1000);
}
