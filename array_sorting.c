#include<stdio.h>

int main()
{

int ar[6]={11,2,1,3,5,4};
int ar1[6];

int i,j,temp;

printf("\nunsorted array\n");
for(i=0;i<=5;i++){
 printf("%d   ",ar[i]);
}

for(i=0;i<=5;i++){
for(j=0;j<=i-1;j++){
 
 if(ar[j]>ar[j+1]){
  temp=ar[j];
  ar[j]=ar[j+1];
  ar[j+1]=temp;
   }
  }
}

printf("\nsorted array\n");
for(i=0;i<=5;i++){
 printf("%d   ",ar[i]);
}

return 1;

}
