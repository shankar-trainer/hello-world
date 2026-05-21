<?php
if (isset($_GET['id']) && isset($_GET['name'])) {
    $id = $_GET['id'];
    $name = $_GET['name'];
    echo "hello id is " . $id . "<br> name is " . $name;
}
?>
<html>
<head>
</head>
<form action="<?php echo $_SERVER['PHP_SELF'] ?>">
	<!-- <form> -->
	<div>
		<label>enter id </label> <input name="id">
	</div>
	<div>
		<label>enter name </label> <input name="name">
	</div>
	<div>
		<button type="submit">submit</button>
	</div>
</form>

</html>