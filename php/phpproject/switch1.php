<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
<?php
$country="bangladesh";

switch ($country) {
    case 'india':
        // print"capital of india is new delhi";
        print"capital of $country is new delhi"; // interpolation
        break;
    
    case 'srilanka':
        print "capital of srilanka is new colombo";
        break;
    
    case 'bangladesh':
        print  "capital of ".$country."  is dhaka";
        break;
    
    case 'china':
        print"capital of ".$country ." is sanghai";
        break;
    
    case 'nepal':
        print"capital of nepal is new kathmandu";
        break;
    
    default:
        echo"no matching values";
        break;
}


?>

    
</body>
</html>