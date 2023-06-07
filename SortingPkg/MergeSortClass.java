package SortingPkg;

import java.util.Random;
import java.util.Arrays;

public class MergeSortClass {
    private static void merge(int[] result,int[] arr1,int[] arr2){
        int i = 0, j = 0, k = 0;
        int len1 = arr1.length, len2 = arr2.length;
        // int[] result = new int[len1+len2];
        while(i<len1 && j<len2){
            if(arr1[i]<=arr2[j])
            {
                result[k++]=arr1[i++];
            }
            else{
                result[k++]=arr2[j++];
            }
        }
        while(i<len1){
            result[k++]=arr1[i++];
        }
        while(j<len2){
            result[k++]=arr2[j++];
        }
    }
    public static void mergeSort(int[] arr){
        if (arr == null || arr.length <= 1) {
            return;
        }
        int mid = arr.length / 2;
        int[] leftArray = new int[mid];
        int[] rightArray = new int[arr.length - mid];
        // using System.arraycopy(src, srcPos, dest, destPos, length); to create subarray
        System.arraycopy(arr, 0, leftArray, 0, mid);
        System.arraycopy(arr, mid, rightArray, 0, arr.length - mid);
        mergeSort(leftArray);
        mergeSort(rightArray);
        merge(arr,leftArray,rightArray);
    }
}
