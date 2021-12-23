#include <stdio.h>

int main()
{
int a;
int sum=0;

for(int i = 1; i <=5 ; i++)
{
	printf("Enter No ");
	scanf("%d",&a);
	sum=sum+a;
}	
	printf("\n\nsum is %d ",sum);
	
return 0;
}