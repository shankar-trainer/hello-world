#include<stdio.h>
#include<malloc.h>
#include<string.h>

struct infix{
	char target[10];
	char stack[10];
	char *s,*t;
	int top;
};

void initinfix(struct infix *p)
{
	p->top=-1;
	strcpy(p->target,"");
	strcpy(p->stack,"");
	p->s="";
	p->t="";
}

void setexpr(struct infix *p, char *str)
{
	p->s=str;
}

void push(struct infix *p, char c)
{
	if(p->top==10)
		printf("\nstack is full");
	else {
		p->top++;
		p->stack[p->top]=c;
	}
}

char  pop(struct infix *p)
{
	if(p->top==-1){
		printf("\nstack is empty");
	 return -1;  
	}
	else		
		
	return p->stack[p->top--];

}

int main()
{
	int x=0;
	
	struct infix p;
	initinfix(&p);
	//setexpr(&p,expr);
	push(&p,'a');
	push(&p,'b');
	push(&p,'c');
	push(&p,'d');
	push(&p,'e');
	push(&p,'f');
	push(&p,'g');
	push(&p,'h');
	push(&p,'i');
	push(&p,'j');
	
	for(x=0;x<10;x++)
		printf("\n\t%c",pop(&p));
	
}