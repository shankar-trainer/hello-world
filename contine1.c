#include<stdio.h>
int main()
{
	// take five even number and display the sum
	// if input is not even number then continue 
	
	 int c=1;
     int a,sum=0;
     
     while(c<=5)
	 {
	 printf(" Enter  number  %d ",c);
     scanf("%d",&a);
	 if(a%2==0){
		 sum=sum+a;
		 }	
	 else 
	 	continue; 
	 c++;	
	 }
	 
     printf("\nsum is %d ",sum);
     
	return 0;	
}	
	