function addition() {
    var a = document.getElementById('n1').value
    var b = document.getElementById('n2').value
    if (a == '')
        alert('no1 is blank')
    else if (b == '')
        alert('no2 is blank')

    else if (isNaN(a))
        alert('no1 must be numeric')
    else if (isNaN(b))
        alert('no2 must be numeric')

    else {
        var c = parseFloat(a) + parseFloat(b)
        alert('sum  is ' + (c))
    }
}