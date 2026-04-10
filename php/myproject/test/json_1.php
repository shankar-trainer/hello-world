<?php

$employee=array("ram"=>1,"shyam"=>2,"suresh"=>3);

foreach ($employee as $key => $value) {
    # code...
    echo $key." ".$value."<br>";
}
echo ("<br>");

echo(json_encode($employee));
?>