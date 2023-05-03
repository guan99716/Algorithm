#include <stdio.h>
#include <stdlib.h>
#include <time.h>
#define N 1000
void countingsort(int *, int, int);
int main(void) {
  int arr[N], i, k = 10;
  srand(time(NULL));
  for (i = 0; i < N; i++)
    arr[i] = rand() % 10; // 0~9
  countingsort(arr, N, k);
  for (i = 0; i < N; i++)
    printf("%d ", arr[i]);
  return 0;
}
void countingsort(int *input, int n, int k) {
  int count[k], output[n], i;
  for (i = 0; i < k; i++)
    count[i] = 0;
  for (i = 0; i < n; i++)
    count[input[i]]++;
  for (i = 1; i < k; i++)
    count[i] += count[i - 1];
  for (i = n - 1; i >= 0; i--) {
    count[input[i]]--;
    output[count[input[i]]] = input[i];
  }
  for (i = 0; i < n; i++)
    input[i] = output[i];
}
