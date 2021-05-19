#include<stdio.h>

int main()
{
		int k;
		
	int *p;
	p=&k;
	
	*p=20;
	
	printf("p address %d ",p);
	printf("\n p is ",*p);
}

