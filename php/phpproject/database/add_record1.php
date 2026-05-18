  <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.8/dist/css/bootstrap.min.css" rel="stylesheet"
        integrity="sha384-sRIl4kxILFvY47J16cr9ZwB07vP4J8+LH7qKQnuqkuIAvNWLzeN8tE5YBujZqJLB" crossorigin="anonymous">
<div class="container">
<?php
$id=0;
$name='';
$salary=0;
$dob='';

if(isset($_POST["id"]) && !empty($_POST["id"])){
    $id = $_POST["id"];
}
else {
    echo "<div class='border border-success p-5 m-5 w-50'><span class='text-danger'>id is blank</span>";
    echo"<p><a href='index.php'>go back</a></p></div>";
    exit;
}
if(isset($_POST["name"]) && !empty($_POST["name"])){
    $name = $_POST["name"];
}
else {
    echo "<div class='border border-success p-5 m-5 w-50'><span class='text-danger'>name is blank</span>";
    echo"<p><a href='index.php'>go back</a></p></div>";
    exit;
}

 if(strlen(trim($_POST["name"])) < 5 ||strlen(trim($_POST["name"])) >15 ) {
    echo "<div class='border border-success p-5 m-5 w-50'><span class='text-danger'>name must between 5- 15 chars</span>";
    echo"<p><a href='index.php'>go back</a></p></div>";
    exit;
  }
  else {
    $name = $_POST["name"];
  }


if(isset($_POST["salary"]) && !empty($_POST["salary"])){
    $salary = $_POST["salary"];
}
else {
    echo "<div class='border border-success p-5 m-5 w-50'><span class='text-danger'>salary is blank</span>";
    echo"<p><a href='index.php'>go back</a></p></div>";
    exit;
}
if(isset($_POST["dob"]) && !empty($_POST["dob"])){
    $dob = $_POST["dob"];
}
else {
    echo "<div class='border border-success p-5 m-5 w-50'><span class='text-danger'>dob is blank</span>";
    echo"<p><a href='index.php'>go back</a></p></div>";
    exit;
}


include("db.php");
mysqli_report(MYSQLI_REPORT_ERROR | MYSQLI_REPORT_STRICT);
try{

$stmt= $connection->prepare("insert into employee value(?,?,?,?)");
$stmt->bind_param("ssss", $id,$name,$salary,$dob);

if($stmt->execute()){
    echo "<br>record added";
}
else{
 echo "some problem";
}
}
catch(mysqli_sql_exception $e){
    // echo "". $e->getMessage() ."".$e->getCode();
    if($e->getCode() == "1062"){
    echo "<br>duplicate id error ";
    }
}
?>
</div>