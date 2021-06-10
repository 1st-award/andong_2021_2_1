#include <stdio.h>
#include <stdlib.h>
#include <string.h>

typedef struct ListNode {
	struct ListNode *llink;
	char data[4];
	struct ListNode *rlink;
}listNode;

typedef struct {
	listNode *head;
}linkedList_h;

linkedList_h* createLinkedList() {
	linkedList_h *DL = (linkedList_h*)malloc(sizeof(linkedList_h));
	DL->head = NULL;
	return DL;
}

listNode* searchNode(linkedList_h *DL, char *x) {
	listNode *temp = DL->head;
	while(temp!=NULL) {
		if(strcmp(temp->data, x) == 0) return temp;
		else temp = temp->rlink;
	}
	return temp;
}

void printList(linkedList_h *DL) {
	listNode *temp = DL->head;
	printf("DL=(");
	while(temp!=NULL) {
		printf("%s", temp->data);
		temp = temp->rlink;
		if(temp!=NULL)	printf(", ");
	}
	printf(")\n");
}

void insertNode(linkedList_h *DL, listNode *pre, char *x) {
	listNode *newNode = (listNode*)malloc(sizeof(listNode));
	strcpy(newNode->data, x);
	if(DL->head == NULL) {
		newNode->llink = NULL;
		newNode->rlink = NULL;
		DL->head = newNode;
	}
	else {
		newNode->rlink = pre->rlink;
		pre->rlink = newNode;
		newNode->llink = pre;
		if(newNode->rlink!=NULL) {
			newNode->rlink->llink = newNode;
		}
	}
}

void deleteNode(linkedList_h *DL, listNode *old) {
	if(DL->head == NULL) return;
	else if(old == NULL) return;
	else if(DL->head->rlink == NULL) {
		free(DL->head);
		DL->head = NULL;
	}
	else {
		old->rlink->llink = old->llink;
		old->llink->rlink = old->rlink;
		free(old);
	}
}
int main(void) {
	linkedList_h *DL = createLinkedList();
	listNode *p;
	
	printf("(1) 이중 연결 리스트 생성하기!\n");
	printList(DL);
	
	printf("(2) 이중 연결 리스트에 [월] 노드 삽입하기!\n");
	insertNode(DL, NULL, "월");	printList(DL); 
	
	printf("(3) 이중연결 리스트의 [월] 노드 뒤에 [수] 노드 삽입하기!\n");
	p = searchNode(DL, "월");	insertNode(DL, p, "수"); printList(DL);
	
	printf("(4) 이중 연결 리스트의 [수] 노드 뒤에 [금] 노드 삽입하기!\n");
	p = searchNode(DL, "수");	insertNode(DL, p, "금"); printList(DL); 
	
	printf("(5) 이중 연결 리스트의 [수] 노드 삭제하기!\n");
	deleteNode(DL, p);	printList(DL);
}
