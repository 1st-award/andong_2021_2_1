#include <stdio.h>
#include <stdlib.h>
#include <string.h>

typedef int element;
typedef struct stackNode {
	element data;
	struct stackNode *link;
}stackNode;

stackNode *top;

int isEmpty() {
	if(top == NULL)	return 1;
	else return 0;
}

void push(element item) {
	stackNode *newNode = (stackNode*)malloc(sizeof(stackNode));
	newNode->data = item;
	newNode->link = top;
	top = newNode;
}

element pop() {
	stackNode *temp;
	element item;
	if(isEmpty())	return 0;
	else {
		temp = top;
		item = temp->data;
		top = top->link;
		free(temp);
		return item;		
	}
}

element peek() {
	if(isEmpty())	return 0;
	else	return top->data;
}

void printStack() {
	stackNode *temp = top;
	printf("\nSTACK [");
	while(temp!=NULL) {
		printf("%d ", temp->data);
		temp = temp->link;
	}
	printf("]");
}

void main(void) {
	element item;
	printf("**연결 스택 연산**\n");
	printStack();
	push(1);	printStack();
	push(2);	printStack();
	push(3);	printStack();	printf("\tpeek => %d", peek());
	item =pop();printStack();	printf("\tpop => %d", item);
	item =pop();printStack();	printf("\tpop => %d", item);
	item =pop();printStack();	printf("\tpop => %d", item);
}
