#include<stdio.h>
#include<malloc.h>

struct node{	
	int data;
	struct node *next;
};

struct node *head;

void insert(int x)
{
	struct node *temp;
	temp=(struct node*)malloc(sizeof(struct node));

   temp->data=x;
   temp->next=NULL;
   
   if(head!=NULL)
   {
	temp->next=head;
   }
   head=temp;
}



void disp(struct node *p)
{
	
	while(p!=NULL){
		printf("\n%d",p->data);
		p=p->next;
	}

}

int main()
{
	head=NULL;
	
	int n;
	int x; 
	int k;
	
	printf("how many no u want to add");
	scanf("%d",&n);
	
	for(x=0;x<n;x++)
	{
		printf("\n Enter number");
		scanf("%d",&k);
		insert(k);
	}
	
	disp(head);
}