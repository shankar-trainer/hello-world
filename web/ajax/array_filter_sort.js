const array=[
    {"name":"apple","cost":120},
    {"name":"banana","cost":50},
    {"name":"tomato","cost":40},
    {"name":"potato","cost":30},
    {"name":"chocalate","cost":12},
    {"name":"icecream","cost":110},
]

var result=array.filter(a=>a.cost>100).sort((a,b)=>a-b)
console.log(result)

