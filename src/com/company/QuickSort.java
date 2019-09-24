package com.company;

import java.util.Arrays;

public class QuickSort {


    public static void quick_sort(int q[], int l, int r) {
        if (l >= r) {
            return;
        }
        int x = q[l], i = l - 1, j = r + 1;
        while (i < j) {
            do {
                i++;
            } while (q[i] < x);
            do {
                j--;
            } while (q[j] > x);
            if (i < j) {
                swap(q,i, j);
            }
        }
        quick_sort(q, l, j);
        quick_sort(q, j + 1, r);
    }

    public static void swap(int[] list, int j, int k) {
        int temp = list[j];
        list[j] = list[k];
        list[k] = temp;
    }

    public static void main(String[] args) {
        int arr[] = {6,1,3,2,8,9,4};
        quick_sort(arr,0,arr.length - 1);
        System.out.println(Arrays.toString(arr));


    }
}