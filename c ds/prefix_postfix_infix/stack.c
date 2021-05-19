#include<stdio.h>
#include<malloc.h>

struct Stack{
	int top;
	int capacity;
	int *array;
};

void push(struct Stack *stack, int data)
{
	//if(isFull(stack))
	stack->array[++stack->top]=data;
}
int pop(struct Stack *stack)
{
	return (stack->array[stack->top--]);
}

int peek(struct Stack *stack)
{
	return (stack->array[stack->top]);

}


int isEmpty(struct Stack *stack)
{
		return (stack->top==-1);
	
}

int main()
{
    struct Stack *s1;
	
	s1=malloc(sizeof(struct Stack));
	 s1->capacity=5;
	 s1->top=-1;
	 s1->array=(int*)malloc(sizeof(int));

printf(" \nis Empty %d"+isEmpty(s1));
		
	
	int i=0,capacity=5;
	printf("\npushing ");
	for(i=0;i<5;i++){
		push(s1,i+100);
	}
	
	printf("\nafter push is Empty   %d"+isEmpty(s1));
	
	printf("\n Peek ");
	printf("\n\t%d",peek(s1));
	printf("\n\t%d",peek(s1));
	
	
	printf("\npopping ");
	for(i=0;i<5;i++){
		printf("\n%d",pop(s1));
	}

	printf("\n\nafter pop is Empty   %d"+isEmpty(s1));
	
	
	
	
	
}