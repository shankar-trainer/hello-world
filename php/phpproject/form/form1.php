<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
    <style>
        label{
            float: left;
            width: 110pt;
        }
        input{
            width: 100pt;
        }
        form{
            width: 40%;
            border: solid;
            padding: 20pt;
            margin-left: 200pt;
            margin-top: 50pt;
            background-color: antiquewhite;
        }
        .style1{
            width: 40%;
            border: solid;
            padding: 20pt;
            margin-left: 200pt;
            margin-top: 10pt;
            background-color: lightblue;
            color: blue;
        }
    </style> 
</head>
<body>
    <?php
    echo "<div class='style1'>";
    if (isset($_POST["id"]) && isset($_POST["name"])) {
        if (empty($_POST["id"])) {
            echo "<span style='color:red'> id is empty </span>";
        } else if (empty($_POST["name"])) {
            echo "<span style='color:red'> name is empty </span>";
        } else {
            $id = $_POST["id"];
            $name = $_POST["name"];
            echo "id is " . $id;
            echo "<br>name is " . $name;
            echo "<br>server values";
            echo "<br>".$_SERVER['SERVER_ADDR'] ;
            echo "<br>".$_SERVER['SERVER_NAME'] ;
            echo "<br>".$_SERVER['HTTP_HOST'] ;
            echo "<br>".$_SERVER['REMOTE_ADDR'] ;
            echo "<br>".$_SERVER['REQUEST_METHOD'] ;
        }
    } else {
        echo "value not found";
    }
     echo "</div>";
    ?>

    <!-- <form action="form1.php" method="post"> -->
    <!-- <form  method="post"> -->
    <!-- <form  method="post" action="<?php echo $_SERVER['PHP_SELF']  ?>"> -->

    <form  method="post" action="<?php echo htmlspecialchars($_SERVER['PHP_SELF'])  ?>">
        <div>
            <label>enter id</label>
            <input name="id">
        </div>

        <div>
            <label>enter name</label>
            <input name="name">
        </div>
        <div>
            <button type="submit">submit</button>
            <button type="reset">cancle</button>
        </div>
    </form>
</body>

</html>