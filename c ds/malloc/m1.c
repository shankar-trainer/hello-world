#include<stdio.h>

int main()
{
	
	printf("hello");
		
	int *p;
	int x=1;
	
	p=(int*)malloc(10*sizeof(int));
	
	p+0=10;
	
	p+1=11;
	
	p+2=12;
	
	p+3=13;
	
	p+4=14;
		
	printf("%d\n",*(p+0));
	printf("%d\n",*(p+1));
	printf("%d\n",*(p+2));
	printf("%d\n",*(p+3));
	printf("%d\n",*(p+4));
	
}

