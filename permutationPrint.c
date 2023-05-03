#include <stdio.h>
void permutate(char[], int, int);
void swap(char[], int, int);
int main(void) {
  char arr[] = {'A', 'B', 'C','D'};
  int n = sizeof(arr)/sizeof(char);
  permutate(arr,0,n);
  return 0;
}

void permutate(char arr[], int l, int r) {
  if (l == r) {
    printf("%s\n",arr);
    }
  for(int i =l;i<r;i++){
    swap(arr,l,i);
    permutate(arr, l+1, r);
    swap(arr,l,i);
  }
}

void swap(char arr[], int i, int j) {
  char temp = arr[i];
  arr[i] = arr[j];
  arr[j] = temp;
}

