 <?php
	echo "<div style='border:solid;padding:10pt'>";
	echo "<br> PHP_SELF ".$_SERVER['PHP_SELF'];
	echo "<br> REQUEST_METHOD ". $_SERVER['REQUEST_METHOD'];
	echo "<br> REMOTE_ADDR ".$_SERVER['REMOTE_ADDR'];
	echo "<br> HTTP_USER_AGENT ".$_SERVER['HTTP_USER_AGENT'];
	echo "</div>";
 ?>


<html>
<head>
<!--     <form action="<?php echo $_SERVER['PHP_SELF'] ?>">-->
    <form action="form3_cookie.php">
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
</head>
</html>