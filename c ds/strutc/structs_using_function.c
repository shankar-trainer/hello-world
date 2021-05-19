#include<stdio.h>
#include<string.h>

struct employee{

 int id;
 char name[20];
 float salary;
};

struct employee emp;

void disp(struct employee e){
	
	printf("employee data using function ");
	printf("\nemployee id  %d",e.id);
	printf("\nemployee name  %s",e.name);
	printf("\nemployee salary  %f",e.salary);
	
	}
int main()
{
	 emp.id=1001;
	 //emp.name="shivannad";
	 strcpy(emp.name,"shivananad");
	 
	 emp.salary=78000.00;
  disp(emp);
}


