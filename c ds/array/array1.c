#include<stdio.h>
int main()
{
	int x,y;	
	int arr[]={1,2,3,4,5};
	int arr2[3][4]={
		   {1,2,3,99},
		   {4,5,6,98},
		   {7,8,9,97}
		   
		};
	int arr3[3][4]={
		   {11,22,33,99},
		   {44,55,66,98},
		   {77,88,99,97}
		   
		};
	int arr4[3][4];	

	printf("1st array");
	for(x=0;x<5;x++)
	  printf("\n\t%d", arr[x]);	
		
	printf("\n2nd array\n");
		
	for(x=0;x<3;x++){
	for(y=0;y<4;y++){
	  printf("  %d", arr2[x][y]);	
	}
	printf("\n");
	}
	printf("\n3rd array\n");
		
	for(x=0;x<3;x++){
	for(y=0;y<4;y++){
	  printf("  %d", arr3[x][y]);	
	}
	printf("\n");
	}
	
	printf("\nsum of  array1 and array2 \n");
	
	
	for(x=0;x<3;x++){
	for(y=0;y<4;y++){
		arr4[x][y]=arr2[x][y]+arr3[x][y];
	  printf("  %d", arr4[x][y]);	
	}
	printf("\n");
	}
	
	
	
	
	
}

