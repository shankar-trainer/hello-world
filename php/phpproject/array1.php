<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>

<body>
    <?php
    $ar1 = array(1, 2, 3, 4, 5);
    print_r($ar1);

    print ("<br> " . $ar1[0]);
    print ("<br> $ar1[1]");
    print "<br>count of elements in array is " . count($ar1);

    echo "<ul>";
    for ($i = 0; $i < count($ar1); $i++) {
        echo "<li>$ar1[$i]";
    }
    echo "</ul>";

    echo "<p>using foreach loop";
    foreach ($ar1 as $k ) {
         echo "<br>".$k;
    }
    ?>



</body>

</html>