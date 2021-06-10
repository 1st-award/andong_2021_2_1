#include <stdio.h>
#include <stdlib.h>

typedef char element;
typedef struct DQNode {
	element data;
	struct DQNode *llink, *rlink;
}DQNode;

typedef struct {
	DQNode *front, *rear;
}DQType;

DQType* createDQ() {
	DQType *DQ = (DQType*)malloc(sizeof(DQType));
	DQ->front = NULL;
	DQ->rear = NULL;
	return DQ;
}

int isEmpty(DQType *DQ) {
	if(DQ->front == NULL) return 1;
	else return 0;
}

void insertFront(DQType *DQ, element item) {
	DQNode *newNode = (DQNode*)malloc(sizeof(DQNode));
	newNode->data = item;
	newNode->llink = NULL;
	if(DQ->front == NULL) {
		DQ->front = newNode;
		DQ->rear = newNode;
		newNode->rlink = NULL;
	}
	else {
		newNode->rlink = DQ->front;
		DQ->front->llink = newNode;
		DQ->front = newNode;
	}
}

void insertRear(DQType *DQ, element item) {
	DQNode *newNode = (DQNode*)malloc(sizeof(DQNode));
	newNode->data = item;
	newNode->rlink = NULL;
	if(DQ->front == NULL) {
		DQ->front = newNode;
		DQ->rear = newNode;
		newNode->llink = NULL;
	}
	else {
		DQ->rear->rlink = newNode;
		newNode->llink = DQ->rear;
		DQ->rear = newNode;
	}
}

element deleteFront(DQType *DQ) {
	DQNode *temp;
	element item;
	if(isEmpty(DQ))	return 0;
	else {
		temp = DQ->front;
		item = temp->data;
		DQ->front = DQ->front->rlink;
		if(DQ->front == NULL) {
			DQ->rear = NULL;
		}
		else DQ->front->llink = NULL;
		free(temp);
		return item;
	}
}

element deleteRear(DQType *DQ) {
	DQNode *temp;
	element item;
	if(isEmpty(DQ)) return 0;
	else {
		temp = DQ->rear;
		item = temp->data;
		DQ->rear = DQ->rear->llink;
		if(DQ->rear == NULL) {
			DQ->front = NULL;
		}
		else DQ->rear->rlink = NULL;
		free(temp);
		return item;
	}
}

element peekFront(DQType *DQ) {
	if(isEmpty(DQ))	return 0;
	else return DQ->front->data;
}

element peekRear(DQType *DQ) {
	if(isEmpty(DQ)) return 0;
	else return DQ->rear->data;
}

void printDQ(DQType *DQ) {
	DQNode *temp = DQ->front;
	printf("DQNode [");
	while(temp) {
		printf("%3c", temp->data);
		temp = temp->rlink;
	}
	printf("]");
}

void main(void) {
	DQType *DQ1 = createDQ();
	element data;
	
	printf("\n ===== µ¥Å©¿¬»ê =====\n");
	printf("\n front »ðÀÔ A>> "); insertFront(DQ1, 'A');	printDQ(DQ1);
	printf("\n front »ðÀÔ B>> "); insertFront(DQ1, 'B');	printDQ(DQ1);
	printf("\n rear »ðÀÔ C>> ");  insertRear(DQ1, 'C');		printDQ(DQ1);
	printf("\n front »èÁ¦ >>");	  data = deleteFront(DQ1);  printDQ(DQ1);
	printf("\t»èÁ¦ µ¥ÀÌÅÍ %c", data);
	printf("\n near »èÁ¦ >>");	  data = deleteRear(DQ1);	printDQ(DQ1);
	printf("\t»èÁ¦ µ¥ÀÌÅÍ %c", data);
	printf("\n rear »ðÀÔ D>>");	  insertRear(DQ1, 'D');		printDQ(DQ1);
	printf("\n front »ðÀÔ E>>");  insertFront(DQ1, 'E');	printDQ(DQ1);
	printf("\n front »ðÀÔ F>>");  insertFront(DQ1, 'F');	printDQ(DQ1);
	
	data= peekFront(DQ1);	printf("\n peek Front item : %c\n", data);
	data= peekRear(DQ1);	printf("\n peek Rear  item : %c\n", data);
}
