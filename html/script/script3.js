function totCost() {
    var id1 = document.getElementById('id').value
    var name1 = document.getElementById('name').value
    var cost1 = document.getElementById('cost').value
    var noi1 = document.getElementById('noi').value

    if (id1 == "")
        alert("id cannot be blank")

    else if (name1 == "")
        alert("name cannot be blank")
    else if (cost1 == "")
        alert("cost cannot be blank")

    else if (isNaN(cost1))
        alert("cost is not a number")

    else if (noi1 == "")
        alert("number of items  cannot be blank")

    else if (isNaN(noi1))
        alert("number of items is not a number")
    
    else {
        var cost2 = parseFloat(cost1)
        var noi2 = parseInt(noi1)

        var total = cost2 * noi2
        document.getElementById('toc').innerText = total
    }
}