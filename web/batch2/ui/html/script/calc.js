function calculate() {
    var a = document.getElementById("n1").value
    var b = document.getElementById("n2").value

    if (a == ""){
        alert("no1 is blank")
        document.getElementById("n1").style.border="solid red"
    }
    else if (isNaN(a)){
        alert("no1 is not a number")
        document.getElementById("n1").style.border="solid red"
    }
    else if (b == ""){
        alert("no2 is blank")
        document.getElementById("n2").style.border="solid red"
    }
    else if (isNaN(b)){
        alert("no2 is not a number")
        document.getElementById("n2").style.border="solid red"
    }
    else {
        var sum = parseFloat(a) + parseFloat(b)
        alert("no1 is " + parseFloat(a).toFixed(2) + "\nno2 is " + parseFloat(b).toFixed(2) + "\nsum is " + sum.toFixed(2))
        document.getElementById("n1").style.border="none"
        document.getElementById("n2").style.border="none"

    }
}