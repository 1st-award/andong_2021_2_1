#include <stdio.h>
#include <stdlib.h>

typedef struct ListNode {
	float coef;
	int expo;
	struct ListNode *link;
}listNode;

typedef struct {
	listNode *head;
}listHead;

listHead* createLinkedList() {
	listHead *L = (listHead*)malloc(sizeof(listHead));
	L->head = NULL;
	return L;
}

void printList(listHead *L) {
	listNode *temp = L->head;
	while(temp!=NULL) {
		printf("%3.0fx^%d", temp->coef, temp->expo);
		temp = temp->link;
		if(temp!=NULL)	printf(" + ");
	}
	puts("");
}

void appendTerm(listHead *L, float coef, int expo) {
	listNode *newNode = (listNode*)malloc(sizeof(listNode)), *temp;
	newNode->coef = coef;
	newNode->expo = expo;
	newNode->link = NULL;
	if(L->head == NULL) {
		L->head = newNode;
	}
	else {
		temp = L->head;
		while(temp->link!=NULL) {
			temp = temp->link;
		}
		temp->link = newNode;
	}
}

void addPoly(listHead *A, listHead *B, listHead *C) {
	listNode *p, *q;
	p = A->head;
	q = B->head;
	int sum = 0;
	while(p && q) {
		if(p->expo == q->expo) {
			sum = p->coef + q->coef;
			appendTerm(C, sum, p->expo);
			p = p->link;	q = q->link;
		}
		else if(p->expo > q->expo) {
			appendTerm(C, p->coef, p->expo);
			p = p->link;
		}
		else {
			appendTerm(C, q->coef, q->expo);
			q = q->link;
		}
	}
	
	while(p) {
		appendTerm(C, p->coef, p->expo);
		p = p->link;
	}
	while(q) {
		appendTerm(C, q->coef, q->expo);
		q = q->link;
	}
}

void main() {
	listHead *A = createLinkedList();
	listHead *B = createLinkedList();
	listHead *C = createLinkedList();
	
	appendTerm(A, 4, 3);
	appendTerm(A, 3, 2);
	appendTerm(A, 5, 1);
	printf("\nA(x) = ");
	printList(A);
	
	appendTerm(B, 3, 4);
	appendTerm(B, 1, 3);
	appendTerm(B, 2, 1);
	appendTerm(B, 1, 0);
	printf("\nB(x) = ");
	printList(B);
	
	addPoly(A, B, C);
	printf("\nC(x) = ");
	printList(C);
}
