int main()
{
	int a,b,c;
	printf("enter two number");
	scanf("%d",&a);
	scanf("%d",&b);
	
	printf("\n1. Addition");
	printf("\n2. Subtraction");
	printf("\n3. Multiplication");
	printf("\n4. Division");
	printf("\nenter operation no");
	
	scanf("%d",&c);
	switch(c)
	{
	case 1:
	 printf("\nAddition  of %d and %d is %d  ",a,b,a+b);
	 break;
	case 2:
	 printf("\nSubtraction  of %d and %d is %d  ",a,b,a-b);
	break;
	case 3:
	 printf("\nMultiplication  of %d and %d is %d  ",a,b,a*b);
     break;
	case 4:
	 printf("\nDivision  of %d and %d is %d  ",a,b,a/b);
	  break;
	default:
	printf("\n wrong choice");  
	}
 }

