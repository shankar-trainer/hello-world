#include<stdio.h>
int main()
{
int counter=1;
int x;
int fact=1;

printf("Enter a number ");
scanf("%d",&x);

while(counter<=x){
	fact=fact*counter;
	counter++;	
}

  printf("\nfactorial is %d  ",fact);
}