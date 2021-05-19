#include <stdio.h>
#include <string.h>

struct Employee {

 int id;
 char name[10];

}; 

int main()
{
struct Employee e;
e.id=1001;
strcpy(e.name,"ram kumar");

printf("id is %d",e.id);
printf("\nname is %s",e.name);

}

