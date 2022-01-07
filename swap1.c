void swap(int a, int b)
{
	int temp;
	printf("\nbefore swap \n");
	
	printf("a is %d",a);
	printf("\nb is %d",b);
	
	temp=a;
	a=b;
	b=temp;
	
	
	printf("\nafter swap \n");
	
	printf("\na is %d",a);
	printf("\nb is %d",b);
	
}
void main()
{ 
    int x=10,y=15;


	printf("\nInside main \n");
	printf("\nx is %d",x);
	printf("\ny is %d",y);

    
	swap(x,y);
	
	printf("\nInside main after swap  \n");
	printf("\nx is %d",x);
	printf("\ny is %d",y);
	
}
