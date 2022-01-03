#include<stdio.h>

int main()
{
  int ar[10]={
  11,22,33,44,55,66,77,88,99,1
  };
  int sum=0,i;
     printf("\n numbers are \n");
     for(i=0;i<=9;i++){
      printf("%d\t",ar[i]); 
    }

   for(i=0;i<=9;i++){
     sum=sum+ar[i];
   } 
  
   printf("\n sum is %d  ",sum);
  
    
   return 1;

}
