#include <stdio.h>
#include <stdlib.h>
#define MAX_SIZE 100

typedef int element;
element stack[MAX_SIZE];
int top = -1;

int isFull() {
	if(top == MAX_SIZE-1)	return 1;
	else	return 0;
}

int isEmpty() {
	if(top == -1)	return 1;
	else	return 0;
}

void push(element item) {
	if(isFull())	return;
	else	stack[++top] = item;
}

element pop() {
	if(isEmpty())	return 0;
	else	return stack[top--];
}

element peek() {
	if(isEmpty())	return 0;
	else	return stack[top];
}

void printStack() {
	int i;
	printf("\nSTACK [");
	for(i=0; i<=top; ++i) {
		printf("%d ", stack[i]);
	}
	printf("]");
}

void main(void) {
	element item;
	printf("** 순차 스택 연산 **");
	printStack();
	push(1);	printStack();
	push(2);	printStack();
	push(3);	printStack(); printf("\tpeek => %d", peek());
	item=pop();	printStack(); printf("\tpop => %d", item);
	item=pop();	printStack(); printf("\tpop => %d", item);
	item=pop();	printStack(); printf("\tpop => %d", item);
	 
}
