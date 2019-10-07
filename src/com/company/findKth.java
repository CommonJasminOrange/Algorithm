package com.company;

import java.util.Arrays;

//《算法设计》
public class findKth {


    public static void findKth(int q[], int l, int r,int k) {
        if (l >= r) {
            return;
        }
        int x = q[l], i = l - 1, j = r + 1;
        while (i < j) {

            while(q[++i] < x && i < r);
            while(q[--j] > x);
            if (i < j) {
                swap(q,i, j);
            }
        }
        System.out.println(l+".."+r+"..,x = "+x+" ");
        findKth(q, l, j,k);
        findKth(q, j + 1, r,k-(j+1));
    }

    public static void swap(int[] list, int j, int k) {
        int temp = list[j];
        list[j] = list[k];
        list[k] = temp;
    }

    public static void main(String[] args) {
        int arr[] = {6,1,3,2,8,9,4,11,13};
        int k = 8;
        findKth(arr,0,arr.length - 1,k);
        System.out.println(Arrays.toString(arr));
        System.out.println(arr[k-1]);


    }
}