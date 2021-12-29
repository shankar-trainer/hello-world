var table=prompt('enter a number')
var x=1;

document.write("<div class='table'>")

while(x<=10){
    document.write(table+" * "+x+" = "+(x*table)+"<br>")
    x++;
}
document.write("</div>")