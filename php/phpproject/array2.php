<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
<?php 

$employees=array(100001=>'ram kumar',100002=>'amit kumar',100003=>'suresh kumar',100004=>'kamal kumar',100005=>'vimal kumar');

echo "employee1 ".$employees[100001];

echo "<p>";
foreach ($employees as $key => $value) {
    echo    'key '.$key.' value '.$value.'<br>';
}

print_r($employees);

print"<br> using var_dump<br>";

var_dump($employees);

$x=10001;
$p=45000.677;

print"<br> using var_dump<br>";

var_dump($x);
print"<br> using var_dump<br>";

var_dump($p);



?>    


</body>
</html>