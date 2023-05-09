const set1=new Set();
set1.add('hello');
set1.add('welcome');
set1.add('chennai');
set1.add('javascript');
set1.add('hello');
set1.add('javascript');
console.log(set1)
set1.delete('hello');

for (const iterator of set1) {
    console.log(iterator);
}

arr1=['a','b','c']
for (const [index,ele] of arr1.entries()) {
    console.log(index,"-->",ele)
}

