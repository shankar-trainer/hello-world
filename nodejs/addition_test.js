var p=require('./addition')
console.log(p.a)
console.log(p.b)
console.log(p.xx1)
console.log(p.sum(p.a,p.b))

console.log(`sum of ${p.a} and ${p.b} is ${p.sum(p.a,p.b)}`)

circle=require('./circle')

console.log('area of radius 4.5 is '+circle.area(4.5))
console.log('circumference of radius 4.5 is '+circle.circumference(4.5))