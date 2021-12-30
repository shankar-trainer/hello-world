//	function with  parameter, with  return 

#include<stdio.h>
 int  addition(int x, int y)
   {
   	int c;
   	c=x+y;
   	 return c;
   }
  

 int main()
 {
   int a, b,p;
   printf("using function");
    
    printf("enter  1st no");
   	scanf("%d",&a);
   	
	printf("enter  2nd no");
   	scanf("%d",&b);
    
   p=addition(a,b);
   printf("\nsum of %d and %d is %d ",a,b,p);
   	
   return 1;
   
 }
		 
		
		
