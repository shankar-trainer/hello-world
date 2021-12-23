#include <stdio.h>

int main()
{
int a=0;
int b=1;
int n=8;
int z=0;
//0,1,1,2,3,5,8
for(int i = 1; i <=n ; i++)
{
		printf("%d  ",z );

    z=a+b;
	
	a=b;
	b=z;
	
}
return 0;
		
}