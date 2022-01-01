//	function with no parameter, no return 

#include<stdio.h>
    

 int main()
 {
   printf("\nusing function");
   addition();
   return 1;
 }
		 
void addition()
   {
   int a, b,c;	
   	printf("\nenter  1st no  ");
   	scanf("%d",&a);
   	
	printf("\nenter  2nd no  ");
   	scanf("%d",&b);
   	c=a+b;
   	printf("\nsum of %d and %d is %d ",a,b,c);
   	}
  		
		
