<?php

$customers = array("ram kumar" => 20000, "shyam kumar" => 56000, "amit kumar" => 78000, "pardip kumar" => 12000);

foreach ($customers as $key => $value) {
    echo "<br>".$key."  ===>".$value;    
}
ksort($customers);// sort using keys

echo "<p>after sorting by keys ";
foreach ($customers as $key => $value) {
    echo "<br>".$key."  ===>".$value;    
}

asort($customers);// sort using values

echo "<p>after sorting using asort ";
foreach ($customers as $key => $value) {
    echo "<br>".$key."  ===>".$value;    
}

arsort($customers);// sort using values in reverse order
krsort($customers);// sort using keys  in reverse order




?>