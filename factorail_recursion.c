int factorial(int x)
{
	if(x==1)
	  return 1;
	else 
	 return  x*factorial(x-1); 
}

void main()
{
	int result=factorial(6);
printf("\nfactorial of 6 is %d ",result);
printf("\nfactorial of 5 is %d ",factorial(5));
printf("\nfactorial of 4 is %d ",factorial(4));
}
