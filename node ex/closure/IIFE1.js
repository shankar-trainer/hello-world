hi=function hello(){
	console.log('hello world')
}();

(function (){
	console.log('hello world....')
}());

var ss=(function (){
	console.log('hello ....   world....')
});

a=()=>{
	console.log('welcome ...')
};
a();

(()=>{
	console.log('hello welcome ...')
}); // implicitly called

ss()



//(async () => console.log(await (100 + 20)))();

