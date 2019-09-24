package com.company;

import java.util.*;

public class MergeSort2{

    public static void main(String[] args){
        int[] a = {6,5,3,8,1,7,2,9,4};
         for(int i = 1; i <= a.length; i *= 2){
             //Math.min的目的是处理 整个待排序数组为奇数的情况
             for(int j = 0; j + i <= a.length; j += i*2){
                 merge(a, j, j+i-1, Math.min(j + 2 * i - 1, a.length - 1));
             }
         }
        
        System.out.println(Arrays.toString(a));
    }

    public static void merge(int[] a,int left, int mid, int right){
        int[] tmp = new int[right - left + 1];
        //mid = (left + right) /2;
        int l = left; //左数组第一个元素的指针 
        int r = mid+1; //右数组第一个元素的指针
        int k = 0; //临时数组temp的指针

        //把较小的数先移入新数组
        while(l <= mid && r <=right){
            if(a[l] <= a[r]) 
            {
                tmp[k++] = a[l++];
            }else{
                tmp[k++] = a[r++];
            }
        }
        //左边剩余的数移入数组
        while(l <= mid){
            tmp[k++] = a[l++];
        }
        //右边剩余的数移入数组
        while(r <= right){
            tmp[k++] = a[r++];
        }
        System.arraycopy(tmp,0,a,left,tmp.length);
    }
    }