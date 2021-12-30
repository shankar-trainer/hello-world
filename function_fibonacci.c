void fibonacci(int n)
{
int a=0,i=0;
int b=1;
int z=0;

printf("\nfibonacci series for number %d ",n);
printf("\n");
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
printf("\n");
}

int main()
{
	
fibonacci(3);	
fibonacci(4);
fibonacci(5);	
	
}
