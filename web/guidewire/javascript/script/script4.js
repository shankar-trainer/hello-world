var ar=[11,2,1,3,4,5,99];
document.write('<br>using for in loop<br>');   

for (var  key in ar) {
    document.write(key+' ------- '+ar[key]+'<br> ');   
}

document.write('<br>using for of loop <br>');   

for (var  a of ar) {
    document.write(a+'<br> ');   
    
}
