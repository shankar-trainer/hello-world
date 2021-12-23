#include<stdio.h>
int main()
{
int counter=1;
int x=0;
int sum=0;

while(counter<=5)
{
	printf("Enter number");
	scanf("%d",&x);
	sum=sum+x;
	counter=counter+1;
}

printf("\n sum is %d ",sum);
return 0;

}


