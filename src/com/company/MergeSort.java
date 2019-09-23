package com.company;

public class MergeSort {
    public static void mergeSort(int[] a,int left, int right){
        if (left<right){ //至少有两个元素
            int i = (left + right) / 2; //取中点
            mergeSort(a,left,i); //对左边数组进行递归
            mergeSort(a,i+1, right); //对右边数组进行递归
            mergeSort(a, b, left, i, right); //合并两个排好序的数组段到一个新的数组b中
            copy(a, b, left, right); //将合并后的数组段再复制回数组a中
        }
    }
}
