function  mysort(a,b){
	return a-b
}
sort1 =function (a,b){
	return b-a
}
sort2 =(a,b)=>a-b

ar=[100,2,33,1]
ar.sort(sort1)
console.log(ar)
console.log(ar.sort(sort2))
console.log(ar.sort(mysort))




