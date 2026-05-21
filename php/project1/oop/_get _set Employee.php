<?php  

class Employee{
	private $data=[];
	public function __set($name,$value){
		$this->data[$name]=$value;
	}  
	
	public function __get($name){
	 return $this->data[$name];
	} 
}

$emp=new Employee();
$emp->id=10001;
$emp->name="amit kumar";
$emp->salary=20000;

echo "employee data ";

echo "\nid is ".$emp->id;
echo "\nname is ".$emp->name;
echo "\nsalary is ".$emp->salary;

?>
