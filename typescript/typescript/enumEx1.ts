enum Season{Winter,Autumn,Summer}

let s:Season=Season.Autumn

console.log(s)
console.log(Season.Summer)
// console.log(s)


function addition():void{
	console.log('addition program')
}
function sum(p1:number,p2:number,p3?:number):number{
	return p1+p2+p3;
}
addition();

console.log(sum(11,22,33));
console.log(sum(11,22,undefined));

