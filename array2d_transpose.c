#include<stdio.h>

int main()
{
int i, j;
int arr2[3][4];
	int arr1[4][3]={
		      {1,2,3},
			  {4,5,6},
			  {7,8,9},
			  {11,12,13}
		 };

printf("\narray1 \n"); 
   
   for(i=0;i<=3;i++){
    for(j=0;j<=2;j++){
      printf("%d\t",arr1[i][j]);  
          } 
	printf("\n");
   }


   for(i=0;i<=2;i++){
    for(j=0;j<=3;j++){
          arr2[i][j]=arr1[j][i];
		  } 
   }


printf("\nafter transpose array2 \n"); 
   
   for(i=0;i<=2;i++){
    for(j=0;j<=3;j++){
      printf("%d\t",arr2[i][j]);  
    } 
	printf("\n");
   }

return 1;

}
