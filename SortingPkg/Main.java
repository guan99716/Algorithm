package SortingPkg;

import java.util.Random;
import java.util.Arrays;


public class Main {
    public static void main(String[] args) {
//        int N = 10; // length of array
        int[] arr = new int[1000];
        Random rand = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextInt(100);
        }
        // original array
        System.out.println(Arrays.toString(arr));

        //quicksort
//        System.out.println("After quicksort: ");
//        QuickSortClass.qsort2(arr, 0, arr.length-1);
//        System.out.println(Arrays.toString(arr));

        //mergesort
//        MergeSortClass.mergeSort(arr);
//        System.out.println("After mergesort: ");
//        System.out.println(Arrays.toString(arr));

        //heapsort
        System.out.println("After heapsort: ");
        System.out.println(Arrays.toString(HeapSortClass.heapsort(arr)));

    }

}
