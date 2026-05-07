<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.8/dist/css/bootstrap.min.css" rel="stylesheet"
        integrity="sha384-sRIl4kxILFvY47J16cr9ZwB07vP4J8+LH7qKQnuqkuIAvNWLzeN8tE5YBujZqJLB" crossorigin="anonymous">

</head>

<body>

    <div class="container border border-primary p-4 m-5 bg-info text-light">
        <?php

        $cities = array("new delhi", "chennai", "mumbai", "kolkotta", "madurai");

        echo "<div class='row'>";
        echo "<div class='col-4   border border-secondary'>";
        print "before sorting <p>";
        foreach ($cities as $city) {
            print "" . $city . ", ";
        }
        echo "</div>";

        sort($cities);
        echo "<div class='col-4   border border-secondary'>";
        print "<br>after sorting<p>";

        foreach ($cities as $city) {
            print "" . $city . ", ";
        }

        echo "</div>";

        rsort($cities);

        echo "<div class='col-4   border border-secondary'>";
        print "<br>after sorting in reverse order<p>";

        foreach ($cities as $city) {
            print "" . $city . ", ";
        }
        echo "</div>";

        echo "</div>";
        ?>
    </div>
</body>

</html>