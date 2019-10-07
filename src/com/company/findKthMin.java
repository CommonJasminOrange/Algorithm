package com.company;

import java.util.Arrays;

public class findKthMin {

    public static int getKth(int[] nums, int k, int left, int right){
        if (left == right) {
            return nums[left];
        }
        int pivot = nums[left];
        int i = left-1;
        int j = right+1;
        while (i < j){
            while (nums[++i] < pivot && i <right);
            while (nums[--j] > pivot);

            if (i < j){
                swap(nums, i, j);
            }

        }
        //swap(nums, i, left);
        if (i-left >= k){
            return getKth(nums, k, left, i-1);
        } else if (i-left+1 == k) {
            return nums[i];
        } else {
            return getKth(nums, k-(i-left+1), i+1, right);
        }
    }

    public static void swap(int nums[],int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }




    public static void main(String[] args) {
        int nums[] = {6,1,3,2,8,9,4,91};
        int k = 6;
        getKth(nums,k,0,nums.length-1);
        System.out.println(Arrays.toString(nums));
        System.out.println(nums[k-1]);


    }


}
