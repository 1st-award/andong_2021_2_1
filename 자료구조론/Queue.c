#include <stdio.h>
#include <stdlib.h>
#define MAX_SIZE 4

typedef char element;
typedef struct QNode{
	element queue[MAX_SIZE];
	int rear, front;
}QueueType;

QueueType* createQueue() {
	QueueType *Q = (QueueType*)malloc(sizeof(QueueType));
	Q->rear = -1;
	Q->front = -1;
	return Q;
}

int isFull(QueueType *Q) {
	if(Q->rear == MAX_SIZE-1)	return 1;
	else return 0;
} 

int isEmpty(QueueType *Q) {
	if(Q->rear == Q->front) return 1;
	else return 0;
}

void enQueue(QueueType *Q, element item) {
	if(isFull(Q))	return;
	else {
		Q->rear++;
		Q->queue[Q->rear] = item;
	}
}

element deQueue(QueueType *Q) {
	if(isEmpty(Q)) return 1;
	else {
		Q->front++;
		return Q->queue[Q->front];
	}
}

element peek(QueueType *Q) {
	if(isEmpty(Q)) return 0;
	else {
		return Q->queue[Q->front+1];
	}
}

void printQ(QueueType *Q) {
	int i;
	printf("Q [");
	for(i=Q->front+1; i<=Q->rear; ++i) {
		printf("%3c", Q->queue[i]);
	}
	printf("]");
}

void main(void) {
	QueueType *Q1 = createQueue();
	element data;
	printf("\n순차 큐 연산\n");
	printf("\n삽입 A>>");	enQueue(Q1, 'A'); printQ(Q1);
	printf("\n삽입 B>>");	enQueue(Q1, 'B'); printQ(Q1);
	printf("\n삽입 C>>");	enQueue(Q1, 'C'); printQ(Q1);
	printf("\n삭제 >>");	data=deQueue(Q1); printQ(Q1);
	printf("\t삭제 데이터: %c", data);
	printf("\n삭제 >>");	data=deQueue(Q1); printQ(Q1);
	printf("\t삭제 데이터: %c", data);
	printf("\n삭제 >>");	data=deQueue(Q1); printQ(Q1);
	printf("\t삭제 데이터: %c", data);
	
	printf("\n삽입 D>>");	enQueue(Q1, 'D'); printQ(Q1);
	printf("\n삽입 E>>");	enQueue(Q1, 'E'); printQ(Q1);
	printf("\tPeek >> %c", peek(Q1));
}
