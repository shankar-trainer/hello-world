#include <stdio.h>

int main()
{
int a=567;
int b=0;

for(;a!=0;){
    b=b*10+a%10;
	a=a/10;	
}
printf("reverse  is %d ",b);

return 0;

}