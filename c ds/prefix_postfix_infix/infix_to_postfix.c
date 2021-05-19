#include<stdio.h>
#include<malloc.h>


struct Stack{
	
	int top;
	int capacity;
	int *array;
};

struct Stack *createStack(int capacity)
{
	struct Stack *stack;
     stack=malloc(sizeof(struct Stack));
	 
	 if(!stack)
		 return NULL;
	 stack->capacity=capacity;
	 stack->top=-1;
	 stack->array=(int*)malloc(sizeof(int));
	 
	 if(!stack->array)
		 return NULL;
	 return stack;
		
}

int size(struct Stack *stack)
{
	return (stack->top+1);
}

int isFull(struct Stack *stack)
{
	return (stack->top==stack->capacity-1);
}

void push(struct Stack *stack, int data)
{
	//if(isFull(stack))
	stack->array[++stack->top]=data;
}
int pop(struct Stack *stack)
{
	
	return (stack->array[stack->top--]);
	
}


int main()
{
    struct Stack *s1;
s1=createStack(5);	
	printf("program test");
	
	int i=0,capacity=5;
	for(i=0;i<5;i++){
		push(s1,i+100);
	}
	
	for(i=0;i<5;i++){
		printf("%d\n",pop(s1));
	}
	
}