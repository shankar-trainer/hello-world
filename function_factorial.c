#include<stdio.h>

int factorial(int k){
  int fact=1,i;
   for(i=1;i<=k;i++){
   	fact=fact*i;
   }
   return fact;
} 
 int main()
 {
   int a=5,b;
   b=factorial(a);
   printf("\nfactorial is %d ",b);
   a=4;
   b=factorial(a);
   printf("\nfactorial is %d ",b);
   
   printf("\nfactorial is %d ",factorial(7));
   
   return 1;
}
