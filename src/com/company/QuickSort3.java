package com.company;

import java.util.Arrays;

public class QuickSort3 {
    //《数据结构》
    public static void quickSort(int[] q, int l,int r){
        if (l >= 0  && r >=0 && r < q.length && l < r){
            int i = l, j = r;
            int index = l;
            int x = q[i];
            while(i < j){
                while (i < j){
                    if (q[j] < x){
                        q[index] = q[j]; // 找到所需值，将值填充到坑位
                        index = j; // 此时j位置为index新坑位
                        i++; // 右侧找到了数据，则i右移一位，准备进行比对
                        break; // 找到数据之后，跳出内循环，准备从左侧开始对比
                    }
                    // 没有匹配的数据，则j左移一位，继续对比
                    j--;
                }
                while (i < j){
                    if (q[i] > x){
                        q[index] = q[i]; // 找到所需值，将值填充到坑位
                        index = i; // 此时i位置为index新坑位
                        j--; // 左侧找到了数据，则j左移一位，准备进行比对
                        break; // 找到数据之后，跳出内循环，准备从右侧开始对比
                    }
                    // 没有匹配的数据，则i右移一位，继续对比
                    i++;
                }
            }


            q[index] = x;
            System.out.println(l+".."+r+"..,x = "+x+" ");
            quickSort(q, l, j - 1);
            quickSort(q, j + 1, r);
        }
    }

    public static void main(String[] args) {
        int arr[] = {35,50,15,30,85,12,20,70};
        quickSort(arr,0,arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }
}
