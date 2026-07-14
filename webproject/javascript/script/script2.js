function result() {
    var n1 = document.getElementById("n1").value
    var n2 = document.getElementById("n2").value
    if (n1 == "")
        alert("number1 is blank")
    else if (isNaN(n1))
        alert("number1 is not a number")
    else if (n2 == "")
        alert("number2 is blank")
    else if (isNaN(n2))
        alert("number2 is not a number")
    else {
        alert("number1 is " + n1)
        alert("number2 is " + n2)
        document.getElementById("n3").value = parseInt(n1) + parseInt(n2);
    }
}