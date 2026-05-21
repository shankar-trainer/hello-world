<?php
session_start();
if(!isset($_SESSION['hits'])){
$_SESSION['hits']=0;
}

$_SESSION['hits']++;
echo 'user hits '.$_SESSION['hits'];

?>