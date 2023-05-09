function hello(){
  let x=10;
	function welcome(){
       console.log(x);
	}
	return welcome;
}

let show=hello();
show();