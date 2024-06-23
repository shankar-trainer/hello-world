<!DOCTYPE html>
<html>
<head>
<style>
table, th, td {
	border: 1px solid grey;
	border-collapse: collapse;
	padding: 5px;
}

table tr:nth-child(odd) {
	background-color: #f2f2f2;
}

table tr:nth-child(even) {
	background-color: #ffffff;
}
</style>
<script type="text/javascript" src="js/angular.js"></script>
<script type="text/javascript">
	angular.module("app1", []).controller("control1", function($scope, $http) {
		$http.get("empdata.jsp").success(function(response) {
			$scope.mydata = response
		})
	});
</script>
</head>
<body ng-app="app1" ng-controller="control1">
	<table>
		<tr>
			<th>Id</th>
			<th>Name</th>
			<th>Salary</th>
		</tr>

		<tr ng-repeat="s in mydata">
			<td>{{s.id}}</td>
			<td>{{s.name}}</td>
			<td>{{s.salary}}</td>
		</tr>
	</table>

</body>
</html>