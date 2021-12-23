#include<stdio.h>
int main()
{
int counter=1;
int x;
printf("\n table program \n");
printf(" enter no for the table ");

scanf("%d",&x);

while(counter<=10)
{
	
	printf("\n%d",x*counter);
	counter++;
}

return 0;

}