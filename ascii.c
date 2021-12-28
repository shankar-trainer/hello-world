#include<stdio.h>

int main()
{
 int x;
 int k=1;
 
 for(x=0;x<=255;x++)
 {
   printf("\t\t%d------>%c",x,x);
   if(k%5==0)
    printf("\n");
    k++;
	}
printf("\n Capital Alphabet \n");
k=1;
 
 for(x=65;x<=91;x++)
 {
   printf("\t\t%d------->%c",x,x);
   if(k%5==0)
    printf("\n");
    k++;
}


printf("\n Small Alphabet \n");
k=1;
 
 for(x=97;x<=122;x++)
 {
   printf("\t\t%d------->%c",x,x);
   if(k%5==0)
    printf("\n");
    k++;
}



return 0;
	
}

