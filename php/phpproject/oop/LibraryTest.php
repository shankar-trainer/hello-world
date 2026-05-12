<style>
    .style1{
        width:30%;
        margin-left: 250pt;
        margin-top: 40pt;
        border: solid 2pt;
        padding: 50pt;
        border-radius: 20pt;
        color: blue;
        background-color: lightyellow;
    }
    </style>
<?php 
include("Library.php");
$library1=new Library();
$library1->id=1000;
$library1->name='health library';
$library1->location='thoraipakkam';
$library1->total_member=100;
$library1->pin=65656565;

echo "<p class='style1'>Library data";
echo "<br>   id :".$library1->id."";
echo "<br>   name :".$library1->name."";
echo "<br>   location :".$library1->location."";
echo "<br>   total member :".$library1->total_member."";
echo "<br>   pin :".$library1->pin."";


?>
