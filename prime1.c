#include<stdio.h>
#include <stdlib.h>

int main()
 {
	
	int c=2;
    int a;
    
     printf(" Enter  number   ");
     scanf("%d",&a);
  
     if(a==1)
	 {
	 printf("%d is prime  ",a);
	  exit(0);	
	 }
	         
     while(c<=a-1){
		 
		 if(a%c==0)
		 	break;
		 else
		 c++;
	 }
	
	 //printf("c is %d", c);
	 
	 if(c==a)
	 	printf("%d is prime  ",a);
	 else 
	 	printf("%d is not prime ",a);
	 
}