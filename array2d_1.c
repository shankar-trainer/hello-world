#include<stdio.h>

int main()
{
int i, j;
	int arr[4][3]={
		      {1,2,3},
			  {4,5,6},
			  {7.8,9},
			  {11,12,13}
		 };
		
		
		 
   
   for(i=0;i<=2;i++){
    for(j=0;j<=3;j++){
      printf("%d\t",arr[i][j]);   
    } 
	printf("\n");
   }
  
   return 1;

}
