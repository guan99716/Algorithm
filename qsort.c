#include <stdio.h>
#include <time.h>
#include<stdlib.h>
void swap(int[], int, int);
void qsort2(int[], int, int);

int main(void) {
  srand(time(NULL));
  int arr[1000];
  for (int i = 0; i < 1000; i++)
    arr[i] = rand() % 100 + 1; // 1~100

  qsort2(arr, 0, 999);

  for (int i = 0; i < 1000; i++)
    printf("%d\n", arr[i]);

  return 0;
}

void swap(int arr[], int i, int j) {
  int temp = arr[i];
  arr[i] = arr[j];
  arr[j] = temp;
}

void qsort2(int arr[], int left, int right) {
  int i, j, pivot;
  int n = right; // length of array
  if (left < right) {
    i = left;
    j = right+1;
    pivot = arr[left];
    do {
      do {i++;} while (i < n && arr[i] < pivot);
      do {j--;} while (j < n && arr[j] > pivot);
      if (i < j)
        swap(arr, i, j);
    } while (i < j);
    swap(arr, left, j);
    qsort2(arr, left, j - 1);
    qsort2(arr, j + 1, right);
  }
}
