#include <stdio.h>

int main()
{
int fact=1;
int a;

printf("\nEnter a number");
scanf("%d",&a);

for(int i = 1; i <=a ; i++)
{
	fact=fact*i;
}

printf("\nfactorial of %d is %d  ",a,fact);
return 0;
}