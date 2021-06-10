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
	linkedList_h* CL = (linkedList_h*)malloc(sizeof(linkedList_h));
	CL->head = NULL;
	return CL;
}

void printList(linkedList_h *CL) {
	listNode *temp = CL->head;
	printf("CL = (");
	do {
		printf("%s", temp->data);
		temp = temp->link;
		if(temp!=CL->head)	printf(", ");
	} while(temp!=CL->head);
	printf(")\n");
}

listNode* searchNode(linkedList_h *CL, char *x) {
	listNode *temp = CL->head;
	do {
		if(strcmp(temp->data, x) == 0)	return temp;
		else	temp = temp->link;
	} while(temp!=CL->head);
	return temp;
}

void insertFirstNode(linkedList_h *CL, char *x) {
	listNode *newNode = (listNode*)malloc(sizeof(listNode)), *temp;
	strcpy(newNode->data, x);
	if(CL->head == NULL) {
		CL->head = newNode;
		newNode->link = newNode;
	}
	else {
		temp = CL->head;
		while(temp->link!=CL->head) {
			temp = temp -> link;
		}
		newNode->link = temp->link;
		temp->link = newNode;
		CL->head = newNode;
	}
}

void insertMiddleNode(linkedList_h *CL, listNode *pre, char *x) {
	listNode *newNode = (listNode*)malloc(sizeof(listNode));
	strcpy(newNode->data, x);
	if(CL->head == NULL) {
		CL->head = newNode;
		newNode->link = newNode;
	}
	else {
		newNode->link = pre->link;
		pre->link = newNode;
	}
}

void deleteNode(linkedList_h *CL, listNode *old) {
	listNode *temp;
	if(CL->head == NULL)	return;
	else if(old == NULL)	return;
	else {
		temp = CL->head;
		while(temp->link != old) {
			temp = temp->link;
		}
		temp->link = old->link;
		if(old == CL->head) {
			CL->head = old->link;
		}
		free(old);
	}
}	
int main(void) {
	linkedList_h *CL = createLinkedList();
	listNode *p;
	
	printf("(1) 원형 연결 리스트 생성하기!\n");
	
	printf("(2) 원형 연결 리스트에 [월] 노드 삽입하기!\n");
	insertFirstNode(CL, "월"); printList(CL);
	
	printf("(3) 원형 연결 리스트의 [월] 노드 뒤에 [수] 노드 삽입하기!\n");
	p = searchNode(CL, "월");	insertMiddleNode(CL, p, "수");	printList(CL);
	
	printf("(4) 원형 연결 리스트의 [수] 노드 뒤에 [금] 노드 삽입하기!\n");
	p = searchNode(CL, "수");	insertMiddleNode(CL, p, "금");	printList(CL); 
	
	printf("(5) 원형 연결 리스트에서 [수] 노드 삭제하기!\n");
	p = searchNode(CL, "수");	deleteNode(CL, p);	printList(CL); 
}
