#include <stdio.h>
#include <stdlib.h>
#define MAX_SIZE 4

typedef char element;
typedef struct QNode {
	element queue[MAX_SIZE];
	int front, rear;
}QNode;

QNode* createQueue() {
	QNode* cQ = (QNode*)malloc(sizeof(QNode));
	cQ->front = 0;
	cQ->rear = 0;
	return cQ;
}

int isFull(QNode *cQ) {
	if((cQ->rear+1)%MAX_SIZE == cQ->front)	return 1;
	else return 0;
}

int isEmpty(QNode *cQ) {
	if(cQ->front == cQ->rear) return 1;
	else return 0;
}

void enQueue(QNode *cQ, element item) {
	if(isFull(cQ))	return;
	else {
		cQ->rear = (cQ->rear+1)%MAX_SIZE;
		cQ->queue[cQ->rear] = item;
	}
}

element deQueue(QNode* cQ) {
	if(isEmpty(cQ))	return 0;
	else {
		cQ->front = (cQ->front+1)%MAX_SIZE;
		return cQ->queue[cQ->front];
	}
}

element peek(QNode* cQ) {
	if(isEmpty(cQ))	return 0;
	else return cQ->queue[cQ->front+1];
}

void printQ(QNode *cQ) {
	int rear, front;
	front = (cQ->front+1)%MAX_SIZE;
	rear = (cQ->rear+1)%MAX_SIZE;
	printf("cQ [");
	while(front!=rear) {
		printf("%3c ", cQ->queue[front]);
		front = (front+1)%MAX_SIZE;
	}
	printf("]");
}

void main(void) {
	QNode *cQ = createQueue();
	element data;
	printf("\n원형 큐 연산\n");
	printf("\n삽입 A>>");	enQueue(cQ, 'A'); printQ(cQ);
	printf("\n삽입 B>>");	enQueue(cQ, 'B'); printQ(cQ);
	printf("\n삽입 C>>");	enQueue(cQ, 'C'); printQ(cQ);
	data=peek(cQ);	printf("peek item:%c\n", data);
	printf("\n삭제 >>");	data=deQueue(cQ); printQ(cQ);
	printf("\t삭제 데이터:%c", data);
	printf("\n삭제 >>");	data=deQueue(cQ); printQ(cQ);
	printf("\t삭제 데이터:%c", data);
	printf("\n삭제 >>");	data=deQueue(cQ); printQ(cQ);
	printf("\t삭제 데이터:%c", data);
	printf("\n삽입 D>>");	enQueue(cQ, 'D'); printQ(cQ);
	printf("\n삽입 E>>");	enQueue(cQ, 'E'); printQ(cQ);
}
