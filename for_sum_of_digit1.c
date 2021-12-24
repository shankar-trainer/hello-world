#include <stdio.h>

int main()
{
int a=567;
int sum=0;


for(;a!=0;){
	sum=sum+(a%10);
	a=a/10;	
}
printf("sum is %d ",sum);

return 0;

}