#include<stdio.h>
#include<string.h>

struct employee{

 int id;
 char name[20];
 float salary;
};

struct employee emp[3];

void disp(struct employee e[]){
	int x;
	printf("employee data using function ");
	
    for( x=0;x<=2;x++){
	printf("\n\nemployee id  %d",e[x].id);
	printf("\nemployee name  %s",e[x].name);
	printf("\nemployee salary  %f",e[x].salary);
     }
	}
int main()
{int x;
    for( x=0;x<=2;x++){
	   printf("enter id ");
	   scanf("%d", &emp[x].id);
	   
	   printf("enter name ");
	   //scanf("%s", &emp[x].name);
	   //fgets(emp[x].name,120,stdin);
	   getchar();
	   gets(emp[x].name);
	   
	   printf("enter salary ");
	   scanf("%f", &emp[x].salary);
	}

		
  disp(emp);
  
  return 1;
}


