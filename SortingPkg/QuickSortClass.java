package SortingPkg;

public class QuickSortClass {
    public static void qsort2(int[] arr, int left, int right) {
        int i, j, pivot;
        int n = arr.length;
        if (left < right) {
            i = left;
            j = right + 1;
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

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
