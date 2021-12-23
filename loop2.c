#include<stdio.h>
int main()
{
printf("\nloop program \n");
printf("\nwhile  loop ");
int counter=1;

int sum=0;

while(counter<=10)
{
 sum=sum+counter;	
 counter=counter+1;
}

printf("sum of 1 - 10 is %d ",sum);
return 0;
}


