var myapp=angular.module("myapp2",[]);
myapp.controller("mycontroller2", function($scope) {
	$scope.disp=function(fname,lname,email){
	alert("Hello "+fname +"  "+lname+" email is "+email)
	}
})
