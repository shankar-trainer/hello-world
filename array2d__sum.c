#include<stdio.h>

int main()
{
int i, j;
int arr3[4][3];
	int arr1[4][3]={
		      {1,2,3},
			  {4,5,6},
			  {7,8,9},
			  {11,12,13}
		 };
		
	int arr2[4][3]={
		      {11,2,3},
			  {24,5,6},
			  {37,80,9},
			  {1,2,31}
		 };
		
	printf("\narray1 \n"); 
   
   for(i=0;i<=3;i++){
    for(j=0;j<=2;j++){
      printf("%d\t",arr1[i][j]);   
    } 
	printf("\n");
   }

printf("\narray2 \n"); 
   
   for(i=0;i<=3;i++){
    for(j=0;j<=2;j++){
      printf("%d\t",arr2[i][j]);  
    arr3[i][j]=arr1[i][j]+arr2[i][j];	  
    } 
	printf("\n");
   }
  
  
	printf("\nsum of array1 and array2 \n"); 
   
   for(i=0;i<=3;i++){
    for(j=0;j<=2;j++){
      printf("%d\t",arr3[i][j]);   
    } 
	printf("\n");
   }
   return 1;

}
