package com.company;

//递归算法
public class BinarySearch2 {
    public static int BSearch(int[] a, int x, int low, int high){
        int mid = (low + high) / 2;
        if(low > high) return -1;
        if (x == a[mid]) return mid;
        if (x > a[mid]) return BSearch(a, x , mid+1, high);
        else return BSearch(a, x, low, mid - 1);
    }

    public static void main(String[] args) {
        int a[] ={15,22,34,49,50,51,78,79,93, };
        int aim = BSearch(a, 93, 0, a.length - 1);
        System.out.println(aim);
    }
}
