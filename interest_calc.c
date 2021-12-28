#include<stdio.h>
int main()
{
int time;
float amount,rate;

do 
{
	printf("\nenter amount");
   scanf("%f",&amount);
}
while(amount<=0);


do 
{
   printf("\nenter rate");
   scanf("%f",&rate);
}
while(rate<=0);

do 
{
   printf("\nenter time");
   scanf("%d",&time);
}
while(time<=0);

float interest=amount*rate*time/100;

printf("\ninterest  is %f ",interest);

return 0;

}

