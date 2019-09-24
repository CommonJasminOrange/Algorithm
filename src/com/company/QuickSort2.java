package com.company;

import java.util.Arrays;

public class QuickSort2 {
 //《随机快排》
    public static int partition(int[] q, int l, int r){

        int x = q[l];
        int i = l;
        int j = r + 1;

        while (true){
            while (q[++i] < x && i < r);
            while (q[--j] > x);
            if (i >= j){
                break;
            }
            swap(q,i,j);
        }
        q[l] = q[j];
        q[j] = x;
        return j;
    }

    public static int RandomPartition(int q[], int l, int r){
        int i = l + (int)(Math.random() * (r-l+1));
        swap(q,i,l);
        return partition(q,l,r);
    }
    public static void quick_sort(int q[], int l, int r) {
        if (l < r){
            int x = RandomPartition(q,l,r);
            System.out.println(l+".."+r+"..,x = "+x+" ");
            quick_sort(q, l, x-1);
            quick_sort(q, x+1, r);
        }

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