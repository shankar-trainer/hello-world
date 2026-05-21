<?php
if (!empty($_GET['id']) && !empty($_GET['name'])) {
  echo "welcome " . $_GET['id'] . "<p>name " . $_GET['name'];
  setcookie('id', $_GET['id']);
  setcookie('name', $_GET['name']);
} else {
  echo "go back";
}

?>