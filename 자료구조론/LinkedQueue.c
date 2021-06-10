#include <stdio.h>
#include <stdlib.h>

typedef char element;
typedef struct QNode{
	element data;
	struct QNode *link;
}QNode;

typedef struct {
	QNode *front, *rear;
}LQueueType;

LQueueType* createLinkedQueue() {
	LQueueType* LQ = (LQueueType*)malloc(sizeof(LQueueType));
	LQ->front = NULL;
	LQ->rear = NULL;
}

int isEmpty(LQueueType *LQ) {
	if(LQ->front == NULL)	return 1;
	else return 0;
}

void enQueue(LQueueType *LQ, element item) {
	QNode *newNode = (QNode*)malloc(sizeof(QNode));
	newNode->data = item;
	newNode->link = NULL;
	if(LQ->front == NULL) {
		LQ->front = newNode;
		LQ->rear = newNode;
	}
	else {
		LQ->rear->link = newNode;
		LQ->rear = LQ->rear->link;
	}
}

element deQueue(LQueueType *LQ) {
	QNode *temp;
	element item;
	if(isEmpty(LQ))	return 0;
	else {
		temp = LQ->front;
		item = temp->data;
		LQ->front = LQ->front->link;
		if(LQ->front == NULL) {
			LQ->rear = NULL;
		}
		free(temp);
		return item;
	}
}

element peek(LQueueType *LQ) {
	if(isEmpty(LQ)) return 0;
	else return LQ->front->data;
}

void printLQ(LQueueType *LQ) {
	QNode *temp = LQ->front;
	printf("LQ [");
	while(temp) {
		printf("%3c", temp->data);
		temp = temp->link;
	}
	printf("]");
}

void main(void) {
	LQueueType *LQ = createLinkedQueue();
	element data;
	printf("\n���� ť ����\n");
	printf("\n���� A>>");	enQueue(LQ, 'A');	printLQ(LQ);
	printf("\n���� B>>");	enQueue(LQ, 'B');	printLQ(LQ);
	printf("\n���� C>>");	enQueue(LQ, 'C');	printLQ(LQ);
	data = peek(LQ);	printf("peek item: %c\n", data);
	printf("\n���� >>");	data=deQueue(LQ);	printLQ(LQ);
	printf("\t���� ������ : %c", data);
	printf("\n���� >>");	data=deQueue(LQ);	printLQ(LQ);
	printf("\t���� ������ : %c", data);
	printf("\n���� >>");	data=deQueue(LQ);	printLQ(LQ);
	printf("\t���� ������ : %c", data);
	printf("\n���� D>>");	enQueue(LQ, 'D');	printLQ(LQ);
	printf("\n���� E>>");	enQueue(LQ, 'E');	printLQ(LQ);
}
