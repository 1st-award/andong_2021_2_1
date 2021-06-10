#include <stdio.h>
#include <stdlib.h>
#include <string.h>

typedef struct ListNode {
	char data[4];
	struct ListNode *link;
}listNode;

typedef struct {
	listNode *head;
}linkedList_h;

linkedList_h* createLinkedList() {
	linkedList_h *L = (linkedList_h*)malloc(sizeof(linkedList_h));
	L->head = NULL;
	return L;
}

listNode* searchNode(linkedList_h *L, char *x) {
	listNode *temp = L->head;
	while(temp!=NULL) {
		if(strcmp(temp->data, x)==0)	return temp;
		else 	temp = temp->link;
	}
	return temp;
}

void printList(linkedList_h *L) {
	listNode *temp = L->head;
	printf("L = (");
	while(temp!=NULL) {
		printf("%s", temp->data);
		temp = temp->link;
		if(temp!=NULL)	printf(", ");
	}
	printf(")\n");
}

void reverse(linkedList_h *L) {
	listNode *p, *q, *r;
	p = L->head;
	q = NULL;
	r = NULL;
	while(p!=NULL) {
		r = q;
		q = p;
		p = p->link;
		q->link = r;
	}
	L->head = q;
}

void reset(linkedList_h *L) {
	listNode *temp;
	while(L->head!=NULL) {
		temp = L->head;
		L->head = L->head->link;
		free(temp);
		temp = NULL;
	}
}

void insertFirstNode(linkedList_h *L, char *x) {
	listNode *newNode = (listNode*)malloc(sizeof(listNode));
	strcpy(newNode->data, x);
	if(L->head == NULL) {
		L->head = newNode;
		newNode->link = NULL;
	}
	else {
		newNode->link = L->head;
		L->head = newNode;
	}
}

void insertMiddleNode(linkedList_h *L, listNode *pre, char *x) {
	listNode *newNode = (listNode*)malloc(sizeof(listNode));
	strcpy(newNode->data, x);
	if(L->head == NULL) {
		L->head = newNode;
		newNode->link = NULL;
	}
	else {
		newNode->link = pre->link;
		pre->link = newNode;
	}
}

void insertLastNode(linkedList_h *L, char *x) {
	listNode *newNode = (listNode*)malloc(sizeof(listNode)), *temp;
	strcpy(newNode->data, x);
	newNode->link = NULL;
	if(L->head==NULL) {
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

void deleteNode(linkedList_h *L, listNode *old) {
	listNode *temp;
	if(L->head==NULL)	return;
	else if(old == NULL)	return;
	else if(L->head->link == NULL) {
		free(L->head);
		L->head = NULL;
	}
	else {
		temp = L->head;
		while(temp->link!=old) {
			temp = temp->link;
		}
		temp->link = old->link;
		free(old);
	}
}

void main(void) {
	linkedList_h *L = createLinkedList();
	listNode *p;
	
	printf("(1) ��, ��, �� �����ϱ�!\n");
	insertFirstNode(L, "��");	 insertFirstNode(L, "��");	insertFirstNode(L, "��");
	printList(L); 
	printf("(2) �� �����ϱ�!\n");
	p = searchNode(L, "��");
	insertMiddleNode(L, p, "��");	printList(L); 
	printf("(3) �� �����ϱ�!\n");
	deleteNode(L, p); printList(L);
	printf("�� �輼�ϱ�\n");
	p = searchNode(L, "��");
	deleteNode(L, p);	printList(L);
	
	printf("�������ϱ�! \n");
	reverse(L);	printList(L);
	
	printf("�����ϱ�!\n");
	reset(L);	printList(L); 
}

