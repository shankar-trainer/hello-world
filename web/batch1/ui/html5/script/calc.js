function calculate() {
    var a = document.getElementById("n1").value
    if (a == "") {
        alert("no1 is blank")
        // document.getElementById("n1").style.borderColor = "blue";
        document.getElementById("n1").style.border = "double red 2pt";
    }
    else if (isNaN(a)) {
        alert("no1 is not a number")
        document.getElementById("n1").style.border = "double red 2pt";
    }
    else
        alert(" first number is " + (parseFloat(a).toFixed(2)))

    var b = document.getElementById("n2").value
    var sum = parseFloat(a) + parseFloat(b)
    if (b == "") {
        alert("no2 is blank")
        document.getElementById("n2").style.border = "double red 2pt";
        document.getElementById("n2").style.backgroundColor = "yellow";
    }
    else if (isNaN(b)){
        alert("no2 is not a number")
        document.getElementById("n2").style.border="double red 2pt";
    }
        else {
        alert(" second number is " + parseFloat(b).toFixed(2))
        alert("addition  is " + sum.toFixed(2))
    }
}