#include<stdio.h>
#include<malloc.h>

struct node{	
	int data;
	struct node *next;
};


	struct node *head=NULL;
	struct node *first=NULL;
	struct node *second=NULL;

void disp(struct node *p)
{
	
	while(p!=NULL){
		printf("\n%d",p->data);
		p=p->next;
		
	}

	
}


int main()
{

	printf("welcome to linked list program\n");
	
	first=(struct node*)malloc(sizeof(struct node));
	second=(struct node*)malloc(sizeof(struct node));
	
	head=first;
	first->data=2;
	
	first->next=second;
	
	second->data=4;
	second->next=NULL;
	
	printf("first  %d\n",first->data);
	printf("second %d\n",second->data);


printf("Using Loop \n");

    while(head!=NULL){
		printf("\t\n%d",head->data);
		head=head->next;
		
	}
	
	head=first;
	
printf("\nUsing Function \n");

disp(head);
	
}
