#include <stdio.h>

int main()
{
	int i;
	int j;
	int n;
     printf("\n enter row no for floyd triangle \n");
     scanf("%d",&n);
	printf("\nrow is %d ", n  );
	printf("\n");
	for(i = 1; i <=n; i++)
	{
		for(j = 0; j <i ; j++)
		{
			printf("* ");
		}
		printf("\n");
	}
	
	
return 0;	
}

	
	