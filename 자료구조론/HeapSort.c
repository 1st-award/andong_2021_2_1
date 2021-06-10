#include <stdio.h>
 
void swap(int *a, int *b) {
    int temp = *a;
    *a = *b;
    *b = temp;
}
void heapify(int arr[], int here, int size) {
    int left = here * 2 + 1;
    int right = here * 2 + 2;
    int max=here;
    if (left < size&&arr[left]>arr[max])
        max = left;
    if (right < size&&arr[right]>arr[max])
        max = right;
 
    if (max != here) {
        swap(&arr[here], &arr[max]);
        heapify(arr, max, size);
    }
}
 
void buildHeap(int arr[], int size) {
    int i,j;
    for (i = size / 2 - 1; i >= 0; i--) {
        heapify(arr, i, size);
        for (j = 0; j < size; j++)
            printf("%d ", arr[j]);
        printf("\n\n");
    }
}
 
void heapSort(int arr[],int size) {
    int treeSize;
    buildHeap(arr, size);
    for (treeSize = size - 1; treeSize >= 0; treeSize--) {
        swap(&arr[0], &arr[treeSize]);
        heapify(arr, 0,treeSize);
    }
}
void printArray(int arr[], int size) {
    int i;
    for (i = 0; i < size; i++)
        printf("%d ", arr[i]);
    printf("\n");
}

void main() {
    int arr[] = {69, 10, 30, 2, 16, 8, 31, 22};
    int size = 8;
    printf("\n<<<<<<<<<<<< 히프 정렬 수행 >>>>>>>>>>>>>\n");
    heapSort(arr, size);
    printArray(arr, size);
}
