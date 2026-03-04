function displayItem() {
    var name = document.getElementById('name').value
    var cost = document.getElementById('cost').value
    var total = document.getElementById('total').value
    var totalcost = cost * total

    if (name == '') {
        document.getElementById('err_name').innerHTML = 'name is blank'
        document.getElementById('name').style.border='solid 2pt red'
    }
    else if (cost == '') {
         document.getElementById('err_name').innerHTML = ''
        document.getElementById('err_cost').innerHTML = 'cost is blank'
    }
    else if (total == '') {
          document.getElementById('err_name').innerHTML = ''
        document.getElementById('err_cost').innerHTML = ''
        document.getElementById('err_total').innerHTML = 'total is blank'
    }
    else {

        document.getElementById('err_name').innerHTML = ''
        document.getElementById('err_cost').innerHTML = ''
        document.getElementById('err_total').innerHTML = ''


        var s1 = 'name :' + name + '<br>cost :' + cost +
            '<br>total item:' + total + '<br><br>total cost  : ' + totalcost

        document.getElementById('display').innerHTML = s1
    }
}