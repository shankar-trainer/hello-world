#include<stdio.h>
#include<string.h>

struct book
{

int isbn;
char bname[20];
char author[30];
float price;
};


int main()
{

struct book b1={100999, "let us c","y kanitkar",455};
struct book *ptr;

ptr=&b1;

printf("Book Info ");
printf("\nisbn %d",b1.isbn);
printf("\nname %s",b1.bname);
printf("\nauthor %s",b1.author);
printf("\nprice %f",b1.price);



printf("\nBook Info Using Pointer \n");
printf("\nisbn %d",ptr->isbn);
printf("\nname %s",ptr->bname);
printf("\nauthor %s",ptr->author);
printf("\nprice %f",ptr->price);

}


