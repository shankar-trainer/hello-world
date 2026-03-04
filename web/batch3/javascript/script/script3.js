
function hobbies1() {
    document.getElementById("tarea").value = "blank"
}

function changeIt() {
    var img1 = document.getElementById("imgid1")
    var form = document.getElementsByTagName('form')
    img1.src = "image/img2.jpg"

    img1.style.border = 'solid 10pt red'
    img1.style.borderRadius = '20pt'
    // img1.style.marginLeft="300pt"
    form[0].style.marginLeft = "240pt"
    form[0].style.backgroundColor = "yellow"

}

function checkit() {
    var check1 = document.getElementById
        ('cts');
    if (check1.checked == true) {
        alert(" welcome ")
    }
    else {
        alert("select the value ")
    }
}
