package com.company;

public class MergeSort{
    public static void mergeSort(int[] a, int left, int right){
        
        if(left < right){ 
            int i = (left + right) / 2;
            mergeSort(a, left, i);
            mergeSort(a, i + 1, right);
            merge(a,left,right);
        }
    }
    public static void merge(int[] q,int l, int r){
        int mid = (l + r) / 2;
        int[] temp = new int[r - l + 1];
        int i = l; int j = mid + 1; int k = 0;
        while (i <= mid && j<= r) {
            if (q[i] <= q[j]) {
                temp[k++] = q[i++];
            }else{
                temp[k++] = q[j++];
            }
        }
        while(i <= mid){
            temp[k++] = q[i++];
        }
        while(j <= r){
            temp[k++] = q[j++];
        } 
        k = 0;
        while(l <= r){
            q[l++] = temp[k++];
        }
        }
    public static int[] getArr(){
        int[] a = {5,4,3,2,6,7,9,0};
        return a;
    }
    public static void printArray(int[] arr){
        for(int i = 0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        int[] a = getArr();
        System.out.println("排序前");
        printArray(a);
        System.out.println();
        mergeSort(a,0,a.length - 1);
        System.out.println("排序后");
        printArray(a);
        
    }
    }