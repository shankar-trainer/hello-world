<?php
$employee=array("ram"=>1,"shyam"=>2,"suresh"=>3);

foreach ($employee as $key => $value) {
    # code...
    echo $key." ".$value."<br>";
}
echo ("<br>");
//  json_encode Convert PHP to JSON.  Encode to JSON string
//converts a PHP value (usually an array or object) into a JSON string.

echo(json_encode($employee));

//json_decode(): Convert JSON to PHP.
//This function converts a JSON string back into a PHP variable. 

// $customer="{'id':1000,'name':amit kumar,'email':'ram@gmail.com'}";
$customer = '{"id":1000, "name":"amit kumar", "email":"ram@gmail.com"}';
print"<br>";

print $customer;
print"<br>";
print_r($customer);

print('<p>json_decode<p>');

$p=json_decode($customer);
// print_r($p);
print_r($p);
print("<br>");
print_r($p->id);
?>