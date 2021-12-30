#include <stdio.h>
int main()
{
int a=0,i;
int b=1;
int n=11;
int z=0;
//0,1,1,2,3,5,8
//0 
for(i = 1; i <=n ; i++)
{
	if(i==2)
	printf("%d  ",z );
	else{
	printf("%d  ",z );
	z=a+b;
	a=b;
	b=z;
 }
}
return 0;
}
