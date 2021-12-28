#include<stdio.h>

int main()
{  char c;
     int k=1;
     
   printf("\n\tSmall Alphabet\n\n");

  for(c='a';c<='z';c++)	{
     printf("%c\t",c);
     if(k%5==0)
       printf("\n");
     k++;
  }
  
  
   printf("\n\tCapital Alphabet\n\n");
  k=1;
  for(c='A';c<='Z';c++)	{
     printf("%c\t",c);
     if(k%5==0)
       printf("\n");
     k++;
  }
  

return 0;
  }
	
