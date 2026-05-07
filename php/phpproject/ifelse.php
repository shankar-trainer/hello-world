<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
    <style>
          .style1{
              border: solid;
              width:30%;
              padding: 20pt;
              margin-left: 150pt;
               background-color: antiquewhite;
          }
    </style>    
</head>
<body>
<?php
$m1 = 78;
$m2 = 50;

$total = $m1 + $m2;
$avg = $total / 2;

$grade = '';

if ($avg >= 75)
    $grade = 'distinction';
elseif ($avg >= 60 && $avg <= 74)
    $grade = 'first';
elseif ($avg >= 50 && $avg < 60)
    $grade = 'second';
elseif ($avg >= 35 && $avg < 50)
    $grade = 'third';
else
    $grade = 'fail';
print("<div class='style1'>");
print "student information";
print "<br>marks1 ".$m1;
print "<br>marks2 ".$m2;
print "<br>total marks ".$total;
print "<br>average marks  ".$avg;
print "<br>grade marks  ".$grade;
print("</div>");

?>

</body>
</html>
