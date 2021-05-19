struct employee{

 int id;
 char name[20];
 float salary;
};

struct employee emp;

int main()
{
	 emp.id=1001;
	 //emp.name="shivannad";
	 strcpy(emp.name,"shivananad");
	 
	 emp.salary=78000.00;
	  
	
	printf("employee data ");
	printf("\nemployee id  %d",emp.id);
	printf("\nemployee name  %s",emp.name);
	printf("\nemployee salary  %f",emp.salary);
	
}


