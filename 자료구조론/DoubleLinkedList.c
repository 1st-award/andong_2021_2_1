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
	
	printf("(1) ���� ���� ����Ʈ �����ϱ�!\n");
	printList(DL);
	
	printf("(2) ���� ���� ����Ʈ�� [��] ��� �����ϱ�!\n");
	insertNode(DL, NULL, "��");	printList(DL); 
	
	printf("(3) ���߿��� ����Ʈ�� [��] ��� �ڿ� [��] ��� �����ϱ�!\n");
	p = searchNode(DL, "��");	insertNode(DL, p, "��"); printList(DL);
	
	printf("(4) ���� ���� ����Ʈ�� [��] ��� �ڿ� [��] ��� �����ϱ�!\n");
	p = searchNode(DL, "��");	insertNode(DL, p, "��"); printList(DL); 
	
	printf("(5) ���� ���� ����Ʈ�� [��] ��� �����ϱ�!\n");
	deleteNode(DL, p);	printList(DL);
}
