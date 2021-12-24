#include <stdio.h>

int main()
{
int a=567;
int sum=0;

/*
printf("\n%d",13%10);// reminder 3
printf("\n%d",13/5);//2
printf("\n%d",1/10);//2
printf("\n%d",1%10);//1
*/

while(a!=0){
	sum=sum+(a%10);
	a=a/10;	
}
printf("sum is %d ",sum);

return 0;

}