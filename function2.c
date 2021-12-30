//	function with  parameter, no return 

#include<stdio.h>

void addition(int x, int y)
   {
   	int c;
   	c=x+y;
   	printf("\nsum of %d and %d is %d ",x,y,c);
   	
   }
   
 int main()
 {
   int a, b;
   printf("using function");
  
     printf("enter  1st no");
   	scanf("%d",&a);
   	
	printf("enter  2nd no");
   	scanf("%d",&b);
    
   addition(a,b);
   
   return 1;
   
 }
		 
		
		
