#include<stdio.h>

int main()
{
  int ar[10],sum,i;
   
   for(i=0;i<=9;i++){
     printf("enter a number\n");
     scanf("%d",&ar[i]);
     sum=sum+ar[i];
   } 
  
   printf("\n sum is %d  ",sum);
  
  printf("\n numbers are \n");
     for(i=0;i<=9;i++){
      printf("%d\t",ar[i]); 
    }
    
   return 1;

}
